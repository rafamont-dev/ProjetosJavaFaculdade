public class Cidade {
    // Declaração de atributos
    private int codigo;
    private String descricao;
    private String uf;
    private int qtEstudantes;
    
    // Método construtor
    public Cidade(int codigo, String descricao, String uf) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.uf = uf;
    }
    
    // Métodos get
    public int getCodigo() {
        return this.codigo;
    }
    
    public String getDescricao() {
        return this.descricao;
    }
    
    public String getUf() {
        return this.uf;
    }
    
    // Métodos set
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void setUf(String uf) {
        this.uf = uf;
    }
    
    /* Método para contar e armazenar a quantidade de estudantes
     * em cada cidade instanciada. Será chamado no método construtor
     * Estudante
     */
    public void adicionaNovoEstudante() {
        this.qtEstudantes++;
    }
    
       public void exibeDados() {
        System.out.println();
        System.out.println("-- DADOS DA CIDADE --");
        System.out.printf("Código: %d\n", getCodigo());
        System.out.printf("Descrição: %s\n", getDescricao());
        System.out.printf("UF: %s\n", getUf());
        System.out.printf("Quantidade de estudantes: %d\n", this.qtEstudantes);
    }
}