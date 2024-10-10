package com.springboot.rest.entity;

import javax.persistence.*;

@Entity
@Table(name = "user_table",
		uniqueConstraints = @UniqueConstraint(columnNames = "user_id")) // Change here
public class User {

	@Id
	@Column(name = "user_id", nullable = false)
	private String userId;

	@Column(name = "user_name")
	private String userName;

	public User() {}

	public User(String userId, String userName) {
		this.userId = userId;
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
