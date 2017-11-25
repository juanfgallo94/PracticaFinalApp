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
import model.TblDevoluciones;

/**
 *
 * @author dalejandro.higuita
 */
@Stateless
public class DevolucionesDao implements DevolucionesDaoLocal {
@PersistenceContext
    private EntityManager em;
    @Override
    public void addDevolucion(TblDevoluciones devolucion) {
        em.persist(devolucion);
    
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public void editDevolucion(TblDevoluciones devolucion) {
        em.merge(devolucion);
    }

    @Override
    public void deleteDevolucion(String id) {
        em.remove(getDevolucion(id));
    }

    @Override
    public TblDevoluciones getDevolucion(String id) {
        return em.find(TblDevoluciones.class, id);
    }

    @Override
    public List<TblDevoluciones> getAllDevolucion() {
        return em.createNamedQuery("Devoluciones.getAll").getResultList();
    }
}
