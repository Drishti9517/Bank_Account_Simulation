import java.util.InputMismatchException;
import java.util.Scanner;

public class Account {

    public  String holderName;
    public float deposit;
    public float c_deposit;
    public float balance;

    public Account(String holderName, float deposit){
        this.holderName = holderName;
        this.deposit = deposit;
        this.balance = deposit;
    }

    public static int accNo(int accNo) {
        return ++accNo;
    }

    public float deposit(float depo) {
        c_deposit = deposit + depo;
        deposit = c_deposit;
        balance += depo;
        return c_deposit;
    }


    public boolean withdraw(float amt) {
        if(amt > balance) {
            System.out.println("Your acc has " + balance + " rupees only. Therefore, you can't withdraw " + amt + " rupees.");
            return false;
        } else {
            balance = balance - amt;
        }
        return true;
    }

    public float balance() {
        return balance;
    }

    static Scanner in = new Scanner(System.in);
    public static float isValidFloat() {
        while(true) {
            try{
                float num = in.nextFloat();
                return num;
            } catch(InputMismatchException e) {
                System.out.print("Invalid input. Enter valid no: ");
                in.next();
            }
        }
    }
    public static int isValidInt() {
        while(true) {
            try{
                int num = in.nextInt();
                return num;
            } catch(InputMismatchException e) {
                System.out.print("Invalid input. Enter valid no: ");
                in.next();
            }
        }
    }
}
