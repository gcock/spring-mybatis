package com.spring.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spring.dao.MemberMapper;
import com.spring.pojo.Member;

@Service("memberService")
public class MemberService {

	@Resource(name="memberMapper")
	private MemberMapper memberMapper;
	
	
	//查找所有数据
	public List<Member> findall(){
		return memberMapper.findall();
	}
	
	//根据ID查找某个数据
	public Member find(int id){
		return memberMapper.find(id);
		
	
	}
	
	//更新
	public void update(Member member){
	
		 memberMapper.update(member);
	}
	
	//删除
	public  void delete(int id){
		memberMapper.delete(id);
	}
	
//创建数据
	public  void create(Member member){
		memberMapper.add(member);
	}
}
	
