import java.util.Date;

public class Emprestimo {
    private Usuario usuario;
    private Publicacao publicacao;
    private Date dataEmprestimo;
    private int numRenovacoes;

    public Emprestimo(Usuario usuario, Publicacao publicacao) {
        this.usuario = usuario;
        this.publicacao = publicacao;
        this.dataEmprestimo = new Date(); // Data atual do sistema
        this.numRenovacoes = 0; // Inicializa com zero renovações
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Publicacao getPublicacao() {
        return publicacao;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public int getNumRenovacoes() {
        return numRenovacoes;
    }

    public void renovar() {
        this.numRenovacoes++;
    }

    public double calcularMulta() {
        return publicacao.calcularMulta(numRenovacoes);
    }

    public String toString() {
        return "Emprestimo{" +
                "usuario=" + usuario.getNome() +
                ", publicacao=" + publicacao.getTitulo() +
                ", dataEmprestimo=" + dataEmprestimo +
                ", numRenovacoes=" + numRenovacoes +
                '}';
    }
}
