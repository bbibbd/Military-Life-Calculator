package com.tanhyeon.milcalculator;

import java.util.Calendar;

public class DayCalculator{		

	public String addDays(int days){
		Calendar now = Calendar.getInstance();
		now.add(Calendar.DATE, days);

		return now.get(Calendar.YEAR)+"�� "+(now.get(Calendar.MONTH)+1)+"�� "+now.get(Calendar.DATE)+"��";
	}

}