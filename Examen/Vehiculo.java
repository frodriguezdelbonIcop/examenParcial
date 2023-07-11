package Examen;

import java.util.Scanner;

public class Vehiculo  {
	private String marca;
	private String modelo;
	private int anio;
	private int nroMotor;
	private String chasis;
	private String potenciaCV;
	private int matricula;
    Scanner sc= new Scanner(System.in);

	
	
	
	public Vehiculo(String marca, String modelo, int anio, int nroMotor, String chasis, String potenciaCV,
			int matricula) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.nroMotor = nroMotor;
		this.chasis = chasis;
		this.potenciaCV = potenciaCV;
		this.matricula = matricula;
	}




	public Vehiculo() {
		System.out.println("Ingrese la marca del vehiculo");
		this.marca = sc.next();
		System.out.println("Ingrese el modelo del vehiculo");
		this.modelo = sc.next();
		System.out.println("Ingrese el año del vehiculo");
		this.anio = sc.nextInt();
		System.out.println("Ingrese el nro del motor");
		this.nroMotor = sc.nextInt();
		System.out.println("Ingrese el chasis");
		this.chasis = sc.next();
		System.out.println("Ingrese la potenciaCV");
		this.potenciaCV = sc.next();
		System.out.println("Ingrese la matricula");
		this.matricula = sc.nextInt();
		
	}


	public void MostrarVehiculo() {
		System.out.println("Marca "+this.marca+" modelo: "+this.modelo+" año "+this.anio+" nroMotor "+this.nroMotor+
				" chasis "+this.chasis+" potenciaCV "+this.potenciaCV+" matricula "+this.matricula
				);
	}
	
	

	
	public String getMarca() {
		return marca;
	}




	public void setMarca(String marca) {
		this.marca = marca;
	}




	public String getModelo() {
		return modelo;
	}




	public void setModelo(String modelo) {
		this.modelo = modelo;
	}




	public int getAnio() {
		return anio;
	}




	public void setAnio(int anio) {
		this.anio = anio;
	}




	public int getNroMotor() {
		return nroMotor;
	}




	public void setNroMotor(int nroMotor) {
		this.nroMotor = nroMotor;
	}




	public String getChasis() {
		return chasis;
	}




	public void setChasis(String chasis) {
		this.chasis = chasis;
	}




	public String getPotenciaCV() {
		return potenciaCV;
	}




	public void setPotenciaCV(String potenciaCV) {
		this.potenciaCV = potenciaCV;
	}




	public int getMatricula() {
		return matricula;
	}




	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	
}
