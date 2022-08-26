package test;

import java.io.IOException;
import view.ConsoleUI7;

public class TestConsoleUI {
	public static void main(String[] args) {
		//ConsoleUI1 ui=new ConsoleUI1();
		//ConsoleUI2 ui=new ConsoleUI2();
		//ConsoleUI3 ui=new ConsoleUI3();
		//ConsoleUI4 ui=new ConsoleUI4();
		//ConsoleUI5 ui=new ConsoleUI5();
		//ConsoleUI6 ui=new ConsoleUI6();
		ConsoleUI7 ui=new ConsoleUI7();
	
	try {
			ui.execute();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}
}
