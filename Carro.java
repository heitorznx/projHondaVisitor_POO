// Classe concreta de veículo: Carro
public class Carro implements Veiculo {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitCarro(this);
    }
}
