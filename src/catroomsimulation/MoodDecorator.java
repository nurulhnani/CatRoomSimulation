package catroomsimulation;

import javax.swing.JProgressBar;

public class MoodDecorator extends Mood {
    Mood mood;

    public MoodDecorator(Mood mood) {
        this.mood = mood;
    }
    
    @Override
    public JProgressBar setMood(int val) {
        return mood.setMood(val);
    }
     
}
