

import java.util.Scanner;

public class PorquinhoDaIndia {
 private String nome;
 private String pelo;
 private char tamanho;
 private String raca;
 private String cor;
 private char sexo;
    
 //metodo de acesso
    
 public void setNome (String nomedoporquinho) {
     nome = nomedoporquinho;
     
  
 }
 
 public String getNome (){
   return nome;
 }
       
    public String getPelo() {
        return pelo;
    }

    public void setPelo(String cordepelo){
    pelo= cordepelo;
    }
    
    public char getTamanho() {
        return tamanho;
    }

    public void setTamanho (char tamanhodoporquinho) {
     tamanho = tamanhodoporquinho;
     
    }
    
    public void setRaça(String raça) {
        this.raca = raça;
    }

    
    public void setCor(String cor) {
        this.cor = cor;
    }

    
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
//metodo construtor 
    public PorquinhoDaIndia(String raca1, String cor1, char sexo1){
        this.raca = raca1;
        this.cor = cor1;
        this.sexo =sexo1;
    
              
       }
    
    //metodo classes
    public void ruido(){
        System.out.print(" cui cui cui");
    }
    
    public void bravo () {
        System.out.println(" morde ");
    }
    
    public boolean pipocou (boolean feliz){
        if (feliz){
            System.out.println("pulou de felicidade");
        }
        else 
        {
            System.out.println("não pulou de felicidade");
        }
   return feliz;
   }
    public static void main(String[] args) {
        // TODO code application logic here
        
  PorquinhoDaIndia P1=new PorquinhoDaIndia ("tedy","cinza",'M');
  Scanner lerTec=new Scanner(System.in);      
  System.out.println("Digite o nome do Porquinho?");
  
 P1.setNome(lerTec.next());
  
  
        
       
  P1.setPelo("cinza");
  P1.setTamanho('M');
  P1.ruido();
  P1.pipocou(true);
  System.out.println(P1.getNome() + "\n" + P1.getPelo()+ "\n" + P1.getTamanho() +"\n");
  
        
       
  PorquinhoDaIndia P2=new PorquinhoDaIndia ("Peruano", "Caramelo e branco", 'F');
  System.out.println("Digite o nome do Porquinho?");
  P2.setPelo("marrom com branco");
  P2.ruido();
  P2.setTamanho('P');
  P2.pipocou(false);
   System.out.println("Digite o nome do Porquinho?");
  P2.setNome(lerTec.next());
  System.out.println(P2.getNome() + "\n" + P2.getPelo()+ "\n" + P2.getTamanho() +"\n");
  
  PorquinhoDaIndia P3=new PorquinhoDaIndia ("Peruano", "Branco e Preto", 'F');
  P3.setPelo("Preto");
  P3.setTamanho ('M');
  P3.ruido();
  P3.pipocou(true);
  P3.bravo();
   System.out.println("Digite o nome do Porquinho?");
  P3.setNome(lerTec.next());
  System.out.println(P3.getNome() + "\n" + P3.getPelo()+ "\n" + P3.getTamanho() +"\n");
 
}
    }

   
