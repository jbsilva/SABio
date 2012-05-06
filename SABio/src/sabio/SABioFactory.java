package sabio;

import sabio.impl.Conta;
import sabio.impl.Usuario;
import sabio.spec.IConta;
import sabio.spec.IUsuario;

public class SABioFactory {

	private static SABioFactory instance = null;

	private SABioFactory() {
	}

	public static SABioFactory getInstance() {
		if (instance == null) {
			instance = new SABioFactory();
		}
		return instance;
	}

	public IConta getAccount() {
		return new Conta();
	}

	public IUsuario getUser() {
		return new Usuario();
	}
}
