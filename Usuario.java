package teste1;


public class Usuario {
    private String nome;
    private int id;
    private int idade;

    public Usuario(int id, String nome, int idade) {
        this.nome = nome;
        this.id = id;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
         return "Usuario{id=" + id + ", nome='" + nome + "', idade=" + idade + "}";
    }
        
    
}
