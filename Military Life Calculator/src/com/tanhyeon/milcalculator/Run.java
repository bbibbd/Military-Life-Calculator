package com.tanhyeon.milcalculator;

import java.text.SimpleDateFormat;
import java.util.Scanner;
class Run {
	private String name;
	private int sy, sm, sd, ey, em, ed;

	public String getName(){
		return name;
	}



	public Run(String name, int sy, int sm, int sd, int ey, int em, int ed) {
		this.name = name;
		this.sy = sy;
		this.sm = sm;
		this.sd = sd;
		this.ey = ey;
		this.em = em;
		this.ed = ed;
	}

	PeriodCalculator calculator = new PeriodCalculator();

	public void calculating(){

		calculator.setStartYear(sy);
		calculator.setStartMonth(sm);
		calculator.setStartDate(sd);

		calculator.setEndYear(ey);
		calculator.setEndMonth(em);
		calculator.setEndDate(ed);
		calculator.calculatingPeriode();

		//�̹� ������ ����� ���
		if(calculator.getRemainDays()<=0){
			System.out.println("�����̽ó׿�. ���α׷��� �����մϴ�.");
			return ;
		}

		//��ü ����Ȱ �� �ϼ�, ���� �ϼ�
		System.out.printf("%s���� ��ü ����Ȱ: %d�� %d���� %d��(�� %d��)\n��\n%d��(%.4f%%) �ϼ�����, %d�� �����̽��ϴ�.\n\n",
				name,calculator.getBetweenYear(), calculator.getBetweenMonth(), calculator.getBetweenDay(), calculator.getTotalDays(), calculator.getPastDays(), (double)calculator.getPercentage(),calculator.getRemainDays());

		//Ư�� �ۼ�Ʈ(10%, 20%, 25%, 30%, 33%, ..., 90%)���� ���� �ϼ�
		DayCalculator dayCalculator = new DayCalculator();

		System.out.printf("�Ϸ翡 %.3f%%�� �����մϴ�. \n10%%������ %d�� (%s)\n20%%������ %d�� (%s)\n25%%������ %d�� (%s) \n30%%������ %d�� (%s)\n33%%������ %d�� (%s)\n40%%������ %d�� (%s)\n50%%������ %d�� (%s)\n60%%������ %d�� (%s)\n66%%������ %d�� (%s)\n70%%������ %d�� (%s)\n75%%������ %d�� (%s)\n80%%������ %d�� (%s)\n90%%������ %d�� (%s)\n���ҽ��ϴ�.\n"
				,calculator.dayPercentage()
				,calculator.remainPercentage(10) ,dayCalculator.addDays(calculator.remainPercentage(10))
				,calculator.remainPercentage(20) ,dayCalculator.addDays(calculator.remainPercentage(20))
				,calculator.remainPercentage(25) ,dayCalculator.addDays(calculator.remainPercentage(25))
				,calculator.remainPercentage(30) ,dayCalculator.addDays(calculator.remainPercentage(30))
				,calculator.remainPercentage(33) ,dayCalculator.addDays(calculator.remainPercentage(33))
				,calculator.remainPercentage(40) ,dayCalculator.addDays(calculator.remainPercentage(40))
				,calculator.remainPercentage(50) ,dayCalculator.addDays(calculator.remainPercentage(50))
				,calculator.remainPercentage(60) ,dayCalculator.addDays(calculator.remainPercentage(60))
				,calculator.remainPercentage(66) ,dayCalculator.addDays(calculator.remainPercentage(66))
				,calculator.remainPercentage(70) ,dayCalculator.addDays(calculator.remainPercentage(70))
				,calculator.remainPercentage(75) ,dayCalculator.addDays(calculator.remainPercentage(75))
				,calculator.remainPercentage(80) ,dayCalculator.addDays(calculator.remainPercentage(80))
				,calculator.remainPercentage(90) ,dayCalculator.addDays(calculator.remainPercentage(90)));

		//100��, 200�� ,,, 500�� ��������
		System.out.printf("\n�Դ� D+ \n100���� %d�� (%s)\n200���� %d�� (%s)\n300���� %d�� (%s)\n400���� %d�� (%s)\n500���� %d�� (%s) \n�����̽��ϴ�.\n\n���� D-\n500���� %d�� (%s)\n400���� %d�� (%s)\n300���� %d�� (%s)\n200���� %d�� (%s)\n100���� %d�� (%s)\n�����̽��ϴ�.\n",
				calculator.pastHund(100), dayCalculator.addDays(calculator.pastHund(100)),
				calculator.pastHund(200), dayCalculator.addDays(calculator.pastHund(200)),
				calculator.pastHund(300), dayCalculator.addDays(calculator.pastHund(300)),
				calculator.pastHund(400), dayCalculator.addDays(calculator.pastHund(400)),
				calculator.pastHund(500), dayCalculator.addDays(calculator.pastHund(500)),
				calculator.remainHund(500), dayCalculator.addDays(calculator.remainHund(500)),
				calculator.remainHund(400), dayCalculator.addDays(calculator.remainHund(400)),
				calculator.remainHund(300), dayCalculator.addDays(calculator.remainHund(300)),
				calculator.remainHund(200), dayCalculator.addDays(calculator.remainHund(200)),
				calculator.remainHund(100), dayCalculator.addDays(calculator.remainHund(100)));

		//�Դ����� 1�� �Ѱ� ���Ҵ���,  1���� ��������
		switch(calculator.oneYear()){
		case 1: System.out.printf("1��(D-365��)�� ����������, \n�Դ� 1�������� %d�� �����̽��ϴ�.",365-calculator.getPastDays());
		break;
		case 2: System.out.printf("1��(D-365��)�� ����������, �� �Դ����� 1�ֳ��̽ʴϴ�. ���ϵ帳�ϴ�^^");
		break;
		case 3: System.out.printf("1��(D-365��)�� ����������, �Դ����� 1������ �̹� �������ϴ�.");
		break;
		case 4: System.out.printf("�� 1�� �����̽��ϴ�..^^");
		break;
		case 5: System.out.printf("���� 1��(D-365��)�� �ȱ����̽��ϴ�. \n1�� ��������� %d�� �������� (%s), %d�� �� �Դ� 1������ �˴ϴ�.",calculator.getRemainDays()-365, dayCalculator.addDays(calculator.getRemainDays()-365),365-calculator.getPastDays());
		default:  break;
		}

		//���ݱ��� �밭 ���� «��
		System.out.printf("\n\n�Դ� �� ���ݱ��� ��� «�� %d�� �̸�, ������ %d�� �� ��ž� �մϴ�.\n\n",calculator.eatedJjam(),calculator.willEatJjam());

		//����� ���, �ٹ� ���, ��ȸ ���
		System.out.printf("\n�����Ҷ����� �ٹ��� �� %d��, ��ȸ�� %d��, ������� %d��(%d��) ���ҽ��ϴ�.\n",calculator.howManyGeunmu(),calculator.howManyChurch(),calculator.howManyBasik(1),calculator.howManyBasik(2));

		//����Ȱ�� 24�ð����� ǥ���Ͽ��� ��
		System.out.println("����� ����Ȱ�� 24�ð� �Ϸ� �ϰ��� ǥ������ ��, ���� �ð��� "+calculator.dayConvert()+"�Դϴ�.");

		//������� « á���� ������
		switch(calculator.jjam(calculator.getPercentage())){
		case 1: System.out.println("�����...?"); break;
		case 2: System.out.println("������ ���� ���׿�."); break;
		case 3: System.out.println("��������������. ���� «���Դϴ�."); break;
		case 4: System.out.println("������ �޷����� ������ «��");  break;
		case 5: System.out.println("« �� á�׿�..?");  break;
		case 6: System.out.println("��ǻ� �Ǽ�");  break;
		case 7: System.out.println("������ ���̱� �����Ѵ�..!");  break;
		case 8: System.out.println("Ȥ�� �����ϻ��...???");  break;
		case 9: System.out.println("����");  break;
		default:  System.out.println("����");  break;
		}
		System.out.println("---------------------------------------");
	}

	private double remainPercentage = calculator.getPercentage();  

	public double getPercentage(){
		return remainPercentage;
	}




}