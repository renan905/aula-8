public class GerenciadorDePessoas {
   private pessoa pessoa1;
   private pessoa pessoa2;

    // Método para cadastrar a Pessoa 1
    public void cadastrarPessoa1(pessoa pessoa) {
        this.pessoa1 = pessoa;
        System.out.println("Pessoa 1 cadastrada com sucesso!");
    }

    // Método para cadastrar a Pessoa 2
    public void cadastrarPessoa2(pessoa pessoa) {
        this.pessoa2 = pessoa;
        System.out.println("Pessoa 2 cadastrada com sucesso!");
    }

    // Método para atualizar a Pessoa 1
    public void atualizarPessoa1(pessoa pessoa) {
        if (this.pessoa1 != null) {
            this.pessoa1 = pessoa;
            System.out.println("Dados da Pessoa 1 atualizados com sucesso!");
        } else {
            System.out.println("Pessoa 1 ainda não foi cadastrada.");
        }
    }

    // Método para atualizar a Pessoa 2
    public void atualizarPessoa2(pessoa pessoa) {
        if (this.pessoa2 != null) {
            this.pessoa2 = pessoa;
            System.out.println("Dados da Pessoa 2 atualizados com sucesso!");
        } else {
            System.out.println("Pessoa 2 ainda não foi cadastrada.");
        }
    }

    // Método para exibir a Pessoa 1
    public void exibirPessoa1() {
        if (this.pessoa1 != null) {
            System.out.println(pessoa1.exibirInformacoes());
        } else {
            System.out.println("Pessoa 1 não cadastrada.");
        }
    }

    // Método para exibir a Pessoa 2
    public void exibirPessoa2() {
        if (this.pessoa2 != null) {
            System.out.println(pessoa2.exibirInformacoes());
        } else {
            System.out.println("Pessoa 2 não cadastrada.");
        }
    }

    public static void main(String[] args){
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