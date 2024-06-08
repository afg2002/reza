/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sikar.dao;


import com.sikar.model.User;
import java.sql.SQLException;
import java.util.List;
public interface UserDAO {
    void addUser(User user) throws SQLException;
    void updateUser(User user) throws SQLException;
    void deleteUser(String userId) throws SQLException;
    User getUserById(String userId) throws SQLException;
    List<User> getAllUsers() throws SQLException;
}
