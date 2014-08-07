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

@Named("usersController")
@RequestScoped
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

    public Users getSelectedUser() {
        return selectedUser;
    }

    public void setSelectedUser(Users selectedUser) {
        this.selectedUser = selectedUser;
    }
    
}
