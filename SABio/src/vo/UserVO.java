package vo;

public class UserVO extends ObjectVO {

	private String login;

	private String senha;
	
	public UserVO() {
	}

	public UserVO(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

        @Override
	public String toString() {
		StringBuilder buffer = new StringBuilder();
		buffer.append("[");
		buffer.append(", login = ");
		buffer.append(this.getLogin());
		buffer.append("]");
		return buffer.toString();
	}
}
