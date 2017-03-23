/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311taskplanner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Brian Morehouse
 */
public class NavController {
    
    private NavView navView;
    private NavModel navModel;
    private TaskView taskView;
    private AddTaskView addTaskView;
    private ContactView contactView;
    private AddContactView addContactView;
    private SearchView searchView;
    
    
        NavController(NavView navView, NavModel navModel)
    {
        this.navModel = navModel;
        this.navView = navView;
        taskView = new TaskView();
        addTaskView = new AddTaskView();
        contactView = new ContactView();
        addContactView = new AddContactView();
        searchView = new SearchView();
        
        navView.addTaskButtonListener(new TaskButtonListener());
        navView.addContactButtonListener(new ContactButtonListener());
        navView.addAddTaskButtonListener(new AddTaskButtonListener());
        navView.addAddContactsButtonListener(new AddContactButtonListener());
        navView.addSearchButtonListener(new SearchButtonListener());
    }
        
        class TaskButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        {     
            navView.switchToTaskPanel(taskView);
        }
    }
        class ContactButtonListener implements ActionListener{
            public void actionPerformed(ActionEvent e)
            {
                navView.switchToContactPanel(contactView);
            }
        }
        class AddTaskButtonListener implements ActionListener{
            public void actionPerformed(ActionEvent e)
            {
                navView.switchToAddTaskPanel(addTaskView);
            }
        }
        class AddContactButtonListener implements ActionListener{
            public void actionPerformed(ActionEvent e)
            {
                navView.switchToAddContactPanel(addContactView);
            }
        }
        class SearchButtonListener implements ActionListener{
            public void actionPerformed(ActionEvent e)
            {
                navView.switchToSearchPanel(searchView);
            }
        }
        
 
        

    
    
}
