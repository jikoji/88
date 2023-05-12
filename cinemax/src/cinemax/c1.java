package cinemax;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import org.json.simple.parser.ParseException;




public class c1 extends javax.swing.JFrame {
public static c1 Instance;    
public JLabel m1,c1;

    public c1() throws IOException, FileNotFoundException, ParseException {
        initComponents();
        Instance = this;
        m1=movien;
        c1=cinenum;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        date1 = new javax.swing.JLabel();
        am10 = new javax.swing.JButton();
        jt2 = new javax.swing.JButton();
        jt3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jd2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jt5 = new javax.swing.JButton();
        jt6 = new javax.swing.JButton();
        jt7 = new javax.swing.JButton();
        movien = new javax.swing.JLabel();
        cinenum = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        date1.setText("Sunday, 21 May 2023");

        am10.setText("10:00 am");
        am10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                am10ActionPerformed(evt);
            }
        });

        jt2.setText("01:00 PM");

        jt3.setText("04:00 PM");

        jLabel2.setText("IMAX");

        jd2.setText("Monday, 22 May 2023");

        jLabel4.setText("IMAX");

        jt5.setText("10:00 AM");

        jt6.setText("01:00 PM");

        jt7.setText("04:00 PM");

        movien.setText("jLabel1");

        cinenum.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jt5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jt6))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(am10)
                                .addGap(189, 189, 189)
                                .addComponent(jt2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jt3)
                            .addComponent(jt7))
                        .addGap(357, 357, 357))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(movien)
                            .addComponent(jLabel4)
                            .addComponent(jd2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cinenum)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(date1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(movien)
                    .addComponent(cinenum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(am10)
                    .addComponent(jt2)
                    .addComponent(jt3))
                .addGap(41, 41, 41)
                .addComponent(jd2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt5)
                    .addComponent(jt6)
                    .addComponent(jt7))
                .addContainerGap(412, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void am10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_am10ActionPerformed
    
     new info().setVisible(true);
     dispose();
     
     info.Instance.lb1.setText(am10.getText());
     info.Instance.lb2.setText(date1.getText());
     info.Instance.movie.setText(movien.getText());
     info.Instance.cine1.setText(cinenum.getText());
    }//GEN-LAST:event_am10ActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(c1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(c1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(c1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(c1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try { 
                    new c1().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(c1.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {
                    Logger.getLogger(c1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
 
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton am10;
    private javax.swing.JLabel cinenum;
    private javax.swing.JLabel date1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jd2;
    private javax.swing.JButton jt2;
    private javax.swing.JButton jt3;
    private javax.swing.JButton jt5;
    private javax.swing.JButton jt6;
    private javax.swing.JButton jt7;
    private javax.swing.JLabel movien;
    // End of variables declaration//GEN-END:variables
}
