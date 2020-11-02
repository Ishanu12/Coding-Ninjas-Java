import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
        int i=n;
        int s_e=0;
        int s_o=0;
        while(i>0)
        {
            int x=i%10;
            if(x%2==0)
            {
                s_e+=x;
            }
            else
            {
                s_o+=x;
            }
            i=i/10;
        }
        System.out.println(s_e+" "+s_o);
	}
}
