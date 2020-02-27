public class principal {
  public static void main(final String[] args) {
    final animal animal0 = new cachorro("Cachorro:", 3);
    final animal animal1 = new preguica("Preguiça", 6);
    final animal animal2 = new cavalo("Cavalo", 4);

    System.out.println(animal0.toString());
    System.out.println(animal1.toString());
    System.out.println(animal2.toString());
  }
}