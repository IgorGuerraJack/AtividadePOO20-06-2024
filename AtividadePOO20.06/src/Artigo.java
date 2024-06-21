public class Artigo extends Publicacao {
    private String resumo;

    public Artigo(String titulo, String dataPublicacao, String resumo) {
        super(titulo, dataPublicacao);
        this.resumo = resumo;
    }

    public String getResumo() {
        return resumo;
    }

    public double calcularMulta(int numRenovacoes) {
        // Lógica para calcular a multa de acordo com o número de renovações
        // Exemplo simples: 2 reais por renovação
        return 2.0 * numRenovacoes;
    }

    public String toString() {
        return "Artigo{" +
                "titulo='" + getTitulo() + '\'' +
                ", dataPublicacao='" + getDataPublicacao() + '\'' +
                ", autores=" + getAutores() +
                ", resumo='" + resumo + '\'' +
                '}';
    }
}
