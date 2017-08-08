package com.spring.controller;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.pojo.Member;
import com.spring.service.MemberService;

@Controller
public class MemberController {

	@Resource(name = "memberService")
	private MemberService memberService;
	 
	@InitBinder    
    protected void initBinder(WebDataBinder binder) {    

        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));    

    }   
	
	// 查询所有的信息
	@RequestMapping("/")
	public String findall(Model m) {
		System.out.println(123);
		List<Member> member = memberService.findall();
		System.out.println(member.size());
		m.addAttribute("member", member);
		return "main";
	}

	// 根据ID查询
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String edit(@PathVariable int id, Model m) {
		Member m1 = memberService.find(id);
		m.addAttribute("m1", m1);
		return "edit";

	}

	// 更新
	@RequestMapping(value = "/{id}", method = RequestMethod.POST)
	public String update(@DateTimeFormat(pattern = "yyyy-MM-dd") @PathVariable int id, Member member) {

		memberService.update(member);
		return "redirect:/";
	}

	// 删除
	@RequestMapping(value = "/{id}/delete", method = RequestMethod.POST)
	public String delete(@PathVariable int id) {

		memberService.delete(id);
		return "redirect:/";

	}

	// 跳转到添加数据的页面
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String create(Member member) {
		System.out.println("创建");
		// memberService.create(member);
		return "add";
	}

	// 创建用户
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String createGO(Member member) {
		System.out.println("添加");
		System.out.println(member.getId() + "" + member.getName());
		memberService.create(member);
		return "redirect:/";
	}

	// 模糊查询
	@RequestMapping(value = "/chaxun", method = RequestMethod.GET)
	public String chaxun(String name, String cardNo, Model m1) {
		
		StringBuffer s = new StringBuffer(name);
				s.insert(0, "%");
				s.insert(s.length(), "%");
				String names = s.toString();
				
		StringBuffer s2 = new StringBuffer(cardNo);
				s2.insert(0, "%");
				s2.insert(s2.length(), "%");
				String cardNos = s2.toString();
				
		List<Member> member = memberService.findByName(names, cardNos);
		
		m1.addAttribute("member", member);
		return "main";
		
	}
	
	//回到首页
	@RequestMapping(value = "/shouye", method = RequestMethod.GET)
	public String shouye(){
		return "redirect:/";
	}
}
