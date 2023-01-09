package catroomsimulation;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class DefaultRoomSetting {

    public DefaultRoomSetting() {
    }

    public void setBackground(JLabel bgLabel, JLabel toyLabel){
        bgLabel.setText("");
        toyLabel.setText("");
        bgLabel.setIcon(new ImageIcon(getClass().getResource("resources/catroom.jpg")));
    }
    
    public void setHealthProgressBar(JProgressBar HealthProgressBar){
        Health health = new HealthProgressDecrease(HealthProgressBar);
        health.setHealth(1);     
    }
    
    public void setMoodProgressBar(JProgressBar MoodProgressBar){
        MoodProgressBar mood = new MoodProgressBar(MoodProgressBar);
        mood.execute();
    }
    
}
