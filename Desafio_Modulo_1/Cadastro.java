public class Cadastro
{
    public static void main(String[] args){
    System.out.println("-------------------------------------");
    System.out.println("            BANCO DIGITAL            ");
    System.out.println("SCD - Sistema de cadastro de clientes");
    System.out.println("Insira os dados abaixo:");
    String nome = Teclado.leString("Nome: ");
    String nasc = Teclado.leString("Data de nascimento: ");
    char sex = Teclado.leChar("Sexo: ");
    String mae = Teclado.leString("Nome da mãe: ");
    String cpf = Teclado.leString("CPF: ");
    double renda = Teclado.leDouble("Renda mensal (R$): ");
    String email = Teclado.leString ("E-mail: ");
    String rua = Teclado.leString ("Logradouro(rua, av...): ");
    int num = Teclado.leInt("Número: ");
    String compl = Teclado.leString("Complemento: ");
    String cidade = Teclado.leString("Cidade: ");
    String estado = Teclado.leString("Estado: ");
    String cep = Teclado.leString("CEP: ");
    
    System.out.print('\u000C');
    System.out.println("------------------------------------");
    System.out.println("** Cadastro realizado com sucesso **");
    System.out.println("--> Cliente: "+nome);
    System.out.println("--> Data de Nascimento: "+nasc);
    System.out.println("--> Sexo: "+sex);
    System.out.println("--> Nome da mãe: "+mae);
    System.out.println("--> CPF: "+cpf);
    System.out.printf("--> Renda mensal: R$ %.2f%n", renda);
    System.out.println("--> E-mail: "+email);
    System.out.println("--> Endereço residencial: "+rua+", "+num+", "+compl);
    System.out.println("--> Cidade: "+cidade);
    System.out.println("--> Estado: "+estado);
    System.out.println("--> CEP: "+cep);
    
    
    }
}