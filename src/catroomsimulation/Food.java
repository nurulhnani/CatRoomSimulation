package catroomsimulation;

import javax.swing.JProgressBar;


public class Food extends HealthDecorator{
    
    Food(Health health) {
        super(health);
    }
    
    @Override
    public JProgressBar setHealth(int val) {
         return health.setHealth(val);
    }
}
