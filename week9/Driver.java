package week9;

import java.util.ArrayList;

import week9.dao.StudentDao;
import week9.vo.Result;
import week9.vo.Student;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<Student> list = StudentDao.inputFromKeyBoard();
			ArrayList<Result> listResult = StudentDao.calulateProvince(list);
			StudentDao.display(list,listResult);
		}
		
	

}
/*
001，张珊，女，湖北
002，李云，男，湖北
003，王燕，女，湖南
004，刘华，男，北京
005，徐泽，女，广东
006，李丽，女，北京
end
*/