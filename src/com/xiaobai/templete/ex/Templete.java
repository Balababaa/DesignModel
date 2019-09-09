package com.xiaobai.templete.ex;

import java.sql.SQLException;
import java.util.ArrayList;

public class Templete extends JDBCTemplete {
    @Override
    public boolean isPrint() {
        return false;
    }

    @Override
    public Object handle() throws SQLException {
        ArrayList<User> users = new ArrayList<>();

        while (rs.next()) {
            User user = new User();
            user.setId(Integer.valueOf(rs.getString(1)));
            user.setName(rs.getString(2));
            user.setUrl(rs.getString(3));
            users.add(user);
        }

        return users;
    }
}
