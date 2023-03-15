package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class MySQLUsersDao implements Users{
    private final Connection connection;

    public MySQLUsersDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }

    @Override
    public boolean validateUsernamePassword(String username, String password) {
        try {
            String sql = "SELECT * FROM ad_lister_users WHERE username = ? and password = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving user.", e);
        }
    }

    @Override
    public User findByUsername(String username) {
        try {
            String sql = "SELECT * FROM ad_lister_users WHERE username = ?;";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();
            return getUserFromResultSet(rs);
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving user.", e);
        }
    }

    private static User getUserFromResultSet(ResultSet rs) throws SQLException {
        if (rs.next()) {
            User user = new User();
            user.setId(rs.getLong("user_id"));
            user.setUsername(rs.getString("username"));
            user.setEmail(rs.getString("email"));
            user.setPassword(rs.getString("password"));
            return user;
        } else {
            return null;
        }
    }

    @Override
    public Long insert(User user) {
        try {
            String sql = "INSERT INTO ad_lister_users(username, email, password) VALUES (?,?,?)";
            PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPassword());
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error creating new user.", e);
        }
    }
}
