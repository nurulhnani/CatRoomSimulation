package catroomsimulation;
import javax.swing.*;
import java.awt.*;

public class index extends javax.swing.JFrame {
    
    private String catName;
    private String catType;
    SimpleBackgroundFactory factory;
    
    // Singleton method -- Setup background music
    musicPlayerSingleton player = musicPlayerSingleton.getInstance();
    static long clipTimePosition;
    static boolean isPlaying = true;

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
        setUpHealthProgressBar();
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
    
    private void setUpHealthProgressBar() {
        Health health = new HealthDecreaser(HealthProgressBar);
        health.healthProgress();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        catNameLabel = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        bgBox = new javax.swing.JComboBox<>();
        catLabel = new javax.swing.JLabel();
        VolumDownButton = new javax.swing.JButton();
        VolumUpButton = new javax.swing.JButton();
        musicButton = new javax.swing.JButton();
        musicBox = new javax.swing.JComboBox<>();
        HealthProgressBar = new javax.swing.JProgressBar();
        HealthPanel = new javax.swing.JPanel();
        HealthLabel = new javax.swing.JLabel();
        patButton = new javax.swing.JButton();
        FoodButton1 = new javax.swing.JButton();
        MilkButton = new javax.swing.JButton();
        bgLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
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
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, 30));

        bgBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cat Room", "Play Room", "Living Room", "Bed Room", "Park" }));
        bgBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bgBoxActionPerformed(evt);
            }
        });
        getContentPane().add(bgBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 200, 30));

        catLabel.setText("catImage");
        getContentPane().add(catLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 320, 340));

        VolumDownButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/catroomsimulation/resources/volumeDown.png"))); // NOI18N
        VolumDownButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolumDownButtonActionPerformed(evt);
            }
        });
        getContentPane().add(VolumDownButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 690, 40, 30));

        VolumUpButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/catroomsimulation/resources/volumeUp.png"))); // NOI18N
        VolumUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolumUpButtonActionPerformed(evt);
            }
        });
        getContentPane().add(VolumUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 690, 40, 30));

        musicButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/catroomsimulation/resources/soundOff.png"))); // NOI18N
        musicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musicButtonActionPerformed(evt);
            }
        });
        getContentPane().add(musicButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 690, 40, 30));

        musicBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Music 1", "Music 2", "Music 3" }));
        musicBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musicBoxActionPerformed(evt);
            }
        });
        getContentPane().add(musicBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 690, 80, 30));

        HealthProgressBar.setValue(50);
        getContentPane().add(HealthProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 200, -1));

        HealthPanel.setBackground(new java.awt.Color(222, 222, 222));

        HealthLabel.setBackground(new java.awt.Color(0, 0, 0));
        HealthLabel.setForeground(new java.awt.Color(0, 0, 0));
        HealthLabel.setText("Health");
        HealthPanel.add(HealthLabel);

        getContentPane().add(HealthPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 220, 40));

        patButton.setText("Pat");
        patButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patButtonActionPerformed(evt);
            }
        });
        getContentPane().add(patButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 560, 80, -1));

        FoodButton1.setText("Food");
        FoodButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FoodButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(FoodButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 640, 80, -1));

        MilkButton.setText("Milk");
        MilkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MilkButtonActionPerformed(evt);
            }
        });
        getContentPane().add(MilkButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 600, 80, -1));

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

    private void VolumUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolumUpButtonActionPerformed
        player.volumeUp();
    }//GEN-LAST:event_VolumUpButtonActionPerformed

    private void musicButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musicButtonActionPerformed
//        player.clip.setMicrosecondPosition(0);
//        clipTimePosition = 0;
//        player.clip.start();
        if(isPlaying){
            player.loadMusic(musicBox.getSelectedItem().toString()+".wav");
            musicButton.setIcon(new ImageIcon(getClass().getResource("resources/soundOn.png")));
        }else{
            player.clip.stop();
            musicButton.setIcon(new ImageIcon(getClass().getResource("resources/soundOff.png")));
        } 
        isPlaying = !isPlaying;
    }//GEN-LAST:event_musicButtonActionPerformed

    private void VolumDownButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolumDownButtonActionPerformed
        player.volumeDown();
    }//GEN-LAST:event_VolumDownButtonActionPerformed

    private void musicBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musicBoxActionPerformed
        if(isPlaying){
            player.loadMusic(musicBox.getSelectedItem().toString()+".wav");
            musicButton.setIcon(new ImageIcon(getClass().getResource("resources/soundOn.png")));
        }else{
            player.clip.stop();
            musicButton.setIcon(new ImageIcon(getClass().getResource("resources/soundOff.png")));
        } 
        isPlaying = !isPlaying;
    }//GEN-LAST:event_musicBoxActionPerformed

    private void patButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patButtonActionPerformed
        Health health = new Pat(HealthProgressBar);
        health.healthProgress();
        System.out.println("Pat clicked");
    }//GEN-LAST:event_patButtonActionPerformed

    private void FoodButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FoodButton1ActionPerformed
        Health health1 = new Food(HealthProgressBar);
        health1.healthProgress();
        System.out.println("Food clicked");
    }//GEN-LAST:event_FoodButton1ActionPerformed

    private void MilkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MilkButtonActionPerformed
        Health health3 = new Milk(HealthProgressBar);
        health3.healthProgress();
        System.out.println("Milk clicked");
    }//GEN-LAST:event_MilkButtonActionPerformed


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
    public javax.swing.JButton FoodButton1;
    public javax.swing.JLabel HealthLabel;
    public javax.swing.JPanel HealthPanel;
    public javax.swing.JProgressBar HealthProgressBar;
    public javax.swing.JButton MilkButton;
    private javax.swing.JButton VolumDownButton;
    private javax.swing.JButton VolumUpButton;
    private javax.swing.JComboBox<String> bgBox;
    private javax.swing.JLabel bgLabel;
    private javax.swing.JLabel catLabel;
    private javax.swing.JLabel catNameLabel;
    private javax.swing.JButton exitButton;
    private javax.swing.JComboBox<String> musicBox;
    private javax.swing.JButton musicButton;
    public javax.swing.JButton patButton;
    // End of variables declaration//GEN-END:variables

}
