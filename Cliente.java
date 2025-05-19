// Classe principal (cliente)
public class Cliente {
    public static void main(String[] args) {
        Veiculo carro = new Carro();
        Veiculo moto = new Moto();

        Visitor inspecaoSeguranca = new InspecaoSegurancaVisitor();
        carro.accept(inspecaoSeguranca); // Realiza inspeção no carro
        moto.accept(inspecaoSeguranca);  // Realiza inspeção na moto
    }
}
