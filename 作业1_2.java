package 作业;

import java.util.Scanner;

public class 作业1_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 定义
		final int BOX = 24;
		final int BOXES = 75;
		int numberOfCookies;
		int numberOfBox;
		int numberOfBoxes;
		int leftoverCookies;
		int leftoverBox;
		// 输入
		System.out.println("请输入饼干数量");
		numberOfCookies = scan.nextInt();
		// 计算
		numberOfBox = numberOfCookies / BOX;
		leftoverCookies = numberOfCookies % BOX;
		numberOfBoxes = numberOfBox / BOXES;
		leftoverBox = numberOfBox % BOXES;
		// 输出
		System.out.println("可以装" + numberOfBox + "盒饼干");
		System.out.println("可以装" + numberOfBoxes + "箱饼干");
		System.out.println("还剩" + leftoverCookies + "个饼干");
		System.out.println("还剩" + leftoverBox + "盒饼干");

	}

}
