
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		FabricaAbstrata fabrica = new FabricaConcreta();
		Imprimir imprime = new Imprimir(fabrica);
		imprime.executar();

	}

}
