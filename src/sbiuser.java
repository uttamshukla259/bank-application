import java.util.Objects;
import java.util.UUID;

public class sbiuser implements bankInterface {
//    attributes;
    String name;
    String accountNo;
    double balance;
    String password;
    private static double rateOfInterest;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static double getRateOfInterest() {
        return rateOfInterest;
    }

    public static void setRateOfInterest(double rateOfInterest) {
        sbiuser.rateOfInterest = rateOfInterest;
    }

    public sbiuser(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;

        this.rateOfInterest =6.5;
        this.accountNo = String.valueOf(UUID.randomUUID());

    }

    @Override
    public double checkBalance() {

        return balance;
    }

    @Override
    public String addMoney(int amount) {
        balance = balance+amount;
        return "avi bhout paisa hai";
    }

    @Override
    public String withdrawMoney(int amount, String enterpassword) {
        if (Objects.equals(enterpassword, password)) {
            if (amount > balance) {
                return "paisa khatam";
            }
            else {
                return "andha paisa";
        }
        }
        else{
            return " wrong password";
        }

    }

    @Override
    public double calculateInterest(int years) {
        return (balance*years*rateOfInterest)/100;
    }
}
