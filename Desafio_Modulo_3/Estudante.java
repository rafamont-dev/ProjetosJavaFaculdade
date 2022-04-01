public class Estudante {
    // Declaração de atributos
    private int codigo;
    private String nome;
    private String dataNasc;
    private String email;
    private String senha;
    private Cidade cidade;

    /* Método construtor de uma instância Estudante, que invoca 
     * o método para da classe Cidade para adicionar novo estudante
     * a cidade escolhida
     */
    public Estudante(int codigo, String nome, String dataNasc, String email,
    String senha, Cidade cidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.email = email;
        this.senha = senha;
        this.cidade = cidade;
        this.cidade.adicionaNovoEstudante();
    }
    
    // Métodos getters e setters
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getDataNasc() {
        return this.dataNasc;
    }
    
    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getSenha() {
        return this.senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public Cidade getCidade() {
        return this.cidade;
    }
    
    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    
    /* Método para atualizar a senha, com duas camadas aninhadas:
     * 
     * A primeira camada pede a senha atual e faz a verificação com a
     * estrutura if-else. É aninhada por uma estrutura do-while que
     * impede o prosseguimento enquanto a autenticação não for feita
     * corretamente.
     * 
     * A segunda camada pede a digitação da nova senha duas vezes e faz
     * duas verificações com uma estrutura de if-else aninhadas. A primeira
     * verifica se as duas senhas são iguais. A segunda verifica se a
     * nova senha não é igual a anterior. Com essas condições satisfeitas,
     * a senha é alterada. Essa estrutura é aninhada por uma estrutura
     * do-while que impede o prosseguimento enquanto as condições não
     * forem satisfeitas. Todas os possíveis erros são informados ao
     * usuário com mensagens na tela. 
     */
    public void atualizaSenha() {
        System.out.println("--- ATUALIZAR SENHA ---");
        String senhaAtual = "";
        String novaSenha1 = "";
        String novaSenha2 = "";
        do {
            senhaAtual = Teclado.leString("Digite a senha atual: ");
            if (senhaAtual.equals(this.senha)) {
                do {
                    novaSenha1 = Teclado.leString("Digite a nova senha: ");
                    novaSenha2 = Teclado.leString("Repita a nova senha: ");
                    if (novaSenha2.equals(novaSenha1)) {
                        if (!novaSenha2.equals(this.senha)) {
                            this.senha = novaSenha2;
                            System.out.println("Senha alterada com sucesso!");
                        } else {
                            System.out.println("Senha nova não pode ser igual a senha atual");
                        }
                    }   else {
                        System.out.println("Senhas não conferem.");
                    }
                } while (this.senha.equals(senhaAtual));
            }   else {
                System.out.println("Senha incorreta.");
            }   
        } while (!this.senha.equals(novaSenha2));
    }
    
    public void exibeDados() {
        System.out.println();
        System.out.println("-- DADOS DO ESTUDANTE --");
        System.out.printf("Código do estudante: %d\n", getCodigo());
        System.out.printf("Nome: %s\n", getNome());
        System.out.printf("Data de nascimento: %s\n", getDataNasc());
        System.out.printf("E-mail: %s\n", getEmail());
        System.out.printf("Senha: %s\n", getSenha());
        System.out.printf("Cidade: %s\n", cidade.getDescricao());
    }
}