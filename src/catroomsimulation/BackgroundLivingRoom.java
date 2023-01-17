package catroomsimulation;

import javax.swing.ImageIcon;

public class BackgroundLivingRoom extends Background {

    @Override
    public ImageIcon getBackground() {
        return new ImageIcon(getClass().getResource("resources/" + getFolder() + "/livingroom.jpg"));
    }

}
