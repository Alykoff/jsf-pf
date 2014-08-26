package ru.cinimex.manager;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import ru.cinimex.model.Users;

/**
 *
 * @author galykov
 */
@ApplicationScoped
public class UsersManagerImpl implements Serializable {
    private transient static final Users[] users;
    static {
        Users[] usersLocal = new Users[]{
            new Users(1L, "name", "serch", "mosckov", "piter", 10, false),
            new Users(2L, "name2", "serch", "mosckov", "piter", 10, false),
            new Users(3L, "name3", "serch", "mosckov", "piter", 10, false),
            new Users(4L, "name4", "serch", "mosckov", "piter", 10, true),
            new Users(5L, "name42", "serch", "mosckov", "piter", 10, false),
            new Users(6L, "name23", "serch", "mosckov", "piter", 10, false),
            new Users(7L, "name234", "serch", "mosckov", "piter", 10, false),
            new Users(8L, "name324", "serch", "mosckov", "piter", 10, false),
            new Users(9L, "name43", "serch", "mosckov", "piter", 10, false),
            new Users(10L, "name34", "serch", "mosckov", "piter", 10, false),
            new Users(11L, "name34", "serch", "mosckov", "piter", 10, false),
            new Users(12L, "Vasya", "Larkup", null, "piter", 10, false),
            new Users(14L, "name3", "serch", "mosckov", "piter", 10, false),
            new Users(15L, "name3", "serch", "mosckov", "piter", 10, false),
            new Users(16L, "name", "serch", "mosckov", "piter", 10, false)
        };
        users = usersLocal;
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("monogoNoDB");
//        EntityManager em = emf.createEntityManager();
//        EntityTransaction tx = em.getTransaction();
//        tx.begin();
//        for (Users user : usersLocal) {
//            em.persist(null);
//        }
//        tx.commit();
//        em.close();
//        emf.close();
    }

    public List<Users> getAll() {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("monogoNoDB");
//        EntityManager em = emf.createEntityManager();
//        EntityTransaction tx = em.getTransaction();
//        return em.createNamedQuery("findAll", Users.class).getResultList();
        return Arrays.asList(users);
    }

}
