package vo;

/**
 * @author Delano
 */
public class TreinoVO extends ObjectVO {

	private String numero;

	private Double saldo;

	private UserVO usuario;

	public TreinoVO() {
		super();
	}

	public TreinoVO(String number, UserVO usuario) {
		this(number, new Double(0.0), usuario);
	}

	public TreinoVO(String numero, Double saldo, UserVO usuario) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.usuario = usuario;
	}

	public TreinoVO(int id, String numero, Double saldo, UserVO usuario) {
		super(id);
		this.numero = numero;
		this.saldo = saldo;
		this.usuario = usuario;
	}

	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public UserVO getUsuario() {
		return this.usuario;
	}

	public void setUsuario(UserVO usuario) {
		this.usuario = usuario;
	}

        @Override
	public String toString() {
		StringBuilder buffer = new StringBuilder();
		buffer.append("[");
		buffer.append("id = ");
		buffer.append(this.getId());
		buffer.append(", numero = ");
		buffer.append(this.getNumero());
		buffer.append(", saldo = ");
		buffer.append(this.getSaldo());
		buffer.append(", usuario = ");
		buffer.append(this.getUsuario());
		buffer.append("]");
		return buffer.toString();
	}
}
