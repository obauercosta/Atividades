
public class Executavel {
    public static void main(String[] args) throws Exception {
        Livro livro = new Livro("O Futuro da Humanidade","Augusto Cury",2008,320 );

        livro.exibirDetalhes();
        livro.adicionarPaginas(10);
        livro.exibirDetalhes();
        livro.adicionarPaginas(3);
        livro.exibirDetalhes();
        livro.atualizarAno(2009);
        livro.exibirDetalhes();

    }
}
