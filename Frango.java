public class Frango implements Pizza {
    @Override
    public void assar() {
        System.out.println("35 minutos");
    }

    @Override
    public void preparar() {
        System.out.println("frango, catupiry, queijo, molho");
    }

    @Override
    public void cobrar() {
        System.out.println(45.00);
    }
}
