import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nome;
    private String endereco;
    private List<Publicacao> acervo;

    public Biblioteca(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.acervo = new ArrayList<>();
    }

    public void adicionarPublicacao(Publicacao publicacao) {
        this.acervo.add(publicacao);
    }

    public void removerPublicacao(Publicacao publicacao) {
        this.acervo.remove(publicacao);
    }

    public Publicacao buscarPublicacaoPorTitulo(String titulo) {
        for (Publicacao p : acervo) {
            if (p.getTitulo().equals(titulo)) {
                return p;
            }
        }
        return null;
    }

    public void listarPublicacoes() {
        System.out.println("### Publicações na biblioteca " + nome + " ###");
        for (Publicacao p : acervo) {
            System.out.println(p);
        }
        System.out.println("#####################################");
    }

    public void emprestarPublicacao(Publicacao publicacao, Usuario usuario) {
        if (!publicacao.isEmprestado()) {
            if (usuario instanceof UsuarioEspecial || usuario.podeEmprestar()) {
                Emprestimo emprestimo = new Emprestimo(usuario, publicacao);
                usuario.adicionarEmprestimo(emprestimo);
                publicacao.setEmprestado(true);
                System.out.println("Empréstimo realizado com sucesso para " + usuario.getNome());
            } else {
                System.out.println("Usuário comum já possui um empréstimo em andamento.");
            }
        } else {
            System.out.println("Publicação já está emprestada.");
        }
    }

    public void devolverPublicacao(Publicacao publicacao, Usuario usuario) {
        Emprestimo emprestimo = usuario.getEmprestimo(publicacao);
        if (emprestimo != null) {
            double multa = emprestimo.calcularMulta();
            if (multa > 0) {
                System.out.println("Devolução com multa de R$" + multa);
            } else {
                System.out.println("Devolução realizada com sucesso.");
            }
            usuario.removerEmprestimo(emprestimo);
            publicacao.setEmprestado(false);
        } else {
            System.out.println("Esta publicação não está emprestada para este usuário.");
        }
    }
}
