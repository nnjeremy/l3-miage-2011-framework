/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package application.Vue;

/**
 *
 * @author NNJeremy
 */
public class Admin extends javax.swing.JPanel {

    /**
     * Creates new form Admin
     */
    public Admin(FenPrincipale fenprinc) {
        this.ancetre = fenprinc;
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
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel_Module = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jComboBox_Module = new javax.swing.JComboBox();
        jPanel_ModuleAdmin = new AdminGestionForum(this.ancetre);

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Administration", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));
        setLayout(new java.awt.GridBagLayout());

        jLabel_Module.setText("Module d'Administration : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(30, 16, 0, 0);
        add(jLabel_Module, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 6);
        add(jSeparator1, gridBagConstraints);

        jComboBox_Module.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gestion messages forum", "Gestion fichiers", "Gestion profils" }));
        jComboBox_Module.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_ModuleActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 4, 0, 0);
        add(jComboBox_Module, gridBagConstraints);

        javax.swing.GroupLayout jPanel_ModuleAdminLayout = new javax.swing.GroupLayout(jPanel_ModuleAdmin);
        jPanel_ModuleAdmin.setLayout(jPanel_ModuleAdminLayout);
        jPanel_ModuleAdminLayout.setHorizontalGroup(
            jPanel_ModuleAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
        );
        jPanel_ModuleAdminLayout.setVerticalGroup(
            jPanel_ModuleAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 273, Short.MAX_VALUE)
        );

        jPanel_ModuleAdmin = new AdminGestionForum(this.ancetre);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 7, 6);
        add(jPanel_ModuleAdmin, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_ModuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_ModuleActionPerformed
      
        if(jComboBox_Module.getSelectedIndex() == 0){
            this.remove(jPanel_ModuleAdmin);
            jPanel_ModuleAdmin = new AdminGestionForum(this.ancetre);
            java.awt.GridBagConstraints gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 3;
            gridBagConstraints.gridwidth = 3;
            gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
            gridBagConstraints.weightx = 0.5;
            gridBagConstraints.weighty = 0.5;
            gridBagConstraints.insets = new java.awt.Insets(6, 6, 7, 6);
            add(jPanel_ModuleAdmin, gridBagConstraints);
            validate();
            ancetre.pack();
        }
        else if (jComboBox_Module.getSelectedIndex() == 1) {
            this.remove(jPanel_ModuleAdmin);
            jPanel_ModuleAdmin = new AdminGestionFichier(this.ancetre);
            java.awt.GridBagConstraints gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 3;
            gridBagConstraints.gridwidth = 3;
            gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
            gridBagConstraints.weightx = 0.5;
            gridBagConstraints.weighty = 0.5;
            gridBagConstraints.insets = new java.awt.Insets(6, 6, 7, 6);
            add(jPanel_ModuleAdmin, gridBagConstraints);
            validate();
            ancetre.pack();
        }
        else {
            this.remove(jPanel_ModuleAdmin);
            jPanel_ModuleAdmin = new AdminGestionProfil(this.ancetre);
            java.awt.GridBagConstraints gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 3;
            gridBagConstraints.gridwidth = 3;
            gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
            gridBagConstraints.weightx = 0.5;
            gridBagConstraints.weighty = 0.5;
            gridBagConstraints.insets = new java.awt.Insets(6, 6, 7, 6);
            add(jPanel_ModuleAdmin, gridBagConstraints);
            validate();
            ancetre.pack();
        }
    
    }//GEN-LAST:event_jComboBox_ModuleActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox_Module;
    private javax.swing.JLabel jLabel_Module;
    private javax.swing.JPanel jPanel_ModuleAdmin;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
    private FenPrincipale ancetre;
}
