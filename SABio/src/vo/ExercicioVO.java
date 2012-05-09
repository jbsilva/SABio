package vo;

public class ExercicioVO extends ObjectVO {
  
    private String cliente;
    private int carga;
    private String exercicio;
    private int numero_de_series;
    private int treino_id;


    public ExercicioVO()
    {
        super();
    }

    public ExercicioVO(int treino_id, int carga, String exercicio,
            int numero_de_series, String cliente)
    {
        super();
        this.treino_id = treino_id;
        this.cliente = cliente;
        this.carga = carga;
        this.exercicio = exercicio;
        this.numero_de_series = numero_de_series;
    }

    //String ou TreinoVO?
    public String getCliente() {
        return this.cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public int getTreino() {
        return this.treino_id;
    }

    public void setTreino(int treino_id) {
        this.treino_id = treino_id;
    }
    
    public int getCarga()
    {
        return this.carga;
    }

    public void setCarga(int carga)
    {
        this.carga = carga;
    }

    public String getExercicio()
    {
        return this.exercicio;
    }

    public void setExercicio(String exercicio)
    {
        this.exercicio = exercicio;
    }


    public int getNumeroDeSeries()
    {
        return this.numero_de_series;
    }

    public void setNumeroDeSeries(int numero_de_series)
    {
        this.numero_de_series = numero_de_series;
    }

}
