package week9.vo;

public class Student {
	private  String IDNumber;
	private  String name;
	private  String gender;
	private  String province;
	public String getIDNumber() {
		return IDNumber;
	}
	public void setIDNumber(String iDNumber) {
		IDNumber = iDNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public Student() {
		super();
	}
	public Student(String iDNumber, String name, String gender, String province) {
		super();
		this.IDNumber = iDNumber;
		this.name = name;
		this.gender = gender;
		this.province = province;
	}
	@Override
	public String toString() {
		return "Student [IDNumber=" + IDNumber + ", name=" + name + ", gender=" + gender + ", province=" + province
				+ "]";
	}
	
	
	
	
}
