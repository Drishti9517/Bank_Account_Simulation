import java.util.InputMismatchException;
import java.util.Scanner;

public class Account {

    public static float initial_deposit;
    public String holderName;
    public int accNo;
    public static float deposit;
    public static float c_deposit;
    public static float balance;
    public static float withdraw;


    public Account(String holderName, int accNo, float deposit){
        this.holderName = holderName;
        this.accNo = accNo;
        this.deposit = deposit;
    }

    public static int accNo(int accNo) {
        return ++accNo;
    }
    public static float i_deposit(float initial_deposit) {
        deposit = initial_deposit;
        return initial_deposit;
    }

    public static float deposit(float depo) {
        c_deposit = deposit + depo;
        deposit = c_deposit;
        return c_deposit;
    }


    public static boolean withdraw(float amt) {
        balance = c_deposit;

        if(amt > balance) {
            System.out.println("Your acc has " + balance + " rupees only. Therefore, you can't withdraw " + amt + " rupees.");
            return false;
        } else {
            withdraw = amt;
        }
        return true;
    }

    public static float balance() {
        return c_deposit - withdraw;
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
