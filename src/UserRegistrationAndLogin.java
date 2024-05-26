import java.util.Scanner;

public class UserRegistrationAndLogin {


    public static BankAccount userAccountDetails;

    public static Long accountNumber = 12345L;

    public static void createUser() {

        Scanner scanner = new Scanner(System.in);

        String username = take_username();

        String password = take_password();

        Long tempAccountNumber = accountNumber++;

        userAccountDetails = new BankAccount(0, accountNumber, password, username);


        System.out.println("Account Number generated...Please note it down: " + tempAccountNumber);

        System.out.println("Please login into your account...");

        System.out.println(userAccountDetails.getUserName());
        System.out.println(userAccountDetails.getPassword());
        loginUser();

    }

    public static void loginUser() {
        String username = take_username();
        String password = take_password();

        try {
            if (username.equals(userAccountDetails.getUserName()) && password.equals(userAccountDetails.getPassword())) {
                bank_operations();
            } else {
                System.out.println("Incorrect username or password...please try again");
                loginUser();
            }
        } catch (NullPointerException e) {
            System.out.println("You are not registered as a customer please register yourself first by entering the below details");
            createUser();
        }

    }

    public static String take_username() {

//        Scanner scanner = new Scanner(System.in);
//        String username = "";
//        while (true) {
//            System.out.println("Enter username (minimum 4 characters, must start with an alphabet):");
//            username = scanner.nextLine();
//            if (username != null && !username.isBlank() && username.length() >= 4 && Character.isAlphabetic(username.charAt(0))) {
//                break;
//            } else {
//                System.out.println("Invalid username. Please enter a valid username with at least 4 characters and starting with an alphabet.");
//            }
//        }
//        return username;

        Scanner scanner = new Scanner(System.in);
        String username = "";

        while (true) {
            System.out.println("Enter username (minimum 4 characters, must start with an alphabet):");
            try {
                username = scanner.nextLine();
                if (username != null && !username.isBlank() && username.length() >= 4 && Character.isAlphabetic(username.charAt(0))) {
                    break;
                }
                throw new RuntimeException();

            } catch (Exception e) {

                System.out.println("Invalid username. Please enter a valid username with at least 4 characters and starting with an alphabet");

                scanner.nextLine(); // Clear the invalid input
            }
        }

        return username;
    }

    public static String take_password() {

        Scanner scanner = new Scanner(System.in);

        String password = "";
        while (true) {
            try {
                System.out.println("Enter password (minimum 4 characters):");
                password = scanner.nextLine();
                if (password != null && !password.isBlank() && password.length() >= 4) {
                    break;
                }
                throw new RuntimeException();
            } catch (Exception e) {
                System.out.println("Invalid password, Please enter min of 4 characters");
                scanner.nextLine();
            }

        }

        return password;
    }


    public static void bank_operations() {

        while (true) {
            System.out.println("1. Deposit Amount ");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println();

            Scanner scanner = new Scanner(System.in);
            int choice = -1;

            while (true) {
                try {
                    System.out.println("Please choose your operation (1-4): ");
                    choice = scanner.nextInt();

                    if (choice >= 1 && choice <= 4) {
                        break;
                    } else {
                        System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a number between 1 and 4.");
                    scanner.next(); // Clear the invalid input
                }
            }

            switch (choice) {
                case 1:
                    BankingOperations.deposit_amount();
                    break;
                case 2:
                    BankingOperations.withdraw_amount();
                    break;
                case 3:
                    BankingOperations.check_balance();
                    break;
                case 4:
                    System.exit(0);
            }

        }
    }


}
