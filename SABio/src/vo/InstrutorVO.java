package vo;

import java.util.Calendar;


public class InstrutorVO extends ObjectVO
{
    private String usuario;
    private String nome;
    private String cpf;
    Calendar data_contratacao;
    private String rg;
    private String endereco;
    private String registro_profissional;
    private String numero_carteira_trabalho;
    private int carga_horaria;

    public InstrutorVO()
    {
        super();
    }

    public InstrutorVO(String usuario, String nome, String cpf,
            Calendar data_contratacao, String rg, String endereco, 
            String registro_profissional, String numero_carteira_trabalho,
            int carga_horaria)
    {
        super();
        this.usuario = usuario;
        this.nome = nome;
        this.cpf = cpf;
        this.data_contratacao = data_contratacao;
        this.rg = rg;
        this.endereco = endereco;
        this.registro_profissional = registro_profissional;
        this.numero_carteira_trabalho = numero_carteira_trabalho;
        this.carga_horaria = carga_horaria;
        
    }

    //String ou UsuarioVO?
    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNome()
    {
        return this.nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getCPF()
    {
        return this.cpf;
    }

    public void setCPF(String cpf)
    {
        this.cpf = cpf;
    }

    public Calendar getDataContratacao()
    {
        return this.data_contratacao;
    }
    
    public void setDataContratacao(Calendar data_contratacao)
    {
        this.data_contratacao = data_contratacao;
    }

    public String getRG()
    {
        return this.rg;
    }

    public void setRG(String rg)
    {
        this.rg = rg;
    }


    public String getEndereco()
    {
        return this.endereco;
    }

    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }

    public String getRegistroProfissional()
    {
        return this.registro_profissional;
    }

    public void setRegistroProfissional(String registro_profissional)
    {
        this.registro_profissional = registro_profissional;
    }

    public String getNumeroCarteiraTrabalho()
    {
        return this.numero_carteira_trabalho;
    }

    public void setNumeroCarteiraTrabalho(String numero_carteira_trabalho)
    {
        this.numero_carteira_trabalho = numero_carteira_trabalho;
    }
    
    public int getCargaHoraria()
    {
        return this.carga_horaria;
    }

    public void setCargaHoraria(int carga_horaria)
    {
        this.carga_horaria = carga_horaria;
    }
}
