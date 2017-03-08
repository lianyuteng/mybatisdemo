package com.xing.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.xing.util.MybatisUtil;

public class Test_select_1 {
	//探查mybatis的对象与字段的映射
	
	
	//起别名as进行对象属性  与数据库字段  的映射
	@org.junit.Test
	public void select1(){
		SqlSession session = MybatisUtil.getSession();
		Address a = (Address)session.selectOne("com.xing.model.User2.select", 111);
		System.out.println(a);
		session.close();
	}

	
	//写一个resultMap进行映射
	@org.junit.Test
	public void select2(){
		SqlSession session = MybatisUtil.getSession();
		//第三個参数是以什么作为map的键
		Map a = session.selectMap("com.xing.model.User2.select2","1","id");
		System.out.println(a);
		session.close();
	}
	
	
	//写一个resultMap进行映射
	@org.junit.Test
	public void select2_1(){
		SqlSession session = MybatisUtil.getSession();
		//第三個参数是以什么作为map的键
		Map map = new HashMap();
		map.put("type", "1");
		Map a = session.selectMap("com.xing.model.User2.select2_1",map,"id");
		System.out.println(a);
		session.close();
	}
	
	@org.junit.Test
	public void select3(){
		SqlSession session = MybatisUtil.getSession();
		//不需要传入参数 sql语句是写死的
		Map a = session.selectMap("com.xing.model.User2.select3","id");
		System.out.println(a);
		session.close();
	}
	
	
	//mybatis分页 RowBounds
	//mybatis的分页是逻辑分页。。数据量大会内存溢出。
	//逻辑分页运用对结果结果集的算法来分页。。叫逻辑分页。 
	//物理分页是运用数据库本身的一些特性来分页。 运用sql语句优化来提高分页性能。
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
