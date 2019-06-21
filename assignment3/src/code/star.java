package code;

import java.sql.SQLException;

import sql.DataConnect;

public class star {
	String username;
	String songname;
	public star(String username, String songname) {
		super();
		this.username = username;
		this.songname = songname;
	}
	public void create(){
		String sql = "insert into star(songname,username)values('"+songname+"','"+username+"');";
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
	public String getUsername() {
		return username;
	}
	public String getSongname() {
		return songname;
	}

}
