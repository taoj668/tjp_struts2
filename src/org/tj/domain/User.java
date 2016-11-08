package org.tj.domain;

public class User {
private String uname;
private String upass;
private String name;
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getUpass() {
	return upass;
}
public void setUpass(String upass) {
	this.upass = upass;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public User(String uname, String upass, String name) {
	super();
	this.uname = uname;
	this.upass = upass;
	this.name = name;
}
public User() {
	super();
}

}
