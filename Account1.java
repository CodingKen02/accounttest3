/*
Name: Kennedy Keyes
Date: September 12, 2021
Program: Account1.class
Description: This is the Account class with a double instance variable 
balance and a constructor and deposit method that perform validation.
 */
package accounttest3;

/**
 *
 * @author codingken
 */
public class Account1 {
    private String name; // instance variable
    private double balance; // instance variable
    
    // activate constructor that receives two parameters
    public Account1(String name, double balance) {
        this.name = name; // assign name to instance variable name
        
        // validate that the balance is greater than 0.0; if it's not,
        // instance variable balance keeps its default initial value of 0.0
        if (balance > 0.0) { // if the balance is valid
            this.balance = balance; // assign it to instance variable balance
        }
    }
    
    // method that deposits (adds) only a valid amount to the balance
    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) { // if the depositAmount is valid
            balance = balance + depositAmount; // add it to the balance
        }
    }
    
    // method returns the account balance
    public double getBalance() {
        return balance;
    }
    
    // method that sets the name
    public void setName(String name) {
        this.name = name;
    }
    
    // method that returns the name
    public String getName() {
        return name;
    }
    
}