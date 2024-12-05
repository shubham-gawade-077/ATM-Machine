package Atm;

import java.util.Scanner;

public class AtmMachine 
{
	public static void main(String[] args)
	{
		
		int pin,ch1,ch2,cpin=1234,cnt=1;
		double interest,wamt,damt,bal=5000;
		Scanner sc=new Scanner(System.in);
	
		while(cnt<=3)
		{
			System.out.println("Enter the pin");
			pin=sc.nextInt();
			if(pin==cpin)
			{
				System.out.println("choose your account");
				System.out.println(" 1.current \n 2.saving");
				int a=sc.nextInt();
				switch(a)
				{
				case 1:
					do {
					System.out.println("Enter your choice");
					System.out.println(" 1.check balance\n2.withdraw money\n3.deposit money\n4.change pin\n5.calculate interest\n6.exit");
					 ch1=sc.nextInt();
					
				
					switch(ch1)
					{
					case 1:
						System.out.println("Available balance= "+bal);
						break;
					case 2:
						System.out.println("Enter withdraw money");
						wamt=sc.nextInt();
						if(wamt<=bal)
						{
						double money=bal-wamt;
						bal=money;
						System.out.println(" Remaining balance= "+bal);
						}
						else
						{
							System.out.println("Insuffitient money....plz deposit money");
						}
						break;
					case 3:
							System.out.println("Deposit your money");
							damt=sc.nextInt();
							double m=damt+bal;
							bal=m;
							System.out.println("total balance= "+bal);

						break;
					case 4:
							System.out.println("Enter old pin");
							int pp=sc.nextInt();
							if(cpin==pp)
							{
								System.out.println("Enter new pin");
								int npin=sc.nextInt();
								cpin=npin;
							}
							else
							{
								System.out.println("incorrect pin...plz enter valid pin");
							}
						break;
					case 5:
						System.out.println("balance= "+bal);
						interest=bal*0.02;
						System.out.println("interest= "+interest);
						bal=bal+interest;
						System.out.println("total balance= "+bal);
						break;
					case 6:
						System.exit(0);
						default:
							System.out.println("plz enter valid choice");
					}
					}
					while(ch1<=6);
					break;
					
				case 2:
					do
					{
					System.out.println("Enter your choice");
					System.out.println("1.check balance\n2.withdraw money\n3.deposit money\n4.change pin\n5.calculate interest\n6.Exit");
					ch2=sc.nextInt();
					switch(ch2)
					{
					case 1:
						System.out.println("Available balance= "+bal);
						break;
					case 2:
						System.out.println("Enter withdraw money");
						wamt=sc.nextInt();
						if(wamt<=bal)
						{
						double money=bal-wamt;
						bal=money;
						System.out.println(" Remaining balance= "+bal);
						}
						else
						{
							System.out.println("Insuffitient money....plz deposit money");
						}
						break;
					case 3:
						System.out.println("Deposit your money");
						damt=sc.nextInt();
						double m=damt+bal;
						bal=m;
						System.out.println("total balance= "+bal);
						break;
					case 4:
						System.out.println("Enter old pin");
						int pp=sc.nextInt();
						if(cpin==pp)
						{
							System.out.println("Enter new pin");
							int npin=sc.nextInt();
							cpin=npin;
						}
						else
						{
							System.out.println("incorrect pin...plz enter valid pin");
						}
						break;
					case 5:
						System.out.println("balance= "+bal);
						interest=bal*0.04;
						System.out.println("interest= "+interest);
						bal=bal+interest;
						System.out.println("total balance= "+bal);
						break;
					case 6:
						System.exit(0);
						default:
							System.out.println("plz enter valid choice");
					}
					}
					while(ch2<=6);
					break;
				
				}
			}
		else
		{
			if(cnt<=2)
			{
			System.out.println("Wrong pin..plz enter valid pin\n");
			
			
			}
			cnt++;
		}
			
		
		}
		
		
	if(cnt>=3 )
		{
		System.out.println("your card has been blocked");
		}
	}
}
