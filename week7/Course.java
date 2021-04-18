package week7;

import java.util.ArrayList;

public class Course {
	private String cId;
	private String cName;
	private int capacity = 0;
	private int size = 0;
	ArrayList<Student> list = new ArrayList<Student>() {
		
		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < list.size() ; i++) {
				Student stu = list.get(i);
				sb.append(stu.getsId()).append("  ").append(stu.getSname()).append("\n");
			}
			return sb.toString();
		}
	};
	
	
	public String getcId() {
		return cId;
	}
	public void setcId(String cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
	@Override
	public String toString() {
		return "�γ�Id: " + cId + ", �γ�����: " + cName + ", �γ�����: " + capacity + "\nѡ������: " + size + "\nѧ��       ����  \n"
				+ list;
	}
	
	
	
}
