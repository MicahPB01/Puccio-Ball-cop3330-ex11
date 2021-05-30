package oop.example;


import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int numEuros;
        float exchangeRate;

        System.out.printf("How many euros are you exchanging? ");
        numEuros = Integer.parseInt(input.nextLine());

        System.out.printf("What is the exchange rate? ");
        exchangeRate = Float.parseFloat(input.nextLine());

        System.out.printf("%d euros at an exchange rate of %.2f is\n%.2f U.S dollars.\n", numEuros, exchangeRate, (numEuros * (exchangeRate/100)));



    }
}
