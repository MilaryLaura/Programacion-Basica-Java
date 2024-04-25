package operadoresaritmeticos;
public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int variableUno = 50;
        int variableDos = 20;
        
        //Incremento
        //variableUno = variableUno + 1;
        variableUno ++;
        System.out.println("Incremento: " + variableUno);
        
        //Decremento
        //variableDos = variableDos - 1;
        variableDos --;
        System.out.println("Decremento: " + variableDos);
        
        //Suma
        int Suma = variableUno + variableDos;
        System.out.println("Resultado Suma: " + Suma);
        
        //Resta
        int Resta = variableUno - variableDos;
        System.out.println("Resultado Resta: " + Resta);        
        
        //Mutiplicacion
        int Multi = variableUno * variableDos;
        System.out.println("Resultado Multiplicacion: " + Multi);        
        
        //Division
        double Divi = variableUno / variableDos;
        System.out.println("Resultado Division: " + Divi);        
        
        //Modulo
        int Modulo = variableUno % variableDos;
        System.out.println("Resultado Modulo: " + Modulo);
    }
} //Milary Yulyana Laura Machaca
