package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


    public class GajiTotal extends JFrame{
    JLabel ljudul = new JLabel("Update Karyawan");
    
    JLabel lnama = new JLabel("Nama");
    public final JLabel fnama = new JLabel();
    
    public final JLabel fcek = new JLabel();
    
    JLabel lusia = new JLabel("Usia");
    public final JLabel fusia= new JLabel();
    
    JLabel lgaji = new JLabel("Gaji");
    public final JLabel fgaji = new JLabel();
    
    JLabel llembur = new JLabel("lembur");
    public final JTextField flembur = new JTextField();
    
    JLabel ltotal = new JLabel("Total Gaji : ");
    public final JLabel ftotal = new JLabel();
      
    public JButton btotal = new JButton("TOTALGAJI");
    public JButton bkembali = new JButton("Kembali");
   
    
     public GajiTotal(){
        setTitle("TotalGaji");
        setSize(550,550);
        setLayout(null);
        add(ljudul);
        add(lnama);
        add(fnama);
        add(lusia);
        add(fusia);
        add(lgaji);
        add(fgaji);  
        add(btotal);
        add(llembur);
        add(flembur);
        add(ltotal);
        add(ftotal);
        add(bkembali);
        
        ljudul.setBounds(15,5,200,20);
        lnama.setBounds(15,30,120,20);
        fnama.setBounds(55,30,200,20);
        
        lusia.setBounds(15,60,120,20);
        fusia.setBounds(55,60,200,20);
        
        lgaji.setBounds(15,90,120,20);
        fgaji.setBounds(55,90,200,20);
        
        llembur.setBounds(15,130,120,20);
        flembur.setBounds(55,130,200,20);
        
        ltotal.setBounds(100,160,120,20);
        ftotal.setBounds(170,160,200,20);
        
        btotal.setBounds(140,195,120,20);
        bkembali.setBounds(15,195,120,20);
        
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        setLocationRelativeTo(null);
    }
    public String getNama(){
        return fnama.getText();
    }
    public String getCek(){
        return fcek.getText();
    }
    
    public String getUsia(){
        return fusia.getText();
    }
    
    public String getGaji(){
        return fgaji.getText();
    }
}

