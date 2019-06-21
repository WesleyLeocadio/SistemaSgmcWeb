/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericdao.impl;

import genericdao.interfaces.IProdutoDao;
import java.io.Serializable;
import model.Produto;

/**
 *
 * @author tanir
 */
public class ProdutoDaoImpl extends GenericDaoImpl<Produto, Integer> implements IProdutoDao{

    public ProdutoDaoImpl() {
        super (Produto.class);
    }

    @Override
    public void selecionaProdudtoVencido(Produto p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}
