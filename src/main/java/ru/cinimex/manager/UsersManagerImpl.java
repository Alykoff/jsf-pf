package ru.cinimex.manager;

import java.util.Arrays;
import java.util.List;
import javax.inject.Singleton;
import ru.cinimex.model.Users;

/**
 *
 * @author galykov
 */
@Singleton
public class UsersManagerImpl {
    public List<Users> getAll() {
        Users[] users = new Users[] {
            new Users(1L, "name", "serch", "mosckov", "piter", false),
            new Users(2L, "name2", "serch", "mosckov", "piter", false),
            new Users(3L, "name3", "serch", "mosckov", "piter", false),
            new Users(4L, "name4", "serch", "mosckov", "piter", true),
            new Users(5L, "name42", "serch", "mosckov", "piter", false),
            new Users(6L, "name23", "serch", "mosckov", "piter", false),
            new Users(7L, "name234", "serch", "mosckov", "piter", false),
            new Users(8L, "name324", "serch", "mosckov", "piter", false),
            new Users(9L, "name43", "serch", "mosckov", "piter", false),
            new Users(10L, "name34", "serch", "mosckov", "piter", false),
            new Users(11L, "name34", "serch", "mosckov", "piter", false),
            new Users(12L, "Vasya", "Larkup", null, "piter", false),
            new Users(14L, "name3", "serch", "mosckov", "piter", false),
            new Users(15L, "name3", "serch", "mosckov", "piter", false),
            new Users(16L, "name", "serch", "mosckov", "piter", false)
        };
        List<Users> list = Arrays.asList(users);
        return list;
    }
    
}
