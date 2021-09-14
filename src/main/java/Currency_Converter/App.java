package Currency_Converter;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Persad
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner myObj = new Scanner(System.in);
        double amount_to;
        double amount_from;
        double rate_from;
        System.out.print("How many euros are you exchanging? " );
        String num_euro = myObj.nextLine();
        System.out.print( "What is the exchange rate? " );
        String exchange_rate = myObj.nextLine();

        amount_from = Double.parseDouble(num_euro);
        rate_from = Double.parseDouble(exchange_rate);

        amount_to = amount_from*rate_from;

        String print = String.format("%s euros at an exchange rate of %s is\n%.2f U.S. dollars.",
                num_euro,exchange_rate,amount_to);
        System.out.println(print);
    }
}
