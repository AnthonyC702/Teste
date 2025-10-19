package teste1;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nome;
    private String endereco;
    private List<Usuario> usuarios;

    public Empresa(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.usuarios = new ArrayList<>();
    }
    public void adicionarUsuario(Usuario u){
        usuarios.add(u);
    }
    
    public boolean reomoverUsuarioporId(int id){
        return usuarios.removeIf(u -> u.getId() == id);
    }
    
    public List<Usuario> listarUsuarios(){
        return new ArrayList<>(usuarios);
    }
    
    public Usuario buscarporId(int id){
        for(Usuario u: usuarios){
          if(u.getId() == id){
              return u;
          }
        }
        return null;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    Usuario buscarPorId(int idBuscar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    boolean removerUsuarioPorId(int idRemover) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
