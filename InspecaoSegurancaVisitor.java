public class InspecaoSegurancaVisitor implements Visitor {
    @Override
    public void visitCarro(Carro carro) {
        System.out.println("Realizando inspeção de segurança no carro.");
    }

    @Override
    public void visitMoto(Moto moto) {
        System.out.println("Realizando inspeção de segurança na moto.");
    }
}
