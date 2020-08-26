package JavaBeans;

public class Fase{

	private String nome;
	private int nivel;
	private float nota;
	
	public Fase(){
		
	}
	
	public Fase(String nome, int nivel,float nota) {
		super();
		this.nome = nome;
		this.nivel = nivel;
		this.nota=nota;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		this.nota=nota;
	}
	
	
}
