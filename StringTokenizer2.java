package opps;
import java.util.StringTokenizer;
public class StringTokenizer2 {

	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("java SQL MYSQL HTML CSS JAVASCRIPT"," ");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
