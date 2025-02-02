import java.util.Scanner;
public class SwitchCase{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a String:");
String s=sc.nextLine();
int i;
s=s.toLowerCase();
System.out.println("The vowels in a given string are");
for(i=0;i<s.length();i++){
char ch=s.charAt(i);
switch(ch){
case 'a':
System.out.println("a");
break;
case 'e':
System.out.println("e");
break;
case 'i':
System.out.println("i");
break;
case 'o':
System.out.println("o");
break;
case 'u':
System.out.println("u");
break;
default:
}
}
}
}