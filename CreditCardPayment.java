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
public class CreditCardPayment extends Payment 
{
    private String name;
    private String expireDate;
    private String number;
    
    public CreditCardPayment()
    {
        this.name ="";
        this.expireDate="";
        this.number="";
    }
    
    public CreditCardPayment(double am,String nm, String eDate, String num)
    {
        super(am);
        this.name=nm;
        this.expireDate=eDate;
        this.number=num;
    }
    
    public void setName(String nm)
    {
        this.name=nm;
    }
    public String getName()
    {
        return this.name;
    }
    
    public void setExpiredDate(String eDate)
    {
        this.expireDate=eDate;
    }
    public String getExpiredDate()
    {
        return this.expireDate;
    }
    
    public void setNumber(String num)
    {
        this.number=num;
    }
    public String getNumber()
    {
        return this.number;
    }
    
    public String toString()
    {
        return "\nThe amount payment with Credit Card "+super.toString()+"\nName: "+getName()+"\nThe expired date at: "+getExpiredDate()+"\nThe number: "+getNumber();
    }
}
