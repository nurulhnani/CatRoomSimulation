package catroomsimulation;

import javax.swing.JProgressBar;

public class HealthDecreaser extends Health {

    private JProgressBar hpb;

    public HealthDecreaser(JProgressBar HealthProgressBar) {
        this.hpb = HealthProgressBar;
    }
    
    @Override
    public void healthProgress() {
        ProgressBarDecreaser pb = new ProgressBarDecreaser(hpb);
        pb.execute();
    }
     
}
