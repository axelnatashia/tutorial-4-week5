/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialpayment;
import java.util.*;
/**
 *
 * @author AXEL NATASHIA JAYA
 * since 10/26/2020
 */
public class PaymentList 
{
    private Payment[] CashList;
    private Payment[] CardList;
    private int numCash;
    private int numCard;
    private final int tpay=8;
    
    public PaymentList()
    {
        this.CashList=new Payment[tpay];
        this.CardList=new Payment[tpay];
        this.numCash=0;
        this.numCard=0;
    }
    
    public CashPayment addCashPayment(double am)
    {
        if(numCash==tpay)
        {
            return null;
        }
        else
        {
            CashPayment newPay =new CashPayment(am);
            CashList[numCash++]=newPay;
            return newPay;
        }
    }
    
    public CreditCardPayment addCreditCardPayment(double am,String nm, String eDate, String num)
    {
        if(numCard==tpay)
        {
            return null;
        }
        else
        {
            CreditCardPayment newPay=new CreditCardPayment(am,nm,eDate,num);
            CardList[numCard++]=newPay;
            return newPay;
        }
    }
    
    public int totalAmount()
    {
        int total=0;
        for(int a=0; a<8;a++)
        {
            if(CashList[a]!=null)
            {
                total+=CashList[a].getAmount();
            }
            if(CardList[a]!=null)
            {
                total+=CardList[a].getAmount();
            }
        }
        return total;
    }
    
    public int Payless(double am)
    {
        int getchar=0;
        for(int a=0;a<8;a++)
        {
            if(CashList[a]!=null)
            {
                if(am>CashList[a].getAmount())
                {
                    getchar++;
                }
            }
            if(CardList[a]!=null)
            {
                if(am>CardList[a].getAmount())
                {
                    getchar++;
                }
            }
        }
        return getchar;
    }
    public int num_Cash()
    {
        return numCash;
    }
}
