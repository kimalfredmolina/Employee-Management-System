/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package employee.management;

import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kim Alfred
 */
public class Project extends javax.swing.JInternalFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    
    public Project() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root", "");
            pst=con.prepareStatement("Select * from project_db");
            rs=pst.executeQuery();
            ResultSetMetaData rsmd =rs.getMetaData();
            int n=rsmd.getColumnCount();
            DefaultTableModel dtm=(DefaultTableModel) projecttbl.getModel();
            dtm.setRowCount(0);
            
            while(rs.next()){
                Vector v=new Vector();
                for(int i=1;i<=n;i++){
                    v.add(rs.getString("id"));
                    v.add(rs.getString("employee_id"));
                    v.add(rs.getString("name"));
                    v.add(rs.getString("email"));
                    v.add(rs.getString("position"));
                    v.add(rs.getString("department")); 
                    v.add(rs.getString("picture"));
                    v.add(rs.getString("assigndate"));
                    v.add(rs.getString("duedate"));
                    v.add(rs.getString("mark"));
                    v.add(rs.getString("status"));
                    v.add(rs.getString("proj_desc"));
                    v.add(rs.getString("submitted"));
                    
                }
                //System.out.print(v);
                dtm.addRow(v);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        update4 = new javax.swing.JButton();
        delete3 = new javax.swing.JButton();
        deltxt3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        seeproj = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        projecttbl = new javax.swing.JTable();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));
        jPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 0)));

        update4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        update4.setForeground(new java.awt.Color(0, 0, 0));
        update4.setText("Update Project");
        update4.setActionCommand("Update Leave");
        update4.setBorder(new javax.swing.border.MatteBorder(null));
        update4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                update4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                update4MouseExited(evt);
            }
        });
        update4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update4ActionPerformed(evt);
            }
        });

        delete3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        delete3.setForeground(new java.awt.Color(0, 0, 0));
        delete3.setText("Delete Project");
        delete3.setBorder(new javax.swing.border.MatteBorder(null));
        delete3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                delete3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                delete3MouseExited(evt);
            }
        });
        delete3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete3ActionPerformed(evt);
            }
        });

        deltxt3.setBackground(new java.awt.Color(255, 255, 255));
        deltxt3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deltxt3.setForeground(new java.awt.Color(0, 0, 0));
        deltxt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deltxt3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Type The Number Here");

        add.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add.setForeground(new java.awt.Color(0, 0, 0));
        add.setText("Add Project");
        add.setActionCommand("Update Leave");
        add.setBorder(new javax.swing.border.MatteBorder(null));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
        });
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        seeproj.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        seeproj.setForeground(new java.awt.Color(0, 0, 0));
        seeproj.setText("See Project");
        seeproj.setActionCommand("Update Leave");
        seeproj.setBorder(new javax.swing.border.MatteBorder(null));
        seeproj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                seeprojMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                seeprojMouseExited(evt);
            }
        });
        seeproj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeprojActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(update4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delete3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deltxt3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 66, Short.MAX_VALUE))
                    .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(seeproj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deltxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delete3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(update4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seeproj, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        projecttbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Number", "Employee ID", "Name", "Email", "Position", "Department", "Picture", "Asign Data", "Due date", "Mark", "Status", "Project Description", "Submitted Date"
            }
        ));
        jScrollPane1.setViewportView(projecttbl);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 884, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 2, 1130, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void update4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update4MouseEntered
        Color clr=new Color(0, 0, 255);
        update4.setBackground(clr);
    }//GEN-LAST:event_update4MouseEntered

    private void update4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update4MouseExited
        Color clr=new Color(255,255,255);
        update4.setBackground(clr);
    }//GEN-LAST:event_update4MouseExited

    private void update4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update4ActionPerformed
      
    }//GEN-LAST:event_update4ActionPerformed

    private void delete3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete3MouseEntered
        Color clr=new Color(0, 0, 255);
        delete3.setBackground(clr);
    }//GEN-LAST:event_delete3MouseEntered

    private void delete3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete3MouseExited
        Color clr=new Color(255,255,255);
        delete3.setBackground(clr);
    }//GEN-LAST:event_delete3MouseExited

    private void delete3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete3ActionPerformed
        try {
            String idToDelete = deltxt3.getText();

            if (!idToDelete.isEmpty()) {
                String sql = "DELETE FROM project_db WHERE id =?";
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb", "root", "");
                pst = con.prepareStatement(sql);
                pst.setString(1, idToDelete);
                int rowsAffected = pst.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Delete Successfully");
                } else {
                    JOptionPane.showMessageDialog(null, "No records found with the specified ID");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please enter an Number to delete");
            }
        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_delete3ActionPerformed

    private void deltxt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deltxt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deltxt3ActionPerformed

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        Color clr=new Color(0, 0, 255);
        add.setBackground(clr);
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        Color clr=new Color(255,255,255);
        add.setBackground(clr);
    }//GEN-LAST:event_addMouseExited

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        AddProject a = new AddProject();
        a.setVisible(true);
    }//GEN-LAST:event_addActionPerformed

    private void seeprojMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seeprojMouseEntered
        Color clr=new Color(0, 0, 255);
        seeproj.setBackground(clr);
    }//GEN-LAST:event_seeprojMouseEntered

    private void seeprojMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seeprojMouseExited
        Color clr=new Color(255,255,255);
        seeproj.setBackground(clr);
    }//GEN-LAST:event_seeprojMouseExited

    private void seeprojActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeprojActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seeprojActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton delete;
    private javax.swing.JButton delete1;
    private javax.swing.JButton delete2;
    private javax.swing.JButton delete3;
    private javax.swing.JTextField deltxt;
    private javax.swing.JTextField deltxt1;
    private javax.swing.JTextField deltxt2;
    private javax.swing.JTextField deltxt3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable projecttbl;
    private javax.swing.JButton seeproj;
    private javax.swing.JButton update;
    private javax.swing.JButton update1;
    private javax.swing.JButton update2;
    private javax.swing.JButton update3;
    private javax.swing.JButton update4;
    // End of variables declaration//GEN-END:variables
}
