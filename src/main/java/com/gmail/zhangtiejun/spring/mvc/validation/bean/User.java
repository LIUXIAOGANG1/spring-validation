package com.gmail.zhangtiejun.spring.mvc.validation.bean;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

public class User {
	@NotNull(message = "用户名不能为空")
	@Size(min = 2, max = 20, message = "用户名长度必须是 2 - 20")
	private String username;
	
	@NotNull(message = "密码不能为空")
	@Size(min = 6, max = 32, message = "密码长度必须是 6 - 32")
	private String password;
	
	@NotNull(message = "邮件地址不能为空")
	@Email(message = "{org.hibernate.validator.constraints.Email.message}")
	private String email;
	
	@Pattern(regexp="^[0]{1}[0-9]{2,3}-[0-9]{7,8}$", message="电话格式错误")
	private String telephone;
	
	@Pattern(regexp="^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$", message="电话格式错误")
	private String mobile;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", email=" + email + ", telephone=" + telephone + ", mobile=" + mobile + "]";
	}
}
