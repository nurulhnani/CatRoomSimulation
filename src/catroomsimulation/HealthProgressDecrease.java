package catroomsimulation;

import javax.swing.JProgressBar;

public class HealthProgressDecrease extends Health{

    public HealthProgressDecrease(JProgressBar pb) {
        this.pb = pb;
    }
        
    @Override
    public JProgressBar setHealth() {
        HealthDecreaser dec = new HealthDecreaser(pb, addHealthValue());
        dec.execute();
        return this.pb;
    }
    
    @Override
    public int addHealthValue(){
        return 1;
    }
    
}
