/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311taskplanner;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Brian Morehouse
 */
public class SearchView extends JPanel {
    private JLabel searchLabel;
    
    SearchView(){
        searchLabel = new JLabel("ADD SEARCH PANEL");
        add(searchLabel);
    }
    
}
