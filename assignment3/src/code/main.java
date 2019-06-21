package code;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import sql.DataConnect;
import view.mainview;
import view.registered;

import com.mysql.jdbc.Statement;

public class main {
	private String name;
	private String pw;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public main(String string, String string2) {
		super();
	}
	public boolean login(String name, String pw) throws SQLException, ClassNotFoundException{
		String url ="select * from user where username ='"+name+"' and password='"+pw+"'";
		ResultSet rs = DataConnect.getStat().executeQuery(url);
		if(rs.next())
			return true;
		return false;
	}
	public void register(String name, String pw1, String pw2) throws Exception{
		if(!pw1.equals(pw2))
			{
			registered.error();
			}
		else{
			String sql = "insert into user(username, password) values('"+name+"','"+pw1+"');";
			DataConnect.getStat().executeUpdate(sql);
			
			String s = "C:\\Users\\Ethan\\Desktop\\jpeg\\17.jpg";
			s=s.replace("\\", "\\\\");
			System.out.println(s);
			String url = "insert into Avatar(user,url) values('"+name+"','"+s+"');";
			DataConnect.getStat().executeUpdate(url);
			JOptionPane.showMessageDialog(null, "×¢²á³É¹¦", "ok",
					JOptionPane.PLAIN_MESSAGE);
			dispose();
			new mainview().setVisible(true);
		}
	} 
	
	private void dispose() {
		// TODO Auto-generated method stub
		
	}
	public ArrayList<Ruser> viewAlluser() throws SQLException, ClassNotFoundException{
		ArrayList<Ruser> u = new ArrayList<Ruser>();
		String url = "select * from user";
		ResultSet rs = DataConnect.getStat().executeQuery(url);
		while(rs.next()){
			u.add(new Ruser(rs.getString("username"),rs.getString("password")));
			
		}
		for(int i=0;i<u.size();i++){
			System.out.println(u.get(i).getName());
		}
//		System.out.println();
		return u;
	}
}
