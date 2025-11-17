package Student_Grade_Tracker;



import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class StudModel {
 public void addrecord(Student s1) {
	 
	 try {
		 MyConnection mycon= new MyConnection();
		 
		 PreparedStatement stat= mycon.con.prepareStatement("insert into Student7 Values(?,?,?)");
		 
		 stat.setInt(1,s1.getRollno());
		 stat.setString(2,s1.getName());
		 stat.setInt(3, s1.getMarks());
		 stat.execute();
		 System.out.println("Record Inscrted");
		 mycon.con.close();
	 }
	 catch(Exception e) {
		 System.out.println(e);
	 }
 }
 
 public void updaterecord(Student s1) {
	 try {
		 MyConnection mycon= new MyConnection();
		 
		 PreparedStatement stat= mycon.con.prepareStatement("update Student set std Name=? ,Roll_no=?, marks=?");
		 
		 stat.setInt(3, s1.getRollno());
		 stat.setString(1,s1.getName());
		 stat.setInt(2, s1.getMarks());
		 
		 stat.executeUpdate();
		 
		 System.out.println("Record Update");
		 
		 mycon.con.close();
	 }
	 catch(Exception e) {
		 System.out.println(e);
	 }
 }
 
 
 public void Deleterecord(Student s1) {
	 try {
		 MyConnection mycon=new MyConnection();
		 
		 PreparedStatement stat=mycon.con.prepareStatement("delete from Student7 where Roll_no=?");
		 
		 stat.setInt(1,s1.getRollno());
		 stat.executeUpdate();
		 
		 System.out.println("Record Deleted");
		 
		 mycon.con.close();
	 }
	 catch(Exception e) {
		 System.out.println(e);
	 }
 }
 
 
 
 public Student Searchrecord(Student s1) {
	 try {
	 MyConnection mycon=new MyConnection();
	 
	 PreparedStatement stat=mycon.con.prepareStatement("Select*from Student7 where Roll_no=?");
	 
	 stat.setInt(1, s1.getRollno());
	 
	 ResultSet rs= stat.executeQuery();
	 
	 if(rs.next()) {
		 s1.setName(rs.getString(2));
		 s1.setMarks(rs.getInt(3));
	 }
	 
	 mycon.con.close();

	 } 
	 catch(Exception e) {
	 System.out.println(e);
 }
	 return s1;
}

}

