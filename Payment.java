/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialpayment;

/**
 *
 * @author AXEL NATASHIA JAYA
 * since 10/26/2020
 */
public class Payment 
{
    private double amount;
    
    public Payment()
    {
        this.amount =0.0;
    }
    
    public Payment(double am)
    {
        this.amount = am;
    }
    
    public void setAmount(double am)
    {
        this.amount = am;
    }
    public double getAmount()
    {
        return this.amount;
    }
    
    public String toString()
    {
        return "amount paid is "+getAmount();
    }
}
