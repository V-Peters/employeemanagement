package application.repository;

import application.entity.User;
import application.hibernate.HibernateManager;
import org.hibernate.Session;
import javax.persistence.Query;

public class LoginRepository {

  private Session session = HibernateManager.getSessionFactory().openSession();

  private void startSession() {
    session = HibernateManager.getSessionFactory().openSession();
    session.beginTransaction();
  }

  private void closeSession() {
    session.getTransaction().commit();
    session.close();
  }

  public User getUserByLogin(final String login) {
    this.startSession();
    Query query = session.createQuery("from User where username = :login");
    query.setParameter("login", login);

    return (User)query.getSingleResult();
  }

  public User getUserByUsername(String username) {
    this.startSession();
    Query query = session.createQuery("from User where username = :username");
    query.setParameter("username", username);
    User user = null;
    try {
      user = (User) query.getSingleResult();
    } catch (Exception e) {
      System.out.println("Dieser Username wurde nicht gefunden");
    }
    this.closeSession();
    return user;
  }
}
