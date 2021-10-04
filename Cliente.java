public class Cliente extends Endereco {
    private String nome;
    private String sobrenome;
    private String telefone;

    public Cliente(String _logradouro, String _numero, String _complemento, String _bairro, String _cidade, String nome,
            String sobrenome, String telefone) {
        super(_logradouro, _numero, _complemento, _bairro, _cidade);
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    };

    public String getsobrenome() {
        return sobrenome;
    };

    public String getTelefone() {
        return telefone;
    };
}
