
/**
 * Project Name : tutorial-01
 * File Name    : UserMapper.java
 * Package Name : net.yuanmomo.mybaits
 * Created on   : 2014-3-4上午9:57:19
 * Author       : Hongbin Yuan
 * Blog         : yuanmomo.net
 * Company      : 成都逗溜网科技有限公司  
 */

package net.yuanmomo.mybatis.mapper;

import java.util.List;

import net.yuanmomo.mybatis.bean.User;

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
	 * @throws Exception
	 */
	public int insert(User user) throws Exception;
	
	/**
	 * deleteByPrimaryKey: 删除指定用户. <br/>
	 *
	 * @author Hongbin Yuan
	 * @param id	删除指定id的用户
	 * @return		删除的记录数
	 * @throws Exception
	 */
	public int deleteByPrimaryKey(Integer id) throws Exception;
	
	/**
	 * updateByPrimaryKey: 更新用户. <br/>
	 *
	 * @author Hongbin Yuan
	 * @param user	更新的用户信息
	 * @return		更新的记录数
	 * @throws Exception
	 */
	public int updateByPrimaryKey(User user)throws Exception;

	/**
	 * selectUserList: 查询数据库所有用户. <br/>
	 *
	 * @author Hongbin Yuan
	 * @return		用户信息列表
	 * @throws Exception
	 */
	public List<User> selectAllUserList() throws Exception;
	
	/**
	 * selectByPrimaryKey: 查询指定用户. <br/>
	 *
	 * @author Hongbin Yuan
	 * @param id	用户id
	 * @return		返回指定的用户
	 * @throws Exception
	 */
	public User selectByPrimaryKey(Integer id) throws Exception;
	
	/**
	 * selectToResultMap: 查询指定用户. <br/>
	 *
	 * @author Hongbin Yuan
	 * @param id	用户id
	 * @return		返回指定的用户
	 * @throws Exception
	 */
	public User selectToResultMap(Integer id) throws Exception;
}
