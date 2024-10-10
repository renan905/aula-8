public class pessoa {
    private String nome;
    private String cpf;
    private int idade;

    // Construtor para inicializar os atributos
    public pessoa(String nome,String cpf, int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }
// Métodos getter e setter para encapsulamento
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método para exibir as informações da pessoa
    public String exibirInformacoes() {
        return "Nome: " + nome + ", CPF: " + cpf + ", Idade: " + idade;
    }
    }

