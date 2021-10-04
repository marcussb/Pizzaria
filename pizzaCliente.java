public class pizzaCliente extends Cliente implements Saudacao {
    public pizzaCliente(String _logradouro, String _numero, String _complemento, String _bairro, String _cidade,
            String nome, String sobrenome, String telefone) {
        super(_logradouro, _numero, _complemento, _bairro, _cidade, nome, sobrenome, telefone);
    }

    @Override
    public void saudar() {
        System.out.printf("Boa noite, pedido realizado");
    };
}
