/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311taskplanner;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Brian Morehouse
 */
public class MenuPanel extends JPanel{

    /**
     * @return the tasksButton
     */
    
    private JButton tasksButton;
    private JButton contactsButton;
    private JButton addTasksButton;
    private JButton addContactsButton;
    private JButton searchButton;
    
    
    MenuPanel(){
        super();
       
      
       addTasksButton = new JButton("Add Tasks");
       addContactsButton = new JButton("Add Contacts");       
       tasksButton = new JButton("Tasks");
       contactsButton = new JButton("Contacts");
       searchButton = new JButton("Search");

       add(tasksButton);
       add(contactsButton);
       add(addTasksButton);
       add(addContactsButton);
       add(searchButton);
       
    }
    public JButton getTasksButton() {
        return tasksButton;
    }

    /**
     * @param tasksButton the tasksButton to set
     */
    public void setTasksButton(JButton tasksButton) {
        this.tasksButton = tasksButton;
    }

    /**
     * @return the contactsButton
     */
    public JButton getContactsButton() {
        return contactsButton;
    }

    /**
     * @param contactsButton the contactsButton to set
     */
    public void setContactsButton(JButton contactsButton) {
        this.contactsButton = contactsButton;
    }

    /**
     * @return the addTasksButton
     */
    public JButton getAddTasksButton() {
        return addTasksButton;
    }

    /**
     * @param addTasksButton the addTasksButton to set
     */
    public void setAddTasksButton(JButton addTasksButton) {
        this.addTasksButton = addTasksButton;
    }

    /**
     * @return the addContactsButton
     */
    public JButton getAddContactsButton() {
        return addContactsButton;
    }

    /**
     * @param addContactsButton the addContactsButton to set
     */
    public void setAddContactsButton(JButton addContactsButton) {
        this.addContactsButton = addContactsButton;
    }

    /**
     * @return the searchButton
     */
    public JButton getSearchButton() {
        return searchButton;
    }

    /**
     * @param searchButton the searchButton to set
     */
    public void setSearchButton(JButton searchButton) {
        this.searchButton = searchButton;
    }
}
