package oops;

public class l {
    String Name;
int AcNo;
double Balance;
l(){}
l(String Name,int AcNo ,double Balance)
{
	this.Name=Name;
	this.AcNo=AcNo;
	this.Balance=Balance;
}
public void AccountDetails()
{  System.out.println("Account Holder  name: "+Name);
System.out.println("Account Number   : "+AcNo); 
System.out.println("Balance :"+Balance);
System.out.println("________________________");
}
}
