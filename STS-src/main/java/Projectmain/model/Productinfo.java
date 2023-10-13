package Projectmain.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Productinfo
{

	@Id
	private int pid;
	private String pname;
	private int prate;
	public Productinfo() {
		super();
		
	}
	public Productinfo(int pid, String pname, int prate) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.prate = prate;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrate() {
		return prate;
	}
	public void setPrate(int prate) {
		this.prate = prate;
	}

	
}
