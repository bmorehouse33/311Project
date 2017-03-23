/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311taskplanner;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author Brian Morehouse
 */
public class MainPanelView extends JPanel{
    private MenuPanel menuPanel;
    private TaskView taskView;
    private AddTaskView addTaskView;
    private ContactView contactView;
    private AddContactView addContactView;
    private SearchView searchView;
    private Login login;
    
  MainPanelView()
    {
        super();
       setLayout(new BorderLayout());
       
       menuPanel = new MenuPanel();
       
       
       add(menuPanel, BorderLayout.NORTH);
      
    }
  public MenuPanel getMenuPanel() 
    {
        return menuPanel;
    }
  public void addLogin(Login login)
    {
        this.login= login;
        add(login);
        revalidate();
        repaint();
    }
    
    public void removeLogin()
    {
        if(this.login != null)
        {
            remove(this.login);
        }
    }
  
  public void addTaskPanel(TaskView taskView)
    {
        this.taskView= taskView;
        add(taskView, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    
    public void removeTaskPanel()
    {
        if(this.taskView != null)
        {
            remove(this.taskView);
        }
    }
    public void addAddTaskPanel(AddTaskView addTaskView)
    {
        this.addTaskView= addTaskView;
        add(addTaskView, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    
    public void removeAddTaskPanel()
    {
        if(this.addTaskView != null)
        {
            remove(this.addTaskView);
        }
    }
    public void addContactPanel(ContactView contactView)
    {
        this.contactView= contactView;
        add(contactView, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    
    public void removeContactPanel()
    {
        if(this.contactView != null)
        {
            remove(this.contactView);
        }
    }
    public void addAddContactPanel(AddContactView addContactView)
    {
        this.addContactView= addContactView;
        add(addContactView, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    
    public void removeAddContactPanel()
    {
        if(this.addContactView != null)
        {
            remove(this.addContactView);
        }
    }
    public void addSearchPanel(SearchView searchView)
    {
        this.searchView= searchView;
        add(searchView, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    
    public void removeSearchPanel()
    {
        if(this.searchView != null)
        {
            remove(this.searchView);
        }
    }
  
    
}
