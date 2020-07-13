package com.tanhyeon.milcalculator;

class DataManagement{

	protected int startYear=2019; //�Դ��� �⵵
	protected int startMonth=1;   //�Դ��� ��
	protected int startDate=21;   //�Դ��� ��

	protected int endYear=2020;   //�����ϴ� �⵵
	protected int endMonth=11;    //�����ϴ� ��
	protected int endDate=20;     //�����ϴ� ��

	protected int betweenYear;  //��ü ����Ȱ O��
	protected int betweenMonth; //��ü ����Ȱ O��
	protected int betweenDays;  //��ü ����Ȱ O��

	protected int totalDays;    //��ü ����Ȱ�ϴ� �ϼ�
	protected int remainDays;   //���� �ϼ�
	protected int remainWeeks;  //���� ��
	protected int pastDays;     //�̹� �� �ϼ�
	protected double percentage;//����Ȱ ���ۼ�Ʈ �ߴ���

	public void setStartYear(int startYear){
		this.startYear = startYear;
	}

	public void setStartMonth(int startMonth){
		this.startMonth = startMonth;
	}

	public void setStartDate(int startDate){
		this.startDate = startDate;
	}  

	public void setEndYear(int endYear){
		this.endYear = endYear;
	}

	public void setEndMonth(int endMonth){
		this.endMonth = endMonth;
	}

	public void setEndDate(int endDate){
		this.endDate = endDate;
	}  

	public void setRemainWeeks(int remainWeeks){
		this.remainWeeks = remainWeeks;
	}

	public int getBetweenYear(){
		return betweenYear;
	}

	public int getBetweenMonth(){
		return betweenMonth;
	}

	public int getBetweenDay(){
		return betweenDays;
	}

	public int getTotalDays(){
		return totalDays;
	}

	public int getRemainDays(){
		return remainDays;
	}

	public int getPastDays(){
		return pastDays;
	}

	public int getRemainWeeks(){
		return remainWeeks;
	}

	public double getPercentage(){
		return percentage;
	}
}