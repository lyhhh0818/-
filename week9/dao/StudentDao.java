package week9.dao;

import java.util.ArrayList;
import java.util.Scanner;

import week9.vo.Result;
import week9.vo.Student;

public class StudentDao {
	public static ArrayList<Student> inputFromKeyBoard(){
		ArrayList<Student> list = new ArrayList<Student>();
		Scanner scan = new Scanner(System.in);
		String data = scan.nextLine();
		
		while(!(data.equals("end"))){
			String stuArray[] = data.split(",|��");
//			System.out.println("1");
			Student student = new Student(stuArray[0],stuArray[1],stuArray[2],stuArray[3]);
			list.add(student);
			data = scan.nextLine();
		}
		return list;
	}
	
	public static int calulateByGender(ArrayList<Student> list,String gender){
		int count = 0;
		for (Student student : list) {
			String stuGender = student.getGender();
			if(stuGender.equals(gender)){
				count++;
			}
		}
		return count;
	}
	public static ArrayList<Result> calulateProvince(ArrayList<Student> list){
		ArrayList<Result> listResult = new ArrayList<Result>();
		for(int i=0;i<list.size();i++){
			Student stu = list.get(i);
			String province = stu.getProvince();
			String name = stu.getName();
			int index = isProvinceExist(listResult,province);
			if(index!=-1){
				Result oldResult = listResult.get(index);
				oldResult.setCount(oldResult.getCount()+1);
				oldResult.setName(oldResult.getName()+","+name);
				listResult.set(index, oldResult);
			}else{
				Result result = new Result(province,1,name);
				listResult.add(result);
			}
		}
		return listResult;
	}
	
	private static int isProvinceExist(ArrayList<Result> listResult,String province){
		int index = -1;
		
		for(int i=0;i<listResult.size();i++){
			Result result = listResult.get(i);
			if(result.getProvince().equals(province)){
				return i;
			}
		}
		return index;
	}
	
	public static void display(ArrayList<Student> list,ArrayList<Result> listResult){
		int totalCount = list.size();
		
		int maleCount = calulateByGender(list,"��");
		int femaleCount = calulateByGender(list,"Ů");
		
		System.out.println("��������"+totalCount);
		System.out.println("�����У�"+maleCount+"�ˣ�"+maleCount*100.0f/totalCount+"%,Ů:"+femaleCount+"�ˣ�"
				+femaleCount*100.0f/totalCount+"%");
		for (Result result : listResult) {
			System.out.println(result.toString());
		}
	}
}
