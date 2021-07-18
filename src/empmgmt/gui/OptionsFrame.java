/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empmgmt.gui;

import empmgmt.dbutil.DBConnection;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author aryan
 */
public class OptionsFrame extends javax.swing.JFrame {

    /**
     * Creates new form OptionsFrame
     */
    public OptionsFrame() {
        initComponents();
        setLocationRelativeTo(null);
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jrbAddEmp = new javax.swing.JRadioButton();
        jrbSearchEmp = new javax.swing.JRadioButton();
        jrbShowAllEmp = new javax.swing.JRadioButton();
        jrbQuit = new javax.swing.JRadioButton();
        btnDoTask = new javax.swing.JButton();
        jrbUpdateEmp = new javax.swing.JRadioButton();
        jrbDeleteEmp = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Select Your Choice");

        jrbAddEmp.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbAddEmp);
        jrbAddEmp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbAddEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrbAddEmp.setText("Add Employee");

        jrbSearchEmp.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbSearchEmp);
        jrbSearchEmp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbSearchEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrbSearchEmp.setText("Search Employee");

        jrbShowAllEmp.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbShowAllEmp);
        jrbShowAllEmp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbShowAllEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrbShowAllEmp.setText("Show All Employees");

        jrbQuit.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbQuit);
        jrbQuit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbQuit.setForeground(new java.awt.Color(255, 255, 255));
        jrbQuit.setText("Quit");

        btnDoTask.setBackground(new java.awt.Color(0, 0, 0));
        btnDoTask.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDoTask.setForeground(new java.awt.Color(255, 255, 255));
        btnDoTask.setText("Do Task");
        btnDoTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoTaskActionPerformed(evt);
            }
        });

        jrbUpdateEmp.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbUpdateEmp);
        jrbUpdateEmp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbUpdateEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrbUpdateEmp.setText("Update Employee");

        jrbDeleteEmp.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbDeleteEmp);
        jrbDeleteEmp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbDeleteEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrbDeleteEmp.setText("Delete Employee");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbDeleteEmp)
                    .addComponent(btnDoTask, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbUpdateEmp)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jrbAddEmp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jrbShowAllEmp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jrbSearchEmp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jrbQuit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jrbAddEmp)
                .addGap(29, 29, 29)
                .addComponent(jrbSearchEmp)
                .addGap(31, 31, 31)
                .addComponent(jrbShowAllEmp)
                .addGap(27, 27, 27)
                .addComponent(jrbUpdateEmp)
                .addGap(29, 29, 29)
                .addComponent(jrbDeleteEmp)
                .addGap(27, 27, 27)
                .addComponent(jrbQuit)
                .addGap(29, 29, 29)
                .addComponent(btnDoTask, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
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

    private void btnDoTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoTaskActionPerformed
        if(isValidInput()==false){
            JOptionPane.showMessageDialog(null, "Please Select a Choice the Proceed!");
            return;
        }
        JFrame userChoiceFrame=null;
        if(jrbAddEmp.isSelected())
        {
            userChoiceFrame=new AddEmployeeFrame();

        }
        else if(jrbSearchEmp.isSelected())
        {
            userChoiceFrame=new SearchEmployeeFrame();

        }
        else if(jrbShowAllEmp.isSelected())
        {
            userChoiceFrame=new ViewAllEmployeeFrame();

        }
        else if(jrbUpdateEmp.isSelected())
        {
            userChoiceFrame=new UpdateEmployeeFrame();

        }
        else if(jrbDeleteEmp.isSelected())
        {
            userChoiceFrame=new DeleteEmployeeFrame();

        }
        else
        {
            if (JOptionPane.OK_OPTION == JOptionPane.showConfirmDialog(null, "Are you want to Exit?"))
            {
                DBConnection.closeConnection();
                System.exit(0);
            }
        }
        //        else{
            //            JOptionPane.showMessageDialog(null, "Please Select a Choice the Proceed!");
            //        }
        userChoiceFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDoTaskActionPerformed

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
            java.util.logging.Logger.getLogger(OptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OptionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoTask;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jrbAddEmp;
    private javax.swing.JRadioButton jrbDeleteEmp;
    private javax.swing.JRadioButton jrbQuit;
    private javax.swing.JRadioButton jrbSearchEmp;
    private javax.swing.JRadioButton jrbShowAllEmp;
    private javax.swing.JRadioButton jrbUpdateEmp;
    // End of variables declaration//GEN-END:variables

    private boolean isValidInput() {
        if(jrbAddEmp.isSelected()==false && jrbSearchEmp.isSelected()==false && jrbShowAllEmp.isSelected()==false && jrbQuit.isSelected()==false && jrbUpdateEmp.isSelected()==false && jrbDeleteEmp.isSelected()==false)
            return false;
        return true;
    }
}
