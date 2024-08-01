package xyz.itwill.dto;

//create table userinfo(userid varchar2(100) primary key, password varchar2(100)
//	    , name varchar2(200), email varchar2(300), auth number(1));

public class UserinfoDTO {
	private String userid;
	private String password;
	private String mail;
	private String email;
	private int auth;
	
	public UserinfoDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAuth() {
		return auth;
	}

	public void setAuth(int auth) {
		this.auth = auth;
	}
}
