/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.app;

import java.util.*;

public class Manager
{
    public Manager()
    {
      this.busBoy();
      
      this.orderFood();
    }
    public void busBoy()
    {
        System.out.println("Bus Boy Cleaned The Table and Serves Water");
    }
    public void orderFood()
    {
        Menu customer = new Menu();
          
        Scanner in=new Scanner(System.in);
        
        System.out.println();
        
        System.out.print("Give your order (Enter The ItemNO) :");
         
        int Itemno = in.nextInt();
        
        System.out.println();
        
        new ExecutiveChef(customer.getItemName(Itemno));
        
        System.out.println();
        
        new CashRegister(customer.getItemPrice(Itemno));   
    }
    public void server()
    {
        System.out.println("The Bus Boy Clean The Table");
    }
    
         
}