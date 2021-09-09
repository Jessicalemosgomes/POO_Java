package POO;

public class ObjCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Adriana dos Santos", 46);
		cliente1.imprimir();

		System.out.println("mudança de idade");
		cliente1.setIdade(44);
		cliente1.imprimir();

		System.out.println("\nAdicionando novo cliente");
		Cliente cliente2= new Cliente("Leonardo Silva",32);
		cliente2.imprimir();
	}

}
