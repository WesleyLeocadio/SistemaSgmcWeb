/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericdao.interfaces;

import java.io.Serializable;
import model.Produto;

/**
 *
 * @author tanir
 */
public interface IProdutoDao extends IGenericDao<Produto, Integer>{
    
    void selecionaProdudtoVencido(Produto p);
    
}
