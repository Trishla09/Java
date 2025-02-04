import java.util.Scanner;
public class MatrixDisplay {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
                                      System.out.println("Enter a number of rows:");
                                      int row=sc.nextInt();
                                      System.out.println("Enter a number of columns:");
                                      int col=sc.nextInt();
		int a[][]=new int [row][col];
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
			    System.out.println("Enter value for "+i+","+j+":");
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("The array elements are");
		for(int k=0;k<a.length;k++) {
			for(int l=0;l<a[k].length;l++) {
				System.out.print(a[k][l]+" ");
			}
			System.out.println();
		}
		}}