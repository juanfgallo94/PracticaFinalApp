/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.util.List;
import javax.ejb.Local;
import model.TblQueja;

/**
 *
 * @author dalejandro.higuita
 */
@Local
public interface QuejasDaoLocal {

    void addQueja(TblQueja Queja);

    void editQueja(TblQueja Queja);

    void deleteQueja(String Identificacion);

    TblQueja getQueja(String Identificacion);

    List<TblQueja> getAllQueja();
    
}
