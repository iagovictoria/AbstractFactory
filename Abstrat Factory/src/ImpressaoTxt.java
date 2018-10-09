import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ImpressaoTxt implements ImpressaoTxtAbstrata {

	public ImpressaoTxt() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimir() {
		FileWriter arq = null;
		try {
			arq = new FileWriter("src\\output.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    PrintWriter gravarArq = new PrintWriter(arq);

	    gravarArq.printf("Hello, World");
	 
	    try {
			arq.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
