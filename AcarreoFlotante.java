//Wilberth Gamboa
public class AcarreoFlotante{

    public static void main(String[] args) {

        System.out.println("Comparar 2.3-1.3==1");
        if (2.3-1.3==1)
        {
         System.out.println("Verdadero");
            /* code */
        }else{
            System.out.println("Falso");
        }
        
       System.out.println();
        System.out.println("Comparar 2.3-1.3==1.0");
        if (2.3-1.3==1.0){
            System.out.println("Verdadero");
            /* code */
        }else{
            System.out.println("Falso");
        }
        System.out.println();

        System.out.println("Comparar (float)2.3-(float)1.3==1");
        if ((float)2.3-(float)1.3==1)
        {
         System.out.println("Verdadero");
            /* code */
        }else{
            System.out.println("Falso");
        }
        
        System.out.println();
        System.out.println("Comparar (float)2.3-(float)1.3==1.0");
        if ((float)2.3-(float)1.3==1.0){
            System.out.println("Verdadero");
            /* code */
        }else{
            System.out.println("Falso");
        }
        System.out.println();
        double x = 2.3-1.3;
        float y = (float)2.3-(float)1.3;
        System.out.println("El valor de 2.3-1.3 como double ="+x);
        System.out.println("El valor de (float)2.3-(float)1.3 como float ="+y);
        
    }
}