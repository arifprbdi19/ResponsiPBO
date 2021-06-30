
package controller;

import DAO.DAOkaryawan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import karyawan.Karyawan;
import model.Karyawaan;
import view.EditKaryawan;
import view.InputKaryawan;
import view.Menu;
import view.TampilKaryawan;
import view.GajiTotal;


public class Control {
    

  
    Karyawaan modell;
    TampilKaryawan tampilVieww;
    InputKaryawan inputt;
    EditKaryawan editt;
    GajiTotal totall;
    
    public Control(TampilKaryawan tampilview, Karyawaan model,InputKaryawan input, EditKaryawan edit, GajiTotal total){
        this.modell = model;
        this.tampilVieww = tampilview;
        this.inputt = input;
        this.editt = edit;
        this.totall=total;
        
        if(modell.getBanyakData()!=0){
            String dataKaryawan[][] = modell.readContact();
            tampilVieww.tabel.setModel((new JTable(dataKaryawan, tampilVieww.namaKolom)).getModel());
        }else {
            JOptionPane.showMessageDialog(null, "Data tidak di temukan");
        }
        inputt.bSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String nama = inputt.getNama();
                String usia = inputt.getUsia();
                String gaji =inputt.getGaji();
                model.insert(nama, usia, gaji);
         
                String dataKaryawan[][] = model.readContact();
                tampilVieww.tabel.setModel((new JTable(dataKaryawan, tampilVieww.namaKolom)).getModel());
            }
        });
         inputt.bKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.dispose();
                Menu m = new Menu();
                   
            }
        });
         
        inputt.bReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputt.tNama.setText(null);
                inputt.tUsia.setText(null);  
                inputt.tGaji.setText(null);
            }
        });
        editt.bkembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                edit.dispose();
            }
        });
        tampilVieww.bKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tampilVieww.dispose();

            }
        });
        edit.bupdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String nama = edit.getNama();
                String cek = edit.getCek();
                String usia = edit.getUsia();
                String gaji =edit.getGaji();
                model.update(nama,cek, usia, gaji);
                edit.dispose();
            }
        });
        edit.bhapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String cek = edit.getCek();
                model.delete(cek);
                edit.dispose();
            }
            
        });
        tampilVieww.bedit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int baris = tampilVieww.tabel.getSelectedRow();
                
                String id = tampilVieww.tabel.getValueAt(baris, 0).toString();
                String nama = tampilVieww.tabel.getValueAt(baris, 1).toString();
                String usia = tampilVieww.tabel.getValueAt(baris, 2).toString();
                String gaji = tampilVieww.tabel.getValueAt(baris, 3).toString();
                
                tampilVieww.dispose();
                EditKaryawan ed = new EditKaryawan();
                ed.fnama.setText(nama);
                ed.fcek.setText(id);
                ed.fusia.setText(usia);
                ed.fgaji.setText(gaji);
                TampilKaryawan lh = new TampilKaryawan();
                lh.dispose();
                InputKaryawan ik = new InputKaryawan();
                ik.dispose();
                GajiTotal vg = new GajiTotal();
                vg.dispose();
                Karyawaan md = new Karyawaan();
                Control ct = new Control(lh,md,ik,ed,vg);
                System.out.println("");
            }
        });
        tampilVieww.btotal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              int baris = tampilVieww.tabel.getSelectedRow();
                
                String id = tampilVieww.tabel.getValueAt(baris, 0).toString();
                String nama = tampilVieww.tabel.getValueAt(baris, 1).toString();
                String usia = tampilVieww.tabel.getValueAt(baris, 2).toString();
                String gaji = tampilVieww.tabel.getValueAt(baris, 3).toString();
                
                tampilVieww.dispose();
                GajiTotal vg = new GajiTotal();
                vg.fnama.setText(nama);
                vg.fusia.setText(usia);
                vg.fgaji.setText(gaji);

                
                TampilKaryawan lh = new TampilKaryawan();
                lh.dispose();
                InputKaryawan ik = new InputKaryawan();
                ik.dispose();
                EditKaryawan ed = new EditKaryawan();
                ed.dispose();
                Karyawaan md = new Karyawaan();
                Control ct = new Control(lh,md,ik,ed,vg);
            }
            
        });
         totall.btotal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                double gaji = Double.parseDouble(totall.fgaji.getText());
                int lembur = Integer.parseInt(totall.flembur.getText());
                totall.ftotal.setText(String.valueOf(lembur*25000+gaji));

            }
            
        });
        
              tampilVieww.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                
                        
            }
        }
        );
    }
   
   
}
    

