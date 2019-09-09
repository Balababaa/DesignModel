package com.xiaobai.templete.ex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class JDBCTemplete {
    protected String sql = "select * from sys_privilege";
    protected Connection conn = null;
    protected PreparedStatement pstmt = null;
    protected ResultSet rs = null;

    public final Object execute() throws SQLException {
        getConnection();
        getprepareStatement();
        getResultSet();
        Object obj = handle();
        if (isPrint()) {
            printData();
        }
        close();
        return obj;
    }

    public boolean isPrint() {
        return true;
    }

    public void setSql() {}

    public abstract Object handle () throws SQLException;

    public void getConnection() {
        conn = JDBCUtils.getConn();
    }

    public void getprepareStatement() throws SQLException {
        pstmt = conn.prepareStatement(sql);
    }

    public void getResultSet() throws SQLException {
        rs = pstmt.executeQuery();
    }

    public void printData() throws SQLException {
        int columnCount = rs.getMetaData().getColumnCount();

        rs.beforeFirst();
        while (rs.next()) {
            for (int i = 0; i < columnCount; i++) {
                System.out.print(rs.getString(i + 1) + " ");
            }
            System.out.println();
        }
    }

    public void close() throws SQLException {
        if (rs != null) {
            rs.close();
        }

        if (pstmt != null) {
            pstmt.close();
        }

        if (conn != null) {
            conn.close();
        }
    }
}
