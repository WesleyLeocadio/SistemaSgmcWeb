package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import model.Endereco;
import model.Orcamento;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

    @Id
    //@GeneratedValue
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer id;

    /**
     * **********************************************************
     * UM PARA UM - CASO 2 Chave estrangeira na tabela fonte (cliente possui uma
     * chave estrangeira de enderecos)
     * *********************************************************
     */
    @OneToOne
    /*(cascade = {CascadeType.ALL}, orphanRemoval = true)*/
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;

    @Column(length = 45)
    private String nome;

    @Column
    private String cpf;
    @Column
    private Boolean admin;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    /**
     * **********************************************************
     * UM PARA MUITOS - CASO 3
     * **********************************************************
     */
//	@OneToMany(mappedBy="usuario", fetch = FetchType.LAZY, orphanRemoval=true, cascade = CascadeType.ALL)
//        private List<Orcamento> orcamento = new ArrayList<>();
//	
//	
//	public void addorcamento(Orcamento novoOrcamento){
//		orcamento.add(novoOrcamento);
//		novoOrcamento.setCliente(this);
//	}
//	
//	public void removePedido(Orcamento removePedido){
//		orcamento.remove(removePedido);
//		removePedido.setCliente(null);
//	}
//        
    /**
     * *********************************************************
     */
    private static final long serialVersionUID = -1707591652638708533L;

    public Integer getCliente() {
        return id;
    }

    public void setCliente(Integer cliente) {
        this.id = cliente;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

//	public List<Orcamento> getPedidos() {
//		return orcamento;
//	}
//
//	public void setPedidos(List<Orcamento> pedidos) {
//		this.orcamento = pedidos;
//	}
//        
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
        Usuario other = (Usuario) obj;
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        if (nome == null) {
            if (other.nome != null) {
                return false;
            }
        } else if (!nome.equals(other.nome)) {
            return false;
        }
        return true;
    }

}
