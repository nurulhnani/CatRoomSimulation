
package catroomsimulation;

import javax.swing.ImageIcon;

public abstract class Background {
    State lightsOnState;
    State lightsOffState;
    
    State state;
    
    public Background() {
        lightsOnState = new LightsOnState(this);
        lightsOffState = new LightsOffState(this);
        state = lightsOnState;
    }
    
    abstract ImageIcon getBackground();
    
    public void clickButton() {
        state.clickButton();
    }
    
    public String getFolder() {
        return state.getFolder();
    }
    
    public ImageIcon getIcon() {
        return state.getIcon();
    }
    
    public void setState(State state){
        this.state = state;
    }
    
    public State getState() {
        return state;
    }
    
    public State getLightsOnState() {
        return lightsOnState;
    }
    
    public State getLightsOffState() {
        return lightsOffState;
    }
    
}
