package catroomsimulation;

import javax.swing.JProgressBar;

public abstract class Mood {
    JProgressBar MoodProgressBar;
    int valMood = -1;
    String str = "";
    
    public abstract JProgressBar setMood();
    
    public int valMood(){
        return this.valMood;
    }
    
    public void setVal(int val){
        this.valMood += val;
    }
    
    public int getVal(){
        return this.valMood;
    }
    
    public void setStr(String val){
        this.str += val;
    }

}
