/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sikar.dao;

import com.sikar.database.DatabaseMySQL;
import com.sikar.model.Hasil;
import java.sql.*;
/**
 *
 * @author afgha
 */
public class HasilDAOMySQL implements  HasilDAO{
    
    private Connection connection;

    public HasilDAOMySQL() {
        this.connection = DatabaseMySQL.connectDB();
    }
    
    @Override
    public void insertHasil(Hasil hasil) throws SQLException {
        String query = "INSERT INTO hasil (id_user, id_kecerdasan_minat, kecocokan) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, hasil.getId_user());
            stmt.setInt(2, hasil.getId_kecerdasan_minat());
            stmt.setInt(3, hasil.getKecocokan());
            stmt.executeUpdate();
        }
    }
}
