public class Produto {
    private String nome;
    private String descricao;
    private int quantidade;

    public Produto(String nome, String descricao, int quantidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}