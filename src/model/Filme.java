package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="filme")

public class Filme implements Serializable{
	
	private static final long serialVersionUID =1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codFilme;
	
	@Column(name="nome", length=50, nullable= false)
	private String nome;

	@ManyToOne
	@JoinColumn(name="fil_codAnime", referencedColumnName="codAnime")
	private Anime anime;
	
	public Long getCondFilme() {
		return codFilme;
	}

	public void setCondFilme(Long condFilme) {
		this.codFilme = condFilme;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((codFilme == null) ? 0 : codFilme.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Filme other = (Filme) obj;
		if (codFilme == null) {
			if (other.codFilme != null)
				return false;
		} else if (!codFilme.equals(other.codFilme))
			return false;
		return true;
	}
	
	
	
	

}
