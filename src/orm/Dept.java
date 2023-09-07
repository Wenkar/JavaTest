package orm;

import java.io.Serializable;

public class Dept implements Serializable{
	private Integer deptno;
	private String dname;
	private String loc;
	
	public Dept() {       //建構子:快速產出 右鍵 Source Generate Constructors from super Class
		super();
	}
	
	public Dept(Integer deptno, String dname, String loc) {    //建構子設置參數 :快速產出 右鍵 Source Generate Constructor Using Field
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	public Integer getDeptno() {   //getter、setter : 快速產出 右鍵 Source Generate getters and setters
		return deptno;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}
	
	

}
