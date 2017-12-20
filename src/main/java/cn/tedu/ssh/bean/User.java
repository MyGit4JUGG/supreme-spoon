package cn.tedu.ssh.bean;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = -5871217603792155804L;
	private Integer id;
	private String username;
	private String password;
	private String mobilePhoneNumber;
	private String email;
	
	public User() {
		super();
	}

	public User(String username, String password, String mobilePhoneNumber, String email) {
		super();
		this.username = username;
		this.password = password;
		this.mobilePhoneNumber = mobilePhoneNumber;
		this.email = email;
	}

	public User(Integer id, String username, String password, String mobilePhoneNumber, String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.mobilePhoneNumber = mobilePhoneNumber;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public String getMobilePhoneNumber() {
		return mobilePhoneNumber;
	}

	public void setMobilePhoneNumber(String mobilePhoneNumber) {
		this.mobilePhoneNumber = mobilePhoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", mobilePhoneNumber="
				+ mobilePhoneNumber + ", email=" + email + "]";
	}
	
}
