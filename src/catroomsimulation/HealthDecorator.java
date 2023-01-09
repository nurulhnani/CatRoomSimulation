package catroomsimulation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.Timer;

public class HealthDecorator extends Health{

    Health health;
    
    public HealthDecorator(Health health) {
        this.health = health;
    }
    
    @Override
    public JProgressBar setHealth(int val){
        return health.setHealth(val);
    }
    
}
