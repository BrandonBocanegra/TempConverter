//*******************************************************************
// BBTempConverter.java           Author:Brandon Bocanegra
//
// Chapter 2 Assignment TempConverter
// Due 9/17/23
// Writes a program that converts Fahrenheit to Celsius
//*******************************************************************
import java.util.Scanner;

public class BBTempConverter
{
   //----------------------------------------------------------------
   // Computes the Celsius Equivalent of a specific Fahrenheit
   // value using the formula C = (F - 32)(5/9)
   //----------------------------------------------------------------
   public static void main(String[] args)
   {
      final int Base = 32;
      final double Conversion_Factor = 5.0/ 9.0;
      
      double celsiusTemp;
      int fahrenheitTemp = 24;
      
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the temperature in Fahrenheit: ");
      fahrenheitTemp = scan.nextInt();
      
      celsiusTemp = (fahrenheitTemp - Base) * Conversion_Factor;
      
      System.out.println("Fahrenheit Temperature: " + fahrenheitTemp);
      System.out.println("Celsius Equivalent: " + celsiusTemp);
   }
}
