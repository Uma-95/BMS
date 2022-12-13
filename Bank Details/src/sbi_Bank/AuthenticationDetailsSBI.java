package sbi_Bank;

public class AuthenticationDetailsSBI {
private String Username;
private String Password;

AuthenticationDetailsSBI(String u,String p) {
	this.Username=u;
	this.Password=p;
	authdetails(Username,Password);
}
//username
public String getUsername() {
	return Username;
}
public void setUsername(String username) {
	Username = username;
}

//password
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}

void authdetails(String unm,String pw) {
	if((this.Username==unm)&&(this.Password==pw))
		System.out.println("Login Details match") ;
	else
		System.out.println("Login Details do not match") ;
	
}
}
