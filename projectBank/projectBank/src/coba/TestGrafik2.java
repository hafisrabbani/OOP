package coba;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;


public class TestGrafik2 extends javax.swing.JFrame implements Runnable {
    private Gambar g ;
    private Dimension area ;
    private Thread runner ;
    private int x = 30 ,y = 30 ;        
   
    public TestGrafik2() {
        super("ANIMASI GRAFIK");
        initComponents();
        area = new Dimension(300,300);
        g = new Gambar();
        g.repaint();
        jScrollPane1.setViewportView(g);        
        g.setBackground(Color.white);
        g.setPreferredSize(area);
        g.setAutoscrolls(true);
        start();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     class Gambar extends JPanel{
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            int r = (int) (Math.random() * 256 );
            int g2 = (int) (Math.random() * 256);
            int b = (int) (Math.random() * 256);
            g.setColor(new Color(r,g2,b));  
            g.fillOval(x,y,50,50);                    
        }
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
               runner.sleep(250);
           }catch(Exception e){}
           if (x<=area.width) 
               x = x+10 ;
           else 
               x = 0 ;
           
           if (y<=area.height) {
               y = y + 10 ;
           }
           else
               y = 0 ;           
           g.repaint();
       }
    }
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestGrafik2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
