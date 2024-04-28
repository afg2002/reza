/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sikar.dao;

import com.sikar.model.KecerdasanMinat;
import java.util.List;

/**
 *
 * @author Afghan
 */
public interface KecerdasanMinatDAO {
    KecerdasanMinat getById(int id);
    List<KecerdasanMinat> getAll();
    boolean insert(KecerdasanMinat kecerdasanMinat);
    boolean update(KecerdasanMinat kecerdasanMinat);
    boolean deleteById(int id);
}