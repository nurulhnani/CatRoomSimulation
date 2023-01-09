package catroomsimulation;

import javax.swing.JProgressBar;

public class Milk extends HealthDecorator{
    
    Milk(Health health) {
        super(health);
    }
    
    @Override
    public JProgressBar setHealth(int val) {
        return health.setHealth(val);
    }
}
