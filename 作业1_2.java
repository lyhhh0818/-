package ��ҵ;

import java.util.Scanner;

public class ��ҵ1_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// ����
		final int BOX = 24;
		final int BOXES = 75;
		int numberOfCookies;
		int numberOfBox;
		int numberOfBoxes;
		int leftoverCookies;
		int leftoverBox;
		// ����
		System.out.println("�������������");
		numberOfCookies = scan.nextInt();
		// ����
		numberOfBox = numberOfCookies / BOX;
		leftoverCookies = numberOfCookies % BOX;
		numberOfBoxes = numberOfBox / BOXES;
		leftoverBox = numberOfBox % BOXES;
		// ���
		System.out.println("����װ" + numberOfBox + "�б���");
		System.out.println("����װ" + numberOfBoxes + "�����");
		System.out.println("��ʣ" + leftoverCookies + "������");
		System.out.println("��ʣ" + leftoverBox + "�б���");

	}

}
