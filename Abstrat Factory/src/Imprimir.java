import java.util.Random;

public class Imprimir {

	private ImpressaoTelaAbstrata tela;
	private ImpressaoTxtAbstrata txt;
	
	public Imprimir(FabricaAbstrata fabrica) {
		tela = fabrica.criarObjTela();
		txt = fabrica.criarObjTxt();
	}
	
	public void executar() {
		Random r = new Random();
		if(r.nextInt(2) >= 1) {
			tela.exibir();
		}
		else {
			txt.imprimir();
		}
	}

}
