package catroomsimulation;
import javax.swing.JProgressBar;


public class MoodProgress extends Mood {
    int val;
    public MoodProgress(JProgressBar MoodProgressBar) {
        this.MoodProgressBar = MoodProgressBar;        
    }

    @Override
    public JProgressBar setMood() {
        MoodProgressBar.setValue(MoodProgressBar.getValue()+ this.valMood);
        return this.MoodProgressBar;
    }      

    

}
