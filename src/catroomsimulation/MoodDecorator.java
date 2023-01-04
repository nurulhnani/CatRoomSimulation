package catroomsimulation;

import javax.swing.JProgressBar;

public abstract class MoodDecorator extends Mood {
    protected Mood mood;

    public MoodDecorator(Mood mood) {
        this.mood = mood;
    }
     
}
