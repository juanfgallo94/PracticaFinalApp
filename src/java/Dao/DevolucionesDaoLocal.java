/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.util.List;
import javax.ejb.Local;
import model.TblDevoluciones;

/**
 *
 * @author dalejandro.higuita
 */
@Local
public interface DevolucionesDaoLocal {

    void addDevolucion(TblDevoluciones devolucion);

    void editDevolucion(TblDevoluciones devolucion);

    void deleteDevolucion(String id);

    TblDevoluciones getDevolucion(String id);

    List<TblDevoluciones> getAllDevolucion();
    
}
