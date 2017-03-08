package com.xing.model2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.xing.util.MybatisUtil;

public class Test {

	
	@org.junit.Test
	public void Insert(){
		SqlSession session = MybatisUtil.getSession();
		List list = session.selectList("com.xing.model2.yingshe.select", 111);
		Mobile m = (Mobile)list.get(0);
		Person p = m.getPerson();
		System.out.println(m);
		System.out.println(p);
		session.close();
	}
	
}
