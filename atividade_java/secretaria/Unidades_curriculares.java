package secretaria;

public class Unidades_curriculares {

	private Avaliacao avaliacao;
	private int frequencia; 
	private Professor professo;

	public void setverificacaoFrequencia(int falta){
		frequencia++;
	}
	public int getFrequencia() {
		return frequencia;
	}
}