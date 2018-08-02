import java.util.*;
public class um {

	public static void main(String[] args) {
		int a1,i=0;
		Scanner a= new Scanner(System.in);
		a1= a.nextInt();
		a.close();
		while(a1!=0)
		{
			a1 /=10;
			i++;
		}
		System.out.println(i);
	}

}
