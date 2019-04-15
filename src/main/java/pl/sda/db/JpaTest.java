package pl.sda.db;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaTest {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Person person = new Person("Jan", "Kowalski", 45, 3500,"Bydgoszcz", "Kwiatowa 3", "85-300");

        entityManager.getTransaction().begin();
        entityManager.persist(person);
        entityManager.getTransaction().commit();

        entityManager.getTransaction().begin();
        //odwoluje sie do kalasy a nie do obiektu ideks 1
        Person person1=entityManager.find(Person.class,1);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
