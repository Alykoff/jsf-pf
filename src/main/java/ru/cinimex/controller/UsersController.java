package ru.cinimex.controller;

import java.io.Serializable;
import java.util.List;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import ru.cinimex.manager.UsersManagerImpl;
import ru.cinimex.model.Users;

/**
 *
 * @author galykov
 */

@Named("usersController")
@ViewScoped
public class UsersController implements Serializable {  
    @Inject
    protected UsersManagerImpl usersManager;
    
    private Users selectedUser;
    private List<Users> allUsers;
    private Boolean edit = false;
//    @PostConstruct
//    public void init() {
//        System.out.println("Post contruct");
//    }
    
    public List<Users> getAllUsers() {
        if (allUsers == null) {
            this.allUsers = usersManager.getAll();
        }
        return allUsers;
    }
    
    public void setAllUsers(List<Users> all) {
        this.allUsers = all;
    }
    
    public void updateAllUsers() {
        this.allUsers = usersManager.getAll();
    }
    
    public void saveUser() {
        if (selectedUser == null) {
            return;
        }
        System.out.println("Сохраненно!!! " + selectedUser);
        usersManager.save(selectedUser);
    }
    
    public Users getSelectedUser() {
        System.out.println("get selectedUser: " + selectedUser);
        return selectedUser;
    }

    public void setSelectedUser(Users selectedUser) {
        System.out.println("set selectedUser: " + selectedUser);
        this.selectedUser = selectedUser;
    }
    
    public void setEdit(Boolean isEdit) {
        this.edit = isEdit;
    }
    
    public Boolean getEdit() {
        return this.edit;
    }
    
}
