package ������ϰ��4;

public class Dog {
	private String name;
	private String color;
	private String old;
	
	public Dog() {
		this.name="����";
		this.color="��";
		this.old="5";
	}
	public Dog(String name, String color,String old) {
		this.name=name;
		this.color=color;
		this.old=old;
	}
	public void displayDog() {
		System.out.println("���֣�"+this.name);
		System.out.println("��ɫ��"+this.color);
		System.out.println("���䣺"+this.old);
		System.out.println("*************************************************");
	}
}
