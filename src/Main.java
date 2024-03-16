import java.util.Scanner;

import static java.lang.System.exit;

class ATM {

    int balance = 500000;
    int pin = 5487;

    ATM() {
        this.balance = balance;
        this.pin = pin;
        System.out.println("==================================");
        System.out.println("Enter your pin : ");
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================");
        int enteredPin = sc.nextInt();
        if (enteredPin == pin) {
            menu();
        } else {
            System.out.println("Enter valid pin ");
            pinCheck();
        }
    }

    public void pinCheck(){
        System.out.println("Enter Choice");
        System.out.println("1. Reenter Pin.");
        System.out.println("2. Exit.");
        int choice = sc.nextInt();
        if (choice==1){
            new ATM();
        }else {
            exit(0);
        }
    }

    Scanner sc = new Scanner(System.in);

    public void checkPin() {

        System.out.println("Enter your pin : ");
        Scanner sc = new Scanner(System.in);
        int enteredPin = sc.nextInt();
        if (enteredPin == pin) {
            menu();
        } else {
            System.out.println("Enter valid pin ");
            checkPin();
        }
    }

    public void menu() {
        System.out.println("==================================");
        System.out.println("Enter tour choice : ");
        System.out.println("1. Check Account Balance.");
        System.out.println("2. Withdraw Money. ");
        System.out.println("3. Deposit Money. ");
        System.out.println("4. Exit. ");
        System.out.println("==================================");

//        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if (choice == 1) {
            checkBalance();

        } else if (choice == 2) {
            withdrawMoney();
        } else if (choice == 3) {
            depositMoney();
        } else if (choice == 4) {

            return;

        } else {
            System.out.println("Enter Valid input");
            System.out.println("==================================");
        }

    }


    private void depositMoney() {

        System.out.println("Enter Amount to deposit : ");
        int amount = sc.nextInt();
        balance = balance + amount;
        System.out.println("Amount deposited successfully current Balance : " + balance);
        menu();
        System.out.println("==================================");
    }

    private void withdrawMoney() {

        System.out.println("Enter Amount to Withdraw : ");
        int amount = sc.nextInt();
        if (balance < amount) {
            System.out.println("Insufficient Balance ");
        } else {
            balance = balance - amount;
            System.out.println("Money withdraw successfully and available : " + balance +" RS");
        }
        menu();
    }

    public void checkBalance() {
        System.out.println("==================================");
        System.out.println("Balance : " + balance +" RS");
        System.out.println("==================================");
        menu();
    }

}

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        ATM atm = new ATM();
        atm.checkPin();
    }
}