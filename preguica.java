public class preguica extends animal {

  public preguica(String nome, int idade) {
    super(nome, idade);
  }

  @Override
  public String somdoanimal() {
    return "Som do Bicho Preguiça";
  }

  @Override
  public String lenta() {
    return "Anda Lentamente";
  }

  @Override
  public String toString() {
    return "\n" + super.nome + "\n" + super.idade + "\n" + somdoanimal() + "\n" + lenta();
  }
}