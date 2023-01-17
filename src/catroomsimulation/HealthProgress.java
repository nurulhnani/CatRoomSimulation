package catroomsimulation;

import javax.swing.JProgressBar;

public class HealthProgress extends Health{

    public HealthProgress(JProgressBar pb) {
        this.pb = pb;
    }
        
    @Override
    public JProgressBar setHealth() {
        SwingWork dec = new SwingWork(pb, addHealthValue());
        dec.execute();
        return this.pb;
    }
    
    @Override
    public int addHealthValue(){
        return 1;
    }
    
}
