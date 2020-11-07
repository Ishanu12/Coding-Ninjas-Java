import java.util.Scanner;
import java.lang.Math;
public class Main {
	
	public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=n;
        int ans=0;
        int count=0;
        while(i>0)
        {
            int place=i%10;
            ans+=Math.pow(2,count)*place;
            i=i/10;
            count++;
        }
        System.out.println(ans);
	}
}
