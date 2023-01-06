package catroomsimulation;

import catroomsimulation.MoodDecorator;
import catroomsimulation.Mood;
import javax.swing.JProgressBar;

public class PatMood extends MoodDecorator {
    
    public PatMood(Mood mood) {
        super(mood);
    }  

    
    @Override
    public JProgressBar setMood(int val) {
        return mood.setMood(val);
    }

}
