package tb.soft;

import java.util.*;
import java.util.Scanner;
import static tb.soft.ListObjects.arrayList;
import static tb.soft.ListObjects.linkedList;

/**
 * Program: Aplikacja działająca w oknie konsoli, która umożliwia testowanie
 *          operacji wykonywanych na obiektach klasy Person.
 *    Plik: PersonConsoleApp.java
 *
 *   Autor: Paweł Rogaliński
 *    Data: październik 2018 r.
 */
public class PersonConsoleApp{

	private static final String MENU =
			"    M E N U   G Ł Ó W N E  \n" +
					"1 - Podaj dane nowej osoby \n" +
					"2 - Usuń dane osoby        \n" +
					"3 - Wyswietl liste		    \n" +
					"0 - Zakończ program        \n";

	/**
	 * ConsoleUserDialog to pomocnicza klasa zawierająca zestaw
	 * prostych metod do realizacji dialogu z użytkownikiem
	 * w oknie konsoli tekstowej.
	 */
	private static final ConsoleUserDialog UI = new ConsoleUserDialog();

	public static void main(String[] args) {
		// Utworzenie obiektu aplikacji konsolowej
		// oraz uruchomienie głównej pętli aplikacji.
		PersonConsoleApp application = new PersonConsoleApp();
		application.runMainLoop();
	}

	/*
	 *  Referencja do obiektu, który zawiera dane aktualnej osoby.
	 */

	private Person currentPerson = null;

	/*
	 *  Metoda runMainLoop wykonuje główną pętlę aplikacji.
	 *  UWAGA: Ta metoda zawiera nieskończoną pętlę,
	 *         w której program się zatrzymuje aż do zakończenia
	 *         działania za pomocą metody System.exit(0);
	 */

	public void runMainLoop() {
		System.out.println("Wybierz rodziaj kolekcji: \n" +
				"1. ArrayList \n" +
				"2. LinkedList \n" +
				"3. HashSet \n" +
				"4. TreeSet \n" +
				"5. HashMap \n" +
				"6 TreeMap");

		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();

		while (true) {
			UI.clearConsole();

			//arraylist, podobnie jak linked list, wyspisuje wszystkie elementy w kolejności wpisywania
			//te same elementy doda dwukrotnie
			//equals() i hashCode() nie wpływają na listy
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
						// zakończenie działania programu
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

			//dzięki equals() and hashCode() nie powtarzają się elementy, które łączy imię, nazwisko i rok urodzenia
			//dlatego tez nie zadziala usuwanie np po iteracji
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
						// zakończenie działania programu
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
						// zakończenie działania programu
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
						// zakończenie działania programu
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
						// zakończenie działania programu
						UI.printInfoMessage("\nProgram zakończył działanie!");
						System.exit(0);
					}
				}
			}
			else
				System.out.println("Wybrano zly numer");

		} // koniec pętli while
	}

	/*
	 *  Metoda wyświetla w oknie konsoli dane aktualnej osoby
	 *  pamiętanej w zmiennej currentPerson.
	 */

/*	void showCurrentPerson() {
		showPerson(currentPerson);
	}*/

	/*
	 * Metoda wyświetla w oknie konsoli dane osoby reprezentowanej
	 * przez obiekt klasy Person
	 */

/*	static void showPerson(Person person) {
		StringBuilder sb = new StringBuilder();

		if (person != null) {
			sb.append("Aktualna osoba: \n")
					.append("      Imię: ").append(person.getFirstName()).append("\n")
					.append("  Nazwisko: ").append(person.getLastName()).append("\n")
					.append("   Rok ur.: ").append(person.getBirthYear()).append("\n")
					.append("Stanowisko: ").append(person.getJob()).append("\n");
		} else
			sb.append( "Brak danych osoby\n" );
		UI.printMessage( sb.toString() );
	}*/

	/*
	 * Metoda wczytuje w konsoli dane nowej osoby, tworzy nowy obiekt
	 * klasy Person i wypełnia atrybuty wczytanymi danymi.
	 * Walidacja poprawności danych odbywa się w konstruktorze i setterach
	 * klasy Person. Jeśli zostaną wykryte niepoprawne dane,
	 * to zostanie zgłoszony wyjątek, który zawiera komunikat o błędzie.
	 */

	static Person createNewPerson(){
		String first_name = UI.enterString("Podaj imię: ");
		String last_name = UI.enterString("Podaj nazwisko: ");
		String birth_year = UI.enterString("Podaj rok ur.: ");
		UI.printMessage("Dozwolone stanowiska:" + Arrays.deepToString(PersonJob.values()));
		String job_name = UI.enterString("Podaj stanowisko: ");
		Person person;
		try {
			// Utworzenie nowego obiektu klasy Person oraz
			// ustawienie wartości wszystkich atrybutów.
			person = new Person(first_name, last_name);
			person.setBirthYear(birth_year);
			person.setJob(job_name);
		} catch (PersonException e) {
			// Tu są wychwytywane wyjątki zgłaszane przez metody klasy Person,
			// gdy nie są spełnione ograniczenia nałożone na dopuszczalne wartości
			// poszczególnych atrybutów.
			// Drukowanie komunikatu o błędzie zgłoszonym za pomocą wyjątku PersonException.
			UI.printErrorMessage(e.getMessage());
			return null;
		}
		return person;
	}

}  // koniec klasy PersonConsoleApp
