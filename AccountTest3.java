/*
Name: Kennedy Keyes
Date: September 12, 2021
Program: AccountTest3.java
Description: This program will input and output floating-point numbers 
with Account objects.
 */
package accounttest3;
import java.util.Scanner;

/**
 *
 * @author codingken
 */
public class AccountTest3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account3 account1 = new Account3("Jane Green", 50.00);
        Account3 account2 = new Account3("John Blue", -7.53);
        
        // display initial balance of each object
        System.out.printf("%s balance: $%.2f%n", 
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", 
                account2.getName(), account2.getBalance());
        
        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter deposit amount for account1: "); //prompt
        double depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("%nadding %.2f to account1 balance%n%n", 
                depositAmount);
        account1.deposit(depositAmount); // add to account1's balance
        
        // display balances
        System.out.printf("%s balance: $%.2f%n", 
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", 
                account2.getName(), account2.getBalance());
        
        System.out.print("Enter deposit amount for account2: "); // prompt
        depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("%nadding %.2f to account2 balance%n%n", 
                depositAmount);
        account2.deposit(depositAmount); // add to account2 balance
        
        // display balances
        System.out.printf("%s balance: $%.2f%n", 
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", 
                account2.getName(), account2.getBalance());
    }
    
}
