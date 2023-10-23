import java.util.*;

class user
{
	static int balance =30000;
	int pincode =1234;
	int wd_money,dp_money,tf_money;	
}

class option extends user
{
	Scanner sc = new Scanner(System.in);
	int pin;
	
    void withdraw()
	{
    	     System.out.println("\n ENTER YOUR PIN\n  ");
             pin = sc.nextInt();
	         if(pin==pincode)
	         {
	              System.out.println(" \n ENTER YOUR AMOUNT\n ");
                  wd_money = sc.nextInt();
	         if(wd_money<balance)
	         {
	              System.out.println(" \n COLLECT YOUR CASH Rs."+ wd_money+"/-\n " );
	              System.out.println(" \n NOW AVAILABLE BALANCE  Rs."+(balance-wd_money)+"/-\n " );
	         }
	         else
	         {
	              System.out.println(" \n INSUFFENT FUND\n ");
	         }	
	    }
     	else
	    {
	             System.out.println(" \n PLEASE ENTER VALID PIN\n ");
	    }
	}
	
	void deposit()
	{
         System.out.println(" \n ENTER YOUR PIN\n");
	     pin =sc.nextInt();
		
         if(pin==pincode)
         {
	            System.out.println(" \n ENTER ACCOUNT NUMBER\n");
	            int acc = sc.nextInt();
		
                System.out.println(" \n ENTER AMOUNT\n ");
	            dp_money =sc.nextInt();
	            System.out.println(" \n YOUR AMOUNT IS SUCCESSFULLY!! DEPOSITED\n ");
	            System.out.println(" \n NOW AVAILABLE BALANCE  Rs."+ (balance = balance+dp_money)+"/-\n ");	
         }
     	 else
	     {
	           System.out.println(" \n PLEASE ENTER VALID PIN\n ");
	     }
	}
	
	void transfer()
	{
	     System.out.println(" \n ENTER YOUR PIN\n ");
	     pin = sc.nextInt();
         if(pin==pincode)
         {
               System.out.println(" \n ENTER ACCOUNT NUMBER\n ");
               int acc=sc.nextInt();
               System.out.println(" \n ENTER AMOUNT\n ");
			   tf_money =sc.nextInt();
	           System.out.println(" \n YOUR AMOUNT IS SUCCESSFULLY!! TRANSFERED\n ");
               System.out.println(" \n NOW AVAILABLE BALANCE  Rs."+ (balance=balance-tf_money)+"/-\n ");
	     }
	     else
	     {
               System.out.println(" \n PLEASE ENTER VALID PIN\n ");
	     }
	}
	
	void balance()
	{  
     	 System.out.println(" \n ENTER YOUR PIN\n ");
	     pin = sc.nextInt();
	     if(pin==pincode)
	     {
	           System.out.println(" \n NOW AVAILABLE BALANCE  Rs."+ balance+"/-\n ");
         }
	     else
	     {
               System.out.println(" \n PLEASE ENTER VALID PIN\n ");
         }
	}
}
class Atm
{	
	public static void main(String ar[])
	{
	Scanner sc = new Scanner(System.in);
	int id = 102030;
	System.out.println(" ***** WELCOME TO ATM *****");
	System.out.println(" PLEASE ENTER YOUR VALID ID ");
	int user_id = sc.nextInt();
	boolean exit =true;
	if(id==user_id)
	{
		while(exit==true)
		{
	System.out.println("\n ENTER 1 : FOR WITHDRAW ");
	System.out.println(" ENTER 2 : FOR DEPOSIT ");
	System.out.println(" ENTER 3 : FOR TRANSFER ");
	System.out.println(" ENTER 4 : FOR BALANCE");
	System.out.println(" ENTER 5 : FOR EXIT");
	int x =sc.nextInt();
	switch(x)
	{
	case 1:
	option wid= new option();
	wid.withdraw();
	break;

    case 2:
	option dep= new option();
	dep.deposit();
	break;
				
	case 3:
	option tran= new option();
	tran.transfer();
	break;
				
	case 4:
	option check= new option();
	check.balance();
	break;
	
	case 5:
	System.out.println("......THANKYOU......");
	exit = false;
	break;
	
	default:
	System.out.println(" INVALID OPTION");
	}
	}
	}
	else
	{
	System.out.println(" PLEASE ENTER  VALID ID ");
	}
	}
    }