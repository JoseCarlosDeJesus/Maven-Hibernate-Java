package semanadepratica2.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="dependente")

public class Dependente implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "codigo")
	private Integer codigo;
	
	@Column(name="cpfEmpregado")
	private String cpfEmpregado;
	@Column(name="nome")
	private String nome;
	@Column(name="grauParentesco")
	private String grauParentesco;
	@Column(name="dataNascimento")
	private String dataNascimento;
	
	@ManyToOne 
	@JoinColumn(name = "cpf")
	private Empregado empregado;
	
	public Integer getCodigo() {
		return codigo;
	}
	
	public Integer setCodigo(Integer codigo) {
		this.codigo=codigo;
	}
	
	public String getCpfEmpregado() {
		return cpfEmpregado;
	}
	
	public Integer setCpfEmpregado(String cpfEmpregado) {
		this.cpfEmpregado=cpfEmpregado;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String setNome(String nome) {
		this.nome=nome;
	}
	
	public String getGrauParentesco() {
		return grauParentesco;
	}
	
	public String setGrauParentesco(String grauParentesco) {
		this.grauParentesco=grauParentesco;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	
	public String setDataNascimento(String dataNascimento) {
		this.dataNascimento=dataNascimento;
	}
	public Empregado getEmpregado() {
		return empregado;
	}
	
	public Empregado setEmpregado(Empregado empregado) {
		this.empregado=empregado;
	}
	
	@Override
	public String toString() {
		return "dependente [codigo=" + codigo + ", cpfEmpregado=" + cpfEmpregado + ", nome=" + nome
				+ ", dataNascimento=" + dataNascimento + "]";
	}
}
