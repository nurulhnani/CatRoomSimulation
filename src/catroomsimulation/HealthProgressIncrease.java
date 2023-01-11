package catroomsimulation;

import javax.swing.JProgressBar;

public class HealthProgressIncrease extends Health{
    
    public HealthProgressIncrease(JProgressBar jpb) {
        pb = jpb;
    }
    
    @Override
    public JProgressBar setHealth() {
        pb.setValue(pb.getValue() + addHealthValue());
        return this.pb;
    }
    
    @Override
    public int addHealthValue() {
        return 1;
    }
}
