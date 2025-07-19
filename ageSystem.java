import java.util.Scanner;
public class ageSystem
{
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        
        if(age>=60)
        {
            System.out.println("Senior citizen ");
        }
        else if(age>=20)
        {
            System.out.println("adult");
        }
        else if(age>=13)
        {
            System.out.println("teenager");
        }
        else if(age>=1)
        {
            System.out.println("child ");
        }
        else
        {
            System.out.println("wrong age ");
        }
        sc.close();
    }
}