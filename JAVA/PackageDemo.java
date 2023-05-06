import Marvellous.Arithematic;
import Marvellous.Mathematics;

class PackageDemo
{
    public static void main (String Arg[])
    {
        Arithematic aobj=new Arithematic();
        Mathematics mobj=new Mathematics();
        
        int iet=0;
        
        
        iet=aobj.Addition(10,11);
        System.out.println("Addition is"+iet);

        iet=aobj.Sustraction(10,11);
        System.out.println("Addition is"+iet);

        iet=mobj.Square(10);
        System.out.println("Addition is"+iet);

        iet=mobj.Cube(10);
        System.out.println("Addition is"+iet);





    }    
}
