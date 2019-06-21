package model;
import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "enderecos")
public class Endereco implements Serializable {
	
	/**********************************************************
	 * 		UM PARA UM - CASO 1
	 * A chave primaria de enderecos eh uma chave estrangeira, 
	 * a chave de clientes
	 **********************************************************/
//	@Id
//	private Integer	id;	
//        
//	@OneToOne
//        @MapsId
//        @JoinColumn(name = "id_cliente")
//	private Cliente	cliente;
	/***********************************************************/

	
	/************************************************************
	 * 		UM PARA UM - CASO 2
	 * A chave primaria padrao para endereco
	 ***********************************************************/

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_endereco")
	private Integer	id;	
//	
//	@OneToOne(mappedBy="endereco"/*, orphanRemoval=true*/)
//	private Usuario cliente;
//	/***********************************************************/
//	
	
	
	/************************************************************
	 * 		UM PARA UM - CASO 3
	 * A chave primaria padrao para endereço
	 ***********************************************************/

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "id_endereco")
//	private Integer	id;	
//	
//	@OneToOne
//	@JoinColumn(name="cliente_id")
//	private Cliente	cliente;
	/***********************************************************/

	
	
	/************************************************************
	*		UM PARA UM - CASO 4
	* Relacionamento bi-direcional (chaves em ambos os lados)	
	* **********************************************************/	
	
//	@Id
//	@GeneratedValue
//	@Column(name = "id_endereco")
//	private Integer	id;	
//	
//	@OneToOne
//	@JoinColumn(name="cliente_id")
//	private Cliente	cliente;
	/***********************************************************/	
	
	
	@Column
	private String	rua;		
	@Column
	private String	cidade;

	
	private static final long	serialVersionUID	= 1280791770249284855L;


	public Integer getEndereco() {
		return id;
	}
	public void setEndereco(Integer endereco) {
		this.id = endereco;
	}
//	public Usuario getCliente() {
//		return cliente;
//	}
//	public void setCliente(Usuario cliente) {
//		this.cliente = cliente;
//	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		//result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result
				+ ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((rua == null) ? 0 : rua.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
//		if (cliente == null) {
//			if (other.cliente != null)
//				return false;
//		} else if (!cliente.equals(other.cliente))
//			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (rua == null) {
			if (other.rua != null)
				return false;
		} else if (!rua.equals(other.rua))
			return false;
		return true;
	}
}
