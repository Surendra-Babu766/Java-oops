package pattren;
import java.util.Scanner;
public class Pattren6 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int j=scan.nextInt();
		int i=scan.nextInt();
		for(i=0;i<=n;i++) {
			for(j=1;j<=(n-i)+1;j++) {
				System.out.print("*"+" ");
			}
			System.out.println(" "); 
			
		}

	}

}
