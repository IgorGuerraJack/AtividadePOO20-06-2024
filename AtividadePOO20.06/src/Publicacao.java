import java.util.ArrayList;
import java.util.List;

public abstract class Publicacao {
    private String titulo;
    private String dataPublicacao;
    private List<Publicacao> referencias;
    private List<Autor> autores;
    private boolean emprestado;

    public Publicacao(String titulo, String dataPublicacao) {
        this.titulo = titulo;
        this.dataPublicacao = dataPublicacao;
        this.referencias = new ArrayList<>();
        this.autores = new ArrayList<>();
        this.emprestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public List<Publicacao> getReferencias() {
        return referencias;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public abstract double calcularMulta(int numRenovacoes);

    public String toString() {
        return "Publicacao{" +
                "titulo='" + titulo + '\'' +
                ", dataPublicacao='" + dataPublicacao + '\'' +
                ", autores=" + autores +
                '}';
    }
}
