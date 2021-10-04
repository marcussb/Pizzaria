public class Camarao implements Pizza {
    @Override
    public void assar() {
        System.out.println("35 minutos");
    }

    @Override
    public void preparar() {
        System.out.println("Camarao, catupiry, queijo, molho");
    }

    @Override
    public void cobrar() {
        System.out.println(48.00);
    }
}
