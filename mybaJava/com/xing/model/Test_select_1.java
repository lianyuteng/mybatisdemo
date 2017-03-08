package com.xing.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.xing.util.MybatisUtil;

public class Test_select_1 {
	//̽��mybatis�Ķ������ֶε�ӳ��
	
	
	//�����as���ж�������  �����ݿ��ֶ�  ��ӳ��
	@org.junit.Test
	public void select1(){
		SqlSession session = MybatisUtil.getSession();
		Address a = (Address)session.selectOne("com.xing.model.User2.select", 111);
		System.out.println(a);
		session.close();
	}

	
	//дһ��resultMap����ӳ��
	@org.junit.Test
	public void select2(){
		SqlSession session = MybatisUtil.getSession();
		//��������������ʲô��Ϊmap�ļ�
		Map a = session.selectMap("com.xing.model.User2.select2","1","id");
		System.out.println(a);
		session.close();
	}
	
	
	//дһ��resultMap����ӳ��
	@org.junit.Test
	public void select2_1(){
		SqlSession session = MybatisUtil.getSession();
		//��������������ʲô��Ϊmap�ļ�
		Map map = new HashMap();
		map.put("type", "1");
		Map a = session.selectMap("com.xing.model.User2.select2_1",map,"id");
		System.out.println(a);
		session.close();
	}
	
	@org.junit.Test
	public void select3(){
		SqlSession session = MybatisUtil.getSession();
		//����Ҫ������� sql�����д����
		Map a = session.selectMap("com.xing.model.User2.select3","id");
		System.out.println(a);
		session.close();
	}
	
	
	//mybatis��ҳ RowBounds
	//mybatis�ķ�ҳ���߼���ҳ��������������ڴ������
	//�߼���ҳ���öԽ����������㷨����ҳ�������߼���ҳ�� 
	//�����ҳ���������ݿⱾ���һЩ��������ҳ�� ����sql����Ż�����߷�ҳ���ܡ�
	@org.junit.Test
	public void select4(){
		SqlSession session = MybatisUtil.getSession();
		Map map = new HashMap();
		map.put("type", "1");
		Map a = session.selectMap("com.xing.model.User2.select2_1",map , "id", null);
		System.out.println(a);
		session.close();
	}
}
