/**
 * 
 */
package main;

import java.util.Date;
import java.util.Scanner;

/**
 * @author HTC
 *
 */
public abstract class Person {
	
	//attribute about class
	private String nombre, apellido;
	private Date fecha;
	private int edad;

	/**
	 * 
	 */
	
	//gets and sets methods in class Person
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	//methods to show data
	public void aksInformation() {
		System.out.println("========== Solcitamos la siguiente la informacion ============");
		
		@SuppressWarnings("resource")
		Scanner d=new Scanner(System.in);
		
		System.out.println("Nombre:");
		nombre=d.nextLine();
		System.out.println("Apellido:");
		apellido=d.nextLine();
		System.out.println("Edad:");
		edad=d.nextInt();
		Date dNow = new Date();
	    fecha = dNow;
	    
		
	}
	
	public void showInformation() {
		System.out.println("Nombre Completo: "+nombre+" "+apellido);
		System.out.println("Edad: "+edad);
		System.out.println("Fecha: "+fecha);
	}
}
