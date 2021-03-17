package com.hecj.service.user.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Transient;

/**
 * @说明:用户表
 * @author:hecj
 */
@Getter
@Setter
@Entity
public class UsrUser extends BaseModel{
 
	private static final long serialVersionUID = 1L;

	/** fields */
	/**
	 * phone:手机号
	 */
	protected java.lang.String phone;
	/**
	 * nick_name:昵称
	 */
	protected java.lang.String nickName;
	/**
	 * head_img:头像
	 */
	protected java.lang.String headImg;
	/**
	 * password:密码
	 */
	protected java.lang.String password;
	/**
	 * sex:0男,1女,2未知
	 */
	protected java.lang.Integer sex;
	/**
	 * status:0有效,1无效
	 */
	protected java.lang.Integer status;
	/**
	 * 0正常,1账号注销,永久删除
	 */
	protected Integer deleted;
	/**
	 * 出生日期
	 */
	protected Long birthdate;
	/**
	 * reg_source:注册来源
	 */
	protected java.lang.String regSource;

	// vo
	@Transient
	protected java.lang.String token;
	
}
