package simple.calcultor;
import java.util.Scanner;
public class operations extends Calculator{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		while(flag)
		{
			System.out.println("Enter the Number1");
			Calculator c=new Calculator();
			int num1=sc.nextInt();
			System.out.println("Enter the Number2");
			int num2=sc.nextInt();
			System.out.println("Choose the operation\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:System.out.println("Sum Of "+num1+" "+num2+" is "+c.add(num1,num2));
					   break;
				case 2:System.out.println("Difference Of "+num1+" "+num2+" is "+c.sub(num1,num2));
					   break;
				case 3:System.out.println("Multiplication Of "+num1+" "+num2+" is "+c.mul(num1,num2));
					   break;
				case 4:System.out.println("Division Of "+num1+" "+num2+" is "+c.div(num1,num2));
						break;
				default:return;
				
			}
			System.out.println("Do You Want to continue?");
			int v=sc.nextInt();
			if(v<=0)
			{
				flag=false;
			}
	}

}
}
