public class cachorro extends animal {
  public cachorro(String nome, int idade) {
    super(nome, idade);
  }

  @Override
  public String somdoanimal() {
    return "Au Au Au";
  }

  @Override
  public String corre() {
    return "Ele corre!";
  }

  @Override
  public String toString() {
    return "\n" + "Nome:" + super.nome + "\n" + "Idade:" + super.idade + "\n" + somdoanimal() + "\n" + corre();
  }
}