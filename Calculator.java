import java.util.Scanner;
public class Calculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int choice;

               

    do{
        System.out.print("\n 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division  \n 5. Exit \n Enter your choice :  ");

        choice = sc.nextInt();

               
        
        switch(choice)
        {
            
            case 1 ->{
                System.out.println("Enter first number ");
                int num1 = sc.nextInt();
                System.out.println("Enter second number ");
                int num2 = sc.nextInt();

                int a = num1+num2;
                System.out.println("The sum is " + a) ;

            }

            case 2 ->{
                System.out.println("Enter first number ");
                int num1 = sc.nextInt();
                System.out.println("Enter second number ");
                int num2 = sc.nextInt();
                int b = num1-num2;
                System.out.println("The Diff is  " + b );

            }

            case 3 ->{
                System.out.println("Enter first number ");
                int num1 = sc.nextInt();
                System.out.println("Enter second number ");
                int num2 = sc.nextInt();
                int c = num1 * num2;
                System.out.println("The product is " + c);
            }

            case 4 ->{
                System.out.println("Enter first number ");
                int num1 = sc.nextInt();
                System.out.println("Enter second number ");
                int num2 = sc.nextInt();
                if(num2==0){
                    System.out.println("Cant divide by 0 ");
                }
                else {
                    int d = num1 /num2 ;
                    System.out.println("The division is  " + d);
                }

            }
 
            case 5 ->{
                System.out.println("Thanks for choosing us : BYE BYE ");
            }

        }
      }
      while(choice!=5);

      sc.close();

    }
}