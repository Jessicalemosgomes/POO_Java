package POO;

public class Aviao {

	
	private String modelo;
	private String cor;
	private String AnoFabrica�ao;
	
	
	public Aviao(String modelo, String cor, String tipo) {
		super();
		this.modelo = modelo;
		this.cor = cor;
		this.AnoFabrica�ao = AnoFabrica�ao;
	}


	public String getModelo(){
		return modelo;}


	public void setModelo(String modelo){
		this.modelo = modelo;}

	public String getCor(){
		return cor;}

	public void setCor(String cor){
		this.cor = cor;}

	public String getTipo(){
		return AnoFabrica�ao;}

	public void setTipo(String tipo){
		this.AnoFabrica�ao = AnoFabrica�ao;}
	
	public void imprimir(){
		System.out.println("\n"+modelo+"\t"+cor+"\t"+AnoFabrica�ao);
	}
}