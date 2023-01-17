package catroomsimulation;
import javax.swing.ImageIcon;

public class BackgroundCatRoom extends Background {
    
    @Override
    public ImageIcon getBackground(){
        return new ImageIcon(getClass().getResource("resources/" + getFolder() +"/catroom.jpg"));
    }

}
