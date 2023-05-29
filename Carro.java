public class Carro extends Veiculo{
       private int numPortas;
       
       Carro(String marca, String modelo, int ano, int numPortas){
              super (marca, modelo, ano);
              setNumPortas(numPortas);
              
       }
       public void setNumPortas(int numPortas){
             this.numPortas = numPortas;
       }
       public int getNumPortas(){
             return this.numPortas;
       }
}