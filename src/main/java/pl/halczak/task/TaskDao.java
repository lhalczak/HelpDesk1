package pl.halczak.task;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class TaskDao {

    @PersistenceContext
    EntityManager entityManager;

    public Task findById (long id) { return entityManager.find(Task.class, id); }

    public List<Task> findAll() {
        Query query = entityManager.createQuery("select t from Task t");
        return query.getResultList();
    }

    public void saveTask (Task task) { entityManager.persist(task); }

    public void update(Task task ) { entityManager.merge(task); }

    public void delete(Task task) {
        entityManager.remove(entityManager.contains(task) ? task : entityManager.merge(task));
    }



}
