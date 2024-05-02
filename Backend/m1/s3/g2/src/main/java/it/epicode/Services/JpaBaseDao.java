package it.epicode.Services;


import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JpaBaseDao {
    protected static final Logger log = LoggerFactory.getLogger(JpaBaseDao.class);

    protected final EntityManager em = Persistence //
            .createEntityManagerFactory("JPA_Sample").createEntityManager();

}
