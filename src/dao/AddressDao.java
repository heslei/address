package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Address;

public class AddressDao {

	private EntityManager getEntityManager() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("model.Address");
		return emf.createEntityManager();
	}

	public void createAddress(Address address) {
		EntityManager entityManager = getEntityManager();

		try {
			entityManager.getTransaction().begin();
			entityManager.persist(address);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			entityManager.getTransaction().rollback();
		}

	}

}
