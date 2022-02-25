package sv.edu.udb.ejemplo1;
import javax.swing.*;

public class Ejemplo1 {
	public static void main(String[] args) {
		
		//Declaramos variables
		String temp;
		int x=0;
		int respuesta;
		
		temp = JOptionPane.showInputDialog(null,
				"Ingrese el valor de x");
		
		while((temp.equals("1"))) {
			temp = JOptionPane.showInputDialog(null,
					"Valor erroneo ingrese nuevamente x");
		}
				
		x = Integer.parseInt(temp);
		
		respuesta = (int) Math.pow(x+2,2)/(x-1);
		
		JOptionPane.showMessageDialog(null,
				"La respuesta es: "+ respuesta);
	}
}
