/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import util.HibernateUtil;
import model.Usuario;
import org.hibernate.Transaction;

/**
 *
 * @author tanir
 */
public class ClienteDAO {

    private Session session = null;

    public ClienteDAO() {
        this.session = HibernateUtil.getSessionFactory().openSession();
    }

    public Usuario findById(Integer id) {
       Usuario object = (Usuario) session.get(Usuario.class, id);
        return object;
    }

    public void save(Usuario object) {
        Transaction t = session.beginTransaction();
        session.saveOrUpdate((Usuario) object);
        t.commit();
    }

    public void delete(Usuario object) {
        Transaction t = session.beginTransaction();
        session.delete((Usuario) object);
        t.commit();
    }

    public List<Usuario> listAll() {

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Usuario> query = builder.createQuery(Usuario.class);

        Root<Usuario> klassRoot = query.from(Usuario.class);

        query.select(klassRoot);

        List<Usuario> result = session.createQuery(query).getResultList();

        return result;

    }

}
