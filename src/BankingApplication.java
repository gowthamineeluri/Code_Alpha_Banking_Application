import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args) {
        processStart();

    }

    public static void processStart() {
        System.out.println("------ Welcome to ABC Bank -------");
        System.out.println();
        System.out.println("1. Register as new Account holder");
        System.out.println("2. Login as an existing customer");
        System.out.println("3. Exit");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please choose your operation: ");
        int choice = -1;

        while (true) {
            try {
                choice = scanner.nextInt();
                if (choice == 1 || choice == 2 || choice == 3) {
                    break;
                }
                throw new RuntimeException();
            } catch (Exception e) {
                System.out.println("Choice should be in numbers and between 1 and 3");
                scanner.nextLine();
            }
        }


        switch (choice) {
            case 1:
                UserRegistrationAndLogin.createUser();
                break;
            case 2:
                UserRegistrationAndLogin.loginUser();
                break;
            case 3:
                System.exit(0);
        }
    }
}
