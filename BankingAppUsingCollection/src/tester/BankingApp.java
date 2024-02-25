package tester;

import java.util.HashMap;
import java.util.Scanner;

public class BankingApp {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			HashMap<Integer,BankAccount> accounts = populateMap();
			boolean exit=false;
			while(!exit) {
				System.out.println("Options 1. Create A/C 2.Display 3.Get Acc Summary "+
			"4. Transfer Funds 5. Close A/C 6.Display All details of specific acc type"
						+"7.Remove all loan accounts 10.Exit");
			try {
				switch(sc.nextInt()) {
				case 1:
					System.out.println("enter acc no");
					int acctNo = sc.nextInt();
					if(accounts.containsKey(acctNo))
						throw new BankingException(mesg:"Dup Acct no!!!");
					System.out.println("Enter a/c details: acType,balance,creationDate(yr-mon-day) customerName");
					accounts.put(acctNo,new BankAccount(acctNo,valueOf(sc.next().toUpperCase()),sc.nextDouble(),parse(sc.next()),sc.next()));
					System.out.println("A/C created...");
					break;
				case 2:
					break;
					
				case 3:
					break;
				case 4:
					System.out.println("enter acc no");
					break;
				case 5:
					break;
					
				case 6:
					break;
				case 10:
					exit=true;
					break;
				
				}
			}catch (Exception e) {e.printStackTrace();}
			}
			sc.nextLine();
		}
			
		
	}

}
