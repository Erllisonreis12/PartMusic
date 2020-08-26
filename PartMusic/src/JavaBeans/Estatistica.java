package JavaBeans;

public class Estatistica {
	private int idUsuario;
	private int niFase;
	private float rendimento;
	
	
	
	public Estatistica() {
		
	}
	
	public Estatistica(int idUsuario, int niFase, float rendimento) {
		super();
		this.idUsuario = idUsuario;
		this.niFase = niFase;
		this.rendimento = rendimento;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public int getNiFase() {
		return niFase;
	}
	public void setNiFase(int niFase) {
		this.niFase = niFase;
	}
	public float getRendimento() {
		return rendimento;
	}
	public void setRendimento(float rendimento) {
		this.rendimento = rendimento;
	}
}
