package com.sikar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JurusanDAOMySQL implements JurusanDAO {

    private Connection connection;

    public JurusanDAOMySQL(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<String> getAllJurusan() throws SQLException {
        List<String> jurusanList = new ArrayList<>();
        String sql = "SELECT nama_jurusan FROM jurusan";
        try (PreparedStatement ps = connection.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                jurusanList.add(rs.getString("nama_jurusan"));
            }
        }
        return jurusanList;
    }

    @Override
    public void insertJurusan(int idKecerdasan, String namaJurusan) throws SQLException {
        String sql = "INSERT INTO jurusan (id_kecerdasan, nama_jurusan) VALUES (?, ?)";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, idKecerdasan);
            ps.setString(2, namaJurusan);
            ps.executeUpdate();
        }
    }

    @Override
    public void updateJurusanById(int id, int idKecerdasan, String namaJurusanBaru) throws SQLException {
        String sql = "UPDATE jurusan SET id_kecerdasan = ?, nama_jurusan = ? WHERE id = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, idKecerdasan);
            ps.setString(2, namaJurusanBaru);
            ps.setInt(3, id);
            ps.executeUpdate();
        }
    }

    @Override
    public void deleteJurusanById(int id) throws SQLException {
        String sql = "DELETE FROM jurusan WHERE id = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }
}
