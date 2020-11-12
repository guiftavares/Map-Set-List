package List;

import java.util.ArrayList;

public class CadastroProdutor {
	
			
		ArrayList<Produtor> produtores = new ArrayList<>();
		
		
		public void cadastrarProdutor (Produtor produtor) {
			produtores.add(produtor);
		}
		
		public String numeroCadastros() {
			return produtores.size() + "";
		}
	}
