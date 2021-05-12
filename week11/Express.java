package week11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Express {
	public static void main(String[] args) {
		String express = "add(max(1,doubleMe(2)),min(5,sub(7,2)))";//
		String regex= "((add)|(sub)|(max)|(min)|(doubleMe))\\(\\d{1,}(,\\d{1,})?\\)";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(express);
//		String result = express;
		System.out.println(express);
		while(m.find()) {
			String basicExpress = m.group();
			String result = cal(basicExpress);
			System.out.println(basicExpress+"="+result);
			basicExpress=basicExpress.replaceAll("\\(", "\\\\(");
			basicExpress=basicExpress.replaceAll("\\)", "\\\\)");
			express = express.replaceAll(basicExpress, result);
			System.out.println(express);
			m = p.matcher(express);
		}
		System.out.println(express);
	}
	public static String cal(String s){
		String result="";
		int pos = s.indexOf("(");
		String fun=s.substring(0,pos);
		if(fun.equals("doubleMe")){
			int pos2=s.indexOf(")");
			s=s.substring(pos+1, pos2);
			int num=Integer.parseInt(s);
			num=num*num;
			result+=num;
		}
		else{
			int pos1=s.indexOf(",");
			int pos2=s.indexOf(")");			
			int num1=Integer.parseInt(s.substring(pos+1, pos1));
			int num2=Integer.parseInt(s.substring(pos1+1, pos2));
			int sum=0;
			switch(fun){
			case "add":sum=num1+num2;
			case "sub":sum=num1+num2;
			case "min":if(num1<=num2) {
					sum=num1;
				}else{
					sum=num2;
				}
			case "max":if(num1>=num2) {
					sum=num1;
				}else{
					sum=num2;
				}
			}
			result+=sum;
		}
		return result;
	}
	
}
