public class Account {

    public static float initial_deposit;
    public String holderName;
    public int accNo;
    public static float deposit;
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

    public static float deposit(float initial_deposit) {
        deposit = initial_deposit;
        return deposit;
    }

    public static float withdraw(float amt) {
        balance = deposit;

        if(amt > balance) {
            System.out.println("Your acc has " + balance + " rupees only. Therefore, you can't withdraw " + amt + "rupees.");
        } else {
            withdraw = amt;
        }
        return withdraw;
    }

    public static float balance() {
        return deposit - withdraw;
    }
}
