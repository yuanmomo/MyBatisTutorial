
/**
 * Project Name : tutorial-01
 * File Name    : UserTest.java
 * Package Name : net.yuanmomo.mybatis
 * Created on   : 2014-3-4上午10:29:25
 * Author       : Hongbin Yuan
 * Blog         : yuanmomo.net
 * Company      : 成都逗溜网科技有限公司  
 */

package net.yuanmomo.mybatis.tutorial1;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import net.yuanmomo.mybatis.tutorial1.bean.User;
import net.yuanmomo.mybatis.tutorial1.mapper.UserMapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

/**
 * ClassName : UserTest 
 * Function  : TODO ADD FUNCTION. 
 * Reason    : TODO ADD REASON. 
 * Date      : 2014-3-4 上午10:29:25 
 *
 * @author   : Hongbin Yuan
 * @version  
 * @since      JDK 1.6
 * @see 	 
 */
public class Test1 {
	/**
	 * sqlSessionFactory: 数据库会话池.
	 
	 */
	private SqlSessionFactory sqlSessionFactory = null;
	
	/**
	 * init: JUnit类初始化的时候,默认调用该方法. <br/>
	 * 1. 初始化SqlSessionFactory
	 */
	@Before
	public void init() throws Exception{
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream("tutorial1/mybatis-config.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (Exception e) {
			throw e;
		}finally{
			try {
				inputStream.close();
			} catch (IOException e) {
				throw e;
			}
		}
	}
	
	@Test
	public void insertTest(){
		// 2. 取得一个会话, 设置不自动提交事务
		SqlSession session = this.sqlSessionFactory.openSession(false);
		// 3. 组装一个User对象,作为参数,调用mapper接口方法
		User user = new User("yaunmomo",(short)25,new Date());
		int insertCount = 0;
		try {
			insertCount = session.getMapper(UserMapper.class).insert(user);
			session.commit(); // 事务提交
		} catch (Exception e) {
			session.rollback();
			e.printStackTrace();
		} finally {
			session.close(); // 将当前会话返回连接池
		}
		// 4. 输出结果
		if(insertCount == 1){
			System.out.println("插入成功,新用户id="+user.getId());
		}else{
			System.out.println("插入失败");
		}
	}
	@Test
	public void selectTest(){
		// 2. 取得一个会话, 设置不自动提交事务
		SqlSession session = this.sqlSessionFactory.openSession();
		// 3. 调用mapper接口方法,返回查询结果
		List<User> userList = null;
		try {
			userList = session.getMapper(UserMapper.class).selectUserList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close(); // 将当前会话返回连接池
		}
		// 4. 输出结果
		for(User u : userList){ // 要先判断list是否为空
			System.out.println(u);
		}
	}
}
