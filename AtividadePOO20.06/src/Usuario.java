import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String telefone;
    private String email;
    private String cpf;
    private List<Emprestimo> emprestimos;

    public Usuario(String nome, String telefone, String email, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.emprestimos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void adicionarEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
    }

    public void removerEmprestimo(Emprestimo emprestimo) {
        emprestimos.remove(emprestimo);
    }

    public Emprestimo getEmprestimo(Publicacao publicacao) {
        for (Emprestimo emp : emprestimos) {
            if (emp.getPublicacao().equals(publicacao)) {
                return emp;
            }
        }
        return null;
    }

    public boolean podeEmprestar() {
        return emprestimos.isEmpty();
    }
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
