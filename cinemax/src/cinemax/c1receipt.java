
package cinemax;

import static cinemax.info.jparse;
import static cinemax.info.store;
import static cinemax.info.studentlist;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JLabel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;



public class c1receipt extends javax.swing.JFrame {

     public static c1receipt s;
     public JLabel d1;
    
    public c1receipt() {
        initComponents();
        s = this;
        d1 = date;
        
        
    }
    
    public void display(String x){
       
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        moviename = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        ticketno = new javax.swing.JLabel();
        mdate = new javax.swing.JLabel();
        mtime = new javax.swing.JLabel();
        cineno = new javax.swing.JLabel();
        seatno = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("OFFICIAL RECEIPT");

        date.setText("jLabel2");

        time.setText("jLabel2");

        moviename.setText("jLabel2");

        name.setText("jLabel2");

        ticketno.setText("jLabel2");

        mdate.setText("jLabel2");

        mtime.setText("jLabel2");

        cineno.setText("jLabel2");

        seatno.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(moviename, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ticketno, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mdate, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mtime, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cineno, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seatno, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(188, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(date)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(time)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(moviename)
                .addGap(18, 18, 18)
                .addComponent(name)
                .addGap(18, 18, 18)
                .addComponent(ticketno)
                .addGap(18, 18, 18)
                .addComponent(mdate)
                .addGap(18, 18, 18)
                .addComponent(mtime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cineno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(seatno)
                .addContainerGap(414, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException, FileNotFoundException, ParseException {
     filereader();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new c1receipt().setVisible(true);
            }
        });
    }
    
        public static void filereader() throws FileNotFoundException, IOException, ParseException{
        FileReader reader = new FileReader("src\\cinemax\\c110.json");
           if(reader.ready())
           {
               Scanner nielr = new Scanner(reader);
               String line = "";
               while(nielr.hasNext())
               {
                   line = line+nielr.nextLine();
               }
               if(!line.equals(""));
               {
                   reader.close();        
                   FileReader reader2 = new FileReader("src\\cinemax\\c110.json");   
                   store = (JSONObject)jparse.parse(reader2);
                   studentlist = (JSONArray)store.get("store");
               }
           }
           reader.close();  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cineno;
    private javax.swing.JLabel date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel mdate;
    private javax.swing.JLabel moviename;
    private javax.swing.JLabel mtime;
    private javax.swing.JLabel name;
    private javax.swing.JLabel seatno;
    private javax.swing.JLabel ticketno;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
