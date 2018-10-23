
public class Authenticate{
	
	String un="user1";
	String pw="pwd12345";
	Person user;
	
	public String getUn() {
		return un;
	}

	public void setUn(String un) {
		this.un = un;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	
	
	public int Verify(Person user) {
		int result=0;		
		if(user.getUsername()==un&&user.getPassword()==pw) {
			System.out.println("ok");
			result=1;
		}
		else {
			System.out.println("not ok");
			result=2;
		}
		
		return result;
	}
	
}
