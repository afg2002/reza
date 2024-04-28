/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sikar.dao;

import com.sikar.database.DatabaseMySQL;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JawabanUserDAOMySQL implements JawabanUserDAO {
    private Connection connection;

    public JawabanUserDAOMySQL() {
        // Initialize connection here or pass it through constructor
        this.connection = DatabaseMySQL.connectDB();
    }

    @Override
    public void insertJawabanUser(int userId, String jawaban) throws SQLException {
        String sql = "INSERT INTO jawaban_user (user_id, jawaban) VALUES (?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, userId);
            statement.setString(2, jawaban);
            statement.executeUpdate();
        }
    }

    @Override
    public List<String> getAllJawabanUserByUserId(int userId) throws SQLException {
        List<String> jawabanList = new ArrayList<>();
        String sql = "SELECT jawaban FROM jawaban_user WHERE user_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, userId);
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    jawabanList.add(resultSet.getString("jawaban"));
                }
            }
        }
        return jawabanList;
    }

    @Override
    public void updateJawabanUser(int userId, String jawaban) throws SQLException {
        String sql = "UPDATE jawaban_user SET jawaban = ? WHERE user_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, jawaban);
            statement.setInt(2, userId);
            statement.executeUpdate();
        }
    }

    @Override
    public void deleteJawabanUser(int userId) throws SQLException {
        String sql = "DELETE FROM jawaban_user WHERE user_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, userId);
            statement.executeUpdate();
        }
    }
}
