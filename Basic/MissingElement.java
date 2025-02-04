import java.util.Scanner;
public class MissingElement {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int n=a.length;
		System.out.println("Enter array elements:");
		for(int i =0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int sum=0;
		int total=n*(n+1)/2;
		for(int j=0;j<n;j++) {
			sum+=a[j];
		}
		int missingdigit=total-sum;
		System.out.println("The missing element is "+missingdigit);
		
	}

}
