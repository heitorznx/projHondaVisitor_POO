// Classe concreta de veículo: Moto
public class Moto implements Veiculo {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitMoto(this);
    }
}
