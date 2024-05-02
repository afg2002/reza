/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sikar.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author admin01
 */


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Orang {
    private String id;
    private String nama;
    private String username;
    private String password;
    private String level;

    
}
