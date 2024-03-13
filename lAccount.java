package oops;

public class lAccount extends l{
    int loan;
//single level inheritance
    lAccount(int loan)
    {
        super("hero",123,10000);
        this.loan=loan;
    }
    public void loanAccountDetails()
    {
        System.out.println("Monthly Loan: "+ loan);
    }
    public static void main(String[] args) 
    {
        lAccount l=new lAccount(3000);
        l.AccountDetails();
        l.loanAccountDetails();
    }
}

