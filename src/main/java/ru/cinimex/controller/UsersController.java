package ru.cinimex.controller;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import ru.cinimex.manager.UsersManagerImpl;
import ru.cinimex.model.Users;

/**
 *
 * @author galykov
 */

@RequestScoped
@Named("usersController")
public class UsersController implements Serializable {  
    @Inject
    protected UsersManagerImpl usersManager;
    
    private Users selectedUser;
    
    @PostConstruct
    public void init() {
        System.out.println("Post contruct");
    }
    
    public List<Users> users() {
        return usersManager.getAll();
    }

    public void saveUser() {
        
    }
    
    public Users getSelectedUser() {
        System.out.println("get selectedUser: " + selectedUser);
        return selectedUser;
    }

    public void setSelectedUser(Users selectedUser) {
        System.out.println("set selectedUser: " + selectedUser);
        this.selectedUser = selectedUser;
    }
    
}
