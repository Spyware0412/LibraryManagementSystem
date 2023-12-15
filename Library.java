// Importing required classes
import java.util.Scanner;

public class Library {
	public static int login() {
        Scanner sc = new Scanner(System.in);
        String username, password;
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter username: ");
            username = sc.nextLine();
            if (username.equals("admin")) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("Enter password: ");
                    password = sc.nextLine();

                    if (password.equals("admin")) {
                        System.out.println("Authentication successful. ");
                        return 1;
                    } else if (j == 2) {
                        System.out.println("Maximum attempts reached. Exiting the code.");
                        return 0;
                    } else {
                        System.out.println("Authentication failed. Please try again.");
                    }
                }
            } else if (i == 2) {
                System.out.println("Maximum attempts reached. Exiting the code.");
                return 0;
            } else {
                System.out.println("Authentication failed. Please try again.");
            }
        }
		return 0;
	}
	public static void main(String[] args)
	{	

		Scanner input = new Scanner(System.in);

		// Displaying menu
		System.out.println(
			"********************Welcome to the SIT Library!********************");
			int result = login();
        if (result == 0) {
            System.out.println("Authentication failed. Exiting...");
            return;
		}
		System.out.println(
			"				Select From The Following Options:			 ");
		System.out.println(
			"**********************************************************************");

		books ob = new books();
		students obStudent = new students();

		int choice;
		int searchChoice;

		do {

			ob.dispMenu();
			choice = input.nextInt();

			switch (choice) {

			case 1:
				book b = new book();
				ob.addBook(b);
				break;

			case 2:
				ob.upgradeBookQty();
				break;

			case 3:

				System.out.println(
					" press 1 to Search with Book Serial No.");
				System.out.println(
					" Press 2 to Search with Book's Author Name.");
				searchChoice = input.nextInt();

				switch (searchChoice) {

				case 1:
					ob.searchBySno();
					break;

				case 2:
					ob.searchByAuthorName();
				}
				break;

			case 4:
				ob.showAllBooks();
				break;

			case 5:
				student s = new student();
				obStudent.addStudent(s);
				break;

			case 6:
				obStudent.showAllStudents();
				break;

			case 7:
				obStudent.checkOutBook(ob);
				break;

			case 8:
				obStudent.checkInBook(ob);
				break;
			default:
				System.out.println("ENTER BETWEEN 0 TO 8.");
			}

		}
		while (choice != 0);
	}
}
