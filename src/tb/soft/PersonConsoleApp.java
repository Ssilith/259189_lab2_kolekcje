package tb.soft;

import java.util.*;
import java.util.Scanner;
import static tb.soft.ListObjects.arrayList;
import static tb.soft.ListObjects.linkedList;

public class PersonConsoleApp{

	private static final String MENU =
			"    M E N U   G Ł Ó W N E  \n" +
					"1 - Podaj dane nowej osoby \n" +
					"2 - Usuń dane osoby        \n" +
					"3 - Wyswietl liste		    \n" +
					"0 - Zakończ program        \n";

	private static final ConsoleUserDialog UI = new ConsoleUserDialog();

	public static void main(String[] args) {
		PersonConsoleApp application = new PersonConsoleApp();
		application.runMainLoop();
	}

	private Person currentPerson = null;

	public void runMainLoop() {
		System.out.println("Wybierz rodziaj kolekcji: \n" +
				"1. ArrayList \n" +
				"2. LinkedList \n" +
				"3. HashSet \n" +
				"4. TreeSet \n" +
				"5. HashMap \n" +
				"6. TreeMap");

		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();

		while (true) {
			UI.clearConsole();

			if(choice == 1) {
				switch (UI.enterInt(MENU + "==>> ")) {

					case 1: {
						currentPerson = createNewPerson();
						if (currentPerson != null)
							ListObjects.addArrayElement(currentPerson);
						break;
					}

					case 2: {
						System.out.println("Wybierz numer indeksu: ");
						Scanner sc = new Scanner(System.in);
						int index = sc.nextInt();
						if (index < arrayList.size())
							ListObjects.removeArrayElement(index);

						else
							System.out.println("Nie istnieje obiekt o podanym indeksie");
						break;
					}

					case 3: {
						ListObjects.displayArrayList();
						break;
					}

					case 0: {
						UI.printInfoMessage("\nProgram zakończył działanie!");
						System.exit(0);
					}
				}
			}
			else if(choice == 2){
				switch (UI.enterInt(MENU + "==>> ")) {

					case 1: {
						currentPerson = createNewPerson();
						if (currentPerson != null)
							ListObjects.addLinkedElement(currentPerson);
						break;
					}

					case 2: {
						System.out.println("Wybierz numer indeksu: ");
						Scanner sc = new Scanner(System.in);
						int index = sc.nextInt();
						if (index < linkedList.size())
							ListObjects.removeLinkedElement(index);
						else
							System.out.println("Nie istnieje obiekt o podanym indeksie");
						break;
					}

					case 3: {
						ListObjects.displayLinkedList();
						break;
					}
				}
			}

			else if(choice == 3) {
				switch (UI.enterInt(MENU + "==>> ")) {

					case 1: {
						currentPerson = createNewPerson();
						if (currentPerson != null)
							SetObjects.addHashSElement(currentPerson);
						break;
					}

					case 2: {
						System.out.println("Wpisz dane: \n" +
								" - imie: ");
						Scanner imie = new Scanner(System.in);
						String name = imie.nextLine();
						System.out.println(" - nazwisko: ");
						Scanner nazwisko = new Scanner(System.in);
						String lastname = nazwisko.nextLine();
						System.out.println(" - data urodzenia: ");
						Scanner data = new Scanner(System.in);
						int date = data.nextInt();
						SetObjects.removeHashSElement(name, lastname, date);
						break;
					}

					case 3: {
						SetObjects.displayHashSList();
						break;
					}

					case 0: {
						UI.printInfoMessage("\nProgram zakończył działanie!");
						System.exit(0);
					}
				}
			}

			else if(choice == 4) {
				switch (UI.enterInt(MENU + "==>> ")) {
					case 1: {
						currentPerson = createNewPerson();
						if (currentPerson != null)
							SetObjects.addTreeSElement(currentPerson);
						break;
					}

					case 2: {
						System.out.println("Wpisz dane \n" +
								" - imie: ");
						Scanner imie = new Scanner(System.in);
						String name = imie.nextLine();
						System.out.println(" - nazwisko: ");
						Scanner nazwisko = new Scanner(System.in);
						String lastname = nazwisko.nextLine();
						System.out.println(" - data urodzenia: ");
						Scanner data = new Scanner(System.in);
						int date = data.nextInt();
						SetObjects.removeTreeSElement(name, lastname, date);
						break;
					}

					case 3: {
						SetObjects.displayTreeSList();
						break;
					}

					case 0: {
						UI.printInfoMessage("\nProgram zakończył działanie!");
						System.exit(0);
					}
				}
			}
			else if(choice == 5) {
				switch (UI.enterInt(MENU + "==>> ")) {
					case 1: {
						currentPerson = createNewPerson();
						if (currentPerson != null)
							MapObjects.addHashMElement(currentPerson);
						break;
					}

					case 2: {
						System.out.println("Wpisz dane: \n" +
								" - imie: ");
						Scanner imie = new Scanner(System.in);
						String name = imie.nextLine();
						System.out.println(" - nazwisko: ");
						Scanner nazwisko = new Scanner(System.in);
						String lastname = nazwisko.nextLine();
						System.out.println(" - data urodzenia: ");
						Scanner data = new Scanner(System.in);
						int date = data.nextInt();
						MapObjects.removeHashMElement(name, lastname, date);
						break;
					}

					case 3: {
						MapObjects.displayHashMList();
						break;
					}

					case 0: {
						UI.printInfoMessage("\nProgram zakończył działanie!");
						System.exit(0);
					}
				}
			}

			else if(choice == 6) {
				switch (UI.enterInt(MENU + "==>> ")) {
					case 1: {
						currentPerson = createNewPerson();
						if (currentPerson != null)
							MapObjects.addTreeMElement(currentPerson);
						break;
					}

					case 2: {
						System.out.println("Wpisz dane \n" +
								" - imie: ");
						Scanner imie = new Scanner(System.in);
						String name = imie.nextLine();
						System.out.println(" - nazwisko: ");
						Scanner nazwisko = new Scanner(System.in);
						String lastname = nazwisko.nextLine();
						System.out.println(" - data urodzenia: ");
						Scanner data = new Scanner(System.in);
						int date = data.nextInt();
						MapObjects.removeTreeMElement(name, lastname, date);
						break;
					}

					case 3: {
						MapObjects.displayTreeMList();
						break;
					}

					case 0: {
						UI.printInfoMessage("\nProgram zakończył działanie!");
						System.exit(0);
					}
				}
			}

			else
				System.out.println("Wybrano zly numer");

		}
	}

	static Person createNewPerson(){
		String first_name = UI.enterString("Podaj imię: ");
		String last_name = UI.enterString("Podaj nazwisko: ");
		String birth_year = UI.enterString("Podaj rok ur.: ");
		UI.printMessage("Dozwolone stanowiska:" + Arrays.deepToString(PersonJob.values()));
		String job_name = UI.enterString("Podaj stanowisko: ");
		Person person;

		try {
			person = new Person(first_name, last_name);
			person.setBirthYear(birth_year);
			person.setJob(job_name);
		} catch (PersonException e) {
			UI.printErrorMessage(e.getMessage());
			return null;
		}
		return person;
	}
}