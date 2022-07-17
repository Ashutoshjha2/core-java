import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class BusDao {
public static boolean insertBusToDB(Bus b) {
	boolean f=false;
	//JDBC CODE...
	try {
		Connection con = CP.create();
		String q = "insert into tickets values(?,?,?,?)";
		// prepared statment
		PreparedStatement pstmt =con.prepareStatement(q);
		// set the value of parameter
		pstmt.setInt(1, b.getBusNo());
		pstmt.setString(2, b.getBusDestination());
		pstmt.setString(3, b.getBusFare());
		pstmt.setString(4, b.getBusSeat());
		
		//excute
		pstmt.executeUpdate();
		f=true;
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return f;
}

public static boolean deleteBus(int userno) {
	// TODO Auto-generated method stub
	boolean f=false;
	//JDBC CODE...
	try {
		Connection con = CP.create();
		String q = "delete from tickets where BusNo=?";
		// prepared statment
		PreparedStatement pstmt =con.prepareStatement(q);
		// set the value of parameter
		pstmt.setInt(1, userno);
		
		
		//excute
		pstmt.executeUpdate();
		f=true;
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return f;
}

public static void showAllBus() {
	// TODO Auto-generated method stub
	//JDBC CODE...
	try {
		Connection con = CP.create();
		String q = "select * from tickets;";
	    Statement stmt = con.createStatement();
	    ResultSet set = stmt.executeQuery(q);
		while (set.next()) {
			int no = set.getInt(1);
			String destination = set.getString(2);
			String fare = set.getString(3);
			String seat = set.getString(4);
			System.out.println("No. : "+no);
			System.out.println("Destination :"+destination);
			System.out.println("Fare :"+fare);
			System.out.println("Seat :"+seat);;
			System.out.println("*************************");
		}
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
}
}
