package com.tanhyeon.milcalculator;
//import java.text.SimpleDateFormat;
//import java.util.Scanner;
class Main {
	public static void main(String[] args) {


		Run rrr = new Run("�ƹ���", 2019, 4, 1, 2020, 10, 20);
		Run gibeom = new Run("����", 2019, 4, 1, 2020, 11, 2);
		//Run jinwoo = new Run("������", 2018, 12, 17, 2020, 7, 27);
		//Run jaewook = new Run("�����",2019,1,7,2020,8,14);    
		//Run hyeon = new Run("Ȳ��", 2019, 4, 8, 2020, 11, 9);
		//Run joonyeong = new Run("���ؿ�", 2019, 7, 8, 2021, 01, 31);
		//Run taeseok = new Run("���¼�", 2019, 4, 8, 2020, 11, 9);
		//Run hyeongwoo = new Run("������", 2019, 3, 5, 2020, 10, 8);
		//Run woohyeok = new Run("�̿���", 2019, 1, 21, 2020, 8, 27);
		//Run jongmin = new Run("������", 2019,4,29,2020,11,28);
		//Run byeonghee = new Run("�̺���", 2019, 3, 11, 2020, 10, 14);
		//Run dongyeol = new Run("�ֵ���", 2019, 4, 22, 2020, 11, 22);
		//Run yoonjae = new Run("������", 2019, 5, 27, 2020, 12, 25);
		//Run mimmam = new Run("�ҹҸ�", 2019, 4, 8, 2020, 11, 9);

		rrr.calculating();
		//jinwoo.calculating();
		//jaewook.calculating();
		//woohyeok.calculating();
		//hyeongwoo.calculating();
		//byeonghee.calculating();
		gibeom.calculating();

		//hyeon.calculating();
		//joonyeong.calculating();
		//taeseok.calculating();
		//dongyeol.calculating();
		//jongmin.calculating();
		//yoonjae.calculating();
		//mimmam.calculating();
		//int differenceDays = mimmam.getRemainDays()-gibeom.getRemainDays();
		//double differencePercentage = gibeom.getPercentage()-mimmam.getPercentage();

		//«���� ����
		//System.out.printf("\n\n%s�԰� %s���� « ����: �����ϱ��� %s���� %s�Ժ��� %d�� �� ������ %.4f%%��ŭ ���̰� ���ϴ�. ",mimmam.getName(), gibeom.getName(),mimmam.getName(), gibeom.getName(), differenceDays,differencePercentage);

	}
}