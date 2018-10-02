
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JoZuG
 */
public class AppointmentGUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public static AppointmentModell bl = new AppointmentModell();

    public AppointmentGUI() {
        initComponents();
        liOutput.setModel(bl);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu = new javax.swing.JPopupMenu();
        menu = new javax.swing.JMenu();
        hinzufügen = new javax.swing.JMenuItem();
        löschen = new javax.swing.JMenuItem();
        ändern = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        liOutput = new javax.swing.JList<>();

        menu.setText("Termin");

        hinzufügen.setText("hinzufügen");
        hinzufügen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hinzufügenActionPerformed(evt);
            }
        });
        menu.add(hinzufügen);

        löschen.setText("löschen");
        löschen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                löschenActionPerformed(evt);
            }
        });
        menu.add(löschen);

        ändern.setText("ändern");
        ändern.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ändernActionPerformed(evt);
            }
        });
        menu.add(ändern);

        popupMenu.add(menu);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        liOutput.setComponentPopupMenu(popupMenu);
        jScrollPane1.setViewportView(liOutput);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hinzufügenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hinzufügenActionPerformed
        AppointmentDlg ad = new AppointmentDlg(this, true);
        ad.setVisible(true);

        bl.add(ad.getAp());
    }//GEN-LAST:event_hinzufügenActionPerformed

    private void löschenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_löschenActionPerformed
        int[] array = liOutput.getSelectedIndices();
        
        for (int i = array.length - 1; i >= 0; i--) {
            bl.removeIndex(array[i]);
        }
    }//GEN-LAST:event_löschenActionPerformed

    private void ändernActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ändernActionPerformed
        AppointmentDlg ad = new AppointmentDlg(this, true, liOutput.getSelectedValue());
        ad.setVisible(true);

        bl.add(ad.getAp());
    }//GEN-LAST:event_ändernActionPerformed

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
            java.util.logging.Logger.getLogger(AppointmentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppointmentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppointmentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppointmentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppointmentGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem hinzufügen;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Appointment> liOutput;
    private javax.swing.JMenuItem löschen;
    private javax.swing.JMenu menu;
    private javax.swing.JPopupMenu popupMenu;
    private javax.swing.JMenuItem ändern;
    // End of variables declaration//GEN-END:variables
}
