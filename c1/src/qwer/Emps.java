package qwer;
import javax.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
public class Emps {
	@Entity
	@Table(name="Employee2")
	public class Emp1 {
	@javax.persistence.Id
	@GeneratedValue
	private int Id;
	
			private String Empname;
	
			private String Designation;
	
			private String Mobno;
	
			private String Salary;
	public int getId() {
		return Id;
	}
	public String getEmpname() {
		return Empname;
	}
	public String getDesignation() {
		return Designation;
	}
	public String getMobno() {
		return Mobno;
	}
	public String getSalary() {
		return Salary;
	}
	public void setId(int id) {
		Id = id;
	}
	public void setEmpname(String empname) {
		Empname = empname;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public void setMobno(String mobno) {
		Mobno = mobno;
	}
	public void setSalary(String salary) {
		Salary = salary;
	}
	


}
}
