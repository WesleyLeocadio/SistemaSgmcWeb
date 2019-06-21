package model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import model.Usuario;
//import model.Empregado;

@Entity
@Table(name = "orcamento")
public class Orcamento implements Serializable {

    private static final long serialVersionUID = -3219882293977763487L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_orcamento")
    private Integer id;

    @Column(name = "data_orcamento", updatable = false)
    private Date dataOrcamento;

    @Column(name = "hora_orcamento", updatable = false)
    private Time horaOrcamento;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "orcamento_produto", joinColumns = { @JoinColumn(name ="orcamento_id", referencedColumnName = "id_orcamento") }, 
    inverseJoinColumns = {@JoinColumn(name = "produto_id") })
    private List<Produto> produto = new ArrayList<Produto>();

 
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataOrcamento() {
        return dataOrcamento;
    }

    public void setDataOrcamento(Date dataPedido) {
        this.dataOrcamento = dataPedido;
    }

    public Time getHoraOrcamento() {
        return horaOrcamento;
    }

    public void setHoraOrcamento(Time horaOrcamento) {
        this.horaOrcamento = horaOrcamento;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }

 
   

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        /**
         * **********************************************************
         * UM PARA MUITOS - CASO 3
         * **********************************************************
         */
        //result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
        /**
         * *********************************************************
         */
        result = prime * result
                + ((dataOrcamento == null) ? 0 : dataOrcamento.hashCode());
        
        result = prime * result
                + ((horaOrcamento == null) ? 0 : horaOrcamento.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Orcamento other = (Orcamento) obj;

        /**
         * **********************************************************
         * UM PARA MUITOS - CASO 3
         * **********************************************************
         */
        //if (cliente == null) {
        //	if (other.cliente != null)
        //		return false;
        //} else if (!cliente.equals(other.cliente))
        //	return false;
        /**
         * *********************************************************
         */
        if (dataOrcamento == null) {
            if (other.dataOrcamento != null) {
                return false;
            }
        } else if (!dataOrcamento.equals(other.dataOrcamento)) {
            return false;
        }
    
        if (horaOrcamento == null) {
            if (other.horaOrcamento != null) {
                return false;
            }
        } else if (!horaOrcamento.equals(other.horaOrcamento)) {
            return false;
        }
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        
        return true;
    }

}
