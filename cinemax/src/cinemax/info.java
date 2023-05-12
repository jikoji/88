
package cinemax;


import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import org.json.simple.JSONArray;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class info extends javax.swing.JFrame {

    static JSONObject student = new JSONObject();
    static JSONArray studentlist = new JSONArray();
    static JSONObject store = new JSONObject();
    static JSONParser jparse = new JSONParser();
    static JSONArray seatPosition = new JSONArray();
    static JSONObject seatpos = new JSONObject();
    static JSONArray jsonArray = new JSONArray();
    static boolean button1Clicked, button2Clicked, button3Clicked, button4Clicked, button5Clicked, button6Clicked, button7Clicked, button8Clicked, button9Clicked, button10Clicked;
    static final String FILENAME = "src\\cinemax\\c110button.json";  
    static int generateId = 001 + (int) (Math.random()*999);
    
    static int price = 300;
    static int totalprice = 0;
    public static info Instance;
    public JLabel lb1, lb2, movie,cine1;
   
    
    public info() {
        initComponents();
        loadButtonStatuses(); 
        init();
        Instance = this; 
        lb1 = time;
        lb2 = date;
        movie = mname;
        cine1 = cinenum;
        
    }
    
    public void init(){
        setTime();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cineprice = new javax.swing.JLabel();
        a2 = new javax.swing.JButton();
        a4 = new javax.swing.JButton();
        a1 = new javax.swing.JButton();
        a3 = new javax.swing.JButton();
        a5 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jTxtDate = new javax.swing.JLabel();
        jTxTime = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        mname = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cinenum = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jtname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtemail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtphonenumber = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtcardname = new javax.swing.JTextField();
        jLabel100 = new javax.swing.JLabel();
        jtcardnumber = new javax.swing.JTextField();
        jLabel101 = new javax.swing.JLabel();
        jtcvc = new javax.swing.JTextField();
        jLabel102 = new javax.swing.JLabel();
        jtexpiry = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jtgcashnumber = new javax.swing.JTextField();
        jtgcashcode = new javax.swing.JTextField();
        save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Select Seats & Tickets"));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel1.setText("Tickets");

        jLabel2.setText("Cost");

        jLabel4.setText("IMAX");

        cineprice.setText(Integer.toString(price));

        a2.setText("A2");
        a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a2ActionPerformed(evt);
            }
        });

        a4.setText("A4");
        a4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a4ActionPerformed(evt);
            }
        });

        a1.setText("A1");
        a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ActionPerformed(evt);
            }
        });

        a3.setText("A3");
        a3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a3ActionPerformed(evt);
            }
        });

        a5.setText("A5");
        a5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a5ActionPerformed(evt);
            }
        });

        b1.setText("B1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setText("B2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setText("B3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setText("B4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setText("B5");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        jLabel3.setText("Time");

        time.setText("jlabel");

        jLabel5.setText("Date");

        date.setText("jLabel");

        jTxtDate.setText("jLabel14");

        jTxTime.setText("jLabel14");

        jLabel14.setText("Movie Name");

        mname.setText("jlabel");

        jLabel15.setText("Cinema No.");

        cinenum.setText("jLabel16");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(time))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(date))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mname)
                    .addComponent(jLabel14))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(cinenum))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(cineprice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 316, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTxTime, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(a5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(58, 58, 58))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cineprice)
                            .addComponent(time)
                            .addComponent(date)
                            .addComponent(mname)
                            .addComponent(cinenum)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxTime, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Personal Details & Payment Method"));

        jLabel6.setText("Name*");

        jLabel7.setText("Email*");

        jLabel8.setText("Phone Number (optional)");

        jLabel9.setText("Cardholder Name");

        jLabel10.setText("Credit Card");

        jtcardname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtcardnameActionPerformed(evt);
            }
        });

        jLabel100.setText("Credit Card No.");

        jLabel101.setText("CVC/CVV");

        jLabel102.setText("Expiry Date");

        jLabel11.setText("Gcash");

        jLabel12.setText("Account no.");

        jLabel13.setText("Verification code");

        save.setText("Proceed");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jtname, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(jtemail)
                            .addComponent(jtphonenumber))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(save)
                        .addGap(110, 110, 110)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtgcashcode, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtgcashnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel102)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtexpiry, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel101)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtcvc, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel100)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtcardnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(59, 59, 59)
                            .addComponent(jtcardname, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(71, 71, 71))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jtcardname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel100)
                    .addComponent(jtcardnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel101)
                    .addComponent(jtcvc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtphonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel102)
                            .addComponent(jtexpiry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(jLabel11)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jtgcashnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jtgcashcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(save)
                        .addGap(62, 62, 62))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
     String seatno = seatPosition.toString();
        System.out.println(seatno);


        new c1receipt().setVisible(true);
     dispose();
    
        c1receipt.s.d1.setText(seatno);
         
         
                    if (button1Clicked) {
                    JSONObject button1Object = new JSONObject();
                    button1Object.put("seat no.",a1.getText());
                    button1Object.put("status", "reserved");
                    seatpos.put("Seat no.","a1");
                    jsonArray.add(button1Object);
                }
                    if (button2Clicked) {
                    JSONObject button2Object = new JSONObject();
                    button2Object.put("seat no.", a2.getText());
                    button2Object.put("status", "reserved");
                    seatpos.put("Seat no.","a2");
                    jsonArray.add(button2Object);
                }
                    if (button3Clicked) {
                    JSONObject button3Object = new JSONObject();
                    button3Object.put("seat no.", a3.getText());
                    button3Object.put("status", "reserved");
                    seatpos.put("Seat no.","a3");
                    jsonArray.add(button3Object);
                }
                    if (button4Clicked) {
                    JSONObject button4Object = new JSONObject();
                    button4Object.put("seat no.", a4.getText());
                    button4Object.put("status", "reserved");
                    seatpos.put("Seat no.","a4");
                    jsonArray.add(button4Object);
                }    
                    if (button5Clicked) {
                    JSONObject button5Object = new JSONObject();
                    button5Object.put("seat no.", a5.getText());
                    button5Object.put("status", "reserved");
                    seatpos.put("Seat no.","a5");
                    jsonArray.add(button5Object);
                }    
                    if (button6Clicked) {
                    JSONObject button6Object = new JSONObject();
                    button6Object.put("seat no.", b1.getText());
                    button6Object.put("status", "reserved");
                    seatpos.put("Seat no.","b1");
                    jsonArray.add(button6Object);
                }    
                    if (button7Clicked) {
                    JSONObject button7Object = new JSONObject();
                    button7Object.put("seat no.", b2.getText());
                    button7Object.put("status", "reserved");
                    seatpos.put("Seat no.","b2");
                    jsonArray.add(button7Object);
                }    
                    if (button8Clicked) {
                    JSONObject button8Object = new JSONObject();
                    button8Object.put("seat no.", b3.getText());
                    button8Object.put("status", "reserved");
                    seatpos.put("Seat no.","b3");
                    jsonArray.add(button8Object);
                }    
                    if (button9Clicked) {
                    JSONObject button9Object = new JSONObject();
                    button9Object.put("seat no.", b4.getText());
                    button9Object.put("status", "reserved");
                    seatpos.put("Seat no.","b4");
                    jsonArray.add(button9Object);
                }    
                    if (button10Clicked) {
                    JSONObject button10Object = new JSONObject();
                    button10Object.put("seat no.", b5.getText());
                    button10Object.put("status", "reserved");
                    seatpos.put("Seat no.","b5");
                    jsonArray.add(button10Object);
                }    

                // Write the JSON array to a file
                try (FileWriter fileWriter = new FileWriter(new File(FILENAME))) {
                    fileWriter.write(jsonArray.toJSONString());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
               
        try {
            filereader();
       
    student.put("Total Cost", totalprice);        
    student.put("Movie Name","John Wick");
    student.put("Ticket No.",generateId);
    student.put("Seat No.",seatPosition);
    student.put("Time",time.getText());
    student.put("Date", date.getText());
    student.put("Name", jtname.getText());
    student.put("Email",jtemail.getText());
    student.put("Phone Number",jtphonenumber.getText());
    student.put("Card Name",jtcardname.getText());
    student.put("Card Number",jtcardnumber.getText());
    student.put("CVC/CVV",jtcvc.getText());
    student.put("Expiry Date",jtexpiry.getText());
    student.put("Gcash Number",jtgcashnumber.getText());
    student.put("Gcash Verification",jtgcashcode.getText());
    studentlist.add(student);
    store.put("store",studentlist);
   
    

    
       
    
    filewriter();
  } catch (IOException ex) {
            Logger.getLogger(info.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(info.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     
        
    }//GEN-LAST:event_saveActionPerformed

    private void jtcardnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtcardnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtcardnameActionPerformed

    private void a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ActionPerformed
            button1Clicked = !button1Clicked;
            JButton button = a1;
                if (button1Clicked) { seatPosition.add(a1.getText());
                    a1.setBackground(Color.GREEN);
                    totalprice += price;
                    String buttonText = button.getText();
                } else {seatPosition.remove(a1.getText());
                 totalprice -= price;
                    a1.setBackground(null);
                }
    }//GEN-LAST:event_a1ActionPerformed
 
    private void a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a2ActionPerformed
         button2Clicked = !button2Clicked;
         JButton button = a2;
                if (button2Clicked) {seatPosition.add(a2.getText());
                    a2.setBackground(Color.GREEN);
                    totalprice += price;
                    String buttonText = button.getText();
                } else {seatPosition.remove(a2.getText());
                    totalprice -= price;
                    a2.setBackground(null);
                }
    }//GEN-LAST:event_a2ActionPerformed

    private void a3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a3ActionPerformed
       button3Clicked = !button3Clicked;
       JButton button = a3;
                if (button3Clicked) {seatPosition.add(a3.getText());
                    a3.setBackground(Color.GREEN);
                    totalprice += price;
                    String buttonText = button.getText();
                } else {seatPosition.remove(a3.getText());
                    totalprice -= price;
                    a3.setBackground(null);
                }
    }//GEN-LAST:event_a3ActionPerformed

    private void a4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a4ActionPerformed
        button4Clicked = !button4Clicked;
                if (button4Clicked) {seatPosition.add(a4.getText());
                    a4.setBackground(Color.GREEN);
                    totalprice += price;
                } else {seatPosition.remove(a4.getText());
                    totalprice -= price;
                    a4.setBackground(null);
                }      
    }//GEN-LAST:event_a4ActionPerformed

    private void a5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a5ActionPerformed
         button5Clicked = !button5Clicked;
                if (button5Clicked) {seatPosition.add(a5.getText());
                    a5.setBackground(Color.GREEN);
                    totalprice += price;
                } else {seatPosition.remove(a5.getText());
                    a5.setBackground(null);
                    totalprice -= price;
                }
    }//GEN-LAST:event_a5ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
       button6Clicked = !button6Clicked;
                if (button6Clicked) {seatPosition.add(b1.getText());
                    b1.setBackground(Color.GREEN);
                    totalprice += price;
                } else {seatPosition.remove(b1.getText());
                    totalprice -= price;
                    b1.setBackground(null);
                }     
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
         button7Clicked = !button7Clicked;
                if (button7Clicked) {seatPosition.add(b2.getText());
                    b2.setBackground(Color.GREEN);
                    totalprice += price;
                } else {seatPosition.remove(b2.getText());
                    totalprice -= price;
                    b2.setBackground(null);
                }       
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
         button8Clicked = !button8Clicked;
                if (button8Clicked) {seatPosition.add(b3.getText());
                    totalprice += price;
                    b3.setBackground(Color.GREEN);
                } else {seatPosition.remove(b3.getText());
                    totalprice -= price;
                    b3.setBackground(null);
                }                    
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
       button9Clicked = !button9Clicked;
                if (button9Clicked) {seatPosition.add(b4.getText());
                    totalprice += price;
                    b4.setBackground(Color.GREEN);
                } else {seatPosition.remove(b4.getText());
                    totalprice -= price;
                    b4.setBackground(null);
                }        
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        button10Clicked = !button10Clicked;
                if (button10Clicked) {seatPosition.add(b5.getText());
                    b5.setBackground(Color.GREEN);
                    totalprice += price;
                } else {seatPosition.remove(b5.getText());
                    totalprice -= price;
                    b5.setBackground(null);
                }                    
    }//GEN-LAST:event_b5ActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
      
    }//GEN-LAST:event_jPanel1MouseClicked
     
   
    

     
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new info().setVisible(true);
            }
        });
    }
    
     private void loadButtonStatuses() {// Read the JSON file and update the button statuses
        JSONParser parser = new JSONParser();
        try (FileReader fileReader = new FileReader(new File(FILENAME))) {
            Object obj = parser.parse(fileReader);
            JSONArray jsonArray = (JSONArray) obj;
            for (Object json : jsonArray) {
                JSONObject jsonObject = (JSONObject) json;
                String name = (String) jsonObject.get("seat no.");
                String status = (String) jsonObject.get("status");
                if (name.equals(a1.getText()) && status.equals("reserved")) {
                    button1Clicked = true;
                    a1.setBackground(Color.RED);
                    a1.setEnabled(false);
                } else if (name.equals(a2.getText()) && status.equals("reserved")) {
                    button2Clicked = true;
                    a2.setBackground(Color.RED);
                    a2.setEnabled(false);
                } else if (name.equals(a3.getText()) && status.equals("reserved")) {
                    button3Clicked = true;
                    a3.setBackground(Color.RED);
                    a3.setEnabled(false);
                } else if (name.equals(a4.getText()) && status.equals("reserved")) {
                    button4Clicked = true;
                    a4.setBackground(Color.RED);
                    a4.setEnabled(false);
                } else if (name.equals(a5.getText()) && status.equals("reserved")) {
                    button5Clicked = true;
                    a5.setBackground(Color.RED);
                    a5.setEnabled(false);
                } else if (name.equals(b1.getText()) && status.equals("reserved")) {
                    button6Clicked = true;
                    b1.setBackground(Color.RED);
                    b1.setEnabled(false);
                } else if (name.equals(b2.getText()) && status.equals("reserved")) {
                    button7Clicked = true;
                    b2.setBackground(Color.RED);
                    b2.setEnabled(false);
                } else if (name.equals(b3.getText()) && status.equals("reserved")) {
                    button8Clicked = true;
                    b3.setBackground(Color.RED);
                    b3.setEnabled(false);
                } else if (name.equals(b4.getText()) && status.equals("reserved")) {
                    button9Clicked = true;
                    b4.setBackground(Color.RED);
                    b4.setEnabled(false);
                } else if (name.equals(b5.getText()) && status.equals("reserved")) {
                    button10Clicked = true;
                    b5.setBackground(Color.RED);
                    b5.setEnabled(false);
                }
            }
        } catch (IOException | ParseException ex) {
            // Ignore errors when reading the file
        }
    }
     
     
     public void setTime(){
        new Thread (new Runnable () {
            @Override
            public void run() {
                while(true){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(info.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Date date = new Date ();
                    SimpleDateFormat tf = new SimpleDateFormat("h:mm:ss aa");
                    SimpleDateFormat df = new SimpleDateFormat("EEEE, dd-MM-yyyy");
                    String time = tf.format(date);
                    jTxTime.setText(time.split(" ")[0]+" "+time.split(" ")[1]);
                    jTxtDate.setText(df.format(date));
                }
            }
        }).start(); 
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
     
       public static void filewriter() throws IOException{
        FileWriter file = new FileWriter("src\\cinemax\\c110.json");
        file.write(store.toJSONString());
        file.close();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton a1;
    private javax.swing.JButton a2;
    private javax.swing.JButton a3;
    private javax.swing.JButton a4;
    private javax.swing.JButton a5;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JLabel cinenum;
    private javax.swing.JLabel cineprice;
    private javax.swing.JLabel date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jTxTime;
    private javax.swing.JLabel jTxtDate;
    private javax.swing.JTextField jtcardname;
    private javax.swing.JTextField jtcardnumber;
    private javax.swing.JTextField jtcvc;
    private javax.swing.JTextField jtemail;
    private javax.swing.JTextField jtexpiry;
    private javax.swing.JTextField jtgcashcode;
    private javax.swing.JTextField jtgcashnumber;
    private javax.swing.JTextField jtname;
    private javax.swing.JTextField jtphonenumber;
    private javax.swing.JLabel mname;
    private javax.swing.JButton save;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
