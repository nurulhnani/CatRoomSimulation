/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catroomsimulation;

import javax.swing.ImageIcon;

/**
 *
 * @author ndhsn
 */
public class NightBackground implements Background {

    @Override
    public ImageIcon CatRoom() {
        return new ImageIcon(getClass().getResource("resources/catroomNight.jpg"));
    }

    @Override
    public ImageIcon BedRoom() {
        return new ImageIcon(getClass().getResource("resources/bedroomNight.jpg"));
    }

    @Override
    public ImageIcon Park() {
        return new ImageIcon(getClass().getResource("resources/parkNight.jpg"));
    }

    @Override
    public ImageIcon LivingRoom() {
        return new ImageIcon(getClass().getResource("resources/livingroomNight.jpg"));
    }

    @Override
    public ImageIcon PlayRoom() {
        return new ImageIcon(getClass().getResource("resources/playroomNight.jpg"));
    }
    
}
