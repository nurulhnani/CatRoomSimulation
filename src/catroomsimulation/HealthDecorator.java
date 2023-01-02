package catroomsimulation;

import javax.swing.JProgressBar;

public abstract class HealthDecorator extends Health{

    private int healthPoint = 0;
    
    JProgressBar pb;
    
    @Override
    public  void healthProgress() {
        increaseHealth(healthPoint);
    }
        
    public void increaseHealth(int value){
        pb.setValue(pb.getValue() + value);
    }

}
