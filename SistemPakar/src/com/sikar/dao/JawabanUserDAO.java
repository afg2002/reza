package com.sikar.dao;

import java.sql.SQLException;
import java.util.List;

public interface JawabanUserDAO {
    void insertJawabanUser(int userId, String jawaban) throws SQLException;

    List<String> getAllJawabanUserByUserId(int userId) throws SQLException;

    void updateJawabanUser(int userId, String jawaban) throws SQLException;

    void deleteJawabanUser(int userId) throws SQLException;
}
