package week8;

import java.util.Scanner;

public class password {
	public static void main(String[] args) {
		boolean flag=false;
		while(flag==false){
			boolean flaglength=false;
			boolean flagkg=false;
			boolean flagupper=false;
			boolean flaglower=false;
			boolean flagnumber=false;
			
			System.out.println("���������룬Ҫ������");
			System.out.println("1.����5~10");
			System.out.println("2.�����пո�");
			System.out.println("3.�д�д��Сд");
			System.out.println("4.������");
			Scanner scan =new Scanner(System.in);
			String password;
			password = scan.next();
			int len=password.length();
			if(len>10||len<5){				
				flaglength=true;
			}
			for(int i=0;i<password.length();i++){
				char c=password.charAt(i);				
				if(c==' '){
					flagkg=true;
					break;
				}
				if(c>='A'&&c<='Z'){
					flagupper=true;
				}
				if(c>='a'&&c<='z'){
					flaglower=true;
		
				}
				if(c>='0'&&c<='9'){
					flagnumber=true;
				}
			}
			if(!flagkg && flagupper && flaglower && flagnumber && !flaglength ){
				System.out.println("������ȷ");
				flag=true;
			}
			else{
				System.out.println("�������ԭ�����£�");
				if(flaglength) System.out.println("���Ȳ���ȷ");
				if(flagkg) System.out.println("�пո�");
				if(!flagupper) System.out.println("û�пմ�д��ĸ");
				if(!flaglower) System.out.println("û�пո�Сд��ĸ");
				if(!flagnumber) System.out.println("û������");
			}
		}
		
			
	}
}
