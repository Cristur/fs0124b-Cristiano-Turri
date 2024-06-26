package it.epicode.Dao;

import jakarta.persistence.EntityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JpaBaseDao {
    protected static final Logger log = LoggerFactory.getLogger(JpaBaseDao.class);

    protected final EntityManager em = Persistence
            .createEntityManagerFactory("GestioneEventi")
            .createEntityManager();
}
