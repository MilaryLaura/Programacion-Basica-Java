package tipodato;
public class TipoDato {
    public static void main(String[] args) {
        //Cadenas o Strings
        //Declarando
        String Nombre;
        int Edad;
        boolean Estado;
        double Saldo;
        Object TodoTipoDato;
        
        //Asignado
        Nombre  = "Milary Yulyana Laura Machaca";
        Edad = 19;
        Saldo = 1000.34;
        TodoTipoDato = "Cadena";
        TodoTipoDato = 2;
        TodoTipoDato = true;
        TodoTipoDato = 23.23;
        
        //Imprimiendo
        System.out.println("Nombre: " + Nombre);
        System.out.println("Edad: " + Edad);
        System.out.println("Saldo: " + Saldo);
        System.out.println("Dinamico: " + TodoTipoDato);
    }   
}
