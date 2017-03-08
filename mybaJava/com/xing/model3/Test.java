package com.xing.model3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.xing.util.MybatisUtil;

public class Test {
	//在JUnit3.x中对测试必须继承 TestCase,并且每个方法名必须以test开头
	//在JUnit4.x加@Test
	
	@org.junit.Test
	public void Insert(){
		SqlSession session = MybatisUtil.getSession();
		List list = session.selectList("com.xing.model3.yingshe.select", 111);
		Person person = (Person)list.get(0);
		List<Mobile> mobiles = person.getMobiles();
		System.out.println(person);
		System.out.println(mobiles);
		session.close();
	}
	
}
