package javaweb;
import java.sql.Connection;
import java.sql.PreparedStatement;
public class SignupDAO {
	public static int validate(UserBean bean){
		int row=0;
		try{
			Connection con=DBconnect.getCon();

			PreparedStatement ps=con.prepareStatement(
					"insert into users values(?,?,?,?)");

			ps.setString(1,bean.getName());
			ps.setString(2,bean.getPass());
			ps.setString(3, bean.getEmail());
			ps.setInt(4, 100);


			row=ps.executeUpdate();


		}catch(Exception e){}

		return row;

	}
}