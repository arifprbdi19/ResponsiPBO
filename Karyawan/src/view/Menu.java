package view;

import DAO.DAOkaryawan;
import controller.Control;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import koneksi.Koneksi;
import model.Karyawaan;
import view.TampilKaryawan;



public class Menu extends JFrame implements ActionListener{

     JLabel ljudul = new JLabel("Main Menu");

   public JButton btambah = new JButton("Tambahkan Karyawan");
   public JButton blihat = new JButton("Data Karyawan");
    private Object ScrollPane;


    public Menu(){
        setSize(550,550);
        setLayout(null);
        add(ljudul);
        add(blihat);
        add(btambah);

        ljudul.setBounds(35,5,200,20);


        btambah.setBounds(10, 10, 120, 80); 
        blihat.setBounds(400, 10, 120, 80); 
        
        btambah.addActionListener(this);
        blihat.addActionListener(this);


        setVisible(true);
        setLocationRelativeTo(null);
    }

    public void actionPerformed (ActionEvent e){
        if(e.getSource() == btambah){
           TampilKaryawan lh = new TampilKaryawan();
           lh.dispose();
           dispose();
           InputKaryawan ik = new InputKaryawan();
           EditKaryawan ed = new EditKaryawan();
           ed.dispose();
           Karyawaan md = new Karyawaan();
           GajiTotal vg = new GajiTotal();
           vg.dispose();
           Control ct = new Control(lh, md,ik,ed,vg);
          
        }
        if(e.getSource() == blihat){
            TampilKaryawan lh = new TampilKaryawan();
           InputKaryawan ik = new InputKaryawan();
           ik.dispose();
           EditKaryawan ed = new EditKaryawan();
           ed.dispose();
           Karyawaan md = new Karyawaan();
           GajiTotal vg = new GajiTotal();
           vg.dispose();
           Control ct = new Control(lh, md,ik,ed,vg);
        }

    }

}

