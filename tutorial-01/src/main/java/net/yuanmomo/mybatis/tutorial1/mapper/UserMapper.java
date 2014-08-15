
/**
 * Project Name : tutorial-01
 * File Name    : UserMapper.java
 * Package Name : net.yuanmomo.mybaits
 * Created on   : 2014-3-4上午9:57:19
 * Author       : Hongbin Yuan
 * Blog         : yuanmomo.net
 * Company      : 成都逗溜网科技有限公司  
 */

package net.yuanmomo.mybatis.tutorial1.mapper;

import java.util.List;

import net.yuanmomo.mybatis.tutorial1.bean.User;

/**
 * ClassName : UserMapper 
 * Function  : TODO ADD FUNCTION. 
 * Reason    : TODO ADD REASON. 
 * Date      : 2014-3-4 上午9:57:19 
 *
 * @author   : Hongbin Yuan
 * @version  
 * @since      JDK 1.6
 * @see 	 
 */
public interface UserMapper {
	/**
	 * insert: 插入用户. <br/>
	 *
	 * @author Hongbin Yuan
	 * @param  user
	 * @return 插入成功的记录数
	 * @since JDK 1.6
	 */
	public int insert(User user) throws Exception;

	/**
	 * selectUserList: 查询数据库所有用户. <br/>
	 *
	 * @author Hongbin Yuan
	 * @return
	 * @throws Exception
	 * @since JDK 1.6
	 */
	public List<User> selectUserList() throws Exception;
	
}
