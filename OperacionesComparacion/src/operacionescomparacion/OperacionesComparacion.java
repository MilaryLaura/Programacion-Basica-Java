package operacionescomparacion;
public class OperacionesComparacion {
    public static void main(String[] args) {
        int num1 = 14;
        int num2 = 18;
        
        //Igual ==
        boolean igual = num1 == num2;
        System.out.println(num1 +" es igual que "+ num2 +" = "+ igual);
        
        //Mayor >
        boolean Mayor = num1 > num2;
        System.out.println(num1+ " es Mayor que " + num2 +" = "+ Mayor);
        
        //Menor <
        boolean Menor = num1 < num2;
        System.out.println(num1+ " es Menor que " + num2 + " = "+ Menor);
        
        //Mayor Igual
        boolean MayorIgual = num1 >= num2;
        System.out.println(num1+ " es Mayor Igual que " + num2 + " = "+ MayorIgual);
        
        //Menor Igual
        boolean MenorIgual = num1 <= num2;
        System.out.println(num1+ " es Menor Igual que " + num2 + " = " +MenorIgual);
        
        //Diferente
        if (num1 != num2) {
            System.out.println(num1 + " es diferente de " + num2);
        } else {
            System.out.println(num1+ " es igual a " + num2);
        }
    }
}
//Milary Yulyana LAURA


