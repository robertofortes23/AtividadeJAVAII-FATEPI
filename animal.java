public class animal {
  public String nome;
  public int idade;

  public animal(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  public String somdoanimal() {
    return " ";
  }

  public String corre() {
    return " ";
  }

  public String lenta() {
    return " ";
  }

  public String aString() {
    return nome + "\n" + idade + "\n" + somdoanimal() +  "\n" + corre() + "\n" + lenta();
  }
}