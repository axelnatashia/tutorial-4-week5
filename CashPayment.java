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
public class CashPayment extends Payment 
{
    public CashPayment(double am)
    {
        super(am);
    }
    
    public String toString()
    {
        return "\nThe amount payment with Cash "+super.getAmount();
    }
}
