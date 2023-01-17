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
public class LightsOffState implements State {
    
    Background background;
    
    public LightsOffState(Background background) {
        this.background = background;

    }

    @Override
    public void clickButton() {
        background.setState(background.getLightsOnState());
    }

    @Override
    public String getFolder() {
        return "LightsOffBackground";
    }

    @Override
    public ImageIcon getIcon() {
        return new ImageIcon(getClass().getResource("resources/lightsOff.png"));
    }
    
}
