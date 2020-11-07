import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) 
    {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
		int i=n;
        int ans=0;
        while(i>0)
        {
            int rem=i%10;
            ans=ans*10+rem;
            i=i/10;
        }
        System.out.println(ans);
	}
}