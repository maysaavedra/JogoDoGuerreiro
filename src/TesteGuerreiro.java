
public class TesteGuerreiro {
    public static void main (String args[])
    { Guerreiro g1 = new Guerreiro("Mayara");
      Guerreiro g2 = new Guerreiro ("Fernando");
      System.out.println("Guerreiro: "+ g1.getNome() + " Energia: "+ g1.getEnergia());
      System.out.println("Guerreiro: "+ g2.getNome() + " Energia: "+ g2.getEnergia());
      g1.lutar(g2);
      g1.comer();
      System.out.println("Guerreiro: " + g1.getNome() + " Energia: " + g1.getEnergia());
      System.out.println("Guerreiro: " + g2.getNome() + " Energia: " + g2.getEnergia());
      g1.lutar(g2);
      g1.comer();
      System.out.println("Guerreiro: " + g1.getNome() + " Energia: " + g1.getEnergia());
      System.out.println("Guerreiro: " + g2.getNome() + " Energia: " + g2.getEnergia());
      g1.lutar(g2);
      g1.comer();
      System.out.println("Guerreiro: " + g1.getNome() + " Energia: " + g1.getEnergia());
      System.out.println("Guerreiro: " + g2.getNome() + " Energia: " + g2.getEnergia());
    }
}
