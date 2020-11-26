


import java.util.Scanner;
public class E4
{
    static String assentoRecomend = "";
    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);
        String menuOn = "A";
        String letraP = "";
        int[][] lugares = { // array com numeros que definem o valor de cada assento de 0 a 3, após serem reservados passam a valer o valor correto.
         // A  B  C  D  E  F    // MATRIZ 6x24
          { 2, 107, 2, 107, 2, 2},  // Linha 0
          { 100, 1, 1, 1, 1, 100},  // Linha 1
          { 1, 100, 1, 1, 1, 1},  // Linha 2
          { 1, 1, 1, 100, 1, 100},  // Linha 3
          { 1, 1, 1, 1, 1, 1},  // Linha 4
          { 1, 100, 1, 1, 1, 1},  // Linha 5
          { 0, 1, 1, 1, 1, 0},  // Linha 6
          { 1, 100, 1, 100, 1, 1},  // Linha 7
          { 1, 1, 1, 1, 100, 100},  // Linha 8
          { 2, 2, 107, 2, 2, 2},  // Linha 9
          { 3, 3, 3, 3, 112, 112},  // Linha 10
          { 1, 1, 100, 1, 1, 1},  // Linha 11
          { 1, 1, 1, 1, 1, 1},  // Linha 12
          { 1, 1, 1, 100, 100, 100},  // Linha 13
          { 100, 100, 100, 1, 1, 1},  // Linha 14
          { 1, 100, 1, 1, 100, 1},  // Linha 15
          { 1, 1, 100, 1, 1, 1},  // Linha 16
          { 100, 1, 1, 1, 100, 1},  // Linha 17
          { 100, 100, 1, 1, 1, 1},  // Linha 18
          { 100, 1, 1, 1, 1, 1},  // Linha 19
          { 100, 1, 1, 1, 100, 1},  // Linha 20
          { 1, 100, 1, 1, 1, 1},  // Linha 21
          { 1, 1, 2, 2, 1, 1},  // Linha 22
          { 0, 0, 0, 90, 90, 90}   // Linha 23
        };
        while(!"X".equals(menuOn)){//menu que fica em ciclo até que a letra x seja apertada
            desenhaMapa(lugares);
            System.out.println("Digite o assento desejado: ");
            letraP = in.nextLine().toUpperCase();
                if(!"X".equals(letraP)){
                    lugares = registraOcupacao(lugares, letraP);
                }
            
            menuOn = letraP;
        }
        
    }
    
    private static void desenhaMapa(int [] [] lug)// desenha no mapa os assentos livres
    {
        int numAssentos = 144;
        int numAssentosDisp = 0;
        int numAssentosOcup = 0;
        double totalReservas = 0;
        System.out.println("======================== Menu ========================");
        System.out.println("-----------------------------------------------------");
            for (int l=0; l<lug.length; l++) {// for para percorrer o array de assentos
                for (int c=0; c<lug[l].length; c++) {
                    if(lug[l][c] >3){
                        if(l>10){System.out.printf(" |     | ");}
                        else System.out.printf(" |    | ");
                        numAssentosOcup ++; 
                        totalReservas = totalReservas + lug[l][c];
                    }
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
                    numAssentosDisp++;
                    String assentoLivre = letra + n;
                    assentoRecomend = assentoLivre;
                }
            }
            System.out.println("\n ");
            }
            System.out.println("Total de assentos: " + numAssentos);
            System.out.println("Total de assentos Disponíveis: " + numAssentosDisp);
            System.out.println("Total de assentos Ocupados: " + numAssentosOcup);
            System.out.println("Total acumulado em reservas: " + totalReservas + "$");
           }
    
    private static int [][] registraOcupacao(int [] [] lug, String letraP){ //registra ocupacao de assento
        char cC = 'Z';
        char U;
        char D;
        int numL = 99;
        int numL2 = 99;
            if(letraP.length()<4 && letraP.length()>1){
                switch(letraP.length()){
                    case 2: cC = letraP.charAt(0);
                        U = letraP.charAt(1);
                        numL = Character.getNumericValue(U) - 1;
                        numL2 = numL + 1;
                        break;
                    case 3: cC = letraP.charAt(0);
                        D = letraP.charAt(1);
                        U = letraP.charAt(2);
                        numL = (Character.getNumericValue(D)*10) + Character.getNumericValue(U) - 1;
                        numL2 = numL + 1;
                        break;
                    
            }
        
        int numC = 99;
        String userC = cC + "";
            switch(userC){ //transforma para numero
                        case "A": numC = 0;
                            break;
                        case "B": numC = 1;
                            break;
                        case "C": numC = 2;
                            break;
                        case "D": numC = 3;
                            break;
                        case "E": numC = 4;
                            break;
                        case "F": numC = 5;
                            break;
                    }
                    for (int l=0; l<lug.length; l++) {
                        if(numL == l){
                            for (int c=0; c<lug[l].length; c++) {
                                if(numC == c){
                                    if(lug[l][c] > 3){System.out.println("Assento ocupado. Recomendamos o assento: " + assentoRecomend + ".");}
                                    else{
                                        switch(lug[l][c]){ //preenche o assento com o valor em reais correspondente após ser reservado.
                                            case 0: lug [l][c] = 90;
                                                System.out.println("Foi realizada com succeso a reserva do assento " + userC + numL2 + " no valor de " + lug [l][c] + " reais.");
                                                break;
                                            case 1: lug [l][c] = 100;
                                                System.out.println("Foi realizada com succeso a reserva do assento " + userC + numL2 + " no valor de " + lug [l][c] + " reais.");
                                                break;
                                            case 2: lug [l][c] = 107;
                                                System.out.println("Foi realizada com succeso a reserva do assento " + userC + numL2 + " no valor de " + lug [l][c] + " reais.");
                                                break;
                                            case 3: lug [l][c] = 112;
                                                System.out.println("Foi realizada com succeso a reserva do assento " + userC + numL2 + " no valor de " + lug [l][c] + " reais.");
                                                break;
                    }
                }
            }
            }
        }
        }
    }
        else System.out.println("Valores digitados inválidos. Por favor, digite corretamente o nome do assento.");
        return lug;
    }
}
