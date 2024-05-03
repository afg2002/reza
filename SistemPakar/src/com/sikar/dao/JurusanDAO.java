package com.sikar.dao;

import com.sikar.model.Jurusan;
import java.sql.SQLException;
import java.util.List;

public interface JurusanDAO {
     List<Jurusan> getAllJurusan() throws SQLException;

    void insertJurusan(Jurusan j) throws SQLException;

    void updateJurusanById(int id, int idKecerdasan, String namaJurusanBaru) throws SQLException;

    void deleteJurusanById(int id) throws SQLException;
}
