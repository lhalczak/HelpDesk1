package pl.halczak.user;


import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class UserDao {

    @PersistenceContext
    EntityManager entityManager;

    public User findById(long id) {
        return entityManager.find(User.class, id);
    }

    public List<User> findAll(){
        Query query = entityManager.createQuery("select u from User u");
        return query.getResultList();
    }

    public void saveUser (User user) {entityManager.persist(user);}

    public void update (User user) {entityManager.merge(user);}

    public void delete (User user) {entityManager.remove(entityManager.contains(user) ? user : entityManager.merge(user));}

}
