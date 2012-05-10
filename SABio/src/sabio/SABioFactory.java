package sabio;

import sabio.impl.Treino;
import sabio.impl.Usuario;
import sabio.spec.ITreino;
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

    public IUsuario getUsuario() {
        return new Usuario();
    }
}
