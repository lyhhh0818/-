package 作业;

import java.util.Scanner;

public class 作业1_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 定义
		String songTitle;
		float songPrice;
		int number;
		float totalRevence;
		float siteTevence;
		float managerRevence;
		float siteRate;
		float managerRate;
		// 赋值
		siteRate = 0.03f;
		managerRate = 0.12f;

		System.out.println("请输入歌曲名称：");
		songTitle = scan.nextLine();
		System.out.println("请输入单价：");
		songPrice = scan.nextFloat();
		System.out.println("请输入数量：");
		number = scan.nextInt();
		// 运算
		totalRevence = songPrice * number;
		siteTevence = totalRevence * siteRate;
		managerRevence = totalRevence * managerRate;

		// 输出
		System.out.println("总利润：" + totalRevence);
		System.out.println("经理利润：" + siteTevence);
		System.out.println("站点利润：" + managerRevence);
	}
}
