import java.util.*;
class conditions
{
 	public static void main(String[] args)
 	{

		System.out.println("enter the token");
		Scanner sc =new Scanner(System.in);
 		int token=sc.nextInt();
                //int token=8;
 		switch(token)
		{
			case 100: System.out.println("jaint wheel");
			break;
			case 8:  System.out.println("tora tora");
			break;
			case 80: System.out.println("frog jump");
			break;
			case 20:System.out.println("slide");
			break;
			default:
			System.out.println("invalid token");
			
		}

}
}