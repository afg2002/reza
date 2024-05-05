package com.sikar.dao;

import java.sql.SQLException;
import java.util.List;

public interface JawabanUserDAO {
    void insertJawabanUser(String userId,int kodeCiri, String jawaban) throws SQLException;

    List<String> getAllJawabanUserByUserId(String userId) throws SQLException;
    
    List<String> getAllJawabanUserByUserIdAndStatus(String userId, String status);

    void updateJawabanUser(String userId,int kodeCiri, String jawaban) throws SQLException;

    void deleteJawabanUser(String userId) throws SQLException;
}
