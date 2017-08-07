package com.spring.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.spring.pojo.Member;

@Repository("memberMapper")
public interface MemberMapper {
	@Insert("insert into t_member(m_id, m_name,m_phone,m_level,m_card_no) values(#{id},#{name},#{phone},#{level},#{cardNo})")
	@SelectKey(keyProperty="id",statement="select seq_member.nextval from dual",resultType=int.class,before = true)
	int add(Member member);
	
	/*@Select("select m_id id,m_name name,m_phone phone,m_level, m_card_no cardNo from t_member")*/
	List<Member> findall();
	
	@Delete("delete from t_member where m_id = #{id}")
	int delete(int id);
	
	@Select("select * from where m_id = #{id} ")
	Member find(int id);
	
	@Update("update t_member set id=#{m_id},name = #{m_name},phone=#{m_phone},level=#{m_level} inTime=#{m_in_time} cardNo =#{m_card_no}")
	int update(Member member);
}
