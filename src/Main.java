import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name , password , balance to create an account");
//         craet user
        String name = sc.next();
        String password = sc.next();
        double balance = sc.nextDouble();
        sbiuser user = new sbiuser(name,balance,password);

//        add amount;
        String message = user.addMoney(100000);
        System.out.println(message);

// withdraw money;
        System.out.println("kitna paisa nikalna chahte ho");
        int money = sc.nextInt();
        System.out.println("password inter kro");
        String pass = sc.next();
        System.out.println(user.withdrawMoney(money,pass));



//        rate of intrest
        System.out.println(user.calculateInterest(10));
    }
}