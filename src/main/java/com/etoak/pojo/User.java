package com.etoak.pojo;


import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @author ych
 *
 */
public class User implements Serializable{	

	private static final long serialVersionUID = -3885313706621697914L;
	//columns START
	/** id */
	private java.lang.Integer id;
	/** userName */
	private java.lang.String userName;
	/** password */
	private java.lang.String password;
	/** age */
	private java.lang.Integer age;
	//columns END


	/**
	 * 设置 id
	 * @param id
	 */
	public void setId(java.lang.Integer id) {
		this.id = id;
	}
	/**
	 * id
	 * @return
	 */
	public java.lang.Integer getId() {
		return this.id;
	}
	/**
	 * 设置 userName
	 * @param userName
	 */
	public void setUserName(java.lang.String userName) {
		this.userName = userName;
	}
	/**
	 * userName
	 * @return
	 */
	public java.lang.String getUserName() {
		return this.userName;
	}
	/**
	 * 设置 password
	 * @param password
	 */
	public void setPassword(java.lang.String password) {
		this.password = password;
	}
	/**
	 * password
	 * @return
	 */
	public java.lang.String getPassword() {
		return this.password;
	}
	/**
	 * 设置 age
	 * @param age
	 */
	public void setAge(java.lang.Integer age) {
		this.age = age;
	}
	/**
	 * age
	 * @return
	 */
	public java.lang.Integer getAge() {
		return this.age;
	}



	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("UserName",getUserName())
			.append("Password",getPassword())
			.append("Age",getAge())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof User == false) return false;
		if(this == obj) return true;
		User other = (User)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

