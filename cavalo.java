public class cavalo extends animal {
  public cavalo(String nome, int idade) {
    super(nome, idade);
  }

  @Override
  public String somdoanimal() {
    return "Irriiirriiirr";
  }

  @Override
  public String corre() {
    return "Ele Corre!";
  }

  @Override
  public String toString() {
    return "\n" + super.nome + "\n" + super.idade + "\n" + somdoanimal() + "\n" + corre();
  }
}