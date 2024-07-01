/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sikar.dao;

import com.sikar.database.DatabaseMySQL;
import com.sikar.model.Hasil;
import com.sikar.model.HasilJoin;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
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

    @Override
    public void deleteHasil(String userId) throws SQLException {
         String query = "DELETE FROM hasil WHERE id_user = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, userId);
            stmt.executeUpdate();
        }
    }
    

    @Override
public List<HasilJoin> getHasilByUserId(String userId) throws SQLException {
    String query = "SELECT h.id_user, u.nama, u.nama_sekolah, u.jenis_kelamin, u.kelas, u.jurusan, " +
                   "h.id_kecerdasan_minat, km.nama_kecerdasan, km.deskripsi, h.kecocokan " +
                   "FROM hasil h " +
                   "INNER JOIN users u ON h.id_user = u.id_user " +
                   "INNER JOIN kecerdasan_minat km ON h.id_kecerdasan_minat = km.id " +
                   "WHERE h.id_user = ? AND h.kecocokan >= 3";
    List<HasilJoin> hasilList = new ArrayList<>();

    try (PreparedStatement stmt = connection.prepareStatement(query)) {
        stmt.setString(1, userId);
        try (ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                HasilJoin hasil = new HasilJoin(
                    rs.getString("id_user"),
                    rs.getString("nama"),
                    rs.getString("nama_sekolah"),
                    rs.getString("jenis_kelamin"),
                    rs.getString("kelas"),
                    rs.getString("jurusan"),
                    rs.getInt("id_kecerdasan_minat"),
                    rs.getString("nama_kecerdasan"),
                    rs.getString("deskripsi"),
                    rs.getInt("kecocokan")
                );
                hasilList.add(hasil);
            }
        }
    }
    return hasilList;
}

  @Override
public List<HasilJoin> getHasilAll() throws SQLException {
    String query = "SELECT h.id_user, u.nama, u.nama_sekolah, u.jenis_kelamin, u.kelas, u.jurusan, " +
                   "h.id_kecerdasan_minat, km.nama_kecerdasan, km.deskripsi, h.kecocokan " +
                   "FROM hasil h " +
                   "INNER JOIN users u ON h.id_user = u.id_user " +
                   "INNER JOIN kecerdasan_minat km ON h.id_kecerdasan_minat = km.id " +
                   "WHERE h.kecocokan >= 3";
    List<HasilJoin> hasilList = new ArrayList<>();

    try (PreparedStatement stmt = connection.prepareStatement(query)) {
        try (ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                HasilJoin hasil = new HasilJoin(
                    rs.getString("id_user"),
                    rs.getString("nama"),
                    rs.getString("nama_sekolah"),
                    rs.getString("jenis_kelamin"),
                    rs.getString("kelas"),
                    rs.getString("jurusan"),
                    rs.getInt("id_kecerdasan_minat"),
                    rs.getString("nama_kecerdasan"),
                    rs.getString("deskripsi"),
                    rs.getInt("kecocokan")
                );
                hasilList.add(hasil);
            }
        }
    }
    return hasilList;
}

public List<HasilJoin> getHasilByNama(String nama) throws SQLException {
  String query = "SELECT h.id_user, u.nama, u.nama_sekolah, u.jenis_kelamin, u.kelas, u.jurusan, " +
      "h.id_kecerdasan_minat, km.nama_kecerdasan, km.deskripsi, h.kecocokan " +
      "FROM hasil h " +
      "INNER JOIN users u ON h.id_user = u.id_user " +
      "INNER JOIN kecerdasan_minat km ON h.id_kecerdasan_minat = km.id " +
      "WHERE u.nama LIKE ?";

  List<HasilJoin> hasilList = new ArrayList<>();

  try (PreparedStatement stmt = connection.prepareStatement(query)) {
    stmt.setString(1, "%" + nama + "%"); // Add wildcards for partial name matching
    try (ResultSet rs = stmt.executeQuery()) {
      while (rs.next()) {
        HasilJoin hasil = new HasilJoin(
            rs.getString("id_user"),
            rs.getString("nama"),
            rs.getString("nama_sekolah"),
            rs.getString("jenis_kelamin"),
            rs.getString("kelas"),
            rs.getString("jurusan"),
            rs.getInt("id_kecerdasan_minat"),
            rs.getString("nama_kecerdasan"),
            rs.getString("deskripsi"),
            rs.getInt("kecocokan")
        );
        hasilList.add(hasil);
      }
    }
  }

  return hasilList;
}




}
