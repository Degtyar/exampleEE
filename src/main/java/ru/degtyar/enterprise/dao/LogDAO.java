package ru.degtyar.enterprise.dao;

import ru.degtyar.enterprise.entity.Log;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Remote
@Stateless
public class LogDAO extends AbstractDAO {

    public void start() {
        em.persist(new Log("APP STARTED"));
    }

    public void stopped() {
        em.persist(new Log("APP STOPPED"));
    }

    public void logBD(String massage) {
        Log log = new Log();
        log.setMessage(massage);
        em.merge(log);
    }
    public void testRollbackRTE() {
        em.persist(new Log("testRollbackRTE"));
        throw new RuntimeException("testRollbackRTE");
    }

    public void testRollbackCatchRTE() {
        em.persist(new Log("testRollbackCatchRTE"));
        try {
            throw new RuntimeException("testRollbackCatchRTE");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}