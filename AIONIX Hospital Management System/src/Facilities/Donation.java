/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Facilities;

import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author HP_Owner
 */
public class Donation extends javax.swing.JFrame {
String name,address,organ,sex;
int id,age,x;
long phone;
    /**
     * Creates new form Donation
     */
    public Donation() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton2 = new javax.swing.JButton();
        pname = new javax.swing.JTextField();
        pid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        paddress = new javax.swing.JTextArea();
        addsave = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        pphone = new javax.swing.JTextField();
        page = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        female = new javax.swing.JRadioButton();
        male = new javax.swing.JRadioButton();
        porgan = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/logo.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(0, 0, 140, 110);

        pname.setEditable(false);
        getContentPane().add(pname);
        pname.setBounds(250, 200, 220, 30);

        pid.setEditable(false);
        getContentPane().add(pid);
        pid.setBounds(250, 550, 70, 30);

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 18));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Name");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 200, 170, 30);

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 18));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Organ");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 250, 170, 30);

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 18));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Phone No.");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 380, 170, 30);

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 18));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ID");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 550, 170, 30);

        search.setFont(new java.awt.Font("Rockwell", 0, 18));
        search.setForeground(new java.awt.Color(0, 0, 204));
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search);
        search.setBounds(1200, 480, 130, 50);

        paddress.setColumns(20);
        paddress.setEditable(false);
        paddress.setLineWrap(true);
        paddress.setRows(5);
        paddress.setWrapStyleWord(true);
        jScrollPane1.setViewportView(paddress);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(250, 440, 220, 100);

        addsave.setFont(new java.awt.Font("Rockwell", 0, 18));
        addsave.setForeground(new java.awt.Color(255, 0, 0));
        addsave.setText("Add");
        addsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addsaveActionPerformed(evt);
            }
        });
        getContentPane().add(addsave);
        addsave.setBounds(1200, 330, 130, 50);

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 18));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Address");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 470, 170, 30);

        pphone.setEditable(false);
        pphone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pphoneKeyReleased(evt);
            }
        });
        getContentPane().add(pphone);
        pphone.setBounds(250, 380, 220, 30);

        page.setEditable(false);
        page.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pageKeyReleased(evt);
            }
        });
        getContentPane().add(page);
        page.setBounds(250, 290, 220, 30);

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 18));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Age");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 290, 170, 30);

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 18));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Sex");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 330, 170, 30);

        buttonGroup1.add(female);
        female.setText("Female");
        female.setEnabled(false);
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        getContentPane().add(female);
        female.setBounds(340, 340, 70, 23);

        buttonGroup1.add(male);
        male.setText("Male");
        male.setEnabled(false);
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        getContentPane().add(male);
        male.setBounds(250, 340, 60, 23);

        porgan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-------------------Select-------------------", "Eyes", "Heart", "Intestine", "Kidneys", "Lungs", "Liver", "Pancreas", "Skin", "Tissue" }));
        porgan.setEnabled(false);
        getContentPane().add(porgan);
        porgan.setBounds(250, 250, 220, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/donate.jpg"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(1100, 0, 260, 270);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Organ-donor-shortage-001.jpg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(50, 0, 1220, 750);

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
        jMenuItem14.setText("Details");
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
        new Patient.NewForm().setVisible(true);
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Default.Home().setVisible(true);
}//GEN-LAST:event_jButton2ActionPerformed

    private void addsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addsaveActionPerformed
        // TODO add your handling code here:
        if(addsave.getText().equals("Add"))
        {
            pname.setEditable(true);
            page.setEditable(true);
            paddress.setEditable(true);
            pphone.setEditable(true);
            porgan.setEnabled(true);
            male.setEnabled(true);
            female.setEnabled(true);
            search.setText("Cancel");
            addsave.setText("Submit");
            pname.setText("");
            paddress.setText("");
            pphone.setText("");
            page.setText("");
            pid.setText("");
            buttonGroup1.clearSelection();
            porgan.setSelectedIndex(0);
        }
        else
        {
            name=pname.getText();
            address=paddress.getText();
            try{
            age=Integer.parseInt(page.getText());
            }catch(Exception Ex2){JOptionPane.showMessageDialog(rootPane,"Fill The Age Properly");page.setText("");}
            try{
            phone=Long.parseLong(pphone.getText());
            }catch(Exception Ex1){JOptionPane.showMessageDialog(rootPane, "Fill The Phone No. Properly");pphone.setText("");}
            organ=(String) porgan.getSelectedItem();
            if(name.isEmpty()||sex.isEmpty()||pphone.getText().isEmpty()||address.isEmpty()||page.getText().isEmpty()||pphone.getText().length()<10||organ.isEmpty()||organ.equals("-------------------Select-------------------"))
            {
                JOptionPane.showMessageDialog(rootPane, "Fill the form correctly.");
            }
            else
            {
                try {
                        Class.forName("java.sql.DriverManager");
                        Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/aionix","root","");
                        Statement stmt=(Statement) con.createStatement();
                        String query1="Select * from Donation;";
                        ResultSet rs1= stmt.executeQuery(query1);
                        if(rs1.next())
                        {
                            rs1.last();
                            id=rs1.getInt("id")+1;
                        }
                        else{id=1;}
                        String query="Insert into Donation values('"+organ+"','"+name+"',"+phone+",'"+address+"',"+age+",'"+sex+"',"+id+");";
                        stmt.executeUpdate(query);
                    } catch (Exception ex) {}
                    JOptionPane.showMessageDialog(rootPane, "Your id is "+id, "Task Completed", 1);
                    this.dispose();
                    new Donation().setVisible(true);
            }
        }
}//GEN-LAST:event_addsaveActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
        sex="Male";
    }//GEN-LAST:event_maleActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
        sex="Female";
    }//GEN-LAST:event_femaleActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        if(search.getText().equals("Search"))
        {
            x=Integer.parseInt(JOptionPane.showInputDialog(rootPane, "Type the id."));
            try {
                Class.forName("java.sql.DriverManager");
                Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/aionix","root","");
                Statement stmt=(Statement) con.createStatement();
                String query="Select * from Donation where id="+x+";";
                ResultSet rs= stmt.executeQuery(query);
                if(rs.first()==false)
                {
                    JOptionPane.showMessageDialog(rootPane,"Sorry entry not found");
                }
                else
                {
                    rs.beforeFirst();
                    while(rs.next())
                    {
                        pname.setText(rs.getString("PName"));
                        page.setText(rs.getString("Age"));
                        paddress.setText(rs.getString("Address"));
                        pphone.setText(rs.getString("PhoneNo"));
                        pid.setText(""+x);
                        porgan.setSelectedItem(rs.getObject("Organ"));
                        if(rs.getString("Sex").equals("Male"))
                        {
                            male.setSelected(true);
                        }
                        else
                        {
                            female.setSelected(true);
                        }
                    }
                }
            } catch (Exception ex) {}
        }
        else
        {
            this.dispose();
            new Donation().setVisible(true);
        }
}//GEN-LAST:event_searchActionPerformed

    private void pageKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pageKeyReleased
        // TODO add your handling code here:
        if(page.getText().length()>3)
        {
        JOptionPane.showMessageDialog(rootPane,"Age can't be greater than 3 digits.");
        page.setText("");
        }
        else if(page.getText().equals("0"))
        {
        JOptionPane.showMessageDialog(rootPane,"Age can't be 0");
        page.setText("");
        }
    }//GEN-LAST:event_pageKeyReleased

    private void pphoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pphoneKeyReleased
        // TODO add your handling code here:
        if(pphone.getText().length()>10)
        {
        JOptionPane.showMessageDialog(rootPane,"Phone No. can't be greater than 10 digits.");
        pphone.setText("");
        }
        else if(pphone.getText().equals("0"))
        {
        JOptionPane.showMessageDialog(rootPane,"Phone No. can't be 0");
        pphone.setText("");
        }
    }//GEN-LAST:event_pphoneKeyReleased

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        this.getContentPane().setBackground(Color.white);
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(Donation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Donation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Donation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Donation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Donation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addsave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton female;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JRadioButton male;
    private javax.swing.JTextArea paddress;
    private javax.swing.JTextField page;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField pname;
    private javax.swing.JComboBox porgan;
    private javax.swing.JTextField pphone;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables
}
