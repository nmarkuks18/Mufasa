
public class Account {
	
	//private String userID;
	//private double balance;
	String userID;
	double balance;
	public Account(String userID, double balance)
	{
		this.userID=userID;
		this.balance=balance;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
