package com.sikar.dao;

import com.sikar.model.CiriMinatBakat;
import java.sql.SQLException;
import java.util.List;

public interface CiriMinatBakatDAO {
    CiriMinatBakat getByKodeCiri(String kodeCiri);
    List<CiriMinatBakat> getAll();
    boolean insert(CiriMinatBakat ciriMinatBakat);
    boolean update(CiriMinatBakat ciriMinatBakat);
    boolean deleteByKodeCiri(String kodeCiri);
}