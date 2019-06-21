package code;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import sql.DataConnect;

public class Inquire {
	int i;
	
	public Inquire() {
		super();
	}
	public Inquire(int i) {
		super();
		this.i = i;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	ArrayList<song> s = new ArrayList<song>();
	public String viewAllsong() throws SQLException, ClassNotFoundException{
		
		
			String url = "select * from song where pid = "+i+";";
			ResultSet rs = DataConnect.getStat().executeQuery(url);
			while(rs.next()){
				s.add(new song(rs.getString("name"),rs.getString("Author"),
						rs.getString("time"),rs.getString("id")));
			}
		String a =s.get(0).getName();
		int b=Integer.parseInt(s.get(0).getId());
		String url1 = "delete from temporary;";
		String sql = "insert into temporary(id) values('"+b+"');";
		try {
			DataConnect.getStat().executeUpdate(url1);
			DataConnect.getStat().executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("error");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}

	
	

}
