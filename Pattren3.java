package pattren;
import java.util.Scanner;
public class Pattren3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int i=scan.nextInt();
		int j=scan.nextInt();
		int count=1;
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++) {
				if(count<10) {
					System.out.print("0");
				}
				System.out.print(count+" ");
				count++;
			}
			System.out.println(" ");
		}
		
		

	}

}
