package catroomsimulation;
import javax.swing.JProgressBar;


public class MoodProgress extends Mood {
    
    public MoodProgress(JProgressBar MoodProgressBar) {
        this.MoodProgressBar = MoodProgressBar;
    }

    @Override
    public JProgressBar setMood(int val) {
        MoodProgressBar.setValue(MoodProgressBar.getValue()+ val);
        return this.MoodProgressBar;
    }      

}
