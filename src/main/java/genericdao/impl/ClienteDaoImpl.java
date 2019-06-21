package genericdao.impl;

import genericdao.interfaces.IClienteDao;
import model.Usuario;

public class ClienteDaoImpl extends GenericDaoImpl<Usuario, Integer> implements IClienteDao {

    public ClienteDaoImpl() {
        super(Usuario.class);
    }
}
