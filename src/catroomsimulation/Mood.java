package catroomsimulation;

import javax.swing.JProgressBar;

public abstract class Mood {
    JProgressBar MoodProgressBar;
    
            
    public void setMoodProgressBar(JProgressBar MoodProgressBar) {
        this.MoodProgressBar = MoodProgressBar;
    }
    
    public JProgressBar increaseMood(int value) {
       MoodProgressBar.setValue(MoodProgressBar.getValue() + value);
       return this.MoodProgressBar; 
    }
    
    public abstract JProgressBar setMood();

}
