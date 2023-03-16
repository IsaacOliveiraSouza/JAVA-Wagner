public class detran {
    public static void main(String args[]) {
        int ano = 0;
        int sexo = 0;
        int proc = 0;
        int totalPessoas = 0;
        int idade = 0;
        float menos21 = 0;
        float mais60 = 0;
        float mulher = 0;
        float homem = 0;
        int interior = 0;
        int mulherMenos21 = 0;
        for(int i=0;i<=args.length-1;i+=3){
        
            ano =  Integer.parseInt(args[i]);
            idade = 2023-ano;
            if(idade<21){
                menos21++;
                if(sexo==2){
                     mulherMenos21++;
                }
            }else if(idade>60){
                mais60++;
            }
            
            sexo = Integer.parseInt(args[i+1]);
            if(sexo==2){
              mulher++;
            }else{
              homem++;
            }
            
            
            proc = Integer.parseInt(args[i+2]);
            if(proc==1){
                 interior++;
            }
            
            totalPessoas++;
        }
        
        menos21 = (menos21/totalPessoas)*100;
        System.out.printf("porcentagem de motorista com menos de 21 anos: %2.2f \n", menos21 );
        System.out.printf("mulheres com menos de 21 anos: %d\n", mulherMenos21);
        if(mais60>0){
              System.out.printf("existem motoristas com mais de 60 anos\n");
        }else{
              System.out.printf(" nao existem motoristas com mais de 60 anos\n");
        }
        System.out.printf("quantidade de mulheres: %.0f \n", mulher);
        System.out.printf("quantidade de motoristas do interior: %d \n", interior); 
        homem = (homem/totalPessoas);
        System.out.printf("media de homens: %2.2f\n", homem);
        
        mulher = (mulher/totalPessoas);                    
        System.out.printf("media de mulheres: %2.2f\n", mulher);
        
    }
}