/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sikar.dao;

import java.sql.*;
import com.sikar.model.Hasil;
import com.sikar.model.HasilJoin;
import java.util.List;

/**
 *
 * @author afgha
 */
public interface HasilDAO {
    void insertHasil(Hasil hasil) throws SQLException;
    
    void deleteHasil(String userId) throws SQLException;;
    
    public List<HasilJoin> getHasilByUserId(String userId) throws SQLException;
    public List<HasilJoin> getHasilByNama(String nama) throws SQLException;
    
 }
