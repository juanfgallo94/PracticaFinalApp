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
import model.TblAutomoviles;

/**
 *
 * @author user
 */
@Stateless
public class AutosDao implements AutosDaoLocal {
    @PersistenceContext
    private EntityManager em;


    @Override
    public void addAuto(TblAutomoviles Auto) {
        em.persist(Auto);
        
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public void editAuto(TblAutomoviles Auto) {
        em.merge(Auto);
    }

    @Override
    public void deleteAuto(String Placa) {
        em.remove(getAuto(Placa));
    }

    @Override
    public TblAutomoviles getAuto(String Placa) {
        return em.find(TblAutomoviles.class, Placa);
    }

    @Override
    public List<TblAutomoviles> getAllAuto() {
        return em.createNamedQuery("Auto.getAll").getResultList();
    }
}
