package POO;

public class ObjAvião {

	public static void main(String[] args) {
		
		
		Aviao[] aviao= new Aviao[3];
		
		aviao[0] = new Aviao("Boeing 274","Cinza","1990");
		aviao[1] = new Aviao("Tupolev tu-140","Branco","l998");
		aviao[2] = new Aviao("Boeing 737","Cinza","1997");
		
		System.out.println("Modelo \ntcor \nTipo ");
		for (Aviao roda: aviao) {
			roda.imprimir();
		}
		
	}

}
