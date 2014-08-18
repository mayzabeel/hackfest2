package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "Local")
public class Local {
	@Id
	@SequenceGenerator(name = "LOCAL_SEQUENCE", sequenceName = "LOCAL_SEQUENCE", allocationSize = 1, initialValue = 0)
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long id;
	
	@Column
	private String nome;
	
	@Column
	private Integer capacidade;
	
	@Column
	private String comochegar;
	
	public Local(){
		
	}
	
	public Local (String nome, Integer capacidade, String comoChegar){
		this.nome = nome;
		this.capacidade = capacidade;
		this.comochegar = comoChegar;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(Integer capacidade) {
		this.capacidade = capacidade;
	}

	public String getComochegar() {
		return comochegar;
	}

	public void setComochegar(String comochegar) {
		this.comochegar = comochegar;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((capacidade == null) ? 0 : capacidade.hashCode());
		result = prime * result + ((comochegar == null) ? 0 : comochegar.hashCode());
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
		Local other = (Local) obj;
		if (this.nome.equals(other.getNome()) && this.capacidade.equals(other.getCapacidade()))
		   return true;		
		else
			return false;
	}	

	

}
