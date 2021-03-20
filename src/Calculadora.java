/**
 * 
 * @author Alexelgt
 * @version 0.2
 * @since 0.1
 */
public class Calculadora {
	
	/**
	 * @param a Valor que representa el primer operando
	 * @param b Valor que representa el segundo operando
	 * @return Resultado de la operación
	 */
	public float suma(float a, float b) {
		return a + b;
	}

	/**
	 * @param a Valor que representa el primer operando
	 * @param b Valor que representa el segundo operando
	 * @return Resultado de la operación
	 */
	public float resta(float a, float b) {
		return a - b;
	}

	/**
	 * @param a Valor que representa el primer operando
	 * @param b Valor que representa el segundo operando
	 * @return Resultado de la operación
	 */
	public float multiplicacion(float a, float b) {
		return a * b;
	}
	
	/**
	 * @param a Valor que representa el primer operando
	 * @param b Valor que representa el segundo operando
	 * @throws ArithmeticException El segundo operando no puede ser 0
	 * @return Resultado de la operación
	 */
	public float division(float a, float b) throws ArithmeticException {
		if (b == 0) {
			throw new ArithmeticException("división entre 0");
		}
		return a / b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
