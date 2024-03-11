import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isExit = false;
        while(!isExit) {
            displayMenu();
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("all users function");
                    break;
                }
                case 2: {
                    System.out.println("add user function");
                    break;
                }
                case 3: {
                    System.out.println("login function");
                    break;
                }
                case 0:
                    isExit = true;
                    System.out.println("Exiting");
                    break;
            }
        }
    }
    public static void displayMenu() {
        System.out.print("Welcome to the insurrance management system\n" +
                "1 - Show all users\n" +
                "2 - Add user (Individual / Enterprise)\n" +
                "3 - Login\n" +
                "0 - Exit\n" +
                "Please choose whatever you want to do: ");
    }
}