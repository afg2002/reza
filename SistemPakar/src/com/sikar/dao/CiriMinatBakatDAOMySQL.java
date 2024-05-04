package com.sikar.dao;

import com.sikar.dao.CiriMinatBakatDAO;
import com.sikar.database.DatabaseMySQL;
import com.sikar.model.CiriMinatBakat;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CiriMinatBakatDAOMySQL implements CiriMinatBakatDAO {
    private Connection connection;

    public CiriMinatBakatDAOMySQL() {
        this.connection = DatabaseMySQL.connectDB();
    }

    @Override
    public CiriMinatBakat getByKodeCiri(String kodeCiri) {
        CiriMinatBakat ciriMinatBakat = null;
        String sql = "SELECT * FROM ciri_minat_bakat WHERE kode_ciri = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, kodeCiri);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ciriMinatBakat = new CiriMinatBakat(
                    rs.getString("kode_ciri"),
                    rs.getString("pertanyaan")
                );
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ciriMinatBakat;
    }

    @Override
    public List<CiriMinatBakat> getAll() {
        List<CiriMinatBakat> ciriMinatBakatList = new ArrayList<>();
        String sql = "SELECT * FROM ciri_minat_bakat";
        try (Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery(sql)) {
            while (rs.next()) {
                CiriMinatBakat ciriMinatBakat = new CiriMinatBakat(
                    rs.getString("kode_ciri"),
                    rs.getString("pertanyaan")
                );
                ciriMinatBakatList.add(ciriMinatBakat);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ciriMinatBakatList;
    }

    @Override
    public boolean insert(CiriMinatBakat ciriMinatBakat) {
        String sql = "INSERT INTO ciri_minat_bakat (pertanyaan) VALUES (?)";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1,ciriMinatBakat.getPertanyaan());
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(CiriMinatBakat ciriMinatBakat) {
        String sql = "UPDATE ciri_minat_bakat SET pertanyaan = ? WHERE kode_ciri = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, ciriMinatBakat.getPertanyaan());
            ps.setString(2, ciriMinatBakat.getKodeCiri());
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteByKodeCiri(String kodeCiri) {
        String sql = "DELETE FROM ciri_minat_bakat WHERE kode_ciri = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, kodeCiri);
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
