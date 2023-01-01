package catroomsimulation;
import javax.swing.*;
import java.awt.*;

public class index extends javax.swing.JFrame {
    
    private String catName;
    private String catType;
    SimpleBackgroundFactory factory;

    public index() {
        initComponents();
    }
    
    public index(String catName, String catType, SimpleBackgroundFactory factory) {
        this.catName = catName;
        this.catType = catType;
        this.factory = factory;
        setupCatRoom();
    }
    
    //Template Method -- to setup default cat room
    final void setupCatRoom(){
        initComponents();
        setupCatNameLabel();
        setupCatIcon();
        setupBgDefaulfIcon();
    }
    
    private void setupCatNameLabel(){
        catNameLabel.setText("Hi " + catName + " ♡");
    }
    
    private void setupCatIcon(){
        catLabel.setText("");
        switch(catType) {
          case "blackCat":
              catLabel.setIcon(new ImageIcon(getClass().getResource("resources/blackCat.png")));
              break;
          case "whiteCat":
              catLabel.setIcon(new ImageIcon(getClass().getResource("resources/whiteCat.png")));
              break;
        }      
    }
    
    private void setupBgDefaulfIcon(){
        bgLabel.setText("");
        bgLabel.setIcon(new ImageIcon(getClass().getResource("resources/catroom.jpg")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        catNameLabel = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        bgBox = new javax.swing.JComboBox<>();
        catLabel = new javax.swing.JLabel();
        bgLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(0, 0));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(500, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        catNameLabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        catNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        catNameLabel.setText("Cat Name");
        getContentPane().add(catNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 680, -1, -1));

        bgBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cat Room", "Play Room", "Living Room", "Bed Room", "Park" }));
        bgBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bgBoxActionPerformed(evt);
            }
        });
        getContentPane().add(bgBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 200, 30));

        catLabel.setText("catImage");
        getContentPane().add(catLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 320, 340));

        bgLabel.setText("bgImage");
        bgLabel.setPreferredSize(new java.awt.Dimension(500, 750));
        getContentPane().add(bgLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void bgBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bgBoxActionPerformed
        ImageIcon bgImg;
        
        String selectedPlace = bgBox.getSelectedItem().toString();
        bgImg = factory.createBackground(selectedPlace);
        bgLabel.setIcon(bgImg);
    }//GEN-LAST:event_bgBoxActionPerformed


    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {    
                new index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> bgBox;
    private javax.swing.JLabel bgLabel;
    private javax.swing.JLabel catLabel;
    private javax.swing.JLabel catNameLabel;
    private javax.swing.JButton exitButton;
    // End of variables declaration//GEN-END:variables

}
