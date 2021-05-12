package week9.vo;

public class Result {
	private String province;
	private int count;
	private String name;
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String names) {
		this.name = names;
	}
	public Result(String province, int count, String names) {
		super();
		this.province = province;
		this.count = count;
		this.name = names;
	}
	public Result() {
		super();
	}
	@Override
	public String toString() {
		return province + ":" + count + "»À  £®" + name + "£©";
	}
	
	
}
