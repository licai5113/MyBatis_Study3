package mybatis.pritice.util;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	public static SqlSessionFactory getSqlSessionFactory() {
		String conf="conf.xml";
		InputStream is=MyBatisUtil.class.getClassLoader().getResourceAsStream(conf);
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
		return factory;
	}
	
	public static SqlSession getSqlSession(){
		
		return getSqlSessionFactory().openSession();
	} 
	
	public static SqlSession getSqlSession(boolean isAutoCommit){
		
		return getSqlSessionFactory().openSession(isAutoCommit);
	}
}
