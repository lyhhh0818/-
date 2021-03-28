package 第五章习题4;

public class Dog {
	private String name;
	private String color;
	private String old;
	
	public Dog() {
		this.name="阿黄";
		this.color="黄";
		this.old="5";
	}
	public Dog(String name, String color,String old) {
		this.name=name;
		this.color=color;
		this.old=old;
	}
	public void displayDog() {
		System.out.println("名字："+this.name);
		System.out.println("颜色："+this.color);
		System.out.println("年龄："+this.old);
		System.out.println("*************************************************");
	}
}
