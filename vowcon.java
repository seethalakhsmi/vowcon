import java.io.*;
import java.util.*;
public class vowcon
{
public static void main(String args[])
{
char n;
Scanner scan=new Scanner(System.in);
System.out.println("enter the character");
String a=scan.next();
n=a.charAt(0);
switch(n)
{
case'a':
System.out.println("the character is vowel");
break;
case'e':
System.out.println("the character is vowel");
break;
case'i':
System.out.println("the character is vowel");
break;
case'o':
System.out.println("the character is vowel");
break;
case'u':
System.out.println("the character is vowel");
break;
default:
System.out.println("the character is consonant");
break;
}
}
}
