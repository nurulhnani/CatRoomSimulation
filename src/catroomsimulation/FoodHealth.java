package catroomsimulation;

import javax.swing.JProgressBar;


public class FoodHealth extends HealthDecorator{
    
    FoodHealth(Health health) {
        super(health);
    }
    
    @Override
    public JProgressBar setHealth() {
         return health.setHealth();
    }
    
    @Override
    public int addHealthValue(){
        return health.addHealthValue() + 10;
    }
}
