import java.util.Date;

public class Tese extends Publicacao {
    private Autor autor;
    private int numeroPaginas;
    private String resumo;
    private Date dataDefesa;
    private String instituicao;

    public Tese(String titulo, String dataPublicacao, Autor autor, int numeroPaginas, String resumo, Date dataDefesa, String instituicao) {
        super(titulo, dataPublicacao);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.resumo = resumo;
        this.dataDefesa = dataDefesa;
        this.instituicao = instituicao;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public String getResumo() {
        return resumo;
    }

    public Date getDataDefesa() {
        return dataDefesa;
    }

    public String getInstituicao() {
        return instituicao;
    }

    @Override
    public double calcularMulta(int numRenovacoes) {
        return 3.0 * numRenovacoes;
    }

    public String toString() {
        return "Tese{" +
                "titulo='" + getTitulo() + '\'' +
                ", dataPublicacao='" + getDataPublicacao() + '\'' +
                ", autor=" + autor +
                ", numeroPaginas=" + numeroPaginas +
                ", resumo='" + resumo + '\'' +
                ", dataDefesa=" + dataDefesa +
                ", instituicao='" + instituicao + '\'' +
                '}';
    }
}
