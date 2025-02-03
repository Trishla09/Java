import java.util.Scanner;
public class ReverseANumber{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number:");
int n=sc.nextInt();
int rev=0,r;
while(n>0){
r=n%10;
rev=rev*10+r;
n=n/10;
}
System.out.print("Reverse of the number is "+rev);
}}