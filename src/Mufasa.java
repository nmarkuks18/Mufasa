
public class Mufasa {
	
	Person user;
	Account account;
	Authenticate pwd;
	
	public Authenticate getAuth() {
		return pwd;
	}
	public void setAuth(Authenticate pwd) {
		this.pwd=pwd;
	}
	public Person getUser() {
		return user;
	}
	
	public void setUser(Person user) {
		this.user=user;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}	
	
	public int checkPassword(Authenticate a) {
		int result=0;
		
		result=a.Verify(user);		
		return result;
		
	}
	}
