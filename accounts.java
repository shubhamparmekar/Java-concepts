package oops;
import java.util.Scanner;

public class accounts {
    String Name;
int AcNo;
double Balance;
accounts(String Name,int AcNo ,double Balance)
{
	this.Name=Name;
	this.AcNo=AcNo;
	this.Balance=Balance;
}
public void Withdraw()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Withdraw amt");
	int amount = sc.nextInt();
	if(amount>Balance)
	{
		System.out.println("Insufficient Balance");
		System.out.println("Balance :"+Balance);

	}
	else {
        Balance-=amount;
	System.out.println("Transaction Successfull");
	System.out.println("Balance :"+Balance);
	}
	System.out.println("______________");
	
}

public void Deposite()
{
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter Deposite amt");
    int amount=sc.nextInt();
	Balance+=amount;
	System.out.println("Transaction Successfull");
	System.out.println("Balance :"+Balance);
}

public void AccountDetails()
{
    System.out.println("Account Holder  name: "+Name);
	System.out.println("Account Number   : "+AcNo); 
	System.out.println("Balance :"+Balance);
    System.out.println("________________________");
}
}
