package model;

public class Comodin_Publico {
	
	private boolean usado;
	private int respuestaPublico1;
	private int respuestaPublico2;
	private int respuestaPublico3;
	private int respuestaPublico4;
	
	public Comodin_Publico(boolean usado, int respuestaPublico1, int respuestaPublico2, int respuestaPublico3,
			int respuestaPublico4) {
		this.usado = usado;
		this.respuestaPublico1 = respuestaPublico1;
		this.respuestaPublico2 = respuestaPublico2;
		this.respuestaPublico3 = respuestaPublico3;
		this.respuestaPublico4 = respuestaPublico4;
	}
	
	public boolean isUsado() {
		return usado;
	}

	public void setUsado(boolean usado) {
		this.usado = usado;
	}

	public int getRespuestaPublico1() {
		return respuestaPublico1;
	}
	public void setRespuestaPublico1(int respuestaPublico1) {
		this.respuestaPublico1 = respuestaPublico1;
	}
	public int getRespuestaPublico2() {
		return respuestaPublico2;
	}
	public void setRespuestaPublico2(int respuestaPublico2) {
		this.respuestaPublico2 = respuestaPublico2;
	}
	public int getRespuestaPublico3() {
		return respuestaPublico3;
	}
	public void setRespuestaPublico3(int respuestaPublico3) {
		this.respuestaPublico3 = respuestaPublico3;
	}
	public int getRespuestaPublico4() {
		return respuestaPublico4;
	}
	public void setRespuestaPublico4(int respuestaPublico4) {
		this.respuestaPublico4 = respuestaPublico4;
	}
	
	@Override
	public String toString() {
		return "Comodin_Publico [usado=" + usado + ", respuestaPublico1=" + respuestaPublico1 + ", respuestaPublico2="
				+ respuestaPublico2 + ", respuestaPublico3=" + respuestaPublico3 + ", respuestaPublico4="
				+ respuestaPublico4 + "]";
	}
}
