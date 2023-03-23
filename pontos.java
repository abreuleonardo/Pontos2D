package aula2303;

public class Ponto2D {
   private int x;
   private int y;

   public Ponto2D(int x, int y) {
       this.x = x;
       this.y = y;
   }
   public Ponto2D(){
       this(0,0);
   }
   public double distancia(Ponto2D p){
       double distX = p.x - x;
               double distY = p.y - y;
               return  Math.sqrt(distX * distX + distY * distY);
   }
}




-------------------------------------------------------------------------------
  
  
  
  package aula2303;

public class TestePonto2D {
    public static void main(String[] args) {
       Ponto2D pontoA = new Ponto2D(2, 5);
       Ponto2D pontoB = new Ponto2D(3, 6);

        double distanciaAB = pontoA.distancia(pontoB);
        System.out.println("Distância entre os pontos A e B: " + distanciaAB);

    }
}
