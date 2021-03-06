/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Patient;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.print.PrinterException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author HP_Owner
 */
public class Billing extends javax.swing.JFrame {
int id,total,concharges,ward,wardcharge,med;
String name,consultant,speciality,problem;
    /**
     * Creates new form Billing
     */
    public Billing() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        print = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        ptotal = new javax.swing.JTextField();
        pid = new javax.swing.JTextField();
        dischar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pmedicine = new javax.swing.JTextField();
        pconcharge = new javax.swing.JTextField();
        pconsultant = new javax.swing.JTextField();
        pspeciality = new javax.swing.JTextField();
        pproblem = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pward = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();

        print.setColumns(20);
        print.setRows(5);
        print.setText("We hope a better future for you.\nThanks for visiting the hospital.\n\nYou have to pay an amount of\n\n\t\tRs.");
        jScrollPane1.setViewportView(print);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/logo.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 0, 140, 110);

        ptotal.setEditable(false);
        getContentPane().add(ptotal);
        ptotal.setBounds(810, 670, 290, 60);

        pid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pidActionPerformed(evt);
            }
        });
        getContentPane().add(pid);
        pid.setBounds(410, 60, 160, 30);

        dischar.setFont(new java.awt.Font("Rockwell", 1, 18));
        dischar.setText("Discharge");
        dischar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        dischar.setEnabled(false);
        dischar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discharActionPerformed(evt);
            }
        });
        getContentPane().add(dischar);
        dischar.setBounds(410, 670, 170, 60);

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 14));
        jLabel8.setText("Patient  I.d");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(270, 60, 77, 30);

        jLabel10.setFont(new java.awt.Font("Rockwell", 2, 30));
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("Billing");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(590, 10, 130, 40);

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 14));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(380, 140, 170, 30);

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 14));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Doctor 's  Charges");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(380, 420, 170, 30);

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 14));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Problem");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(380, 210, 170, 30);

        pname.setEditable(false);
        pname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pname.setOpaque(false);
        getContentPane().add(pname);
        pname.setBounds(660, 140, 220, 30);

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 14));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Doctor  Operating");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(380, 280, 170, 30);

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 14));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Medicine  Charges");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(380, 490, 170, 30);

        pmedicine.setEditable(false);
        pmedicine.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pmedicine.setOpaque(false);
        getContentPane().add(pmedicine);
        pmedicine.setBounds(660, 490, 220, 30);

        pconcharge.setEditable(false);
        pconcharge.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pconcharge.setOpaque(false);
        getContentPane().add(pconcharge);
        pconcharge.setBounds(660, 420, 220, 30);

        pconsultant.setEditable(false);
        pconsultant.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pconsultant.setOpaque(false);
        getContentPane().add(pconsultant);
        pconsultant.setBounds(660, 280, 220, 30);

        pspeciality.setEditable(false);
        pspeciality.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pspeciality.setOpaque(false);
        getContentPane().add(pspeciality);
        pspeciality.setBounds(660, 350, 220, 30);

        pproblem.setEditable(false);
        pproblem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pproblem.setOpaque(false);
        getContentPane().add(pproblem);
        pproblem.setBounds(660, 210, 220, 30);

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 14));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Speciality of Doctor");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(380, 350, 170, 30);

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 14));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Ward  Charges");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(380, 560, 170, 30);

        pward.setEditable(false);
        pward.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pward.setOpaque(false);
        getContentPane().add(pward);
        pward.setBounds(660, 560, 220, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/welcome-new-members.jpg"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(130, 110, 1150, 540);

        jMenu8.setText("      File      ");
        jMenu8.setIconTextGap(10);

        jMenuItem22.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/new.JPG"))); // NOI18N
        jMenuItem22.setText("New Form");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem22);

        jMenuItem20.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/mini.PNG"))); // NOI18N
        jMenuItem20.setText("Minimise");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem20);

        jMenuItem23.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/LogOff.PNG"))); // NOI18N
        jMenuItem23.setText("Log Off");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem23);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/TurnOff.PNG"))); // NOI18N
        jMenuItem3.setText("Exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem3);

        jMenuBar4.add(jMenu8);

        jMenu3.setText("      Staff      ");
        jMenu3.setIconTextGap(10);

        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/add.PNG"))); // NOI18N
        jMenuItem17.setText("Add");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem17);

        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/search.PNG"))); // NOI18N
        jMenuItem14.setText("Search");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem14);

        jMenuBar4.add(jMenu3);

        jMenu5.setText("      Patient      ");
        jMenu5.setIconTextGap(10);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/search.PNG"))); // NOI18N
        jMenuItem6.setText("Search");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/bill.PNG"))); // NOI18N
        jMenuItem10.setText("Billing");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem10);

        jMenuBar4.add(jMenu5);

        jMenu6.setText("      Doctor      ");
        jMenu6.setIconTextGap(10);

        jMenuItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/add.PNG"))); // NOI18N
        jMenuItem18.setText("Add");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem18);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/search.PNG"))); // NOI18N
        jMenuItem8.setText("Search");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem8);

        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/appoint.PNG"))); // NOI18N
        jMenuItem11.setText("Appointments");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem11);

        jMenuBar4.add(jMenu6);

        jMenu9.setText("      Help      ");
        jMenu9.setIconTextGap(10);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/aboutus.JPG"))); // NOI18N
        jMenuItem1.setText("About Us");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem1);

        jMenuItem19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/map.PNG"))); // NOI18N
        jMenuItem19.setText("Map");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem19);

        jMenuBar4.add(jMenu9);

        setJMenuBar(jMenuBar4);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new NewForm().setVisible(true);
    }//GEN-LAST:event_jMenuItem22ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        // TODO add your handling code here:
        this.setExtendedState(1);
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Default.Login().setVisible(true);
    }//GEN-LAST:event_jMenuItem23ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        int exit=(int)JOptionPane.showConfirmDialog(rootPane, "Do you want to exit?", "Hospital Management System", 0);
        if(exit==0)
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Staff.Add().setVisible(true);
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Staff.Details().setVisible(true);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Patient.Search().setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Patient.Billing().setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Doctor.Add().setVisible(true);
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Doctor.Search().setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Doctor.Appointments().setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new Help.AboutUs().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        // TODO add your handling code here:
        new Help.Map().setVisible(true);
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
               this.dispose();
        new Default.Home().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pidActionPerformed
        // TODO add your handling code here:
        try{
        id=Integer.parseInt(pid.getText());
        }catch(Exception Ex){JOptionPane.showMessageDialog(rootPane, "Please Enter Numeric Values Only.");pid.setText("");}
        if(pid.getText().isEmpty());
        else
        {
        try{
                Class.forName("java.sql.DriverManager");
                Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/aionix","root","");
                Statement stmt=(Statement) con.createStatement();
                String query1="Select * from Patients where RegistrationNo="+id+";";
                ResultSet rs1=stmt.executeQuery(query1);
                if(rs1.first()==false)
                {
                    JOptionPane.showMessageDialog(rootPane,"Sorry Entry Not Found.");
                }
                else
                {
                    rs1.beforeFirst();
                    while(rs1.next())
                    {
                        String nfind=""+rs1.getDate("DateofDischarge");
                        if(nfind.equalsIgnoreCase("null"))
                        {
                            pname.setText(rs1.getString("Name"));
                            pproblem.setText(rs1.getString("Problem"));
                            consultant=rs1.getString("Consultant");
                            pconsultant.setText(consultant);
                            med=rs1.getInt("Medicine");
                            pmedicine.setText(""+med);
                            ward=rs1.getInt("RoomNo");
                            if(ward>=1||ward<=10)  //General Ward
                            {
                                pward.setText("750");
                                wardcharge=750;
                            }
                            else if(ward>=11||ward<=20) //Children Ward
                            {
                                pward.setText("500");
                                wardcharge=500;
                            }
                            else if(ward>=21||ward<=63) //Private Ward A/C
                            {
                                pward.setText("2000");
                                wardcharge=2000;
                            }
                            else if(ward>=64||ward<=120)  //Private Ward Non A/C
                            {
                                pward.setText("1000");
                                wardcharge=1000;
                            }
                            String query2="Select * from doctors where Name like'"+consultant+"%';";
                            ResultSet rs2=stmt.executeQuery(query2);
                            while(rs2.next())
                            {
                                pspeciality.setText(rs2.getString("Speciality"));
                                pconcharge.setText(rs2.getString("Charges"));
                                concharges=rs2.getInt("Charges");
                            }
                            ptotal.setText(""+(concharges+wardcharge+med));
                            dischar.setEnabled(true);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(rootPane,"Patient Already Discharged.");
                        }
                    }
                }
            }catch(Exception Ex){}}
    }//GEN-LAST:event_pidActionPerformed

    private void discharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discharActionPerformed
        // TODO add your handling code here:
        int ans=JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to leave?");
        if(ans==1)
        {
            this.dispose();
            new Billing().setVisible(true);
        }
        else if(ans==0)
        {
        id=Integer.parseInt(pid.getText());
        try{
                Class.forName("java.sql.DriverManager");
                Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/aionix","root","");
                Statement stmt=(Statement) con.createStatement();
                String query1="Select curdate(),curtime();";
                ResultSet rs1=stmt.executeQuery(query1);
                while(rs1.next())
                {
                    String query2="Update Patients set DateofDischarge='"+rs1.getDate(1)+"',TimeofDischarge='"+rs1.getTime(2)+"' where RegistrationNo="+id+";";
                    stmt.executeUpdate(query2);
                    String query4="Select * from Patients where RegistrationNo="+id+";";
                    ResultSet rs4=stmt.executeQuery(query4);
                    while(rs4.next())
                    {
                        int rm=rs4.getInt("RoomNo");
                        if(rm==1)
                        {

                            String query3="Select * from Rooms where Accommodated='Yes' And RoomNo="+rm+";";
                            ResultSet rs3=stmt.executeQuery(query3);
                            rs3.next();
                            String query5="Update Rooms set Accommodated='No' where RoomNo="+rm+" And BedNo="+rs3.getInt("BedNo")+";";
                            stmt.executeUpdate(query5);
                        }
                        else if(rm==2)
                        {
                            String query3="Select * from Rooms where Accommodated='Yes' And RoomNo="+rm+";";
                            ResultSet rs3=stmt.executeQuery(query3);
                            rs3.next();
                            String query5="Update Rooms set Accommodated='No' where RoomNo="+rm+" And BedNo="+rs3.getInt("BedNo")+";";
                            stmt.executeUpdate(query5);
                        }
                        else if(rm==3)
                        {
                            String query3="Select * from Rooms where Accommodated='Yes' And RoomNo="+rm+";";
                            ResultSet rs3=stmt.executeQuery(query3);
                            rs3.next();
                            String query5="Update Rooms set Accommodated='No' where RoomNo="+rm+" And BedNo="+rs3.getInt("BedNo")+";";
                            stmt.executeUpdate(query5);
                        }
                        else if(rm==4)
                        {
                            String query3="Select * from Rooms where Accommodated='Yes' And RoomNo="+rm+";";
                            ResultSet rs3=stmt.executeQuery(query3);
                            rs3.next();
                            String query5="Update Rooms set Accommodated='No' where RoomNo="+rm+" And BedNo="+rs3.getInt("BedNo")+";";
                            stmt.executeUpdate(query5);
                        }
                        else
                        {
                            String query5="Update Rooms set Accommodated='No' where RoomNo="+rm+";";
                            stmt.executeUpdate(query5);
                        }
                    }
                }
          }catch(Exception Ex){}
            JOptionPane.showMessageDialog(rootPane, "The patient is now discharged.");
            print.setText(print.getText().concat(ptotal.getText()));
        try {
                print.print();
            } catch (PrinterException ex) {ex.printStackTrace();}
            this.dispose();
            new Billing().setVisible(true);
        }
}//GEN-LAST:event_discharActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Billing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dischar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pconcharge;
    private javax.swing.JTextField pconsultant;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField pmedicine;
    private javax.swing.JTextField pname;
    private javax.swing.JTextField pproblem;
    private javax.swing.JTextArea print;
    private javax.swing.JTextField pspeciality;
    private javax.swing.JTextField ptotal;
    private javax.swing.JTextField pward;
    // End of variables declaration//GEN-END:variables
}
