/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;
import java.util.List;
import model.Usuario;
import model.Endereco;
import model.Orcamento;
import model.Produto;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Exemplo {

    public static void main(String[] args) {

        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();

           
        
        //Exemplo1
//       Endereco endereco1 = new Endereco();
//
//        endereco1.setRua("Rua dos Beltrano, 60");
//        endereco1.setCidade("Macaiba");
//        sessao.save(endereco1);
        //Exemplo 2
//        Usuario cliente1 = new Usuario();
//        cliente1.setNome("Beltrano");
//        cliente1.setCpf("1200000");
//        cliente1.setAdmin(true);
////
//        Endereco endereco1 = new Endereco();
//        endereco1.setRua("Rua dos Beltrano, 60");
//        endereco1.setCidade("Macaiba");
////
//        endereco1.setCliente(cliente1);
//        cliente1.setEndereco(endereco1);
////
//        sessao.save(endereco1);
//        sessao.save(cliente1);
//        transacao.commit();

        //Exemplo 3
//        Cliente cliente1 = new Cliente();
//        cliente1.setNome("Beltrano");
//
//        Endereco endereco1 = new Endereco();
//        endereco1.setRua("Rua dos Beltrano, 60");
//        endereco1.setCidade("Macaiba");
//
//        endereco1.setCliente(cliente1);
//        cliente1.setEndereco(endereco1);
//
//        sessao.save(cliente1);
        //Exemplo 4
       
//
//        Endereco endereco1 = new Endereco();
//        endereco1.setRua("Rua dos Beltrano, 60");
//        endereco1.setCidade("Macaiba");
//
//        endereco1.setCliente(cliente1);
//        cliente1.setEndereco(endereco1);
//
//        sessao.save(endereco1);
//        sessao.save(cliente1);
        //Exemplo 5
//        Cliente cliente1 = new Cliente();
//        cliente1.setNome("Beltrano");
//
//        Endereco endereco1 = new Endereco();
//        endereco1.setRua("Rua dos Beltrano, 60");
//        endereco1.setCidade("Macaiba");
//
//        endereco1.setCliente(cliente1);
//        cliente1.setEndereco(endereco1);
//
//        sessao.save(endereco1);
//        sessao.save(cliente1);
//
//        sessao.delete(cliente1);
        //Exemplo 6
        //Cliente cliente1 = new Cliente();
        //cliente1.setNome("Beltrano");
        //Endereco endereco1 = new Endereco();
        //endereco1.setRua("Rua dos Beltrano, 60");
        //endereco1.setCidade("Macaiba");
        //endereco1.setCliente(cliente1);
        //cliente1.setEndereco(endereco1);
        //sessao.save(cliente1);
        //transacao.commit();
        //transacao.begin();
        //cliente1.setEndereco(null);
        //sessao.update(cliente1);
        //Exemplo 7
//        Cliente cliente1 = new Cliente();
//        cliente1.setNome("Beltrano");
//
//        sessao.save(cliente1);
//
//        Pedido pedido1 = new Pedido();
//        pedido1.setDescricao("pedido1");
//        Pedido pedido2 = new Pedido();
//        pedido2.setDescricao("pedido2");
//        Pedido pedido3 = new Pedido();
//        pedido3.setDescricao("pedido3");
//
//        List<Pedido> pedidos = new ArrayList<>();
//        pedidos.add(pedido1);
//        pedidos.add(pedido2);
//        pedidos.add(pedido3);
//
//        cliente1.setPedidos(pedidos);
//
//        sessao.update(cliente1);
        //Exemplo 8
//        Cliente cliente1 = new Cliente();
//        cliente1.setNome("Beltrano");
//
//        sessao.save(cliente1);
//
//        Produto produto1 = new Produto();
//        produto1.setDescricao("produto1");
//        Produto produto2 = new Produto();
//        produto2.setDescricao("produto2");
//        Produto produto3 = new Produto();
//        produto3.setDescricao("produto3");
//        
//        sessao.save(produto1);
//        sessao.save(produto2);
//        sessao.save(produto3);
//        
//        Pedido pedido1 = new Pedido();
//        pedido1.setDescricao("pedido1");
//        pedido1.setCliente(cliente1);
//
//        List<Produto> produtos1 = new ArrayList<>();
//
//        produtos1.add(produto1);
//        produtos1.add(produto2);
//        produtos1.add(produto3);
//
//        pedido1.setProduto(produtos1);
//        
//        List<Pedido> pedidos = new ArrayList<>();
//        pedidos.add(pedido1);
//        
//        cliente1.setPedidos(pedidos);
//
//        sessao.update(cliente1);
//
//        transacao.commit();
//
//        transacao.begin();
//
//        cliente1.getPedidos().get(0).getProduto().remove(0);
//        sessao.update(cliente1);

        //Exemplo 9
//        Cliente cliente1 = new Cliente();
//        cliente1.setNome("Beltrano");
//
//        sessao.save(cliente1);
//
//        Orcamento pedido1 = new Orcamento();
//        pedido1.setDataOrcamento("");
//        Pedido pedido2 = new Pedido();
//        pedido2.setDescricao("pedido2");
//        Pedido pedido3 = new Pedido();
//        pedido3.setDescricao("pedido3");
//
//        Produto produto1 = new Produto();
//        produto1.setDescricao("produto1");
//        Produto produto2 = new Produto();
//        produto2.setDescricao("produto2");
//        Produto produto3 = new Produto();
//        produto3.setDescricao("produto3");
//
//        sessao.save(produto1);
//        sessao.save(produto2);
//        sessao.save(produto3);
//
//        pedido1.addProduto(produto1);
//        pedido1.addProduto(produto2);
//        pedido1.addProduto(produto3);
//
//        cliente1.addPedido(pedido1);
//        cliente1.addPedido(pedido2);
//        cliente1.addPedido(pedido3);
//
//        sessao.update(cliente1);
//
//        transacao.commit();
//        transacao.begin();
//
//        cliente1.getPedidos().get(0).removeProduto(produto1);
//
//        sessao.update(cliente1);
//
//        transacao.commit();

    }

}
