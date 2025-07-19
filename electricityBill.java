import java.util.Scanner;
public class electricityBill
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the units you consumed this month : ");
        int units = sc.nextInt();

        if(units<=100)
        {
            int bill = units * 5;
            System.out.println("The bill is " + bill);

        }

        else if(units<=200)
        {
            int bill = (100 * 5) + ((units - 100 ) * 7);
            System.out.println("The bills is  " + bill);
        }

        else 
        {
            int bill = (100 * 5) + (100 * 7) + ((units - 200 ) * 10);
            System.out.println("the bill is " + bill);
        }
        
        sc.close();
    }
}