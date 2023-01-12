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
public interface State {
    public void clickButton();
    public String getFolder();
    public ImageIcon getIcon();
}
