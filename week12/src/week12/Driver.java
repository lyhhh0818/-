package week12;

import java.util.ArrayList;

import week12.dao.Dao;
import week12.vo.Course;
import week12.vo.Result;
import week12.vo.Student;

public class Driver {
	public static void main(String[] args) {
		ArrayList<Student> stuList = new ArrayList<Student>();
		stuList = Dao.importStudentFromTxt();     
//		stuList = Dao.importStudentFromExcel();
		ArrayList<Course> couList = new ArrayList<Course>();
//		couList = Dao.importCourseFromTxt();
		couList = Dao.importCourseFromExcel();		
		
		ArrayList<Student> list3 = new ArrayList<Student>();
		list3 = Dao.processByStudent(stuList,couList);
		ArrayList<Result> list4 = new ArrayList<Result>();
		list4 = Dao.processByCourse(couList);
		
		Dao.printAll(list3,list4);
		Dao.writeTxt(list3,list4);
	}
	
	
	
	
}
