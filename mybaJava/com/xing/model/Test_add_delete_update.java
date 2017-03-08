package com.xing.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.xing.util.MybatisUtil;

public class Test_add_delete_update {
	//��JUnit3.x�жԲ��Ա���̳� TestCase,����ÿ��������������test��ͷ
	//��JUnit4.x��@Test
	
	@org.junit.Test
	public void Insert(){
		SqlSession session = MybatisUtil.getSession();
		User user = new User();
		user.setPassword("1111");
		user.setUsername("zhangzhixing");
		user.setId(2222);
		session.insert(User.class.getName()+".add", user);
	
		session.commit();
		session.close();
	}
	
	@org.junit.Test
	public void Insert2(){
		System.out.println("wocaonimabi");
		SqlSession session = MybatisUtil.getSession();
		if(session == null){
			
			System.out.println("shiknogde");
			
		}
		int insert = session.insert("co.xing.model.User.add2");
		System.out.println("����ɹ�");
		
		session.commit();
		System.out.println("tijiaochengong");
		session.close();
	}
	
	@org.junit.Test
	public void delete(){
		SqlSession session = MybatisUtil.getSession();
		session.delete(User.class.getName()+".delete", "2222");
		session.commit();
		session.close();

	}
	
	@org.junit.Test
	public void update(){
		SqlSession session = MybatisUtil.getSession();
		User user = new User();
		user.setPassword("456456");
		user.setUsername("zhangzhixing111");
		
		user.setId(111);
		session.update(User.class.getName()+".update", user);
		session.commit();
		session.close();
	}
	
}
