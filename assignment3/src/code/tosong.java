package code;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import sql.DataConnect;

public class tosong {
	public ArrayList<song> viewAllsong() throws SQLException, ClassNotFoundException{
		ArrayList<song> s = new ArrayList<song>();
		for(int i =0;i<10;i++){
			String url = "select * from song where pid = "+i+";";
			ResultSet rs = DataConnect.getStat().executeQuery(url);
			while(rs.next()){
				s.add(new song(rs.getString("name"),rs.getString("Author"),
						rs.getString("time"),rs.getString("id")));
			}
			
		}
//		
//		for(int i =0;i<10;i++){
//			System.out.println(s.get(i).getName());
//		}
		
		
		return s;
	}
}
