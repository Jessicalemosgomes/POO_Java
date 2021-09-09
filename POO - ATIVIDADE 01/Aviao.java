package POO;

public class Aviao {

	
	private String modelo;
	private String cor;
	private String AnoFabricaçao;
	
	
	public Aviao(String modelo, String cor, String tipo) {
		super();
		this.modelo = modelo;
		this.cor = cor;
		this.AnoFabricaçao = AnoFabricaçao;
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
		return AnoFabricaçao;}

	public void setTipo(String tipo){
		this.AnoFabricaçao = AnoFabricaçao;}
	
	public void imprimir(){
		System.out.println("\n"+modelo+"\t"+cor+"\t"+AnoFabricaçao);
	}
}