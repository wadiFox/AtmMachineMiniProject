package git.atmproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class AtmOperationsImpl implements AtmOperationsInterf{
	ATM atm = new ATM();
    List<Transactions> ministmt=new ArrayList<>();
	@Override
	public void viewBalance() {
		System.out.println("Your balance is : "+ atm.getBalance());
		
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		if(withdrawAmount<=atm.getBalance()) {
			Transactions transaction = new Transactions(withdrawAmount, " Amount withdrawn");
			ministmt.add(transaction);
			System.out.println(withdrawAmount + " withdrawed successfully !!!\nCollect your cash ");
			atm.setBalance(atm.getBalance()-withdrawAmount);	
			viewBalance();
		}else {
			System.out.println("insufficient Funds !!!");
		}
		
	}

	@Override
	public void depositAmount(double depositAmount) {
		Transactions transaction = new Transactions(depositAmount, " Amount deposited");
		ministmt.add(transaction);
		System.out.println(depositAmount + " Deposited successfully !!! ");
		atm.setBalance(atm.getBalance()+depositAmount);	
		viewBalance();
	}

	@Override
	public void viewMiniStatement() {
		for(Transactions m:ministmt) {
			System.out.println(m.toString());
		}
		
	}
	
	/*public void viewMiniStatementt() {
        // Convert the entries to a list
        List<Map.Entry<Double, String>> entryList = new ArrayList<>(ministmt.entrySet());

        // Reverse the list
     //   Collections.reverse(entryList);

        // Print the mini-statement
        for (Map.Entry<Double, String> entry : entryList) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }*/

}
