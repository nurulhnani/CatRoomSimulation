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
public class LightsOnState implements State{
    
    SimpleBackgroundFactory background;
    
    public LightsOnState(SimpleBackgroundFactory background) {
       this.background = background;
    }

    @Override
    public void clickButton() {
        background.setState(background.getLightsOffState());
    }

    @Override
    public String getFolder() {
        return "LightsOnBackground";
    }

    @Override
    public ImageIcon getIcon() {
        return new ImageIcon(getClass().getResource("resources/lightsOn.png"));
    }

    
}
