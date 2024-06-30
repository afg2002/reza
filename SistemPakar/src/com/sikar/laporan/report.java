package com.sikar.laporan;


import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.sikar.database.DatabaseMySQL;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class report {

    private Connection conn = new DatabaseMySQL().connectDB();
//    private final String reportPath = ".\\src\\laporan\\pembayaran.jasper";
    private final String reportPath = ".\\src\\com\\sikar\\laporan\\";
    public void generateReport(String filename) {
        try {
           
            JasperReport report = (JasperReport) JRLoader.loadObjectFromFile(reportPath + filename +".jasper");
            JasperPrint jprint = JasperFillManager.fillReport(report, null, conn);
            JasperViewer jviewer = new JasperViewer(jprint, false);
            jviewer.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE);
            jviewer.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(report.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void generateReportWithParameter(String filename, String id_user) {
        try {
            // Membuat Map untuk menyimpan parameter
            Map<String, Object> parameters = new HashMap<>();
            parameters.put("id_user", id_user);

            JasperReport report = (JasperReport) JRLoader.loadObjectFromFile(reportPath + filename + ".jasper");
            JasperPrint jprint = JasperFillManager.fillReport(report, parameters, conn);
            JasperViewer jviewer = new JasperViewer(jprint, false);
            jviewer.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE);
            jviewer.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(report.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}