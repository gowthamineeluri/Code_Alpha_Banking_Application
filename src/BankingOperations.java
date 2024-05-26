import java.util.Scanner;

public class BankingOperations {

    public static void deposit_amount(){
        int amount = take_amount();
        UserRegistrationAndLogin.userAccountDetails.setAccountBalance(
                UserRegistrationAndLogin.userAccountDetails.getAccountBalance()+amount);

        System.out.println(amount+ " rs. deposited to your account");
         UserRegistrationAndLogin.bank_operations();


    }

    public static void withdraw_amount(){
        int amount = take_amount();
        if(amount>UserRegistrationAndLogin.userAccountDetails.getAccountBalance()){
            System.out.println("Insufficient funds...please make sure to have enough balance");
            UserRegistrationAndLogin.bank_operations();
        }
        UserRegistrationAndLogin.userAccountDetails.setAccountBalance(
                UserRegistrationAndLogin.userAccountDetails.getAccountBalance()-amount);
        System.out.println(amount+ " rs. debited from your account");
        System.out.println();
        UserRegistrationAndLogin.bank_operations();
    }

    public static void check_balance(){
        System.out.println();
        System.out.println("Your Current Account Balance is..."+ UserRegistrationAndLogin.userAccountDetails.getAccountBalance());
        UserRegistrationAndLogin.bank_operations();
    }

    public static int take_amount(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the amount");
        int amount=0;
        try {
           amount= scanner.nextInt();
           if(amount<0){
               System.out.println("please enter valid money");
               amount=take_amount();
           }


        }catch (Exception e){
            System.out.println("please enter amount in numbers only");
            amount=take_amount();
        }

        return amount;
    }
}
