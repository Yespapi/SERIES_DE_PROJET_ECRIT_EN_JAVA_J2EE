package com.senegal.explorer.uar;
import javax.swing.*;
/***
 * 
 * @author Aly BA 
 * class principale
 * lance l'application
 */

public class Main {
	
	public static void main(String[] args) {
		Interface testView = new Interface();
		testView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		testView.setSize(480,320);
		testView.setVisible(true);
	}
}
