package pattren;
import java.util.Scanner;
public class Pattren7 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int i=scan.nextInt();
	int j=scan.nextInt();
	for(i=1;i<=n;i++) {
		int count=i;
		for(j=1;j<=(n-i)+1;j++) {
			System.out.print(count+" ");
			count++;
		}
		System.out.println(" ");
		}
	}
}
