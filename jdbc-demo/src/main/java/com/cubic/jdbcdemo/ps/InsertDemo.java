package com.cubic.jdbcdemo.st;

import com.cubic.jdbcdemo.util.DBConnectionUtil;

import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {
        public static final String SQL = """ 
      insert into user_tbl(first_name,last_name,mobile_no) values('Ram','Khanal',9484849)
    """;
        public static void main(String[] args) {
            try(
                    Statement st = DBConnectionUtil.getConnection().createStatement();
            ) {
                st.executeUpdate(SQL);
                System.out.println(" data inserted.");
            } catch (SQLException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

        }
}
