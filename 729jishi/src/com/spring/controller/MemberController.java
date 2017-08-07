package com.spring.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.pojo.Member;
import com.spring.service.MemberService;

@Controller
public class MemberController {

	@Resource(name="memberService")
	private MemberService memberService;

	//������������
	@RequestMapping("/")
	public String findall(Model m){
//		ModelAndView m = new ModelAndView();
		List<Member> member = memberService.findall();
		/*System.out.println(member.size());
		for (Member member2 : member) {
			System.out.println(member2.getName());
		}*/
		m.addAttribute("member", member);
//		m.setViewName("main");
//		m.addObject("member", member);
		return "main";
	}
	
	//����ID����ĳһ������ �༭
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public 	String edit(@PathVariable int id,Model m){
		Member m1 = memberService.find(id);
		m.addAttribute("m1", m1);
		return "edit";
		
	}
	
		//����
		@RequestMapping(value="/{id}",method = RequestMethod.POST)
		public String update(@PathVariable int id ,Member member){
			
			memberService.update(member);
			return "redirect:/";
		}
		
		//ɾ������
		@RequestMapping(value="/{id}/delete",method=RequestMethod.POST)
		public String delete(@PathVariable int id){
		
			memberService.delete(id);
			return "redirect:/";
			
		}
		
		//����

		@RequestMapping(value="/create",method=RequestMethod.POST)
		public String create(Member member){
			System.out.println("����");
			//memberService.create(member);
			return "add";
		}
		
		
		@RequestMapping(value="/add",method=RequestMethod.POST)
		public String createGO(Member member){
			System.out.println("���");
			memberService.create(member);
			return "redirect:/";
		}
	
}
