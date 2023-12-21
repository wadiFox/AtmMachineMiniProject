package git.atmproject;

public class AtmOperationsImpl implements AtmOperationsInterf{
	ATM atm = new ATM();

	@Override
	public void viewBalance() {
		System.out.println("Your balance is : "+ atm.getBalance());
		
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		if(withdrawAmount<=atm.getBalance()) {
			System.out.println(withdrawAmount + " withdrawed successfully !!!\nCollect your cash ");
			atm.setBalance(atm.getBalance()-withdrawAmount);	
			viewBalance();
		}else {
			System.out.println("insufficient Funds !!!");
		}
		
	}

	@Override
	public void depositAmount(double depositAmount) {
		System.out.println(depositAmount + " Deposited successfully !!! ");
		atm.setBalance(atm.getBalance()+depositAmount);	
		viewBalance();
	}

	@Override
	public void viewMiniStatement() {
		// TODO Auto-generated method stub
		
	}

}
