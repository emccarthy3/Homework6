package edu.elon.math;

import java.util.ArrayList;

import javax.swing.JTextField;

public class FunctionServer {
	private static ArrayList<JTextField> textFields;
	public static void main(String[] args) {
		Function samsFunction = new SamsClub();
		Function dellFunction = new Dell();
		Function minAbsSumFunction = new MinimumAbsoluteSum();
		String inputText = "";
	   /* FunctionGuiApplication samsClient = new FunctionGuiApplication(samsFunction);
	    FunctionGuiApplication dellClient = new FunctionGuiApplication(dellFunction);
	    FunctionGuiApplication minClient = new FunctionGuiApplication(minAbsSumFunction);
	    */
	    dellFunction.setTextFields(textFields);
		samsFunction.setTextFields(textFields);
		minAbsSumFunction.setTextFields(textFields);
	}
}
