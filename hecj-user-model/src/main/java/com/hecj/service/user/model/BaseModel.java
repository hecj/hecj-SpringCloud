package com.hecj.service.user.model;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.Getter;
import lombok.Setter;

/**
 * 模型基类
 * @author hecj
 */
@Getter
@Setter
public class BaseModel implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * id主键
	 */
	@Id
	protected String id;
	/**
	 * 创建时间
	 */
	protected Long createAt;
	/**
	 * 创建人
	 */
	protected String creater;
	/**
	 * 修改时间
	 */
	protected Long updateAt;
	/**
	 * 修改人
	 */
	protected String updater;
	
	// 只标注状态,非数据库字段 add/update
	@Transient
	private String status__;

	public BaseModel() {

	}

}