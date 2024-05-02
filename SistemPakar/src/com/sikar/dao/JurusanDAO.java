package com.sikar.dao;

import java.sql.SQLException;
import java.util.List;

public interface JurusanDAO {
     List<String> getAllJurusan() throws SQLException;

    void insertJurusan(int idKecerdasan, String namaJurusan) throws SQLException;

    void updateJurusanById(int id, int idKecerdasan, String namaJurusanBaru) throws SQLException;

    void deleteJurusanById(int id) throws SQLException;
}
