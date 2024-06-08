/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sikar.dao;

import com.sikar.database.DatabaseMySQL;
import com.sikar.model.User;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author afgha
 */
public class UserDAOMySQL implements UserDAO{
    @Override
    public void addUser(User user) throws SQLException {
        String sql = "INSERT INTO users (id_user, nama, nama_sekolah, jenis_kelamin, kelas, jurusan) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement ps = DatabaseMySQL.connectDB().prepareStatement(sql)) {
            ps.setString(1, user.getId_user());
            ps.setString(2, user.getNama());
            ps.setString(3, user.getNama_sekolah());
            ps.setString(4, user.getJenis_kelamin());
            ps.setString(5, user.getKelas());
            ps.setString(6, user.getJurusan());
            ps.executeUpdate();
        }
    }

    @Override
    public void updateUser(User user) throws SQLException {
        String sql = "UPDATE users SET nama = ?, nama_sekolah = ?, jenis_kelamin = ?, kelas = ?, jurusan=? WHERE id_user = ?";
        try (PreparedStatement ps = DatabaseMySQL.connectDB().prepareStatement(sql)) {
            ps.setString(1, user.getNama());
            ps.setString(2, user.getNama_sekolah());
            ps.setString(3, user.getJenis_kelamin());
            ps.setString(4, user.getKelas());
            ps.setString(5, user.getId_user());
            ps.setString(6, user.getJurusan());
            ps.executeUpdate();
        }
    }

    @Override
    public void deleteUser(String userId) throws SQLException {
        String sql = "DELETE FROM users WHERE id_user = ?";
        try (PreparedStatement ps = DatabaseMySQL.connectDB().prepareStatement(sql)) {
            ps.setString(1, userId);
            ps.executeUpdate();
        }
    }

    @Override
    public User getUserById(String userId) throws SQLException {
        String sql = "SELECT * FROM users WHERE id_user = ?";
        try (PreparedStatement ps = DatabaseMySQL.connectDB().prepareStatement(sql)) {
            ps.setString(1, userId);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new User(
                        rs.getString("id_user"),
                        rs.getString("nama"),
                        rs.getString("nama_sekolah"),
                        rs.getString("jenis_kelamin"),
                        rs.getString("kelas"),
                        rs.getString("jurusan")
                    );
                }
            }
        }
        return null;
    }

    @Override
    public List<User> getAllUsers() throws SQLException {
        List<User> users = new ArrayList<>();
        String sql = "SELECT * FROM users";
        try (Statement statement = DatabaseMySQL.connectDB().createStatement();
             ResultSet rs = statement.executeQuery(sql)) {
            while (rs.next()) {
                users.add(new User(
                    rs.getString("id_user"),
                    rs.getString("nama"),
                    rs.getString("nama_sekolah"),
                    rs.getString("jenis_kelamin"),
                    rs.getString("kelas"),
                    rs.getString("jurusan")
                ));
            }
        }
        return users;
    }
}
