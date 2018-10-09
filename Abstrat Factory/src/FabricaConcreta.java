
public class FabricaConcreta implements FabricaAbstrata {

	public FabricaConcreta() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ImpressaoTelaAbstrata criarObjTela() {
		// TODO Auto-generated method stub
		return new ImpressaoTela();
	}

	@Override
	public ImpressaoTxtAbstrata criarObjTxt() {
		// TODO Auto-generated method stub
		return new ImpressaoTxt();
	}



}
