package qwer;
import javax.persistence.*;
public class Emp1 {
	
	@Id
	@Column(name="Id")
	@GeneratedValue
	private int Id;
	@Column(name="FirstName")
			private String FirstName;
	@Column(name="LastName")
			private String LastName;
	@Column(name="Mobno")
			private String Mobno;
	@Column(name="emi")
			private String emi;
	public void setId(int id) {
		Id = id;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public void setMobno(String mobno) {
		Mobno = mobno;
	}
	public void setEmi(String emi) {
		this.emi = emi;
	}
	public int getId() {
		return Id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public String getLastName() {
		return LastName;
	}
	public String getMobno() {
		return Mobno;
	}
	public String getEmi() {
		return emi;
	}
}















