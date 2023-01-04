package catroomsimulation;

import javax.swing.JProgressBar;

public class Play extends MoodDecorator {
    
    public Play(Mood mood, JProgressBar MoodProgressBar) {
        super(mood);
        mood.setMoodProgressBar(MoodProgressBar);
    }
    
    @Override
    public JProgressBar setMood() {
        return mood.increaseMood(3);
    }


}
