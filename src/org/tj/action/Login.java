package org.tj.action;

import org.tj.domain.User;

import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
/*private String username;
private String password;

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
}*/
	private User user;
	
public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

/*@Override
	public String execute() throws Exception {
		if(user.getUname().equals("messi")){
			return "success";
		}
			return "error";
	}
*/
public String Login01(){
	if(user.getUname().equals("messi")){
		return "success";
	}
		return "error";
}
	
	
}
