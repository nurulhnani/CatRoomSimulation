package catroomsimulation;

import javax.swing.JProgressBar;

public class PlayMood extends MoodDecorator {
    
    public PlayMood(Mood mood) {
        super(mood);
    }  

    @Override
    public JProgressBar setMood() {
        mood.setVal(2);
        return mood.setMood();
    }
    
    
}
