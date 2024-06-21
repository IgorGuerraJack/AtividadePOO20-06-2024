public class Livro extends Publicacao {
    private int numeroEdicao;
    private String nomeEditora;
    private String isbn;

    public Livro(String titulo, String dataPublicacao, int numeroEdicao, String nomeEditora, String isbn) {
        super(titulo, dataPublicacao);
        this.numeroEdicao = numeroEdicao;
        this.nomeEditora = nomeEditora;
        this.isbn = isbn;
    }

    public int getNumeroEdicao() {
        return numeroEdicao;
    }

    public String getNomeEditora() {
        return nomeEditora;
    }

    public String getIsbn() {
        return isbn;
    }

    public double calcularMulta(int numRenovacoes) {
        return 3.0 * numRenovacoes;
    }

    public String toString() {
        return "Livro{" +
                "titulo='" + getTitulo() + '\'' +
                ", dataPublicacao='" + getDataPublicacao() + '\'' +
                ", autores=" + getAutores() +
                ", numeroEdicao=" + numeroEdicao +
                ", nomeEditora='" + nomeEditora + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
