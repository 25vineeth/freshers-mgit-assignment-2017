
package com.mycompany.app;
public class CashRegister {
    public CashRegister(){}
    
    public CashRegister(int Price)
    {   
        
        System.out.println("BILL   =  "+Price);
             
  
    }
    public void billPayment(int Amount)
    {
        System.out.println("Amount "+Amount +" paid successfully");
         
    }
}
