/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package systeme;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.DriverManager;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pc
 */
public class Abonnes extends javax.swing.JFrame {

    /**
     * Creates new form Abonnes
     */
    Connection con ;
    PreparedStatement pst ;
    ResultSet rs;
    
    public Abonnes() {
        initComponents();
        TableAbonnes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        nameInputField = new javax.swing.JTextField();
        idInputField = new javax.swing.JTextField();
        insertButton = new javax.swing.JButton();
        empruntButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        modifButton = new javax.swing.JButton();
        requeteButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        livresButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AbonnesTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("SansSerif", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Interface Abonnés");

        nameLabel.setFont(new java.awt.Font("SansSerif", 3, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(51, 51, 51));
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setText("Name");

        idLabel.setFont(new java.awt.Font("SansSerif", 3, 18)); // NOI18N
        idLabel.setForeground(new java.awt.Color(51, 51, 51));
        idLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idLabel.setText("ID");

        idInputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idInputFieldActionPerformed(evt);
            }
        });
        idInputField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idInputFieldKeyReleased(evt);
            }
        });

        insertButton.setFont(new java.awt.Font("SansSerif", 3, 18)); // NOI18N
        insertButton.setForeground(new java.awt.Color(51, 51, 51));
        insertButton.setText("Insertion");
        insertButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        insertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButtonActionPerformed(evt);
            }
        });

        empruntButton.setFont(new java.awt.Font("SansSerif", 3, 18)); // NOI18N
        empruntButton.setForeground(new java.awt.Color(51, 51, 51));
        empruntButton.setText("Emprunt");
        empruntButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        deleteButton.setFont(new java.awt.Font("SansSerif", 3, 18)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(51, 51, 51));
        deleteButton.setText("Suppression");
        deleteButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        modifButton.setFont(new java.awt.Font("SansSerif", 3, 18)); // NOI18N
        modifButton.setForeground(new java.awt.Color(51, 51, 51));
        modifButton.setText("Modification");
        modifButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        modifButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifButtonActionPerformed(evt);
            }
        });

        requeteButton.setFont(new java.awt.Font("SansSerif", 3, 18)); // NOI18N
        requeteButton.setForeground(new java.awt.Color(51, 51, 51));
        requeteButton.setText("Requetes");
        requeteButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        refreshButton.setFont(new java.awt.Font("SansSerif", 3, 18)); // NOI18N
        refreshButton.setForeground(new java.awt.Color(51, 51, 51));
        refreshButton.setText("Actualiser");
        refreshButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        livresButton.setFont(new java.awt.Font("SansSerif", 3, 18)); // NOI18N
        livresButton.setForeground(new java.awt.Color(51, 51, 51));
        livresButton.setText("Livres");
        livresButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        livresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                livresButtonActionPerformed(evt);
            }
        });

        AbonnesTable.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        AbonnesTable.setForeground(new java.awt.Color(51, 51, 51));
        AbonnesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "NOM"
            }
        ));
        AbonnesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                AbonnesTableMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(AbonnesTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idInputField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameInputField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(empruntButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(livresButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(requeteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(insertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modifButton, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(insertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(modifButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(empruntButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(requeteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(livresButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(148, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idInputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idInputFieldActionPerformed
        
    }//GEN-LAST:event_idInputFieldActionPerformed

    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:bibliotheque.db");
            String sql = "insert into Abonnes (ID,NOM) values (?,?)";
            pst = con.prepareStatement(sql);
            pst.setString(1,idInputField.getText());
            pst.setString(2,nameInputField.getText());
            pst.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null,"Abonnement reussi");
            TableAbonnes();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_insertButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:bibliotheque.db");
            String sql = "delete from Abonnes where ID=?";
            pst = con.prepareStatement(sql);
            pst.setString(1,idInputField.getText());
            pst.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null,"Supression reussite");
            TableAbonnes();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void modifButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifButtonActionPerformed
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:bibliotheque.db");
            String sql = "update Abonnes set NOM=? where ID=?";
            pst = con.prepareStatement(sql);
            pst.setString(2,idInputField.getText());
            pst.setString(1,nameInputField.getText());
            pst.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null,"Modification reussite");
            TableAbonnes();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_modifButtonActionPerformed

    private void AbonnesTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AbonnesTableMouseReleased
        int i = AbonnesTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)AbonnesTable.getModel();
        idInputField.setText(model.getValueAt(i, 0).toString());
        nameInputField.setText(model.getValueAt(i, 1).toString());

    }//GEN-LAST:event_AbonnesTableMouseReleased

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        idInputField.setText("");
        nameInputField.setText("");
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void livresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_livresButtonActionPerformed
        Livre livre = new Livre();
        livre.setVisible(true);
    }//GEN-LAST:event_livresButtonActionPerformed

    private void idInputFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idInputFieldKeyReleased
        SearchTableAbonnes(idInputField.getText());
    }//GEN-LAST:event_idInputFieldKeyReleased

    /**
     * @param args the command line arguments
     */
    
    public void TableAbonnes(){
        String [] abonnes = {"ID","NOM"};
         String [] afficher = new String[3];
         DefaultTableModel model = new DefaultTableModel(null,abonnes);
         String sql ="select * from Abonnes";
          try {
              Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:bibliotheque.db");
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()) {
                afficher[0] = rs.getString("ID");
                afficher[1] = rs.getString("NOM");
                model.addRow(afficher);
            }
              AbonnesTable.setModel(model);
              con.close();
          } catch (Exception e) {
              e.printStackTrace();
          }
    }
    
    public void SearchTableAbonnes(String value){
        String [] abonnes = {"ID","NOM"};
         String [] afficher = new String[3];
         DefaultTableModel model = new DefaultTableModel(null,abonnes);
         String sql ="select * from Abonnes where ID like'%"+value+"%'";
          try {
              Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:bibliotheque.db");
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()) {
                afficher[0] = rs.getString("ID");
                afficher[1] = rs.getString("NOM");
                model.addRow(afficher);
            }
              AbonnesTable.setModel(model);
              con.close();
          } catch (Exception e) {
              e.printStackTrace();
          }
    }
    
    
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
            java.util.logging.Logger.getLogger(Abonnes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Abonnes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Abonnes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Abonnes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Abonnes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AbonnesTable;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton empruntButton;
    private javax.swing.JTextField idInputField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JButton insertButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton livresButton;
    private javax.swing.JButton modifButton;
    private javax.swing.JTextField nameInputField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton requeteButton;
    // End of variables declaration//GEN-END:variables
}
