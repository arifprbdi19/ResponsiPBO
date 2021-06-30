
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;
import karyawan.Karyawan;
import koneksi.Koneksi;


public class TampilKaryawan extends JFrame{

    
    JFrame frame = new JFrame("JDBC");
    public JTable tabel;
     DefaultTableModel model;
    JScrollPane scrollPane;
    public Object namaKolom[] = {"ID", "Nama", "Usia", "Gaji"};
    public JButton btotal = new JButton("Total Gaji");
    public JButton bedit = new JButton("Edit Karyawan");
    public JButton bKembali = new JButton("KEMBALI");
    
    
    public TampilKaryawan(){
        
        model = new DefaultTableModel(namaKolom, 0);
        tabel = new JTable(model);
        scrollPane = new JScrollPane(tabel);
        
        setTitle("Data Karyawan");
        setSize(1920, 1080);
        setVisible(true);
        setLayout(null);
        add(scrollPane);
        
        scrollPane.setBounds(40, 35, 1000, 100);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        add(btotal);
        add(bedit);
        add(bKembali);
        btotal.setBounds(265, 500,120, 30);
        bedit.setBounds(140, 500,120, 30);
        bKembali.setBounds(15,500,120,30);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    

    
}
