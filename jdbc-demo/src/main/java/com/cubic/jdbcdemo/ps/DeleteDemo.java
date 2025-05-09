package com.cubic.jdbcdemo.st;

import com.cubic.jdbcdemo.util.DBConnectionUtil;

import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDemo {
 public static final String SQL = """
  delete from user_tbl where id = 2
""";
    public static void main(String[] args) {
        try(
                Statement st = DBConnectionUtil.getConnection().createStatement();
                ){
            st.executeUpdate(SQL);
            System.out.println(" Data Deleted ");

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
