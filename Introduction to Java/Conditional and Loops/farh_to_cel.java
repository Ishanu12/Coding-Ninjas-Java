import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int S=s.nextInt();
        int E=s.nextInt();
        int W=s.nextInt();
        int i=S;
        int f;
        while(i<=E)
        {
            f=(int)((5.0/9)*(i-32));
            System.out.println(i+"\t"+f);
            i=i+W;
        }
	}

}
