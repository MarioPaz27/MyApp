/**
 * 
 */
package main;

/**
 * @author HTC
 *
 */
public class Alumn extends Person{

	/**
	 * 
	 */
	public Alumn() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public void yearsOld() {
		
		if(super.getEdad()<12) {
			System.out.println("El alumno "+ super.getNombre()+" "+super.getApellido()+" es adolescente.");
		}
	}

}
