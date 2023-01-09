package catroomsimulation;

import javax.swing.JProgressBar;

public class HealthProgressIncrease extends Health{

    public HealthProgressIncrease(JProgressBar pb) {
        this.pb = pb;
    }
    
    @Override
    public JProgressBar setHealth(int val) {
        pb.setValue(pb.getValue() + val);
        return this.pb;
    }
    
    
}
