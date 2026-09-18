import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("===== BANK ACCOUNT SIMULATION =====");
        Scanner in = new Scanner(System.in);


        String holderName = "";
        boolean valid = false;
        while(!valid) {
            System.out.print("Enter account holder name: ");
            holderName = in.nextLine();
            valid = true;
            for(int i=0; i<holderName.length(); i++) {
                if(!Character.isAlphabetic(holderName.charAt(i)) && holderName.charAt(i) != ' ') {
                    valid = false;
                    System.out.print("Invalid account holder name.");
                    break;
                }
            }
        }

        float initial_deposit = 0;
        System.out.print("Enter initial deposit: ");
        initial_deposit = Account.isValidFloat();


        Account acc = new Account(holderName, Account.accNo(1000), Account.deposit(initial_deposit));
        System.out.println();
        System.out.println("Account created!");
        System.out.println();

        System.out.println("===== Bank Menu =====");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Account Details");
        System.out.println("5. Transaction history");
        System.out.println("6. Exit");

        float deposit = 0;
        float withdraw = 0;
        float valid_withdraw = 0;
        boolean run = true;
        while(run) {
            System.out.print("Enter your choice from the menu: ");
//            int choice = in.nextInt();
            int choice = Account.isValidInt();
            switch(choice) {
                case 1 -> {
                    System.out.print("Enter deposit amount: ");
                    // check validation
                    deposit = Account.isValidFloat();
                    while(true){
                        if(deposit <= 0) {
                            System.out.print("Invalid deposit amount. Enter valid deposit: ");
                            deposit = Account.isValidFloat();
                        } else {
                            break;
                        }
                    }
                    System.out.println("₹" + deposit + " deposited successfully");
                    Account.deposit(deposit);
                    break;
                }
                case 2 -> {
                    System.out.print("Enter withdrawal amount: ");
                    // check validation
                    valid_withdraw = Account.isValidFloat();
                    while(true){
                        if(valid_withdraw <= 0) {
                            System.out.print("Invalid withdrawal amount. Enter valid withdrawal amount: ");
                            valid_withdraw = Account.isValidFloat();
                        }else break;
                    }
                    boolean true_withdraw = Account.withdraw(valid_withdraw);
                    if(true_withdraw){
                        System.out.println("₹" + valid_withdraw + " withdrawn successfully");
                    }
                    break;
                }
                case 3 -> {
                    System.out.println("Current Balance: ₹" + Account.balance());
                    break;
                }
                case 4 -> {
                    System.out.println("===== Account Details =====");
                    System.out.println("Account holder's name: " + acc.holderName);
                    System.out.println("Account No.- " + Account.accNo(1000));
                    System.out.println("Current Balance: ₹" + Account.balance());
                    break;
                }
                case 5 -> {
                    System.out.println("===== Transaction History =====");
                    System.out.println("Initial deposit: ₹" + initial_deposit);
                    System.out.println("Deposit: ₹" + deposit);
                    System.out.println("Withdrawal Amount: ₹" + valid_withdraw); // -> needs to be checked later
//                    break;
                }
                case 6 -> {
                    run = false;
                }
                default -> {
                    System.out.println("Invalid choice");
                }
            }
        }

    }

}