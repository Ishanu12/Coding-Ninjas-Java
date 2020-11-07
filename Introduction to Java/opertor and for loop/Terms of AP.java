import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
        int i=1;
        int k=1;
        while(k<=n)
        {
            int x=3*i+2;
            if(x%4!=0)
            {
                System.out.print(x+" ");
                k++;
            }
            i++;
        }
	}
}