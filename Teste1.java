package teste1;
import java.util.List;
import java.util.Scanner;

public class Teste1 {

    
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner scanner = new Scanner(System.in);
        
        Empresa empresa = new Empresa("Minha empresa", "Rua exemplo, 123");
        
        boolean sair = false;
        while (!sair) {
            System.out.println("\n---Menu---");
            System.out.println("1 - Adicionar Usuario");
            System.out.println("2 - Listar Usuarios");
            System.out.println("3 - Remover Usuarios por Id");
            System.out.println("4 - Buscar Usuarios por Id");
            System.out.println("0 - Sair");
            System.out.println("Escolha:");
            String opcao = scanner.nextLine();
            
             switch (opcao) {
                case "1":
                    try {
                        System.out.print("ID: ");
                        int id = Integer.parseInt(scanner.nextLine());
                        System.out.print("Nome: ");
                        String nome = scanner.nextLine();
                        System.out.print("Idade: ");
                        int idade = Integer.parseInt(scanner.nextLine());

                        Usuario novo = new Usuario(id, nome, idade);
                        empresa.adicionarUsuario(novo);
                        System.out.println("Usuário adicionado com sucesso!");
                    } catch (NumberFormatException e) {
                        System.out.println("Valor numérico inválido! Tente novamente.");
                    }
                    break;

                case "2":
                    List<Usuario> lista = empresa.listarUsuarios();
                    if (lista.isEmpty()) {
                        System.out.println("Nenhum usuário cadastrado.");
                    } else {
                        System.out.println("Usuários cadastrados:");
                        for (Usuario u : lista) {
                            System.out.println(u);
                        }
                    }
                    break;

                case "3":
                    try {
                        System.out.print("Digite o ID do usuário a remover: ");
                        int idRemover = Integer.parseInt(scanner.nextLine());
                        boolean removido = empresa.removerUsuarioPorId(idRemover);
                        System.out.println(removido ? "Usuário removido." : "ID não encontrado.");
                    } catch (NumberFormatException e) {
                        System.out.println("ID inválido!");
                    }
                    break;

                case "4":
                    try {
                        System.out.print("Digite o ID do usuário a buscar: ");
                        int idBuscar = Integer.parseInt(scanner.nextLine());
                        Usuario encontrado = empresa.buscarPorId(idBuscar);
                        if (encontrado != null) {
                            System.out.println("Encontrado: " + encontrado);
                        } else {
                            System.out.println("Usuário não encontrado.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("ID inválido!");
                    }
                    break;

                case "0":
                    sair = true;
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        System.out.println("Programa encerrado!");
        scanner.close();
    }
    }