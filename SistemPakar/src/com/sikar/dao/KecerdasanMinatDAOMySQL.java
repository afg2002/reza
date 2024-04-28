package com.sikar.dao;

import com.sikar.database.DatabaseMySQL;
import com.sikar.model.KecerdasanMinat;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class KecerdasanMinatDAOMySQL implements KecerdasanMinatDAO {
    private Connection connection;

    public KecerdasanMinatDAOMySQL(Connection connection) {
        this.connection = DatabaseMySQL.connectDB();
    }

    @Override
    public KecerdasanMinat getById(int id) {
        KecerdasanMinat kecerdasanMinat = null;
        String sql = "SELECT * FROM kecerdasan_minat WHERE id = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                kecerdasanMinat = new KecerdasanMinat(
                    rs.getInt("id"),
                    rs.getString("nama_kecerdasan"),
                    rs.getString("deskripsi")
                );
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return kecerdasanMinat;
    }

    @Override
    public List<KecerdasanMinat> getAll() {
        List<KecerdasanMinat> kecerdasanMinatList = new ArrayList<>();
        String sql = "SELECT * FROM kecerdasan_minat";
        try (Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery(sql)) {
            while (rs.next()) {
                KecerdasanMinat kecerdasanMinat = new KecerdasanMinat(
                    rs.getInt("id"),
                    rs.getString("nama_kecerdasan"),
                    rs.getString("deskripsi")
                );
                kecerdasanMinatList.add(kecerdasanMinat);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return kecerdasanMinatList;
    }

    @Override
    public boolean insert(KecerdasanMinat kecerdasanMinat) {
        String sql = "INSERT INTO kecerdasan_minat (nama_kecerdasan, deskripsi) VALUES (?, ?)";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, kecerdasanMinat.getNama_kecerdasan());
            ps.setString(2, kecerdasanMinat.getDeskripsi());
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(KecerdasanMinat kecerdasanMinat) {
        String sql = "UPDATE kecerdasan_minat SET nama_kecerdasan = ?, deskripsi = ? WHERE id = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, kecerdasanMinat.getNama_kecerdasan());
            ps.setString(2, kecerdasanMinat.getDeskripsi());
            ps.setInt(3, kecerdasanMinat.getId());
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteById(int id) {
        String sql = "DELETE FROM kecerdasan_minat WHERE id = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
