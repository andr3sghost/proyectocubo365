package rams.cubo869;

public class Cubo869 { 
    
public static int C1 [][] = {  {0,0,0,0}, {0,11,12,13}, {0,14,15,16}, {0,17,18,19} };
public static int C2 [][] = {  {0,0,0,0}, {0,21,22,23}, {0,24,25,26}, {0,27,28,29} };
public static int C3 [][] = {  {0,0,0,0}, {0,31,32,33}, {0,34,35,36}, {0,37,38,39} };
public static int C4 [][] = {  {0,0,0,0}, {0,41,42,43}, {0,44,45,46}, {0,47,48,49} };
public static int C5 [][] = {  {0,0,0,0}, {0,51,52,53}, {0,54,55,56}, {0,57,58,59} };
public static int C6 [][] = {  {0,0,0,0}, {0,61,62,63}, {0,64,65,66}, {0,67,68,69} };

public static void ImprimeMatriz(int C[][]){
    for (int i = 1; i <= 3; i++){
        System.out.print("        ");    
         for (int j = 1; j <= 3; j++) 
            System.out.print(C[i][j]+" ");
        System.out.println("");
    } //Fin del ciclo 1
} //Fin del método ImprimeMatriz
   
public static void ImprimeTresCaras(int Cx[][], int Cy[][],int Cz[][]){
    for (int i = 1; i <= 3; i++) {
        for (int v = 1; v <= 3; v++){
            for (int j = 1; j <= 3; j++){
            if (v==1) System.out.print(Cx[i][j]+" ");
            if (v==2) System.out.print(Cy[i][j]+" ");
            if (v==3) System.out.print(Cz[i][j]+" ");   
            }//Fin del ciclo j
        }//Fin del ciclo v (veces)
         System.out.println("");
    }
}//Fin del metodo ImprimeTresCaras

public static void ImprimeCubo(){
    ImprimeMatriz(C1);
    ImprimeTresCaras(C5,C2,C6);
    ImprimeMatriz(C3);
    ImprimeMatriz(C4);
    System.out.println("==================================================");
}

public static void RDC6(){
    int t = C6[1][3];
    C6[1][3] = C6[1][1];
    C6[3][3] = C6[1][3];
    C6[3][1] = C6[3][3];
    C6[3][3] = t;
    t=C6[2][3];
    C6[2][3] = C6[1][2];
    C6[1][2] = C6[2][1];
    C6[2][1] = C6[3][2];
    C6[3][2] = t;
    
}//Fin del metodo RDC6

public static void A3(){
    int t; 
    for(int i=1;i<=3;i++){
    t = C1[i][3];
    C1[i][3] = C2[i][3];
    C2[i][3] = C3[i][3];
    C3[i][3] = C4[i][3];
    C4[i][3] =t;
    }//Fin del ciclo i
    
    RDC6();
    ImprimeCubo();
} //Fin del metodo A3


    public static void main(String[] args) {
        ImprimeCubo();
        A3();
       
        
    }//Fin del método main
    
}//Fin del proyecto



   
    
