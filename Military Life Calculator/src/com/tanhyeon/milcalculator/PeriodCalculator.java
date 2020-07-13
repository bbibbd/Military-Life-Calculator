package com.tanhyeon.milcalculator;

import java.time.Period;
import java.time.LocalDate; 
import java.time.Period; 
import java.time.temporal.ChronoUnit;

class PeriodCalculator extends DataManagement {

	//DataManagement�� �ִ� ���� ����
	public void calculatingPeriode(){
		LocalDate today = LocalDate.now();
		LocalDate start = LocalDate.of(startYear, startMonth, startDate);
		LocalDate end = LocalDate.of(endYear, endMonth, endDate); 
		Period between = Period.between(start, end);

		betweenYear = between.getYears();
		betweenMonth = between.getMonths();
		betweenDays = between.getDays(); 

		totalDays = (int)ChronoUnit.DAYS.between(start, end)+1;
		remainDays = (int)ChronoUnit.DAYS.between(today,end);
		remainWeeks = (int)ChronoUnit.WEEKS.between(today, end);
		pastDays = (int)ChronoUnit.DAYS.between(start, today)+1;
		percentage = pastDays*100.0/totalDays;
	}

	//���� « ��
	public int eatedJjam(){
		return pastDays*3;//�Ϸ翡 3���� �Դ´ٰ� �� �� ���
	}

	//�Ծ�� �ϴ� « ��
	public int willEatJjam(){
		return remainDays*3;
	}

	//���ݱ��� �� �ۼ�Ʈ
	public double dayPercentage(){
		double dayP =100.0/totalDays;
		return dayP;
	}

	//Ư�� �ۼ�Ʈ���� ���� �ϼ� ���ϴ� method
	public int remainPercentage(int percentage){ //percentage�� �μ��� �޾�
		int quarter=totalDays/4;  //��ü ����Ȱ�� 1/4
		int half=totalDays/2; //��ü ����Ȱ�� 1/2
		int halfAndQuarter=(int)(totalDays*0.75); //��ü ����Ȱ�� 3/4
		int oneOverThree=totalDays/3; //��ü ����Ȱ�� 1/3 --> 66%���� ���� �ϼ� ���Ҷ� ��

		int tenP=(int)(totalDays*0.1);  //��ü ����Ȱ�� 10%
		int twentyP=(int)(totalDays*0.2); //��ü ����Ȱ�� 20%
		int thirtyP=(int)(totalDays*0.3); //��ü ����Ȱ�� 30%
		int fortyP=(int)(totalDays*0.4);  //��ü ����Ȱ�� 40%
		int sixtyP=(int)(totalDays*0.6);  //��ü ����Ȱ�� 60%
		int seventyP=(int)(totalDays*0.7);  //��ü ����Ȱ�� 70%
		int eightyP=(int)(totalDays*0.8); //��ü ����Ȱ�� 80%
		int ninetyP=(int)(totalDays*0.9); //��ü ����Ȱ�� 90%

		int remainQuarter = remainDays-halfAndQuarter;  //1/4 (25%)���� ���� �ϼ�  
		int remainHalf = remainDays - half; //1/2(50%)���� ���� �ϼ�
		int remainOneOverThree = remainDays-2*oneOverThree; //1/3(33%)���� ���� �ϼ�
		int remainTwoOverThree =remainDays-oneOverThree;  //2/3(66%)���� ���� �ϼ�
		int remainHalfAndQuarter = remainDays-quarter;  //3/4(75%)���� ���� �ϼ�

		int remainTenP = remainDays - ninetyP;  //10%���� ���� �ϼ�
		int remainTwentyP = remainDays - eightyP; //20%���� ���� �ϼ�
		int remainThirtyP = remainDays - seventyP;  //30%���� ���� �ϼ�
		int remainFortyP = remainDays - sixtyP; //40%���� ���� �ϼ�
		int remainSixtyP = remainDays - fortyP; //60%���� ���� �ϼ�
		int remainSeventyP = remainDays - thirtyP;  //70%���� ���� �ϼ�
		int remainEightyP = remainDays - twentyP; //80%���� ���� �ϼ�
		int remainNinetyP = remainDays - tenP;  //90%���� ���� �ϼ�

		if(percentage==10)  return remainTenP;  //10%�� �� ���� �ϼ� 
		else if(percentage==20) return remainTwentyP;
		else if(percentage==25)  return remainQuarter;
		else if(percentage==30)  return remainThirtyP;
		else if(percentage==33)  return remainOneOverThree;
		else if(percentage==40)  return remainFortyP;
		else if(percentage==50)  return remainHalf;
		else if(percentage==60)  return remainSixtyP;
		else if(percentage==66)  return remainTwoOverThree;
		else if(percentage==70)  return remainSeventyP;
		else if(percentage==75)  return remainHalfAndQuarter;
		else if(percentage==80)  return remainEightyP;
		else if(percentage==90)  return remainNinetyP;
		else return 0;

	}

	//�ۼ�Ʈ�� ���� ������� « á���� �����ִ� method
	public int jjam(double percentage){
		int jjam;
		if(percentage < 20) jjam = 1;
		else if(percentage < 30)  jjam = 2;
		else if(percentage < 40)  jjam = 3;
		else if(percentage < 50)  jjam = 4;
		else if(percentage < 60)  jjam = 5;
		else if(percentage < 70)  jjam = 6;
		else if(percentage < 90)  jjam = 7;
		else if(percentage <= 98) jjam = 8;
		else if(percentage <100)  jjam = 9;
		else  jjam =10;
		return jjam;
	}

	//D-365��, D+365�ϱ��� ���� �ϼ�
	public int oneYear(){
		System.out.println();
		if(remainDays < 365){ //����Ȱ�� 1�⺸�� ���� ������ ���
			if(pastDays<365) return 1;  // 1�� �Ѱ� ����Ȱ �� ���
			else if(pastDays==365) return 2;  //�� 1���� ���
			else return 3;  //1�⺸�� ���� ����Ȱ �� ���
		}
		else if(remainDays==365) return 4;  //�� 1�� ���� ���
		else  return 5; //����Ȱ 1�� �Ѱ� ���� ���
	}

	//�Դ����� 100�� ������ ���� �ϼ��� �����ִ� method
	public int pastHund(int pHund){
		if(pHund == 100)  return 100-pastDays;  //�Դ� 100�ϱ��� ���� �ϼ�
		else if(pHund == 200)  return 200-pastDays; //�Դ� 200�ϱ��� ���� �ϼ�
		else if(pHund == 300)  return 300-pastDays; //�Դ� 300�ϱ��� ���� �ϼ�
		else if(pHund == 400)  return 400-pastDays; //�Դ� 400�ϱ��� ���� �ϼ�
		else if(pHund == 500)  return 500-pastDays; //�Դ� 500�ϱ��� ���� �ϼ�
		else return 0;
	}

	//�������� 100�� ������ ���� �ϼ��� �����ִ� method
	public int remainHund(int rHund){
		if(rHund == 500) return remainDays - 500; //���� 500�ϱ��� ���� �ϼ�
		else if(rHund == 400) return remainDays - 400;  //���� 400�ϱ��� ���� �ϼ�
		else if(rHund == 300) return remainDays - 300;  //���� 300�ϱ��� ���� �ϼ�
		else if(rHund == 200) return remainDays - 200;  //���� 200�ϱ��� ���� �ϼ�
		else if(rHund == 100) return remainDays - 100;  //���� 100�ϱ��� ���� �ϼ�
		else return 0;
	}

	//����Ȱ�� �Ϸ� 24�ð� �ϰ��� ǥ������ ���(00:00~23:59����)
	public String dayConvert(){
		int hours= (int)(24*(percentage/100));
		int minutes = (int)((24.0*(percentage/100.0)-hours)*60);
		String day = hours+"�� "+ minutes+"��. ";

		if(hours>0&&hours<6) day = day + "���� ��ħ ��";
		else if(hours == 6){
			if (minutes<30) day = day + "���� ��ħ ��";
			else if (minutes<50)  day = day + "��� �� ��ħ��ȣ ���� ��...";
			else  day = day + "�����忡�� ��ħ ��ȣ���� ��...";
		}
		else if(hours==7){
			if (minutes<30) day = day + "��ħ��ȣ, ��ħ�ܰ��� ��^^";
			else if (minutes<50)  day = day + "���� �Ļ� ��";
			else  day = day + "�ʹ� �Ļ� ��";
		}
		else if(hours==8){
			if (minutes<20) day = day + "�ʹ� �Ļ� ��";
			else if (minutes<30)  day = day + "�ϰ��غ� ��";
			else  day = day + "�����ϰ� ���� ��...";
		}
		else if(hours>8&&hours<11)  day = day + "�����ϰ� ���� ��...";
		else if(hours==11){
			if (minutes<30) day = day + "�����ϰ� ���� ��...";
			else day = day + "���ɽð�";
		}
		else if(hours==12)  day = day + "���ɽð�";
		else if(hours>=13&&hours<15) day = day + "���� �ϰ� ���� ��...";
		else if(hours == 15){
			if (minutes<30) day = day + "���� �ϰ� ���� ��...";
			else day = day + "ü�� ���� ��...";
		} 
		else if(hours<=17){
			if (minutes==0)  day = day + "ü�� ��...";
			else if(minutes<30)  day = day + "ü�� �� �޽� ��...";
			else day = day + "��������!!!!";
		}

		else if(hours==18){
			if(hours<30)  day = day + "���� ����Ļ���...";
			else  day = day + "�ʹ� ����Ļ� ��...";
		}
		else if(hours>18&&hours<20)  day = day + "��������!!!!";
		else if(hours ==20) {
			if(minutes<30) day = day + "��������!!!!";
			else day = day + "�ӹ��д����� ���� û�� ��...";
		}
		else if(hours == 21){
			if(minutes<15) day = day + "û�� ��, «�� �� �޴��� ��� ��";
			else if(minutes<30) day = day + "�޴��� �ݳ�, ������ȣ ���� ��";
			else if(minutes<45) day = day + "������ȣ ��";
			else  day = day + "��ȣ ��, �̺�� ���� ���ϴ� ��";
		}
		else if(hours >= 22)  day = day + "���� ��...";
		return day;
	}

	//���� ����Ȱ ���� ����� �� ��, ��ĥ �ؾ� �ϴ��� ���ϴ� method
	public int howManyBasik(int n){
		int basikWeeks =   remainWeeks/4; //����� �� �� �ؾ��ϴ°� - 4�ֿ� �� �� �ٹ���
		int basikDays = basikWeeks*7; //����� ��ĥ �ؾ��ϴ°� - 1���Ͽ� 7�� ����� �ϱ� ������

		if(n==1)  return basikWeeks;  
		else  return basikDays;
	}

	//���� ����Ȱ ���� ��ȸ �� �� �����ϴ��� �����ִ� method
	public int howManyChurch(){
		return remainWeeks; //1���Ͽ� �� �� ��ȸ�� ��
	}

	//���� ����Ȱ ���� �ٹ� �� �� ������ �����ִ� method
	public int howManyGeunmu(){
		int geunmu = (int)remainWeeks*3; //1���Ͽ� 3�� �ٹ��� ���ٰ� �������� ��
		return geunmu;

	}
}

//�Դ����� �Է��ϸ� �ڵ����� �������� �����ִ� ���α׷� �����
//��¥ �Է��ϸ� �� ������ ��ĥ ���Ұ�, �׳����� �ϸ� ��%�ߴ��� �����ִ� ���α׷�