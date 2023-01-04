package catroomsimulation;
import javax.swing.JProgressBar;


public class MoodProgress extends Mood {
    
    public MoodProgress(JProgressBar MoodProgressBar) {
        this.MoodProgressBar = MoodProgressBar;
    }

    @Override
    public JProgressBar setMood() {
        MoodProgressBar.setValue(MoodProgressBar.getValue() - 1);
        return this.MoodProgressBar;
    }
    
    
        

}
