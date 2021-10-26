package tb.soft;
/*
 * Program: Prosta biblioteka metod do realizacji dialogu z użytkownikiem
 *          w prostych aplikacjach bez graficznego interfejsu użytkownika.
 *    Plik: ConsoleUserDialog.java
 *
 *   Autor: Paweł Rogaliński
 *    Data: październik 2018 r.
 *
 */

import java.util.Scanner;

/**
 * Biblioteka metod do realizacji dialogu z użytkownikiem
 * w prostych aplikacjach bez graficznego interfejsu użytkownika.
 *
 * @author Paweł Rogaliński
 *
 */
public class ConsoleUserDialog {

	private final String  ERROR_MESSAGE =
			"Nieprawidłowe dane!\nSpróbuj jeszcze raz.";

	private final Scanner sc = new Scanner(System.in);

	public void printMessage(String message) {
		System.out.println(message);
	}
	public void printInfoMessage(String message) {
		System.out.println(message);
		enterString("Nacisnij ENTER");
	}

	public void printErrorMessage(String message) {
		System.err.println(message);
		System.err.println("Nacisnij ENTER");
		enterString("");
	}

	public void clearConsole(){
		System.out.println("\n\n");
	}

	public String enterString(String prompt) {
		System.out.print(prompt);
		return sc.nextLine();
	}

	public int enterInt(String prompt) {
		boolean isError;
		int i = 0;
		do{
			isError = false;
			try{
				i = Integer.parseInt(enterString(prompt));
			} catch(NumberFormatException e){
				System.err.println(ERROR_MESSAGE);
				isError = true;
			}
		}while(isError);
		return i;
	}
} // koniec kasy ConsoleUserDialog
