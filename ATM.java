import java.util.Scanner;
public class ATM
{
    public static void main(String[] args)
     {
        
        final int pass = 1234; 
        int money = 1_00_000;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===Welcome to the ATM system====");
        int counter = 0;
        while(counter!=3)
        {


        System.out.print("Enter the password : ");
         int password = sc.nextInt();

        

        

        if(password==pass)
            
        {
            System.out.println("password is correct ! ");
            
            int choice;
            do
            {

            System.out.print("\n1.checkBalance\n2.depositMoney\n3.withdrawMoney\n4.Exit \n Enter your choice : ");
            choice = sc.nextInt();
            
            switch(choice)
            {
            case 1 :
                System.out.print("your balance is : " + money);
                break;

            case 2:
                System.out.print("enter the amount you want to deposit :  ");  
                int deposit = sc.nextInt();
                
                money+=deposit;

                System.out.print("the total balance now is : " + money);
                break;
            
            case 3:
                System.out.print("Enter the amount you want to withdraw : ");
                int withdraw = sc.nextInt();
                if(withdraw<0)
                {
                    System.out.println("invalid operation ....");
                }
                else if( withdraw>money)
                {
                    System.out.println("your account has low balance...");
                }
                else
                {

                money-=withdraw;

                System.out.print("the total balance now is : " + money);
                }
                break;

                case 4:
                    System.out.println("Thanks for choosing our ATM system ");
                    break;
            
            default:
                System.out.print("invalid choice ");
            }
            
            }
            while (choice!=4); 
            break;
        }
                
            
           
    else 
    {
         System.out.println("Incorrect password ! Try again ");
         counter++;
    }
    if(counter ==3)
    {
        System.out.println("Your ATM has been disabled due to again and again wrong passwords ");
    }
}
            
    sc.close();
  }
}