package com.xing.model3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.xing.util.MybatisUtil;

public class Test {
	//��JUnit3.x�жԲ��Ա���̳� TestCase,����ÿ��������������test��ͷ
	//��JUnit4.x��@Test
	
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
