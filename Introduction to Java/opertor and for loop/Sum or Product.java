import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
        int c=s.nextInt();
        int sum=0;
        int prod=1;
        if(c==1)
        {
            int i=N;
            while(i>0)
            {
                sum+=i;
                i--;
            }
            System.out.println(sum);
        }
        else if(c==2)
        {
            int i=N;
            while(i>0)
            {
                prod*=i;
                i--;
            }
            System.out.println(prod);
        }
        else
        {
            System.out.println("-1");
        }
	}
}
