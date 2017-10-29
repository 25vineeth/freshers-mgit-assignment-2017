package com.mycompany.app;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("WELCOME TO THE RESTAURANT");
        
        System.out.println();
        
        Manager manager = new Manager();
        
        Scanner in=new Scanner(System.in);
        
        System.out.println("Please Pay(Enter) The Amount : ");
        
        int Amount = in.nextInt();
        
        CashRegister customer = new CashRegister();
        
        customer.billPayment(Amount);
        
        System.out.println();
        
        System.out.println("Thank you For Visiting"); 
        
        System.out.println();

        manager.server();        
        
}
}