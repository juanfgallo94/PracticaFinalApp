/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.TblQueja;

/**
 *
 * @author dalejandro.higuita
 */
@Stateless
public class QuejasDao implements QuejasDaoLocal {
    @PersistenceContext
    private EntityManager em;
    @Override
    public void addQueja(TblQueja Queja) {
        em.persist(Queja);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @Override
    public void editQueja(TblQueja Queja) {
        em.merge(Queja);
    }

    @Override
    public void deleteQueja(String Identificacion) {
        em.remove(getQueja(Identificacion));
    }

    @Override
    public TblQueja getQueja(String Identificacion) {
        return em.find(TblQueja.class, Identificacion);
    }

    @Override
    public List<TblQueja> getAllQueja() {
        return em.createNamedQuery("Quejas.getAll").getResultList();
    }
}
