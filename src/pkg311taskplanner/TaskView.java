/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311taskplanner;

import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Brian Morehouse
 */
public class TaskView extends JPanel{
    private JLabel taskLabel;
    
    TaskView(){
        taskLabel = new JLabel("TASK PANEL");
        add(taskLabel);
    }
    
    
}
