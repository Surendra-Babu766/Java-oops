package pattren;
import java.util.Scanner;
public class PAttren2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int i=scan.nextInt();
		int j=scan.nextInt();
		for(i=0;i<n;i++) {
			for(j=0;j<=i;j++) {
				if(j==0||i==n-1||i==j) {
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
