package Examen;

import java.util.*;

enum Genero{Masculino,Femenino}
public class Cliente {
	private String nombre;
	private String apellido;
	private Genero genero;
	private int DNI;
	private String email;
	private String domicilio;
	private int telefono;
    Scanner sc= new Scanner(System.in);

	
	
	
	
	public Cliente(String nombre, String apellido, Genero genero, int dNI, String email, String domicilio,
			int telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		DNI = dNI;
		this.email = email;
		this.domicilio = domicilio;
		this.telefono = telefono;
	}




	public Cliente() {
		System.out.println("Ingrese su nombre");
		this.nombre = sc.next();
		System.out.println("Ingrese su apellido");
		this.apellido = sc.next();
		System.out.println("Seleccione su genero 1- masculino 2- femenino");
		int gen = sc.nextInt();
		
		switch(gen) {
		case 1: this.genero = Genero.Masculino;
		break;
		case 2: this.genero = Genero.Femenino;
		break;
		default: System.out.println("Valor fuera de rango, default masculino");
		this.genero = Genero.Masculino;
		}
		System.out.println("Ingrese su DNI");
		this.DNI = sc.nextInt();
		System.out.println("Ingrese su email");
		this.email = sc.next();
		System.out.println("Ingrese su domicilio");
		this.domicilio = sc.next();
		System.out.println("Ingrese su telefono");
		this.telefono = sc.nextInt();
		
		
		
	}

	public void Mostrar() {
		System.out.println("Nombre: "+this.nombre+" Apellido: "+this.apellido+" Genero: "+this.genero+" DNI "+ this.DNI+ " email: "+
				this.email+" domicilio: "+this.domicilio+" telefono: "+this.telefono
				);
		
	}


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




	public Genero getGenero() {
		return genero;
	}




	public void setGenero(Genero genero) {
		this.genero = genero;
	}




	public int getDNI() {
		return DNI;
	}




	public void setDNI(int dNI) {
		DNI = dNI;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getDomicilio() {
		return domicilio;
	}




	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}




	public int getTelefono() {
		return telefono;
	}




	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
}
