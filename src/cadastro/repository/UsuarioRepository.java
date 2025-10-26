package cadastro.repository;

import cadastro.model.Usuario;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioRepository {
    private static final String FILE_PATH = "data/usuarios.txt";

    // Add usuario
    public void adicionar(Usuario usuario) {
        List<Usuario> usuarios = listar();
        usuarios.add(usuario);
        salvarTodos(usuarios);
    }

    // Edita usuario pelo ID
    public void editar(int id, String novoNome, String novoEmail) {
        List<Usuario> usuarios = listar();
        for (Usuario u : usuarios) {
            if (u.getId() == id) {
                u.setNome(novoNome);
                u.setEmail(novoEmail);
                break;
            }
        }
        salvarTodos(usuarios);
    }

    // Remove usuario pelo ID
    public void remover(int id) {
        List<Usuario> usuarios = listar();
        usuarios.removeIf(u -> u.getId() == id);
        salvarTodos(usuarios);
    }

    // Lista todos os usuarios
    public List<Usuario> listar() {
        List<Usuario> usuarios = new ArrayList<>();
        File file = new File(FILE_PATH);
        if (!file.exists()) return usuarios;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(",");
                int id = Integer.parseInt(partes[0]);
                String nome = partes[1];
                String email = partes[2];
                usuarios.add(new Usuario(id, nome, email));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return usuarios;
    }

    // Salva todos os usuarios em um arquivo .txt
    private void salvarTodos(List<Usuario> usuarios) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Usuario u : usuarios) {
                bw.write(u.getId() + "," + u.getNome() + "," + u.getEmail());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
