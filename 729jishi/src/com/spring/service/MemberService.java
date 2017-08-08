package com.spring.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import com.spring.dao.MemberMapper;
import com.spring.pojo.Member;

@Service("memberService")
public class MemberService {

	@Resource(name="memberMapper")
	private MemberMapper memberMapper;
	
	
	//查询所有数据
	public List<Member> findall(){
		return memberMapper.findall();
	}
	
	//根据ID查询某一跳数据
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	public Member find(int id){
		return memberMapper.find(id);
		
	
	}
	
	//更新
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	public void update(Member member){
	
		 memberMapper.update(member);
	}
	
	//根据执行ID删除
	public  void delete(int id){
		memberMapper.delete(id);
	}
	
	//添加用户
	public  void create(Member member){
		memberMapper.add(member);
	}
	
	//模糊查询
	public List<Member> findByName(String name,String cardNo){
		return memberMapper.findByName(name, cardNo);
	}
}
	
