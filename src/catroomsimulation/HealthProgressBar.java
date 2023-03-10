package catroomsimulation;

import javax.swing.JProgressBar;

public class HealthProgressBar extends Health{

    public HealthProgressBar(JProgressBar pb) {
        this.pb = pb;
    }
        
    @Override
    public JProgressBar setHealth() {
        pb.setValue(pb.getValue() + addHealthValue());
        return this.pb;
    }
    
    @Override
    public int addHealthValue(){
        return 1;
    }
    
}