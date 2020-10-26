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
public class TutorialPayment 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        PaymentList pay= new PaymentList();
        double amn;
        String Type;
        String Holder;
        String Date;
        String Cardnum;
        String cont;
        String exDate="";
        boolean test=true;
        Scanner paying=new Scanner(System.in);
        Payment tpay=null;
        
        while (test)
        {
            System.out.print("Sales Amount ?");
            amn=paying.nextDouble();
            System.out.print("Payment type? <Cash> or <Credit> : ");
            Type=paying.next();
            
            if(Type.equalsIgnoreCase("cash"))
            {
                System.out.print("Cash Payment, amount paid is: "+amn);
                System.out.println();
                tpay= pay.addCashPayment(amn);
                
                if(tpay==null)
                {
                    System.out.print("you have maximum payment");
                }
            }
            else
            {
                System.out.print("Credit Card Holder: ");
                Holder=paying.next();
                System.out.print("Expire On (mm/yy) : ");
                Date=paying.next();
                System.out.print("Credit Card Number: ");
                Cardnum=paying.next();
                tpay=pay.addCreditCardPayment(amn, Holder, Date, Cardnum);
                System.out.println();
                System.out.println("Using Card ("+Holder+" ["+Cardnum+"] "+"exp: "+Date+")");
                System.out.println("for credit-card payment"+", Amount paid is: "+amn);
                
                if(Date.substring(4).equals("16"))
                {
                    exDate+="Card Holder "+Holder+"["+Cardnum+"] "+"exp date: "+Date+"\n"+"card number"+Cardnum+"\nfor credit card payment"+", Amount Paid is: "+amn+"\n";
                }
                if(tpay==null)
                {
                    System.out.print("you have maximum payment");
                }
            }
            System.out.print("Continue <y> or <n> ");
            cont=paying.next();
            if(cont.equalsIgnoreCase("n"))
            {
                test=false;
            }
        }
        int min=0;
        System.out.print("Enter amount to search less than: ");
        min=paying.nextInt();
        System.out.println("Number of payment less than "+min+"is: "+pay.Payless(min));
        System.out.println("Number of cash payment: "+pay.num_Cash());
        System.out.println("Total Amount: "+pay.totalAmount());
        System.out.println();
        System.out.println("Credit Card info that expire this year: "+exDate);
    }
    
}
