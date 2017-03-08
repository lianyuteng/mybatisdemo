package com.xing.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.xing.util.MybatisUtil;

public class Test_select_0 {
	
	/*
	 * ����һ������
	 * */
	@org.junit.Test
	public void select(){
		SqlSession session = MybatisUtil.getSession();
		List<User> user = session.selectList("com.xing.model.User.select","22");
		System.out.println(user.toString());
		session.close();
	}
	
	//���ض�����List
	@org.junit.Test
	public void select_list(){
		SqlSession session = MybatisUtil.getSession();
		String x = User.class.getName()+".select_list";
		System.out.println(x);
		List<User> list = session.selectList(x, "1");
		System.out.println(list);
		session.close();
	}
	
	//����map���� ����list���
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
	
	//����list����  ��map�������������-ֵ����map�
	@org.junit.Test
	public void select_list_map(){
		SqlSession session = MybatisUtil.getSession();
		String x = User.class.getName()+".select_list_map";
		System.out.println(x);
		List<Map> map = session.selectList(x,"1");
		System.out.println(map);
		session.close();
	}
	
	//2�����ϲ�ѯ   �Ľ������map������������������as ����
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
