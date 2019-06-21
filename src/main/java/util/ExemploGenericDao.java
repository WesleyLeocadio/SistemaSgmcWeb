/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import genericdao.impl.ClienteDaoImpl;
import genericdao.impl.ProdutoDaoImpl;
import genericdao.impl.ProdutoJDBCDao;
import genericdao.interfaces.IClienteDao;
import genericdao.interfaces.IProdutoDao;
import java.util.List;
import model.Usuario;
import model.Produto;

/**
 *
 * @author tanir
 */
public class ExemploGenericDao {
    
    public static void main(String[] args) {
        
        IClienteDao dao = new ClienteDaoImpl();
        
        
        Usuario c1 = new Usuario();
        c1.setNome("fulano");
        
        Usuario c2 = new Usuario();
        c2.setNome("beltrano");
        
        Usuario c3 = new Usuario();
        c3.setNome("ciclano");
        
        dao.save(c1);
        dao.save(c2);
        dao.save(c3);
        
        List<Usuario> clientes = dao.listAll();
        
        for (Usuario cliente : clientes) {
            System.out.println(cliente.getNome());  
        }
        
        c3.setNome("alguem");
        dao.save(c3);
        
        clientes = dao.listAll();
        
        for (Usuario cliente : clientes) {
            System.out.println(cliente.getNome());  
        }
        
        dao.delete(c1);
        dao.delete(c2);
        dao.delete(c3);
        
//        If (VARIAVEL DE AMBIENTE ){
//        QUAL BANCO ESTOU USANDO
//                {
//                    IProdutoDao pdao = new ProdutoJDBCDao(); 
//                }
//                
//                    IProdutoDao pdao = new ProdutoDaoImpl();
//    } 
         
        IProdutoDao pdao = new ProdutoJDBCDao();     
        Produto p = new Produto();
        p.setPreco(3.4);
        
        pdao.save(p);
        
    }
    
}
