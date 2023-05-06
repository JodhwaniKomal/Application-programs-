import java.util.Scanner;

 
 
class ExceptionDemo
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int No1 = 0,No2 = 0 ;
        float Ans=0.0f;

        System.out.println("Entr first number");
        No1=sobj.nextInt();

        System.out.println("Entr second number");
        No2=sobj.nextInt();

        Ans=No1/No2;
        System.out.println("Division is:"+Ans);
    }
}
