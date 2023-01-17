package catroomsimulation;

import javax.swing.ImageIcon;

public class BackgroundPlayRoom extends Background{

    @Override
    public ImageIcon getBackground() {
        return new ImageIcon(getClass().getResource("resources/" + getFolder() + "/playroom.jpg"));
    }

}
