public class Motocicleta extends Veiculo{
       private Boolean PossuiPartidaEletrica;
       
       Motocicleta(String marca, String modelo, int ano, Boolean PossuiPartidaEletrica){
             super(marca, modelo, ano);
             setPossuiPartidaEletrica(PossuiPartidaEletrica);            
       }   
       
       public void setPossuiPartidaEletrica(Boolean partida){
              this.PossuiPartidaEletrica = partida;
       }
       
       public Boolean getPossuiPartidaEletrica(){
          return this.PossuiPartidaEletrica;
       }
       
}