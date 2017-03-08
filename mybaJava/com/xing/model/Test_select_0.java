package com.xing.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.xing.util.MybatisUtil;

public class Test_select_0 {
	
	/*
	 * 返回一个对象
	 * */
	@org.junit.Test
	public void select(){
		SqlSession session = MybatisUtil.getSession();
		List<User> user = session.selectList("com.xing.model.User.select","22");
		System.out.println(user.toString());
		session.close();
	}
	
	//返回多个结果List
	@org.junit.Test
	public void select_list(){
		SqlSession session = MybatisUtil.getSession();
		String x = User.class.getName()+".select_list";
		System.out.println(x);
		List<User> list = session.selectList(x, "1");
		System.out.println(list);
		session.close();
	}
	
	//传入map参数 返回list结果
	@org.junit.Test
	public void select_map(){
		SqlSession session = MybatisUtil.getSession();
		String x = User.class.getName()+".select_map";
		System.out.println(x);
		Map<String, Object> param=new HashMap<String, Object>();
		param.put("type", "1");
		List list = session.selectList(x,param);
		System.out.println(list);
		session.close();
	}
	
	//返回list集合  的map结果（对象属性-值放入map里）
	@org.junit.Test
	public void select_list_map(){
		SqlSession session = MybatisUtil.getSession();
		String x = User.class.getName()+".select_list_map";
		System.out.println(x);
		List<Map> map = session.selectList(x,"1");
		System.out.println(map);
		session.close();
	}
	
	//2表联合查询   的结果放入map里。。。如果属性重名用as 别名
	@org.junit.Test
	public void select_list_map2(){
		SqlSession session = MybatisUtil.getSession();
		String x = User.class.getName()+".select_list_map2";
		System.out.println(x);
		List<Map> map = session.selectList(x,"1");
		System.out.println(map);
		session.close();
	}
}
