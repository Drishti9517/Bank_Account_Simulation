import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter account holder name: ");
        String holderName = in.nextLine();

        System.out.print("Enter initial deposit: ");
        float initial_deposit = in.nextFloat();

        System.out.print("Enter withdrawal amount: ");
        float out = in.nextFloat();

        Account acc = new Account(holderName, Account.accNo(1000), Account.deposit(initial_deposit));

        System.out.println("---------------Account created!---------------");

        System.out.println("Account holder's name: " + holderName);
        System.out.println("Account No.- " + Account.accNo(1000));
        System.out.println("Deposited:- " + Account.deposit(initial_deposit));
        System.out.println("Money withdraw: " + Account.withdraw(out));
        System.out.println("Balance: " + Account.balance());

    }

}