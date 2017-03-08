package com.xing.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;


import org.apache.log4j.Logger;

import com.xing.util.MybatisUtil;

public class Test_select_2 {
	private final Logger log = Logger.getLogger(Test_select_2.class); 
	
	@org.junit.Test
	public void select1(){
		// ��̬sql  <where>   <if>  ���
		SqlSession session = MybatisUtil.getSession();
		User u = new User();
		u.setId(1111);
		u.setUsername("zhangzhixing");
		User a = session.selectOne("com.xing.model.User3.select", u);
		//List<User> a = session.selectList("com.xing.model.User3.select", u);
		System.out.println(a);
		session.close();
	}
	
	
	@org.junit.Test
	public void select2(){
		// ��̬sql  choose ���
		SqlSession session = MybatisUtil.getSession();
		Map map = new HashMap();
		map.put("id", 1111);
		map.put("username", "zhangzhixing");
		List<User> a = session.selectList("com.xing.model.User3.select2", map);
		System.out.println(a);
		session.close();
	}

	@org.junit.Test
	public void select3(){
		// ��̬sql  ${} ��Ԥ����                             #{}����Ԥ����  =? and  =?
		SqlSession session = MybatisUtil.getSession();
		Map map = new HashMap();
		map.put("id", 1111);
		map.put("hello", "zhangzhixing111");
		List<User> a = session.selectList("com.xing.model.User3.select3", map);
		log.debug(a);
		session.close();
	}
	
	@org.junit.Test
	public void select4(){
		// ��̬sql trim��ǩ  ��sql����ǰ׺pre������׺
		
//        prefix��ǰ׺���ǲ�����������
//        suffix����׺���ǲ�����������
//        prefixOverrides��ǰ׺�жϵ�����
//        suffixOverrides����׺�жϵ�����
        
		SqlSession session = MybatisUtil.getSession();
		Map map = new HashMap();
		map.put("id", 1111);
		map.put("hello", "zhangzhixing111");
		List<User> a = session.selectList("com.xing.model.User3.select4", map);
		log.debug(a);
		session.close();
	}
	
	@org.junit.Test
	public void update(){
		// <set>   update set���
		SqlSession session = MybatisUtil.getSession();
		User user = new User();
		user.setId(1111);
		user.setPassword("aaaaaaaaaaaa");
		user.setType("www");
		user.setUsername("aaaaaa");
		session.update("com.xing.model.User3.update", user);
		session.commit();
		session.close();
	}
	
	@org.junit.Test
	public void select5(){
		// ��̬sql <foreach>  ����list����  ����         in (a,b,c) ���
		SqlSession session = MybatisUtil.getSession();
		List<String> list = new ArrayList<String>();
		list.add("1111");
		list.add("2222");
		list.add("3333");
		List<User> a = session.selectList("com.xing.model.User3.select5", list);
		System.out.println(a);
		session.close();
	}
	
	@org.junit.Test
	public void select6(){
		// ��̬sql <foreach>  array
		SqlSession session = MybatisUtil.getSession();
		//String[] arr = {"1111","2222","3333"};
		int[] arr = {1111,2222,3333};
		List<User> a = session.selectList("com.xing.model.User3.select6", arr);
		System.out.println(a);
		session.close();
	}
}
