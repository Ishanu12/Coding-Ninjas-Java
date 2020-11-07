import java.util.Scanner;
import java.lang.Math;
public class Main {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        long n=s.nextLong();
        long i=n;
        long prev=1;
        long ans=0;
        while(i>0)
        {
            long rem=i%2;
            ans+=prev*rem;
            prev=prev*10;
            i=i/2;
        }
        System.out.println(ans);
	}
}
