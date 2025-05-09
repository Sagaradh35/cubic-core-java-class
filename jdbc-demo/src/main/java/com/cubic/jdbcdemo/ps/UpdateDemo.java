package com.cubic.jdbcdemo.st;

import com.cubic.jdbcdemo.util.DBConnectionUtil;

import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo {
    public static final String SQL = """
            update user_tbl set first_name='Bimal',last_name='Nepal',
            mobile_no=98558389 where id = 2
            """;
    public static void main(String[] args) {
        try(
                Statement st = DBConnectionUtil.getConnection().createStatement();
                ){
            st.executeUpdate(SQL);
            System.out.println("Data is updated");

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
