package com.ey.jdbc.service;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.ey.jdbc.model.ProductMain;
import com.ey.jdbc.util.DbConn;
public class product1ServiceImpl implements product1Service {
@Override
	public void insertProductMain(ProductMain product2) throws SQLException,ClassNotFoundException{
		//PreparedStatement
		PreparedStatement pst=DbConn.getConnection().prepareStatement("insert into ProductMain values(?,?,?)");
		pst.setInt(1,product2.getId());
		pst.setString(2,product2.getName());
		pst.setInt(3,product2.getprice());
		pst.execute();
		
	}

@Override
	public void deleteProductMain(Integer eid)throws SQLException,ClassNotFoundException {
	PreparedStatement pst=DbConn.getConnection().prepareStatement("delete from Productmain where id=?");
	pst.setInt(1,eid);
	pst.execute();
	//implement logger
	System.out.println("deleted");
	}
	public void updateProductMain(Integer eid,ProductMain product2) throws SQLException,ClassNotFoundException{
		Connection con=DbConn.getConnection();
		con.setAutoCommit(false);
		try {
		PreparedStatement pst=con.prepareStatement("update  Productmain  name=?,price=? where id=?");
		pst.setInt(3,eid);
		pst.setString(2, product2.getName());
		pst.setInt(3, product2.getprice());
		pst.execute();
		}
		catch(Exception e) {
			con.rollback();
		}
		con.commit();
		//implement logger
		System.out.println("deleted");	
	}
	public List<ProductMain> getAllProductMains()throws SQLException,ClassNotFoundException{
		Statement st=DbConn.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs=st.executeQuery("select * from ProductMain");
		List<ProductMain> elist=new ArrayList<>();
		while(rs.next()) {
		
			ProductMain e=new ProductMain();
			e.setId(rs.getInt(1));
			e.setName(rs.getString(2));
			e.setprice(rs.getInt(3));
			elist.add(e);
		}
		return elist;
	}
	public ProductMain getProductMain(Integer eid)throws SQLException,ClassNotFoundException {
		PreparedStatement st=DbConn.getConnection().prepareStatement("select * from ProductMain where id=?");
		st.setInt(1, eid);
		
		ResultSet rs=st.executeQuery();
		ProductMain e=new ProductMain();
		
		while(rs.next()) {
			e.setId(rs.getInt(1));
			e.setName(rs.getString(2));
			e.setprice(rs.getInt(3));
		}
		
		return e;
	}

	
}


	

