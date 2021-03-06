package model.entidades;
//Seller � uma entidade do model

import java.io.Serializable;
import java.util.Date;

public class Seller implements Serializable {//Implementar o implements Serializable para poder salvar em arquivo ou tranferir em rede

	// Isso serialVersion do Serializable
	private static final long serialVersionUID = 1L;
	//Atributos
	private Integer id;
	private String name;
	private String email;
	private Date birthDate;
	private Double baseSalary;
	
	//Declara��o em rela��o a entidade Funcao
	private Funcao funcao;

	//Construtor padr�o
	public Seller() {
	}
	//Construtor com argumentos
	public Seller(Integer id, String name, String email, Date birthDate, Double baseSalary, Funcao funcao) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
		this.baseSalary = baseSalary;
		this.funcao = funcao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Funcao getFuncao() {
		return funcao;
	}

	public void setFuncao(Funcao funcao) {
		this.funcao = funcao;
	}

	/*
	 * HashCode and equals
	 * Para poder comparar por conteudo
	 * 
	 * pode ser gerado automaticamente no source(pot�o direito) > HashCode() and equals()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	/*
	 * HashCode() and equals()
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	/*
	 * TO String
	 */
	@Override
	public String toString() {
		return "Seller [id=" + id + ", name=" + name + ", email=" + email + ", birthDate=" + birthDate + ", baseSalary="
				+ baseSalary + ", funcao=" + funcao + "]";
	}
}
