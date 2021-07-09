
public class Guerreiro {
    private String nome;
    private int energia;
    
public Guerreiro(String nome)
{
        this.nome=nome;
        energia =5;
               
}
public String getNome()
{return nome;
}
public int getEnergia()
{return energia;
}
        
private void incremento()
{ energia++;
   if (energia >5)
       energia=5;
 
}
private void decremento()
{ if (energia > 0)
    energia--;
  if  (energia == 0)
      System.out.println("O Guerreito " + nome + " morreu!");
}
public void comer()
{ incremento();
}
public void lutar(Guerreiro outro)
    {   this.decremento();
        this.decremento();
        outro.decremento();
        outro.decremento();
    }    
    
}
