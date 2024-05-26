public class BankAccount {


    private String userName;

    private String password;

    private long accountNumber;

    private double accountBalance;

    public BankAccount() {

    }

    public BankAccount(double accountBalance, long accountNumber, String password, String userName) {
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
        this.password = password;
        this.userName = userName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
