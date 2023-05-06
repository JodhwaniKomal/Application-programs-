UIN2022720

import java.util.Scanner;

public class StringsG1

{

public static void main(String[]args)

{

Scanner k =new Scanner(System.in);

System.out.println("Enter first string:");

String string1=k.nextLine();


System.out.println("Enter second string:");

String string2=k.nextLine();


System.out.println("First string is:"+string1);

System.out.println("First string is:"+string2);

int s=1;

do{
System.out.println("0.Press zero to exit");

System.out.println("1.Find length of strings");

System.out.println("2.Concatanation");

System.out.println("3.Reversal");

System.out.println("4.Comparision");

System.out.println("5.Sub string function");

System.out.println("6.Uppercase and Lowercase");

System.out.println("Enter your choice");

int choice=k.nextInt();

switch(choice)

{

case 0:{

System.exit(0);

}

case 1:

{

System.out.println("The length of first string is:"+string1.length());

System.out.println("The length of second string is:"+string2.length());

break;

}

case 2:

{

System.out.println("The concatenation of strings is:"+string1.concat(string2));

break;
}

case 3:

{
   
 StringBuilder obj=new StringBuilder();

obj.append(string1);
obj=obj.reverse();

System.out.println("The Reversal of the First string is:"+obj);

StringBuilder nobj=new StringBuilder();

nobj.append(string2);
nobj=nobj.reverse();

System.out.println("The Reversal of the second string is:"+nobj);
break;

}
case 4:
{
    System.out.println("The comparision value of first string is:"+(string1).compareTo(string2));
    System.out.println("The comparision value of second string is:"+(string2).compareTo(string1));
     break;
}
case 5:
{
    System.out.println("Enter the position of first  alphabet :");
    int start=k.nextInt();
    System.out.println("Enter the position of last  alphabet :");
    int last=k.nextInt();
    System.out.println("The sub string of the first string is:"+string1.substring(start,last));

    System.out.println("Enter the position of first  alphabet :");
    int start1=k.nextInt();
    System.out.println("Enter the position of last  alphabet :");
    int last1=k.nextInt();
    System.out.println("The sub string of the second string is:"+string2.substring(start1,last1));
    break;

    

}
case 6:
{
    //lower case 
    System.out.println("First string in lower case is:"+string1.toLowerCase());
    
    System.out.println("Second string in lower case is:"+string2.toLowerCase());

    
    System.out.println("First string in upper case is:"+string1.toUpperCase());
    
    System.out.println("Second string in upper case is:"+string2.toUpperCase());
    break;
}
}
}while(s!=0);
}
}










