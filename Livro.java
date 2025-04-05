public class Livro {
    public String titulo;
    public String autor;
    public int anoPublicacao;
    public int quantidadePaginas;

    public Livro (String titulo, String autor, int anoPublicacao, int quantidadePaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.quantidadePaginas = quantidadePaginas;
    }

    public void exibirDetalhes(){
        System.out.println(titulo + "\n" + autor + "\n" + anoPublicacao + "\n" + quantidadePaginas + "\n");
    }

    public void atualizarAno(int novoAno){
        anoPublicacao = novoAno;
    }

    public void adicionarPaginas(int paginasAdicionais){
        quantidadePaginas += paginasAdicionais;
    }

}
