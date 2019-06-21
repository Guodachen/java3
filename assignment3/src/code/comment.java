package code;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import sql.DataConnect;
import view.com;
import view.play;

public class comment {
	
	play in = new play();
	String name;
	String com;
	String sid;
	

	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCom() {
		return com;
	}
	public void setCom(String com) {
		this.com = com;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}

	public comment(String name, String com, String sid) {
		super();
		this.name = name;
		this.com = com;
		this.sid = sid;
	}

	
	public void create(){
		String sql = "insert into comment(sid,comment,username)values('"+sid+"','"+com+"','"+name+"');";
		try {
			DataConnect.getStat().executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("error");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	public ArrayList<comment> viewsong(int i) {
		
		System.out.println(i);
		ArrayList<comment> c = new ArrayList<comment>();
		String url = "select * from comment where sid = "+i+";";
		try {
			ResultSet rs = DataConnect.getStat().executeQuery(url);
			while(rs.next()){
				c.add(new comment(rs.getString("username"),rs.getString("comment"),
						rs.getString("sid")));}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("error");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(c.size());
		return c;
		
	}
	
}

		
		
	
	


