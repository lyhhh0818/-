package ��ҵ;

import java.util.Scanner;

public class ��ҵ1_4 {
	public static void main(String[] args) {
		/*����ÿ�������1Ӣ�����������ɫ�ĳɱ���ÿӢ��0.10��Ԫ��
		��ͨ��ܵĳɱ���ÿӢ��0.15��Ԫ������ʽ��ܵĳɱ���ÿӢ��0.25��Ԫ
		����ͼƬ�������һ��ֽ��ֽ�ĳɱ���ÿƽ��Ӣ��0.02��Ԫ����ͼƬ��
		�����ò����ĳɱ���ÿƽ��Ӣ��0.07��Ԫ���˿�Ҳ����ѡ���ڽ��ϼ���
		��ÿ��0.35��Ԫ��
		��дһ��������ʾ�û�����������Ϣ��Ȼ���������ĳɱ���
		(A)ͼƬ�ĳ��ȺͿ��(��Ӣ��Ϊ��λ)b)��ܵ�����
		(C)�ͻ��Կ����ɫ��ѡ��
		(D)����û���Ҫ�������ڣ���ô�ڵ�������
		*/
		Scanner scan = new Scanner(System.in);
		// ����
		final double COSTOFCOLOURING = 0.10;
		final double WIDE = 1;
		final double REGULARFRAME = 0.15;
		final double FANCYFRAME = 0.25;
		final double PAPER = 0.02;
		final double GLASS = 0.07;
		final double CROWNS = 0.35;
		double  wide;
		double length;
		int numberOfCrowns;
		double cost;
		int frame;
		double Frame;
		// ����
		System.out.println("�����볤");
		length = scan.nextDouble();
		System.out.println("�������");
		wide = scan.nextDouble();
		System.out.println("��ѡ��1.��ͨ���  2.��ʽ���");
		frame =  scan.nextInt();
		System.out.println("���������ڵ�����");
		numberOfCrowns = scan.nextInt();
		// ����
		if(frame==1) Frame=REGULARFRAME;
		else Frame=FANCYFRAME;
		cost=numberOfCrowns*CROWNS+length*wide*GLASS+length*wide*PAPER+COSTOFCOLOURING*WIDE*2*(length+wide+2*length*wide);
			
		// ���
		System.out.println("����ɱ�Ϊ" + cost + "��Ԫ");	
		
	}

}
