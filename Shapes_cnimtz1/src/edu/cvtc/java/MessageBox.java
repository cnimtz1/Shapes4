package edu.cvtc.java;

import javax.swing.JOptionPane;

public class MessageBox implements Dialog {

	public int show(String message, String title) {
		
		return JOptionPane.OK_OPTION;
	};

	
	
}
