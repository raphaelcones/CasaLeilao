public class ProdutosDTO {
    private Integer id;
    private String nome;
    private Double valor;
    private String status;

    public ProdutosDTO(Integer id, String nome, Double valor, String status) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.status = status;
    }

   

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getValor() {
        return valor;
    }

    public String getStatus() {
        return status;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}