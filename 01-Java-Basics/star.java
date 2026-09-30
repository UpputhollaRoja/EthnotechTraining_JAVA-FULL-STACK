import java.util.Scanner;
public class star{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int n=sc.nextInt();
        if(n>90)
        {
            System.out.println("5 star");
        }
        else if(n>80)
        {
            System.out.println("4 star");
        }
        else if(n>70)
        {
            System.out.println("3 star");
        }
        else if(n>60)
        {
            System.out.println("avg student");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}