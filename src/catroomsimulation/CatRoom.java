package catroomsimulation;
import javax.swing.*;
import java.awt.*;

public class CatRoom extends javax.swing.JFrame {
    
    private String catName;
    private String catType;
    SimpleBackgroundFactory factory;
    
    // Singleton method -- Setup background music
    musicPlayerSingleton player = musicPlayerSingleton.getInstance();
    static long clipTimePosition;
    static boolean isPlaying = true;

    public CatRoom() {
        initComponents();
    }
    
    public CatRoom(String catName, String catType, SimpleBackgroundFactory factory){
        this.catName = catName;
        this.catType = catType;
        this.factory = factory;
        setupCatRoom();
    }
    
    //Template Method -- to setup default cat room
    final void setupCatRoom() {
        initComponents();
        setupCatNameLabel();
        setupCatIcon();
        setupBgDefaulfIcon();
        setUpHealthProgressBar();
        setUpMoodProgressBar();
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
        toyLabel.setText("");
        bgLabel.setIcon(new ImageIcon(getClass().getResource("resources/catroom.jpg")));
    }
    
    private void setUpHealthProgressBar() {
        Health health = new HealthDecreaser(HealthProgressBar);
        health.healthProgress();
    }
    
    private void setUpMoodProgressBar(){
        MoodProgressBar mood = new MoodProgressBar(MoodProgressBar);
        mood.execute();
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        catNameLabel = new javax.swing.JLabel();
        toyLabel = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        bgBox = new javax.swing.JComboBox<>();
        catLabel = new javax.swing.JLabel();
        VolumDownButton = new javax.swing.JButton();
        VolumUpButton = new javax.swing.JButton();
        musicButton = new javax.swing.JButton();
        musicBox = new javax.swing.JComboBox<>();
        HealthProgressBar = new javax.swing.JProgressBar();
        HealthPanel1 = new javax.swing.JPanel();
        HealthLabel1 = new javax.swing.JLabel();
        FoodButton1 = new javax.swing.JButton();
        MilkButton = new javax.swing.JButton();
        MoodProgressBar = new javax.swing.JProgressBar();
        MoodPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PatButton = new javax.swing.JButton();
        PlayButton = new javax.swing.JButton();
        bgLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        catNameLabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        catNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        catNameLabel.setText("Cat Name");
        getContentPane().add(catNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        toyLabel.setText("toyImage");
        getContentPane().add(toyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 530, 150, 110));

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
        getContentPane().add(catLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 320, 340));

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

        HealthPanel1.setBackground(new java.awt.Color(222, 222, 222));

        HealthLabel1.setBackground(new java.awt.Color(0, 0, 0));
        HealthLabel1.setText("Health");
        HealthPanel1.add(HealthLabel1);

        getContentPane().add(HealthPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 220, 40));

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

        MoodProgressBar.setValue(99);
        MoodProgressBar.setString("50%");
        getContentPane().add(MoodProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));

        MoodPanel.setBackground(new java.awt.Color(229, 229, 229));
        MoodPanel.setInheritsPopupMenu(true);
        MoodPanel.setName(""); // NOI18N

        jLabel1.setText("Mood");
        MoodPanel.add(jLabel1);

        getContentPane().add(MoodPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 190, 40));
        MoodPanel.getAccessibleContext().setAccessibleName("");

        PatButton.setLabel("Pat");
        PatButton.setMaximumSize(new java.awt.Dimension(49, 23));
        PatButton.setMinimumSize(new java.awt.Dimension(49, 23));
        PatButton.setPreferredSize(new java.awt.Dimension(49, 23));
        PatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatButtonActionPerformed(evt);
            }
        });
        getContentPane().add(PatButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 520, 80, -1));

        PlayButton.setLabel("Play");
        PlayButton.setMaximumSize(new java.awt.Dimension(49, 23));
        PlayButton.setMinimumSize(new java.awt.Dimension(49, 23));
        PlayButton.setPreferredSize(new java.awt.Dimension(49, 23));
        PlayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayButtonActionPerformed(evt);
            }
        });
        getContentPane().add(PlayButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 563, 80, 20));

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

    private void FoodButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FoodButton1ActionPerformed
       toyLabel.setIcon(null);
        Health health1 = new Food(HealthProgressBar);
        health1.healthProgress();
        System.out.println("Food clicked");
    }//GEN-LAST:event_FoodButton1ActionPerformed

    private void MilkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MilkButtonActionPerformed
        toyLabel.setIcon(null);
        Health health3 = new Milk(HealthProgressBar);
        health3.healthProgress();
        System.out.println("Milk clicked");
    }//GEN-LAST:event_MilkButtonActionPerformed

    private void PlayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayButtonActionPerformed
        Mood mood = new Play (new MoodProgress(MoodProgressBar),MoodProgressBar);
        mood.setMood();
        System.out.println("Play clicked - increase Mood by 3 pts");
        toyLabel.setIcon(new ImageIcon(getClass().getResource("resources/mouse.gif")));
    }//GEN-LAST:event_PlayButtonActionPerformed

    private void PatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatButtonActionPerformed
        toyLabel.setIcon(null);
        Mood mood = new PatMood (new MoodProgress(MoodProgressBar),MoodProgressBar);
        mood.setMood();
        System.out.println("Play clicked - increase Mood by 2 pts");
    }//GEN-LAST:event_PatButtonActionPerformed


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
            java.util.logging.Logger.getLogger(CatRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CatRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CatRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CatRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {    
                new CatRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton FoodButton1;
    public javax.swing.JLabel HealthLabel1;
    public javax.swing.JPanel HealthPanel1;
    public javax.swing.JProgressBar HealthProgressBar;
    public javax.swing.JButton MilkButton;
    public javax.swing.JPanel MoodPanel;
    public javax.swing.JProgressBar MoodProgressBar;
    public javax.swing.JButton PatButton;
    public javax.swing.JButton PlayButton;
    private javax.swing.JButton VolumDownButton;
    private javax.swing.JButton VolumUpButton;
    private javax.swing.JComboBox<String> bgBox;
    private javax.swing.JLabel bgLabel;
    private javax.swing.JLabel catLabel;
    private javax.swing.JLabel catNameLabel;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> musicBox;
    private javax.swing.JButton musicButton;
    public javax.swing.JLabel toyLabel;
    // End of variables declaration//GEN-END:variables

}
