package javaAtm;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        // Joseph F. Martin jr.
        // OCa
        // 1D
        // 7/11/22

        
         double balance = 2000;
         int withdraw, deposit;
         
         double bankCharge = 0.50;
         
         System.out.println("ATM machine~~");
         
         Scanner sc = new Scanner(System.in);
         System.out.println("(1) Withdraw");
         System.out.println("(2) Deposit");
         System.out.println("(3) Check Balance");
         System.out.println("(4) Exit");
         System.out.println("---------------------");
         System.out.print("Choose your option: ");
         int BankOption = sc.nextInt();
         
         switch (BankOption) {
         
         // Withdraw
         case 1:
         System.out.print("Enter money to be withdraw: ");
         withdraw = sc.nextInt(); // Input the money youd like to withdraw
         
         if (withdraw % 5 != 0) {
         System.out.println("Not multiple of 5");
         
         } else if (balance >= withdraw) {
         balance = balance - withdraw;
         System.out.println("You successfuly withdraw " + withdraw + " pesos!" );
         System.out.print("Your remaining balance is ");
         System.out.println(balance - bankCharge);
         
         }
         
         else {
         System.out.println("Insufficient Funds");
         System.out.println("Your current balance is " + balance);
         }
         break;
         
         // Deposit
         
         case 2:
         System.out.print("Enter money to be deposit:");
         deposit = sc.nextInt();
         
         System.out.println("Your Money has been successfully deposited");
         System.out.println(balance = balance + deposit);
         break;
         
         // Balance
         
         case 3:
         System.out.println("Balance : " + balance);
         System.out.println("");
         break;
         
         default:
         System.out.println("Not valid input");
         
         }
         
        


    }
}
