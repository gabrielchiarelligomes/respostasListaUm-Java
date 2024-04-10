package atividade;
public class DataHora {
	private Data data;
	private Hora hora;
	
	public DataHora(Data d, Hora h) {
		this.data = d;
		this.hora = h;
	}
	
	public Data getData() {
		return data;
	}
	
	public Hora getHora() {
		return hora;
	}
	
	public void setData(Data d) {
		this.data = d;
	}
	
	public void setHora(Hora h) {
		this.hora = h;
	}
	
	public String imprimirDataHora() {
		return data.imprimirData() + "\n" + hora.imprimirHora();
	}
}
