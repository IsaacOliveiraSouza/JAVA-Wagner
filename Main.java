import java.util.*;
public class Main{
        public static void main(String args[]){
               Scanner scan = new Scanner(System.in);
               
               String marca = scan.nextLine();
               String modelo = scan.nextLine();
               int ano = Integer.parseInt(scan.nextLine());
               int numPortas = Integer.parseInt(scan.nextLine());
                
               Carro carro = new Carro(marca, modelo, ano, numPortas);
               
                
               System.out.println(carro.getMarca());
               System.out.println(carro.getModelo());
               System.out.println(carro.getAno());
               System.out.println(carro.getNumPortas());
               
               
                marca = scan.nextLine();
               modelo = scan.nextLine();
                ano = Integer.parseInt(scan.nextLine());
               Boolean partida = Boolean.parseBoolean(scan.nextLine());
               
               Motocicleta moto = new Motocicleta(marca, modelo, ano, partida);
               System.out.println(moto.getMarca());
               System.out.println(moto.getModelo());
               System.out.println(moto.getAno());
               System.out.println(moto.getPossuiPartidaEletrica());
              
        }
}