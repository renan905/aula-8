public class Main{
    public static void main(String [] args){
        GerenciadorDePessoas gerenciador = new GerenciadorDePessoas();

        // Criação de duas pessoas
        pessoa pessoa1 = new pessoa("João", "123.456.789-00", 30);
        pessoa pessoa2 = new pessoa("Maria", "987.654.321-00", 25);

        // Cadastro das pessoas
        gerenciador.cadastrarPessoa1(pessoa1);
        gerenciador.cadastrarPessoa2(pessoa2);

        // Exibindo as informações das pessoas cadastradas
        System.out.println("Pessoas cadastradas:");
        gerenciador.exibirPessoa1();
        gerenciador.exibirPessoa2();

        // Atualizando os dados da Pessoa 1
        pessoa novaPessoa1 = new pessoa("João Silva", "123.456.789-00", 31);
        gerenciador.atualizarPessoa1(novaPessoa1);
       // Exibindo as informações após atualização
       System.out.println("\nApós atualização da Pessoa 1:");
        gerenciador.exibirPessoa1();
    }
}