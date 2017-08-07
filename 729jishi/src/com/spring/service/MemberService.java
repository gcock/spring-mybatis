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
	
	
	//������������
	public List<Member> findall(){
		return memberMapper.findall();
	}
	
	//����ID����ĳ������
	public Member find(int id){
		return memberMapper.find(id);
		
	
	}
	
	//����
	public void update(Member member){
	
		 memberMapper.update(member);
	}
	
	//ɾ��
	public  void delete(int id){
		memberMapper.delete(id);
	}
	
//��������
	public  void create(Member member){
		memberMapper.add(member);
	}
}
	
