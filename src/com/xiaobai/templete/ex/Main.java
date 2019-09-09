package com.xiaobai.templete.ex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Templete templete = new Templete();
        try {
            ArrayList<User> users = (ArrayList<User>) templete.execute();
            users.forEach(System.out::println);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void findAndPrintAll() {
        String sql = "select * from sys_privilege";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = JDBCUtils.getConn();
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            int columnCount = rs.getMetaData().getColumnCount();

            while (rs.next()) {
                for (int i = 0; i < columnCount; i++) {
                    System.out.print(rs.getString(i + 1) + " ");
                }
                System.out.println();
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }

                if (pstmt != null) {
                    pstmt.close();
                }

                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
