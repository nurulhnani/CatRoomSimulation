package catroomsimulation;

import javax.swing.JProgressBar;

public class MilkHealth extends HealthDecorator{
    
    MilkHealth(Health health) {
        super(health);
    }
    
    @Override
    public JProgressBar setHealth() {
        return health.setHealth();
    }
    
    @Override
    public int addHealthValue(){
        return health.addHealthValue() + 5;
    }
}
