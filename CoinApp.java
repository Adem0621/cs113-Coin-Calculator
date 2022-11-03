import java.util.*;
public class CoinApp
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      int quarters = 25;
      int dimes = 10;
      int nickels = 5;
      int pennies = 1;
      
      System.out.print("Enter number of cents: ");
      int x = scan.nextInt();
      
      int q = x / quarters;
      x = x - q*quarters;
      int d = x / dimes;
      x = x - d*dimes;
      int n = x / nickels;
      x = x - n*nickels;
      int p = x / pennies;
      
      System.out.println(q + " quarters " + d + " dimes " + n + " nickels " + p + " pennies");
   }
}