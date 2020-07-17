package com.tanhyeon.milcalculator;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FrameSetting extends JFrame {
	
	public FrameSetting(String title, int x, int y, int sizeX, int sizeY) {
		super(title);
		setLocation(x,y);
		setSize(sizeX,sizeY);
	}


	public void setButton () {
		JPanel confirmOrCancel = new JPanel();
		JButton confirm = new JButton("Ȯ��");
		JButton cancel = new JButton("���");
		confirmOrCancel.add(confirm);
		confirmOrCancel.add(cancel);
		add(confirmOrCancel, BorderLayout.SOUTH);
		
	}
	
	public void setDate() {
		 JPanel textField = new JPanel();
		 GridLayout g = new GridLayout(0,1,5,5);
		 textField.setLayout(g);
		JTextField inputStartDate = new JTextField("�Դ����� �Է����ֽʽÿ�");
		JTextField inputEndDate = new JTextField("�������� �Է����ֽʽÿ�");
		textField.add(inputStartDate);
		textField.add(inputEndDate);
		add(textField,BorderLayout.NORTH);	
	}
	
	public void showResult() {
		JLabel textArea = new JLabel();

		add(textArea,BorderLayout.CENTER);
	}


		

}
