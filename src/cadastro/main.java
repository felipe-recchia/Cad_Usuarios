package cadastro;

import cadastro.model.Usuario;
import cadastro.service.UsuarioService;
import java.util.Scanner;

    public class main {
        public static void main(String[] args) {
            System.out.println("Programa iniciado!"); {
        UsuarioService service = new UsuarioService();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== SISTEMA DE CADASTRO =====");
            System.out.println("1. Cadastrar usuário");
            System.out.println("2. Listar usuários");
            System.out.println("3. Editar usuário");
            System.out.println("4. Excluir usuário");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1: {
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                
                    // Verifica se o ID existe
                    if (service.idExiste(id)) {
                        System.out.println("Erro: ID já cadastrado! Tente outro.");
                        break;
                    }
                
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                
                    service.cadastrarUsuario(new Usuario(id, nome, email));
                    System.out.println("Usuário cadastrado!");
                    break;
                }
                case 2: service.listarUsuarios().forEach(System.out::println);
                break;
                case 3: {
                    System.out.print("ID do usuário: ");
                    int idEdit = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Novo nome: ");
                    String novoNome = sc.nextLine();
                    System.out.print("Novo email: ");
                    String novoEmail = sc.nextLine();
                    service.editarUsuario(idEdit, novoNome, novoEmail);
                    System.out.println("Usuário editado!");
                    break;
                }
                case 4: {
                    System.out.print("ID do usuário a excluir: ");
                    int idExc = sc.nextInt();
                    service.excluirUsuario(idExc);
                    System.out.println("Usuário excluído!");
                    break;
                }
                case 0: System.out.println("Saindo...");
                break;
                default: System.out.println("Opção inválida!");
                break;
            }
        } while (opcao != 0);

        sc.close();
    }
    }
}   
