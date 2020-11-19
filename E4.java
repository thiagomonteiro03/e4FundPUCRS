


import java.util.Scanner;
public class E4
{
    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);
        Boolean menuOn = true;
        int opcao;
        int[][] lugares = {
         // A  B  C  D  E  F    // MATRIZ 6x24
          { 0, 0, 0, 0, 0, 0},  // Linha 0
          { 0, 0, 0, 0, 0, 0},  // Linha 1
          { 0, 0, 0, 0, 0, 0},  // Linha 2
          { 0, 0, 0, 0, 0, 0},  // Linha 3
          { 0, 0, 0, 0, 0, 0},  // Linha 4
          { 0, 0, 0, 0, 0, 0},  // Linha 5
          { 0, 0, 0, 0, 0, 0},  // Linha 6
          { 0, 0, 0, 0, 0, 0},  // Linha 7
          { 0, 0, 0, 0, 0, 0},  // Linha 8
          { 0, 0, 0, 0, 0, 0},  // Linha 9
          { 0, 0, 0, 0, 0, 0},  // Linha 10
          { 0, 0, 0, 0, 0, 0},  // Linha 11
          { 0, 0, 0, 0, 0, 0},  // Linha 12
          { 0, 0, 0, 0, 0, 0},  // Linha 13
          { 0, 0, 0, 0, 0, 0},  // Linha 14
          { 0, 0, 0, 0, 0, 0},  // Linha 15
          { 0, 0, 0, 0, 0, 0},  // Linha 16
          { 0, 0, 0, 0, 0, 0},  // Linha 17
          { 0, 0, 0, 0, 0, 0},  // Linha 18
          { 0, 0, 0, 0, 0, 0},  // Linha 19
          { 0, 0, 0, 0, 0, 0},  // Linha 20
          { 0, 0, 0, 0, 0, 0},  // Linha 21
          { 0, 0, 0, 0, 0, 0},  // Linha 22
          { 0, 0, 0, 0, 0, 0},  // Linha 23
        };
        while(menuOn){
            desenhaMapa();
            
            System.out.println("Digite um número para opção desejada: ");
            opcao = in.nextInt();
        }
        
    }
    
    private static void desenhaMapa(){
            System.out.println("================================= Menu =================================");
            System.out.println("         -----------------------------------------------------          ");
            for(int i=0;i<24;i++){
            System.out.println("         |  A1  |  B1  |  C1  |          |  D1  |  E1  |  F1 |          ");
            System.out.println("         ----------------------          ---------------------          ");
        }       
           }
    
    private static void arrayOcupacao(int [] [] lug, int userI, int userC){ 
        for(int i = 0; i<lug.length; i++){
            for(int c = 0; c<lug[i].length; c++){
                if(userI == i || userC == c){
                lug[i][c] = 1;}
            }
        }
    }
    
    
    private static String rotativoString(String texto){  //Metodo que pega o primeiro caracter do texto inserido pelo usuario e coloca como ultimo.
        int numTexto = texto.length();
        String rS = "";
        char primeiroC = texto.charAt(0); // Pega primeiro caracter.
        for(int i = 0; i<texto.length();i++){  // For para pegar o restante dos caracteres.
            if(i>0){
                char c = texto.charAt(i);
                rS = rS + c;
            } 
        }
        rS = rS+primeiroC; // juncao do restante dos caracteres + o primeiro caracter.
        return rS;
    }
}
