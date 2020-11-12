package List;

import java.util.ArrayList;

public class Produtor {
	
	String nome;
	String cpf;
	String contato;
	String tipoRebanho;
	Integer animal;
	
	public Produtor() {
		}
	
	public Produtor (String nome, String cpf, String contato,
			String tipoRebanho, Integer animal) {
		this.nome = nome;
		this.cpf = cpf;
		this.contato = contato;
		this.tipoRebanho = tipoRebanho;
		this.animal = animal;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getContato() {
		return contato;
	}
	
	public void setContato(String contato) {
		this.contato = contato;
	}
	
	public String getTipoRebanho() {
		return tipoRebanho;
	}
	
	public void setTipoRebanho(String tipoRebanho) {
		this.tipoRebanho = tipoRebanho;
	}
	
	public Integer getAnimal() {
		return animal;
	}
	
	public void setAnimal(Integer animal) {
		this.animal = animal;
	}
	
	public String toString() {
		return nome + ", " + cpf + ", " +
	contato + ", " + tipoRebanho + ", " +
				animal;
	}
	
	
}
