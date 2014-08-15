
/**
 * Project Name : tutorial-01
 * File Name    : User.java
 * Package Name : net.yuanmomo.mybaits.bean
 * Created on   : 2014-3-4上午9:58:07
 * Author       : Hongbin Yuan
 * Blog         : yuanmomo.net
 * Company      : 成都逗溜网科技有限公司  
 */

package net.yuanmomo.mybatis.bean;

import java.util.Date;

/**
 * ClassName : User 
 * Function  : TODO ADD FUNCTION. 
 * Reason    : TODO ADD REASON. 
 * Date      : 2014-3-4 上午9:58:07 
 *
 * @author   : Hongbin Yuan
 * @version  
 * @since      JDK 1.6
 * @see 	 
 */
public class User {

	private Integer id;

    private String name;
    
    private Short age;

    private Date birthday;

    private String nAme;
    
    
	/**
	 * nAme.
	 *
	 * @return  the nAme
	 * @since   JDK 1.6
	 */
	public String getnAme() {
		return nAme;
	}

	/**
	 * nAme.
	 *
	 * @param   nAme    the nAme to set
	 * @since   JDK 1.6
	 */
	public void setnAme(String nAme) {
		this.nAme = nAme;
	}

	public User() {} // 无参数构造方法很重要

	public User(String name, Short age, Date birthday) {
		super();
		this.name = name;
		this.age = age;
		this.birthday = birthday;
	}
	/**
	 * toString:. <br/>
	 *
	 * @author Hongbin Yuan
	 * @return
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age
				+ ", birthday=" + birthday + ", nAme=" + nAme + "]";
	}

	/**
	 * id.
	 *
	 * @return  the id
	 * @since   JDK 1.6
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * id.
	 *
	 * @param   id    the id to set
	 * @since   JDK 1.6
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * name.
	 *
	 * @return  the name
	 * @since   JDK 1.6
	 */
	public String getName() {
		return name;
	}

	/**
	 * name.
	 *
	 * @param   name    the name to set
	 * @since   JDK 1.6
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * age.
	 *
	 * @return  the age
	 * @since   JDK 1.6
	 */
	public Short getAge() {
		return age;
	}

	/**
	 * age.
	 *
	 * @param   age    the age to set
	 * @since   JDK 1.6
	 */
	public void setAge(Short age) {
		this.age = age;
	}

	/**
	 * birthday.
	 *
	 * @return  the birthday
	 * @since   JDK 1.6
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * birthday.
	 *
	 * @param   birthday    the birthday to set
	 * @since   JDK 1.6
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
}
