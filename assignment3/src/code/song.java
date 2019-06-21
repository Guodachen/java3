package code;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import sql.DataConnect;
import view.allsong;

public class song {
	public String name;
	public String Author;
	public String time;
	public String id;
	public song(String name, String author, String time, String id) {
		super();
		this.name = name;
		Author = author;
		this.time = time;
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public song(String name, String author, String time) {
		super();
		this.name = name;
		Author = author;
		this.time = time;
	}
	public ArrayList<song> viewAllsong() throws SQLException, ClassNotFoundException{
		ArrayList<song> s = new ArrayList<song>();
		String url = "select * from song";
		ResultSet rs = DataConnect.getStat().executeQuery(url);
		while(rs.next()){
			s.add(new song(rs.getString("name"),rs.getString("Author"),
					rs.getString("time"),rs.getString("id")));
			
		}
		allsong al =new allsong();
//		for(int i=0;i<s.size();i++){
//			
//			System.out.println(s.get(i).getName());
//		}
//		System.out.println();
		return s;
	}
}
	

