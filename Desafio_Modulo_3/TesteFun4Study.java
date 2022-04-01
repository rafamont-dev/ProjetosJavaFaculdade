/* Aluno: Rafael Monteiro de Souza
 * Disciplina: Laboratório I
 * Data de entrega: 01/04/2022
 * Curso: Sistemas de Informação - 1º semestre
 */

public class TesteFun4Study {
    public static void main (String[] args) {
        // Captura de dados dos objetos Cidade via classe Teclado
        System.out.println("--- NOVA CIDADE 1 ---");
        int cod1 = Teclado.leInt("Digite o código da cidade: ");
        String desc1 = Teclado.leString("Digite a descrição da cidade: ");
        String uf1 = Teclado.leString("Digite a UF: ");
        
        System.out.println("--- NOVA CIDADE 2 ---");
        int cod2 = Teclado.leInt("Digite o código da cidade: ");
        String desc2 = Teclado.leString("Digite a descrição da cidade: ");
        String uf2 = Teclado.leString("Digite a UF: ");
        
        // Instanciação dos objetos Cidade
        Cidade cidade1 = new Cidade(cod1, desc1, uf1);
        Cidade cidade2 = new Cidade(cod2, desc2, uf2);
        
        /* Captura de dados para o primeiro objeto
         * Estudante via classe Teclado
         */
        System.out.println("--- NOVO ESTUDANTE 1 ---");
        int cod01 = Teclado.leInt("Digite o código do estudante: ");
        String nome01 = Teclado.leString("Digite o nome: ");
        String dn01 = Teclado.leString("Digite a data de nascimento: ");
        String email01 = Teclado.leString("Digite o E-mail: ");
        String senha01 = Teclado.leString("Digite a senha: ");
        
        // Início da interface para seleção da cidade
        Cidade cidadeEstudante01 = null;
        int opc1;
        
        /* Estrutura do-while para impedir o prosseguimento 
         * sem a seleção de uma opção de cidade válida 
         */
        do {
            System.out.println("-----------------");
            System.out.println("Escolha a cidade:");
            System.out.println("-----------------");
            System.out.println("[1] " + cidade1.getDescricao());
            System.out.println("[2] " + cidade2.getDescricao());
            System.out.println("-----------------");
            opc1 = Teclado.leInt("");
        } while (opc1 < 1 || opc1 > 2);
        
        // Estrutura switch para seleção entre as opções válidas
        switch (opc1) {
            case 1:
                cidadeEstudante01 = cidade1;
                break;
                
            case 2:
                cidadeEstudante01 = cidade2;
                break;
        }
        
        // Instanciação do primeiro objeto Estudante
        Estudante aluno1 = new Estudante(cod01, nome01, dn01, email01,
        senha01, cidadeEstudante01);
        
        /* Invocação do método criado na classe Estudante
         * para atualização de senha 
         */
        aluno1.atualizaSenha();
        
        /* Captura de dados para o segundo objeto
         * Estudante via classe Teclado
         */
        System.out.println("--- NOVO ESTUDANTE 2 ---");
        int cod02 = Teclado.leInt("Digite o código do estudante: ");
        String nome02 = Teclado.leString("Digite o nome: ");
        String dn02 = Teclado.leString("Digite a data de nascimento: ");
        String email02 = Teclado.leString("Digite o E-mail: ");
        String senha02 = Teclado.leString("Digite a senha: ");
        
        // Início da interface para seleção da cidade
        Cidade cidadeEstudante02 = null;
        int opc2;
        /* Estrutura do-while para impedir o prosseguimento 
         * sem a seleção de uma opção de cidade válida 
         */
        do {
            System.out.println("-----------------");
            System.out.println("Escolha a cidade:");
            System.out.println("-----------------");
            System.out.println("[1] " + cidade1.getDescricao());
            System.out.println("[2] " + cidade2.getDescricao());
            System.out.println("-----------------");
            opc2 = Teclado.leInt("");
        } while (opc2 < 1 || opc2 > 2);
        
        // Estrutura switch para seleção entre as opções válidas
        switch (opc2) {
            case 1:
                cidadeEstudante02 = cidade1;
                break;
                
            case 2:
                cidadeEstudante02 = cidade2;
                break;
        }
        
        // Instanciação do segundo objeto Estudante
        Estudante aluno2 = new Estudante(cod02, nome02, dn02, email02,
        senha02, cidadeEstudante02);
        
        /* Invocação do método criado na classe Estudante
         * para atualização de senha 
         */
        aluno2.atualizaSenha();
        
        // Invocação do método para exibição de dados dos estudantes.
        aluno1.exibeDados();
        aluno2.exibeDados();
        
        // Invocação do método para exibiçao de dados das cidades.
        cidade1.exibeDados();
        cidade2.exibeDados();
    }   
}