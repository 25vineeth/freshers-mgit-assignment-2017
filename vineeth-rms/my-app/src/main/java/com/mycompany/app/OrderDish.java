/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.app;

public class OrderDish{
    public OrderDish(String Dishname)
    {
        System.out.println("Your Order Is Placed.Please Wait For Some Time While your Dish Is Being Prepared....");
        System.out.println("The Ordered Dish "+Dishname+ " Is Served ");
    }
    
    public OrderDish(int no)
    {   
        
        System.out.println("BILL   =  "+no);
        System.out.println("Thank you For Visiting");   
  
    }
    
}
