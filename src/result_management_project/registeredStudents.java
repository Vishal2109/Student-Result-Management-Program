/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package result_management_project;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.sql.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author visha
 */
public class registeredStudents extends javax.swing.JFrame {

    /**
     * Creates new form registeredStudents
     */
    public registeredStudents() {
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

        jPanel1 = new javax.swing.JPanel();
        addNewStudent = new javax.swing.JButton();
        addResult = new javax.swing.JButton();
        registerdStudents = new javax.swing.JButton();
        allStudentResult = new javax.swing.JButton();
        adminLogout = new javax.swing.JButton();
        allRegisteredStudentsPrint = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        allRegisteredStudents_table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        addNewStudent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addNewStudent.setText("Add New Student");
        addNewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewStudentActionPerformed(evt);
            }
        });

        addResult.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addResult.setText("Add Result");
        addResult.setMaximumSize(new java.awt.Dimension(124, 23));
        addResult.setMinimumSize(new java.awt.Dimension(124, 23));
        addResult.setPreferredSize(new java.awt.Dimension(124, 23));
        addResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addResultActionPerformed(evt);
            }
        });

        registerdStudents.setBackground(new java.awt.Color(204, 255, 255));
        registerdStudents.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        registerdStudents.setText("Registered Students");
        registerdStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerdStudentsActionPerformed(evt);
            }
        });

        allStudentResult.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        allStudentResult.setText("All Students Result");
        allStudentResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allStudentResultActionPerformed(evt);
            }
        });

        adminLogout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        adminLogout.setText("LogOut");
        adminLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminLogoutActionPerformed(evt);
            }
        });

        allRegisteredStudentsPrint.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        allRegisteredStudentsPrint.setIcon(new javax.swing.ImageIcon("D:\\Java Projects\\Result_Management_Project\\images\\print-25.png")); // NOI18N
        allRegisteredStudentsPrint.setText("Print");
        allRegisteredStudentsPrint.setPreferredSize(new java.awt.Dimension(75, 30));
        allRegisteredStudentsPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allRegisteredStudentsPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(allStudentResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addNewStudent, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(registerdStudents, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(addResult, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(allRegisteredStudentsPrint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(adminLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(addNewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addResult, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registerdStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(allStudentResult, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(allRegisteredStudentsPrint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adminLogout)
                .addGap(31, 31, 31))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("All Registered Students");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        allRegisteredStudents_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        allRegisteredStudents_table.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                allRegisteredStudents_tableComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(allRegisteredStudents_table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addNewStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewStudentActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new addNewStudent().setVisible(true);
    }//GEN-LAST:event_addNewStudentActionPerformed

    private void addResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addResultActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new addResult().setVisible(true);
    }//GEN-LAST:event_addResultActionPerformed

    private void registerdStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerdStudentsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerdStudentsActionPerformed

    private void allStudentResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allStudentResultActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new allStudentsResult().setVisible(true);
    }//GEN-LAST:event_allStudentResultActionPerformed

    private void adminLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminLogoutActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new adminIndex().setVisible(true);
    }//GEN-LAST:event_adminLogoutActionPerformed

    private void allRegisteredStudents_tableComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_allRegisteredStudents_tableComponentShown
        // TODO add your handling code here:
         
    }//GEN-LAST:event_allRegisteredStudents_tableComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        try{
//            connects to database
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/srms", "root", "Qwerty@2109");
            
            Statement st = con.createStatement();
//            gets all registered students from database
            ResultSet rs = st.executeQuery("SELECT * FROM students");
            
//            populates allRegisterdStudents_table
            allRegisteredStudents_table.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString(), "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_formComponentShown

    private void allRegisteredStudentsPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allRegisteredStudentsPrintActionPerformed
        // TODO add your handling code here:
//        chose file path where pdf is to be stord
        String path = "";
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.SAVE_DIALOG);
        int x = j.showSaveDialog(this);
        if(x == JFileChooser.APPROVE_OPTION){
            path = j.getSelectedFile().getPath();
        }
        else{
            JOptionPane.showMessageDialog(null, "Something went wrong!", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Document doc = new Document();
        try{
            PdfWriter.getInstance(doc, new FileOutputStream(path + "\\All Students.pdf"));

            doc.open();
//            add new paragraph to doc
            doc.add(new Paragraph("All Registered Students. \n\n"));
//            create table with 6 columns
            PdfPTable table = new PdfPTable(6);
//            add headings to table
            table.addCell("Roll No.");
            table.addCell("Name");
            table.addCell("Course");
            table.addCell("Branch");
            table.addCell("Father's Name");
            table.addCell("Gender");

//            add values to to the table
            for(int i=0; i<allRegisteredStudents_table.getRowCount(); i++){

                String roll = allRegisteredStudents_table.getValueAt(i, 0).toString();
                String course = allRegisteredStudents_table.getValueAt(i, 1).toString();
                String branch = allRegisteredStudents_table.getValueAt(i, 2).toString();
                String name = allRegisteredStudents_table.getValueAt(i, 3).toString();
                String gender = allRegisteredStudents_table.getValueAt(i, 4).toString();
                String father = allRegisteredStudents_table.getValueAt(i, 5).toString();

                table.addCell(roll);
                table.addCell(name);
                table.addCell(course);
                table.addCell(branch);
                table.addCell(father);
                table.addCell(gender);

            }

//            add table to doc
            doc.add(table);
            JOptionPane.showMessageDialog(null, "Pdf saved. ","", JOptionPane.INFORMATION_MESSAGE);
//            close doc
            doc.close();

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString(), "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_allRegisteredStudentsPrintActionPerformed

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
            java.util.logging.Logger.getLogger(registeredStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registeredStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registeredStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registeredStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registeredStudents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewStudent;
    private javax.swing.JButton addResult;
    private javax.swing.JButton adminLogout;
    private javax.swing.JButton allRegisteredStudentsPrint;
    private javax.swing.JTable allRegisteredStudents_table;
    private javax.swing.JButton allStudentResult;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton registerdStudents;
    // End of variables declaration//GEN-END:variables
}
