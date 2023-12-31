package coba;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

/*
 * Grafik3.java
 *
 * Created on March 12, 2008, 12:58 PM
 */



/**
 *
 * @author  Yuliana
 */
public class Grafik3 extends javax.swing.JFrame implements Runnable  {
    private Gambar g ;
    private String s ;
    private int rNumber; 
    private Dimension area;
    private Thread runner ;

    /** Creates new form Grafik3 */
    public Grafik3() {
        super("ANIMASI GRAFIK");
        initComponents();
        s = "Click disini untuk menghasilkan angka secara acak" ;
        area = new Dimension(400,400);
        g = new Gambar();
        g.repaint();
        jScrollPane1.setViewportView(g);
        jPanel1.setPreferredSize(area);
        g.setBackground(Color.white);
        g.setPreferredSize(area);
        g.setAutoscrolls(true);
        start();

    }
    
    private void start(){
        if (runner==null){
            runner = new Thread(this);
            runner.start();
        }

    }
    public void run(){
           while(true){
           try{
               runner.sleep(1000);
           }catch(Exception e){}
           rNumber = (int) (Math.random()*10);
           s = "Click disini untuk menghasilkan angka secara acak";
           g.repaint();
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    class Gambar extends JPanel{
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
   
            int r1 = (int) (Math.random()*256) ;
            int g1 = (int) (Math.random()*256) ;
            int b1 = (int) (Math.random()*256) ;

            g.setColor(new Color(r1,g1,b1));
            g.setFont(new Font("Helvetica", Font.BOLD, 15));
            g.drawString(s,5,20);
            g.setColor(new Color((int) (Math.random()*256), (int) (Math.random()*256), (int) (Math.random()*256)));
            g.setFont(new Font("Helvetica", Font.BOLD, 180));
            g.drawString(""+rNumber, 100, 210);

           
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grafik3().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
}
