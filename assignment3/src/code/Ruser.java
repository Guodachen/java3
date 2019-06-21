package code;

public class Ruser {
	public String name;
	public String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Ruser(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}


}
