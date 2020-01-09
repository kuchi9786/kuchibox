package jdbc.k20191122;

import java.sql.*;
import jdbc.util.DBUtil;
import java.util.Scanner;

public class PreparedStatementTest3 {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("�˻��� �Է��ϼ���: ");
		String search= sc.next();
		
		Connection con=null;
		PreparedStatement ps= null;
		ResultSet rs=null;
		
		//�ش��ۼ��ڰ� �� �� �˻�
		try {
			con= DBUtil.getCon();
			
//			String sql="SELECT * FROM MEMO WHERE NAME= ?";
			
			//�޸𳻿��� �˻�� ���� ������ ������ ������ �����a- like ���
			String sql="SELECT * FROM MEMO WHERE MSG LIKE ?";
			
			System.out.println(sql+search);
			ps=con.prepareStatement(sql);
			
			ps.setString(1, "%"+search+"%");
			
			//query execute
			rs=ps.executeQuery();
			
			//query sysout
			while(rs.next())
			{
				int idx= rs.getInt(1);				//�÷� �ε����� �ᵵ �� ���
				String name2= rs.getString("name");
				String msg= rs.getString("msg");
				Date wdate=rs.getDate(4);			//�̰ŵ� �÷��ε���
				System.out.println(idx+"\t"+name2+"\t"+msg+"\t"+wdate);
			}
			
		}
		finally {
			if(rs!=null)
				rs.close();
			if(ps!=null)
				ps.close();
			if(con!=null)
				con.close();
		}
		
		
	}
}