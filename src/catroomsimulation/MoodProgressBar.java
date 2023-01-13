package catroomsimulation;

import java.util.concurrent.ExecutionException;
import javax.swing.JProgressBar;
import javax.swing.SwingWorker;

public class MoodProgressBar extends SwingWorker<Void, Void> {
    private JProgressBar MoodProgressBar;

    public MoodProgressBar(JProgressBar MoodProgressBar) {
        this.MoodProgressBar = MoodProgressBar;
    }
    
    @Override
    protected Void doInBackground() throws Exception {
      // Perform a time-consuming task
      while (MoodProgressBar.getValue() >= 0) {
          // Update the progress bar using the setProgress() method
          Mood mood = new MoodProgress(MoodProgressBar);
          mood.setMood();
//          int progress = MoodProgressBar.getValue() - 1;
//          MoodProgressBar.setValue(progress);
//          if (MoodProgressBar.getValue() >= 40)
//              StatementMood.setText("I'm happy - " + MoodProgressBar.getValue());
//          else if (MoodProgressBar.getValue() <= 40)
//              StatementMood.setText("I'm sad - " + MoodProgressBar.getValue());
          Thread.sleep(1000);          
          System.out.println("Mood is decreasing -- " + MoodProgressBar.getValue());
      }
      return null;
    }
    
    @Override
    protected void done() {
      try {
        // When the task is done, retrieve the result of the task
        get();
      } catch (InterruptedException | ExecutionException e) {
        e.printStackTrace();
      }
    }
    }
