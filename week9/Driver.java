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
001����ɺ��Ů������
002�����ƣ��У�����
003�����࣬Ů������
004���������У�����
005������Ů���㶫
006��������Ů������
end
*/