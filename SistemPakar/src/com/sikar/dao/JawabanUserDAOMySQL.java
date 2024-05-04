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
   public void insertJawabanUser(String userId, int kodeCiri, String jawaban) throws SQLException {
    String sql = "INSERT INTO jawaban_user (user_id, kode_ciri, jawaban) VALUES (?, ?, ?) "
               + "ON DUPLICATE KEY UPDATE jawaban = VALUES(jawaban)";
    
    try (PreparedStatement statement = connection.prepareStatement(sql)) {
        deleteJawabanUserForReplace(userId, kodeCiri);
        statement.setString(1, userId);
        statement.setInt(2, kodeCiri);
        statement.setString(3, jawaban);
        statement.executeUpdate();
    }
}

    @Override
    public List<String> getAllJawabanUserByUserId(String userId) throws SQLException {
        List<String> jawabanList = new ArrayList<>();
        String sql = "SELECT jawaban FROM jawaban_user WHERE user_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, userId);
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    jawabanList.add(resultSet.getString("jawaban"));
                }
            }
        }
        return jawabanList;
    }

    @Override
    public void updateJawabanUser(String userId,int kode_ciri, String jawaban) throws SQLException {
        String sql = "UPDATE jawaban_user SET kode_ciri = ? , jawaban = ? WHERE user_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, kode_ciri);
            statement.setString(2,jawaban);
            statement.setString(3, userId);
            statement.executeUpdate();
        }
    }

    @Override
    public void deleteJawabanUser(String userId) throws SQLException {
        String sql = "DELETE FROM jawaban_user WHERE user_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, userId);
            statement.executeUpdate();
        }
    }
    
    public void deleteJawabanUserForReplace(String userId, int kode_ciri) throws SQLException {
        String sql = "DELETE FROM jawaban_user WHERE user_id = ? AND kode_ciri = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, userId);
            statement.setInt(2, kode_ciri);
            statement.executeUpdate();
        }
    }
}
