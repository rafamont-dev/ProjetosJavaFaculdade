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
        
        // Declaração dos atributos em arrays
        int cod[] = new int[4];
        String nome[] = new String[4];
        String dn[] = new String [4];
        String email[] = new String[4];
        String senha[] = new String[4];
        Estudante aluno[] = new Estudante[4];
        /* Captura de dados para 4 objetos
         * Estudante via classe Teclado, utilizando 
         * a estrutura de repetição for
         */
        for (int i=0; i<4; i++){
        System.out.printf("--- NOVO ESTUDANTE %d ---\n", i+1);
        cod[i] = Teclado.leInt("Digite o código do estudante: ");
        nome[i] = Teclado.leString("Digite o nome: ");
        dn[i] = Teclado.leString("Digite a data de nascimento: ");
        email[i] = Teclado.leString("Digite o E-mail: ");
        senha[i] = Teclado.leString("Digite a senha: ");
        
        // Início da interface para seleção da cidade
        Cidade cidadeEstudante = null;
        int opc;
        
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
            opc = Teclado.leInt("");
        } while (opc < 1 || opc > 2);
        
        // Estrutura switch para seleção entre as opções válidas
        switch (opc) {
            case 1:
                cidadeEstudante = cidade1;
                break;
                
            case 2:
                cidadeEstudante = cidade2;
                break;
        }
        
        // Instanciação do objeto Estudante
        aluno[i] = new Estudante(cod[i], nome[i], dn[i], email[i],
        senha[i], cidadeEstudante);
        
        /* Invocação do método criado na classe Estudante
         * para atualização de senha 
         */
        aluno[i].atualizaSenha();
    }
        // Invocação dos métodos para exibição de dados dos estudantes.
        aluno[0].exibeDados();
        aluno[1].exibeDados();
        aluno[2].exibeDados();
        aluno[3].exibeDados();
        
        // Invocação dos métodos para exibiçao de dados das cidades.
        cidade1.exibeDados();
        cidade2.exibeDados();    
    
    }
}