package catroomsimulation;

import catroomsimulation.MoodDecorator;
import catroomsimulation.Mood;
import javax.swing.JProgressBar;

public class PatMood extends MoodDecorator{
    
    public PatMood(Mood mood, JProgressBar MoodProgressBar) {
        super(mood);
        mood.setMoodProgressBar(MoodProgressBar);
    }
    
    @Override
    public JProgressBar setMood() {
        return mood.increaseMood(2);
    }

}
