package Projectmain.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contactinfo
{
@Id
private String email;
private String fname;
private String username;
private String password;
private String cpassword;
public Contactinfo() {
	super();
	
}
public Contactinfo(String email, String fname, String username, String password, String cpassword) {
	super();
	this.email = email;
	this.fname = fname;
	this.username = username;
	this.password = password;
	this.cpassword = cpassword;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
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
public String getCpassword() {
	return cpassword;
}
public void setCpassword(String cpassword) {
	this.cpassword = cpassword;
}

}
