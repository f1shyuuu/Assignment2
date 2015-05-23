package WebAssignment2.model;

public class User {

	

	private String userPassword;
	private String userRole;
	
	public User(String name, String pass, String role){
		
		userName = name;
		userPassword = pass;
		userRole = role;
				
	}
	
	private String userName;
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	
	public String toString(){
		return "Hello! "+userName;
	}
	
}
