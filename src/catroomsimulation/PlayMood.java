package catroomsimulation;

import javax.swing.JProgressBar;

public class PlayMood extends MoodDecorator {
    
    public PlayMood(Mood mood) {
        super(mood);
    }  

    
    @Override
    public JProgressBar setMood(int val) {
        return mood.setMood(val);
    }

}
