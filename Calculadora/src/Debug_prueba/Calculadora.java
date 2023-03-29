package Debug_prueba;


/**
 * @author Roberto Serna
 *
 */
public class Calculadora {
	
	public Calculadora(){
        
    }
    
    public int suma(int num1,int num2){
        return num1+num2;
    }
    
    public int resta(int num1,int num2){
        return num1-num2;
    }
    
    public int multiplica(int num1,int num2){
        return num1*num2;
    }
    
    public int divide(int num1,int num2){
        if (num2==0) throw new ArithmeticException("NO PUEDES DIVIDIR POR CERO, MELON");
        return num1/num2;
    }

    public Calculadora(int valor1, int valor2) {
		
		this.valor1 = valor1;
		this.valor2 = valor2;
}
    
	private int valor1;
	private int valor2;
}

