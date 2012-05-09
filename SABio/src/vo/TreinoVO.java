package vo;

import java.util.Calendar;
        

public class TreinoVO extends ObjectVO {

    private ClienteVO cliente;
    private int treino_id;
    private String tipo_treino;
    Calendar data_inicio;
    private int nivel;
    private int numero_dias;
    private String nome_treino;
    private int carga;
    private int numero_series;

    public TreinoVO()
    {
        super();
    }

    public TreinoVO(ClienteVO cliente, int treino_id, String tipo_treino,
            Calendar data_inicio, int nivel, int numero_dias,
            String nome_treino, int carga, int numero_series)
    {
        super();
        this.cliente = cliente;
        this.treino_id = treino_id;
        this.tipo_treino = tipo_treino;
        this.data_inicio = data_inicio;
        this.nivel = nivel;
        this.numero_dias = numero_dias;
        this.nome_treino = nome_treino;
        this.carga = carga;
        this.numero_series = numero_series;
    }

    //String ou ClienteVO?
    public ClienteVO getCliente() {
        return this.cliente;
    }

    public void setCliente(ClienteVO cliente) {
        this.cliente = cliente;
    }

    public int getTreinoId()
    {
        return this.treino_id;
    }

    public void setTreinoId(int treino_id)
    {
        this.treino_id = treino_id;
    }

    public String getTipoTreino()
    {
        return this.tipo_treino;
    }

    public void setTipoTreino(String tipo_treino)
    {
        this.tipo_treino = tipo_treino;
    }

    public Calendar getDataInicio()
    {
        return this.data_inicio;
    }
    
    public void setDataInicio(Calendar data_inicio)
    {
        this.data_inicio = data_inicio;
    }

    public int getNivel()
    {
        return this.nivel;
    }

    public void setNivel(int nivel)
    {
        this.nivel = nivel;
    }

    public int getNumeroDias()
    {
        return this.numero_dias;
    }

    public void setNumeroDias(int numero_dias)
    {
        this.numero_dias = numero_dias;
    }

    public String getNomeTreino()
    {
        return this.nome_treino;
    }

    public void setNomeTreino(String nome_treino)
    {
        this.nome_treino = nome_treino;
    }

    public int getCarga()
    {
        return this.carga;
    }

    public void setCarga(int carga)
    {
        this.carga = carga;
    }

    public int getNumeroSeries()
    {
        return this.numero_series;
    }

    public void setNumeroSeries(int numero_series)
    {
        this.numero_series = numero_series;
    }

    @Override
    public String toString()
    {
        StringBuilder buffer = new StringBuilder();
        buffer.append("[");
        buffer.append("Id = ");
        buffer.append(this.getTreinoId());
        buffer.append(", Tipo = ");
        buffer.append(this.getTipoTreino());
        buffer.append(", Inicio = ");
        buffer.append(this.getDataInicio());
        buffer.append(", cliente = ");
        buffer.append(this.getCliente());
        buffer.append(", Nivel = ");
        buffer.append(this.getNivel());
        buffer.append(", Dias = ");
        buffer.append(this.getNumeroDias());
        buffer.append(", Nome = ");
        buffer.append(this.getNomeTreino());
        buffer.append(", Carga = ");
        buffer.append(this.getCarga());
        buffer.append(", Numero Series = ");
        buffer.append(this.getNumeroSeries());
        buffer.append("]");
        return buffer.toString();
    }
}
