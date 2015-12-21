package mybatis.pritice.test;


import mybatis.pritice.Entity.Order;
import mybatis.pritice.util.MyBatisUtil;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;


public class TestCURDofMybatis {
	@Test
	public void testGetOrder(){
		String statement="mybatis.pritice.mapping.userMapper.getOrder";
		SqlSession sqlsession=MyBatisUtil.getSqlSession();
		System.out.println(sqlsession);
		Order u=sqlsession.selectOne(statement,2);
		System.out.println(u);
		sqlsession.close();
		
	}
	@Test
	public void testSelectOrder(){
		String statement="mybatis.pritice.mapping.userMapper.selectOrder";
		SqlSession sqlsession=MyBatisUtil.getSqlSession();
		System.out.println(sqlsession);
		Order u=sqlsession.selectOne(statement,2);
		System.out.println(u);
		sqlsession.close();
		
	}
	@Test
	public void testSelectMapOrder(){
		String statement="mybatis.pritice.mapping.userMapper.selectMapOrder";
		SqlSession sqlsession=MyBatisUtil.getSqlSession();
		System.out.println(sqlsession);
		Order u=sqlsession.selectOne(statement,2);
		System.out.println(u);
		sqlsession.close();
		
	}
}
