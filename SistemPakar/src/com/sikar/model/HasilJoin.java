/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sikar.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class HasilJoin {
    private String id_user;
    private String nama;
    private String nama_sekolah;
    private String jenis_kelamin;
    private String kelas;
    private String jurusan;
    private Integer id_kecerdasan_minat;
    private String nama_kecerdasan;
    private String deskripsi;
    private Integer kecocokan;

    
}
