package JavaBeans;

import java.sql.Date;

public class Usuario {
	
	private String nome;
	private String login;
	private int id;
	private char instrumento;
	private String senha;
	private String email;
	private Date dtNasc;
	private int numFaIni;
	private int numFaRel;
	
	public Usuario(){
		
	}
	
	
	public Usuario(String nome, String login, int id, char instrumento, String senha, String email, Date dtNasc,
	int numFaIni, int numFaRel) {
		super();
		this.nome = nome;
		this.login = login;
		this.id = id;
		this.instrumento = instrumento;
		this.senha = senha;
		this.email = email;
		this.dtNasc = dtNasc;
		this.numFaIni = numFaIni;
		this.numFaRel = numFaRel;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public char getInstrumento() {
		return instrumento;
	}
	public void setInstrumento(char instrumento) {
		this.instrumento = instrumento;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDtNasc() {
		return dtNasc;
	}
	public void setDtNasc(Date dtNasc) {
		this.dtNasc = dtNasc;
	}
	public int getNumFaIni() {
		return numFaIni;
	}
	public void setNumFaIni(int numFaIni) {
		this.numFaIni = numFaIni;
	}
	public int getNumFaRel() {
		return numFaRel;
	}
	public void setNumFaRel(int numFaRel) {
		this.numFaRel = numFaRel;
	}
}



