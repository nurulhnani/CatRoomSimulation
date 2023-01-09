package catroomsimulation;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CatRoom extends javax.swing.JFrame {
    
    private String name;
    private String type;
    private String time = "Day";
    Cat cat;
    DefaultRoomSetting defaultRoomSetting;
    SimpleBackgroundFactory factory;
    ImageIcon bgImg ;
    Background bg;
    
    // Singleton method -- Setup background music
    musicPlayerSingleton player = musicPlayerSingleton.getInstance();
    static long clipTimePosition;
    static boolean isPlaying = true;
    
    public CatRoom() {
        initComponents();
    }
    
    public CatRoom(Cat cat, String name, String type, DefaultRoomSetting defaultRoomSetting, SimpleBackgroundFactory factory){
        this.name = name;
        this.type = type;
        this.factory = factory;
        this.cat = cat;
        this.defaultRoomSetting = defaultRoomSetting;
        initComponents();
    }
    
    //Facade -- to setup default cat room
    public void setup() {
        cat.setName(catNameLabel, name);
        cat.setType(catLabel, type);
        defaultRoomSetting.setBackground(bgLabel, toyLabel);
        defaultRoomSetting.setHealthProgressBar(HealthProgressBar);
        defaultRoomSetting.setMoodProgressBar(MoodProgressBar);
    }
      

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HealthIncreaseIcon = new javax.swing.JLabel();
        HealthIncreaseIcon.setVisible(false);
        catNameLabel = new javax.swing.JLabel();
        toyLabel = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        bgBox = new javax.swing.JComboBox<>();
        VolumDownButton = new javax.swing.JButton();
        FoodImage = new javax.swing.JLabel();
        FoodImage.setVisible(false);
        MilkImage = new javax.swing.JLabel();
        MilkImage.setVisible(false);
        catLabel = new javax.swing.JLabel();
        VolumUpButton = new javax.swing.JButton();
        musicButton = new javax.swing.JButton();
        musicBox = new javax.swing.JComboBox<>();
        HealthProgressBar = new javax.swing.JProgressBar();
        HealthPanel1 = new javax.swing.JPanel();
        HealthLabel1 = new javax.swing.JLabel();
        MoodProgressBar = new javax.swing.JProgressBar();
        MoodPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        timeButton = new javax.swing.JButton();
        MilkBowl = new javax.swing.JLabel();
        patLabelImg = new javax.swing.JLabel();
        toyLabelImg = new javax.swing.JLabel();
        milkLabelImg = new javax.swing.JLabel();
        foodLabelImg = new javax.swing.JLabel();
        bgLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HealthIncreaseIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/catroomsimulation/resources/health_icon.png"))); // NOI18N
        getContentPane().add(HealthIncreaseIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, -1, -1));

        catNameLabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        catNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        catNameLabel.setText("Cat Name");
        getContentPane().add(catNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        toyLabel.setText("toyImage");
        getContentPane().add(toyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 510, 150, 110));

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, 30));

        bgBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cat Room", "Play Room", "Living Room", "Bed Room", "Park" }));
        bgBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bgBoxActionPerformed(evt);
            }
        });
        getContentPane().add(bgBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 200, 30));

        VolumDownButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/catroomsimulation/resources/volumeDown.png"))); // NOI18N
        VolumDownButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolumDownButtonActionPerformed(evt);
            }
        });
        getContentPane().add(VolumDownButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 690, 40, 30));

        FoodImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/catroomsimulation/resources/food_bowl.png"))); // NOI18N
        getContentPane().add(FoodImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 210, -1));

        MilkImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/catroomsimulation/resources/milk_bowl.png"))); // NOI18N
        getContentPane().add(MilkImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 180, -1));

        catLabel.setText("catImage");
        getContentPane().add(catLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 320, 340));

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

        HealthProgressBar.setValue(99);
        getContentPane().add(HealthProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 190, -1));

        HealthPanel1.setBackground(new java.awt.Color(222, 222, 222));

        HealthLabel1.setBackground(new java.awt.Color(0, 0, 0));
        HealthLabel1.setText("Health");
        HealthPanel1.add(HealthLabel1);

        getContentPane().add(HealthPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 210, 40));

        MoodProgressBar.setValue(99);
        MoodProgressBar.setString("50%");
        getContentPane().add(MoodProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 90, 190, -1));

        MoodPanel.setBackground(new java.awt.Color(229, 229, 229));
        MoodPanel.setInheritsPopupMenu(true);
        MoodPanel.setName(""); // NOI18N

        jLabel1.setText("Mood");
        MoodPanel.add(jLabel1);

        getContentPane().add(MoodPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 210, 40));
        MoodPanel.getAccessibleContext().setAccessibleName("");

        timeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/catroomsimulation/resources/dayMode.png"))); // NOI18N
        timeButton.setBorder(null);
        timeButton.setMaximumSize(new java.awt.Dimension(50, 50));
        timeButton.setMinimumSize(new java.awt.Dimension(50, 50));
        timeButton.setPreferredSize(new java.awt.Dimension(50, 50));
        timeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(timeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 680, -1, -1));
        getContentPane().add(MilkBowl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        patLabelImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/catroomsimulation/resources/pat.png"))); // NOI18N
        patLabelImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patLabelImgMouseClicked(evt);
            }
        });
        getContentPane().add(patLabelImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 480, -1, -1));

        toyLabelImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/catroomsimulation/resources/toy.png"))); // NOI18N
        toyLabelImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toyLabelImgMouseClicked(evt);
            }
        });
        getContentPane().add(toyLabelImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 530, -1, -1));

        milkLabelImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/catroomsimulation/resources/milk.png"))); // NOI18N
        milkLabelImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                milkLabelImgMouseClicked(evt);
            }
        });
        getContentPane().add(milkLabelImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 590, -1, -1));

        foodLabelImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/catroomsimulation/resources/food.png"))); // NOI18N
        foodLabelImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foodLabelImgMouseClicked(evt);
            }
        });
        getContentPane().add(foodLabelImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 640, -1, -1));

        bgLabel.setText("bgImage");
        bgLabel.setPreferredSize(new java.awt.Dimension(500, 750));
        bgLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bgLabelMouseClicked(evt);
            }
        });
        getContentPane().add(bgLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void bgBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bgBoxActionPerformed
        String selectedPlace = bgBox.getSelectedItem().toString();
        bg = factory.createBackground(time);
        bgImg = factory.getBackground(selectedPlace, bg);              
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

    private void timeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeButtonActionPerformed
        if(time == "Night"){
            timeButton.setIcon(new ImageIcon(getClass().getResource("resources/dayMode.png")));
            time = "Day";
        }else{
            timeButton.setIcon(new ImageIcon(getClass().getResource("resources/nightMode.png")));
            time = "Night";
        } 
                
        String selectedPlace = bgBox.getSelectedItem().toString();
        bg = factory.createBackground(time);
        bgImg = factory.getBackground(selectedPlace, bg);              
        bgLabel.setIcon(bgImg);
    }//GEN-LAST:event_timeButtonActionPerformed

    private void patLabelImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patLabelImgMouseClicked
        toyLabel.setIcon(null);
        int val = 2;
        MoodDecorator mooddecorator = new MoodDecorator(new PatMood(new MoodProgress(MoodProgressBar)));
        mooddecorator.setMood(val);
        System.out.println("Play clicked - increase Mood by 2 pts");
    }//GEN-LAST:event_patLabelImgMouseClicked

    private void toyLabelImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toyLabelImgMouseClicked
        int val = 3;
        MoodDecorator mooddecorator = new MoodDecorator(new PlayMood(new MoodProgress(MoodProgressBar)));
        mooddecorator.setMood(val);
        System.out.println("Play clicked - increase Mood by 3 pts");
        toyLabel.setIcon(new ImageIcon(getClass().getResource("resources/mouse.gif")));
    }//GEN-LAST:event_toyLabelImgMouseClicked

    private void milkLabelImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_milkLabelImgMouseClicked
        toyLabel.setIcon(null);
        Health health = (new Milk(new HealthProgressIncrease(HealthProgressBar)));
        health.setHealth(2);
        labelImageVisibility(MilkImage);
    }//GEN-LAST:event_milkLabelImgMouseClicked

    private void bgLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bgLabelMouseClicked

    private void foodLabelImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foodLabelImgMouseClicked
        toyLabel.setIcon(null);
        Health health = new HealthDecorator(new Food(new HealthProgressIncrease(HealthProgressBar)));
        health.setHealth(5);
        labelImageVisibility(FoodImage);
        labelImageUpward(HealthIncreaseIcon);
    }//GEN-LAST:event_foodLabelImgMouseClicked


    public void labelImageVisibility(JLabel label) {
        label.setVisible(true); 
        // create a timer that will make the label invisible after 5 seconds
        int delay = 3000;  // delay in milliseconds
        ActionListener taskPerformer = new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent evt) {
            label.setVisible(false);  // make the label invisible
          }
        };
        new Timer(delay, taskPerformer).start();
        labelImageUpward(HealthIncreaseIcon);
    }
    
    public void labelImageUpward(JLabel label) {
        label.setVisible(true); 
        int delay = 50;  // delay between updates in milliseconds
        int distance = 5;  // distance to move the label per update
        int duration = 1000;  // total duration of the animation in milliseconds
        int steps = duration / delay;  // number of steps in the animation
        final int y = label.getY();  // starting y position of the label

        // create a timer that will update the position of the label at regular intervals
        ActionListener taskPerformer = new ActionListener() {
          int i = 0;  // counter for the number of updates
          int newY = y;
           public void actionPerformed(ActionEvent evt) {
                // update the y position of the label
                
                newY = newY - distance;
                label.setLocation(label.getX(), newY);  // set the new location of the label
                i++;  // increment the counter
                if (i >= steps) {  // if the desired number of updates has been reached
                  label.setVisible(false);  // make the label invisible
                  ((Timer)evt.getSource()).stop();  // stop the timer
                }
              }
        };
        new Timer(delay, taskPerformer).start();
    }
    
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
    public javax.swing.JLabel FoodImage;
    public javax.swing.JLabel HealthIncreaseIcon;
    public javax.swing.JLabel HealthLabel1;
    public javax.swing.JPanel HealthPanel1;
    public javax.swing.JProgressBar HealthProgressBar;
    public javax.swing.JLabel MilkBowl;
    public javax.swing.JLabel MilkImage;
    public javax.swing.JPanel MoodPanel;
    public javax.swing.JProgressBar MoodProgressBar;
    private javax.swing.JButton VolumDownButton;
    private javax.swing.JButton VolumUpButton;
    private javax.swing.JComboBox<String> bgBox;
    private javax.swing.JLabel bgLabel;
    public javax.swing.JLabel catLabel;
    public javax.swing.JLabel catNameLabel;
    private javax.swing.JButton exitButton;
    public javax.swing.JLabel foodLabelImg;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel milkLabelImg;
    private javax.swing.JComboBox<String> musicBox;
    private javax.swing.JButton musicButton;
    public javax.swing.JLabel patLabelImg;
    private javax.swing.JButton timeButton;
    public javax.swing.JLabel toyLabel;
    public javax.swing.JLabel toyLabelImg;
    // End of variables declaration//GEN-END:variables

}
