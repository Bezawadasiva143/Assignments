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
public interface product1Service {
	void insertProductMain(ProductMain Product2) throws SQLException,ClassNotFoundException;
	void deleteProductMain(Integer eid)throws SQLException,ClassNotFoundException ;
	void updateProductMain(Integer eid,ProductMain Product2)throws SQLException,ClassNotFoundException ;
	List<ProductMain> getAllProductMains()throws SQLException,ClassNotFoundException;
	ProductMain getProductMain(Integer eid) throws SQLException,ClassNotFoundException;
	
}