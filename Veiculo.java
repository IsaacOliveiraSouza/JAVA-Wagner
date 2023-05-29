public class Veiculo{
       private String marca;
       private String modelo;
       private int ano;
       

       Veiculo(String marca, String modelo, int ano){
              setMarca(marca);
              setModelo(modelo);
              setAno(ano);
       }
       public void setMarca(String marca){
              this.marca = marca;
       }
       public void setModelo(String modelo){
              this.modelo = modelo;
       }
       public void setAno(int ano){
              this.ano = ano;
       }
       public String getMarca(){
             return this.marca;
       }
       public String getModelo(){
             return this.modelo;
       }
       public int getAno(){
             return this.ano;
       }
}