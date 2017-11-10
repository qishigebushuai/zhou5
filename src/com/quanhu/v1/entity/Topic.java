/**
 * 
 */
package com.quanhu.v1.entity;

import java.util.Date;

/**
 * created by chenshi at 2017年11月10日 上午9:28:55
 */
public class Topic{
	
	private	Long	id;
	
	private	String	createUserId;
	
	private	Date	createDate;
	
	private	String	title;
	
	
	
	/**
	 * 
	 */
	public Topic() {
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getCreateUserId() {
		return createUserId;
	}



	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}



	public Date getCreateDate() {
		return createDate;
	}



	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}

}
