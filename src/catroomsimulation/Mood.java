package catroomsimulation;

import javax.swing.JProgressBar;

public abstract class Mood {
    JProgressBar MoodProgressBar;
    int valMood = -1;
    
    public abstract JProgressBar setMood();
    
    public int valMood(){
        return this.valMood;
    }
    
    public void setVal(int val){
        this.valMood += val;
    }
    
    

}
