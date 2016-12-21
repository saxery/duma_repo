package com.martintech.test;

import java.sql.*;

/**
 * Created by martin on 2016/3/27.
 */
public class TestSql {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection("url", "username", "password");
            stmt = conn.createStatement();
            String sqlTxt = "select * from driver";
            ResultSet rs = stmt.executeQuery(sqlTxt);
            String userName = "jaker";
            String password = "facy";
            System.out.println("userName = " + userName + ", password = " + password);
            int i = 0;
            int j = 1;
            int k = i + j;
            System.out.println(k);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException ignore) {}
        }
    }
}
