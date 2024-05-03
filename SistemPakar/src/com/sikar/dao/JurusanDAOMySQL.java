package com.sikar.dao;

import com.sikar.database.DatabaseMySQL;
import com.sikar.model.Jurusan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JurusanDAOMySQL implements JurusanDAO {

    private Connection connection;

    public JurusanDAOMySQL() {
        this.connection = DatabaseMySQL.connectDB();
    }

    @Override
    public List<Jurusan> getAllJurusan() throws SQLException {
    List<Jurusan> jurusanList = new ArrayList<>();
    String sql = "SELECT jurusan.id, jurusan.id_kecerdasan, kecerdasan_minat.nama_kecerdasan, jurusan.nama_jurusan FROM jurusan INNER JOIN kecerdasan_minat ON jurusan.id_kecerdasan = kecerdasan_minat.id";
    try (PreparedStatement ps = connection.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {
        while (rs.next()) {
            int id = rs.getInt("id");
            int idKecerdasan = rs.getInt("id_kecerdasan");
            String nama_kecerdasan = rs.getString("nama_kecerdasan");
            String namaJurusan = rs.getString("nama_jurusan");
           
            Jurusan jurusan = new Jurusan(id, idKecerdasan,nama_kecerdasan, namaJurusan);
            jurusanList.add(jurusan);
        }
    }
    return jurusanList;
}


    @Override
    public void insertJurusan(Jurusan j) throws SQLException {
        String sql = "INSERT INTO jurusan (id_kecerdasan, nama_jurusan) VALUES (?, ?)";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, j.getIdKecerdasan());
            ps.setString(2, j.getNamaJurusan());
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
