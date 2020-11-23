


import java.util.Scanner;
public class E4
{
    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);
        Boolean menuOn = true;
        String opcao;
        int[][] lugares = {
         // A  B  C  D  E  F    // MATRIZ 6x24
          { 2, 2, 2, 2, 2, 2},  // Linha 0
          { 1, 1, 1, 1, 1, 1},  // Linha 1
          { 1, 1, 1, 1, 1, 1},  // Linha 2
          { 1, 1, 1, 1, 1, 1},  // Linha 3
          { 1, 1, 1, 1, 1, 1},  // Linha 4
          { 1, 1, 1, 1, 1, 1},  // Linha 5
          { 0, 1, 1, 1, 1, 0},  // Linha 6
          { 1, 1, 1, 1, 1, 1},  // Linha 7
          { 1, 1, 1, 1, 1, 1},  // Linha 8
          { 2, 2, 2, 2, 2, 2},  // Linha 9
          { 3, 3, 3, 3, 3, 3},  // Linha 10
          { 1, 1, 1, 1, 1, 1},  // Linha 11
          { 1, 1, 1, 1, 1, 1},  // Linha 12
          { 1, 1, 1, 1, 1, 1},  // Linha 13
          { 1, 1, 1, 1, 1, 1},  // Linha 14
          { 1, 1, 1, 1, 1, 1},  // Linha 15
          { 1, 1, 1, 1, 1, 1},  // Linha 16
          { 1, 1, 1, 1, 1, 1},  // Linha 17
          { 1, 1, 1, 1, 1, 1},  // Linha 18
          { 1, 1, 1, 1, 1, 1},  // Linha 19
          { 1, 1, 1, 1, 1, 1},  // Linha 20
          { 1, 1, 1, 1, 1, 1},  // Linha 21
          { 1, 1, 2, 2, 1, 1},  // Linha 22
          { 0, 0, 0, 0, 0, 0}   // Linha 23
        };
        while(menuOn){
            desenhaMapa(lugares);
            
            System.out.println("Digite separadamente a coluna e a linha do seu assento: ");
            opcao = in.nextLine();
            menuOn = false;
        }
        
    }
    
    private static void desenhaMapa(int [] [] lug){
            System.out.println("======================== Menu ========================");
            System.out.println("-----------------------------------------------------");
            for (int l=0; l<lug.length; l++) {
            for (int c=0; c<lug[l].length; c++) {
                if(lug[l][c] >3){
                System.out.printf(" |    | ");}
                else{
                    String letra = "";
                    int n = l+1;
                    switch(c){
                        case 0: letra = "A";
                        break;
                        case 1: letra = "B";
                        break;
                        case 2: letra = "C";
                        break;
                        case 3: letra = "D";
                        break;
                        case 4: letra = "E";
                        break;
                        case 5: letra = "F";
                        break;
                    }
                System.out.printf(" | " + letra + "%d | ", n);
            }
            }
            System.out.println("\n ");
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
