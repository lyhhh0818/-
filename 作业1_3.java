package ��ҵ;

import java.util.Scanner;

public class ��ҵ1_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// ����
		final int COINS100 = 100;
		final int COINS50 = 50;
		final int COINS20 = 20;
		final int COINS10 = 10;
		final int COINS5 = 5;
		final int COINS2 = 2;
		final int COINS1 = 1;
		int numberOfCoins;
		int leftoverCoins;
		int numberOf100;
		int numberOf50;
		int numberOf20;
		int numberOf10;
		int numberOf5;
		int numberOf2;
		int numberOf1;

		// ����
		System.out.println("��������Ԫ������λ�����֣�");
		numberOfCoins = scan.nextInt();
		// ����
		numberOf100 = numberOfCoins / COINS100;
		leftoverCoins = numberOfCoins % COINS100;
		numberOf50 = leftoverCoins / COINS50;
		leftoverCoins = leftoverCoins % COINS50;
		numberOf20 = leftoverCoins / COINS20;
		leftoverCoins = leftoverCoins % COINS20;
		numberOf10 = leftoverCoins / COINS10;
		leftoverCoins = leftoverCoins % COINS10;
		numberOf5 = leftoverCoins / COINS5;
		leftoverCoins = leftoverCoins % COINS5;
		numberOf2 = leftoverCoins / COINS2;
		leftoverCoins = leftoverCoins % COINS2;
		numberOf1 = leftoverCoins / COINS1;
		leftoverCoins = leftoverCoins % COINS1;

		// ���
		System.out.println("���Ի�" + numberOf100 + "��Ԫ");
		System.out.println(numberOf50 + "��50����");
		System.out.println(numberOf20 + "��20����");
		System.out.println(numberOf10 + "��10����");
		System.out.println(numberOf5 + "��5����");
		System.out.println(numberOf2 + "��2����");
		System.out.println(numberOf1 + "��1����");

	}

}
