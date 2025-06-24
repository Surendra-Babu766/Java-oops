package pattren;
import java.util.Scanner;
public class Pattren5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int i=scan.nextInt();
		int j=scan.nextInt();
		int k=scan.nextInt();
		for(i=1;i<=n;i++) {
			for(k=1;k<=n-i;k++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				if(i==0||j==1||i==j||i==n) {
				System.out.print("*"+" ");
			}
				else {
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}
		

	}

}
