/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.util.List;
import javax.ejb.Local;
import model.TblAutomoviles;

/**
 *
 * @author user
 */
@Local
public interface AutosDaoLocal {

    void addAuto(TblAutomoviles Auto);

    void editAuto(TblAutomoviles Auto);

    void deleteAuto(String Placa);

    TblAutomoviles getAuto(String Placa);

    List<TblAutomoviles> getAllAuto();
    
}
