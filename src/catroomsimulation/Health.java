package catroomsimulation;

import javax.swing.JLabel;
import javax.swing.JProgressBar;

public abstract class Health {

    JProgressBar pb;
    
    public abstract JProgressBar setHealth();
    
    public abstract int addHealthValue();
    
}
