package catroomsimulation;

import javax.swing.JProgressBar;

public class HealthProgressDecrease extends Health{

    public HealthProgressDecrease(JProgressBar pb) {
        this.pb = pb;
    }
        
    @Override
    public JProgressBar setHealth(int val) {
        HealthDecreaser dec = new HealthDecreaser(pb, val);
        dec.execute();
        return this.pb;
    }
    
}
