public class principal {
  public static void main(final String[] args) {
    final animal a1 = new cachorro("Cachorro:", 3);
    final animal a2 = new preguica("Preguiça", 6);
    final animal a3 = new cavalo("Cavalo", 4);

    System.out.println(a1.toString());
    System.out.println(a2.toString());
    System.out.println(a3.toString());
  }
}