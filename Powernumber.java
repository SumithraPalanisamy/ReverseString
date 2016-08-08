import java.util.Scanner;


public class Powernumber {
public static void main(String[] args) {
    long value=1;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the base");
	int base=s.nextInt();
	System.out.println("Enetr the exp");
	int exp=s.nextInt();
	while (exp!=0)
	{
	 value = base;
	--exp;
	}
	System.out.println("power of the number is "+value);
}
}
