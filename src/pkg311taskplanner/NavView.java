/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311taskplanner;

import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Brian Morehouse
 */
public class NavView extends javax.swing.JFrame{
    
    NavModel navModel;
    MainPanelView mainPanelView;
    
    NavView(NavModel navModel) //Setting standards for Frame
    {
         super("Task and Assignment Planner");
        this.navModel = navModel;
        
        setSize(600,600);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        mainPanelView = new MainPanelView();
        add(mainPanelView);  
    }
    
    public void addTaskButtonListener(ActionListener al)
    {
        mainPanelView.getMenuPanel().getTasksButton().addActionListener(al);
    }
    public void addContactButtonListener(ActionListener al)
    {
        mainPanelView.getMenuPanel().getContactsButton().addActionListener(al);
    }
    public void addAddTaskButtonListener(ActionListener al)
    {
        mainPanelView.getMenuPanel().getAddTasksButton().addActionListener(al);
    }
    public void addAddContactsButtonListener(ActionListener al)
    {
        mainPanelView.getMenuPanel().getAddContactsButton().addActionListener(al);
    }
    public void addSearchButtonListener(ActionListener al)
    {
        mainPanelView.getMenuPanel().getSearchButton().addActionListener(al);
    }
    
    public void switchToTaskPanel(TaskView taskView)
    {
        mainPanelView.removeLogin();
        mainPanelView.removeAddTaskPanel();
        mainPanelView.removeContactPanel();
        mainPanelView.removeAddContactPanel();
        mainPanelView.removeSearchPanel();
        mainPanelView.addTaskPanel(taskView);
    }
    public void switchToContactPanel(ContactView contactView)
    {
        mainPanelView.removeLogin();
        mainPanelView.removeAddTaskPanel();
        mainPanelView.addContactPanel(contactView);
        mainPanelView.removeAddContactPanel();
        mainPanelView.removeSearchPanel();
        mainPanelView.removeTaskPanel();
    }
    public void switchToAddTaskPanel(AddTaskView addTaskView)
    {
        mainPanelView.removeLogin();
        mainPanelView.addAddTaskPanel(addTaskView);
        mainPanelView.removeContactPanel();
        mainPanelView.removeAddContactPanel();
        mainPanelView.removeSearchPanel();
        mainPanelView.removeTaskPanel();
    }
    public void switchToAddContactPanel(AddContactView addContactView)
    {
        mainPanelView.removeLogin();
        mainPanelView.removeAddTaskPanel();
        mainPanelView.removeContactPanel();
        mainPanelView.addAddContactPanel(addContactView);
        mainPanelView.removeSearchPanel();
        mainPanelView.removeTaskPanel();
    }
    public void switchToSearchPanel(SearchView searchView)
    {
        mainPanelView.removeLogin();
        mainPanelView.removeAddTaskPanel();
        mainPanelView.removeContactPanel();
        mainPanelView.removeAddContactPanel();
        mainPanelView.addSearchPanel(searchView);
        mainPanelView.removeTaskPanel();
    }
}
