package catroomsimulation;
import javax.swing.*;
import java.awt.*;

public class MainPage extends javax.swing.JFrame {
    
    public MainPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        catRadioGroup = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        catImgLabel = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        blackCatRadio = new javax.swing.JRadioButton();
        whiteCatRadio = new javax.swing.JRadioButton();
        catNameField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(300, 520));

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setPreferredSize(new java.awt.Dimension(305, 520));

        catImgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/catroomsimulation/resources/mainPage.png"))); // NOI18N

        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        blackCatRadio.setBackground(new java.awt.Color(255, 255, 255));
        catRadioGroup.add(blackCatRadio);
        blackCatRadio.setText("Black Cat");

        whiteCatRadio.setBackground(new java.awt.Color(255, 255, 255));
        catRadioGroup.add(whiteCatRadio);
        whiteCatRadio.setText("White Cat");

        catNameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        catNameField.setText("Kitty");

        org.jdesktop.layout.GroupLayout mainPanelLayout = new org.jdesktop.layout.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(mainPanelLayout.createSequentialGroup()
                .add(mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(mainPanelLayout.createSequentialGroup()
                        .add(9, 9, 9)
                        .add(mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                            .add(startButton)
                            .add(catNameField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 151, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(catImgLabel)))
                    .add(mainPanelLayout.createSequentialGroup()
                        .add(64, 64, 64)
                        .add(blackCatRadio)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(whiteCatRadio)))
                .add(28, 28, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(mainPanelLayout.createSequentialGroup()
                .add(catImgLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(catNameField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(blackCatRadio)
                    .add(whiteCatRadio))
                .add(18, 18, 18)
                .add(startButton)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(mainPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(mainPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        blackCatRadio.setActionCommand("blackCat");
        whiteCatRadio.setActionCommand("whiteCat");
        
        //initiliaze background factory
        SimpleBackgroundFactory factory = new SimpleBackgroundFactory();
        
        CatRoom indexFrame = new CatRoom(catNameField.getText(), catRadioGroup.getSelection().getActionCommand(), factory);
        this.setVisible(false);
        indexFrame.setVisible(true);
    }//GEN-LAST:event_startButtonActionPerformed

 
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {             
                new MainPage().setVisible(true);   
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton blackCatRadio;
    private javax.swing.JLabel catImgLabel;
    private javax.swing.JTextField catNameField;
    private javax.swing.ButtonGroup catRadioGroup;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton startButton;
    private javax.swing.JRadioButton whiteCatRadio;
    // End of variables declaration//GEN-END:variables

}
