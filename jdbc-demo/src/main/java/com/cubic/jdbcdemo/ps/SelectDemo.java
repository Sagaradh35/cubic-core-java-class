package com.cubic.jdbcdemo.st;

import com.cubic.jdbcdemo.util.DBConnectionUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDemo {
    public static final String SQL = """
       Select * from user_tbl
       """;
    public static void main(String[] args) {
        try(
                Statement st = DBConnectionUtil.getConnection().createStatement();
        ){
           ResultSet rs = st.executeQuery(SQL);
           while(rs.next()) {
               System.out.println("ID is :" +rs.getInt("id"));
               System.out.println("First Name is :" +rs.getString("first_name"));
               System.out.println("Last Name is :" +rs.getString("last_name"));
               System.out.println("Mobile Number is :" +rs.getLong("mobile_no"));
               System.out.println("==============================");
           }

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
