package model.console;

import java.io.FileNotFoundException;
import java.io.IOException;
import model.main.ConsoleUI;
public class TestConSoleUI {
	public static void main(String[] args) {
		try {
			new ConsoleUI().execute();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
