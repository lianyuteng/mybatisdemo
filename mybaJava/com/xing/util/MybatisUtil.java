package com.xing.util;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
public class MybatisUtil {
	private static SqlSessionFactory factory=null; 
	static {
		InputStream in=null;
		try{
			in = Resources.getResourceAsStream("mybatis-config.xml");
			factory = new SqlSessionFactoryBuilder().build(in);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static SqlSession getSession(){
		return factory.openSession();
	}
	
	public static void closeSession(SqlSession session){
		if(session !=null) session.close();
	}

}
