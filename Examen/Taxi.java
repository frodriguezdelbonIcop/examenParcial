package Examen;

public class Taxi extends Vehiculo {
	private int nroLicencia;

	public Taxi(String marca, String modelo, int anio, int nroMotor, String chasis, String potenciaCV, int matricula,
			int nroLicencia) {
		super(marca, modelo, anio, nroMotor, chasis, potenciaCV, matricula);
		this.nroLicencia = nroLicencia;
	}
	
	public Taxi() {
		super();
		System.out.println("Ingrese el nro de licencia");
		this.nroLicencia = sc.nextInt();
		Poliza poliza = new Poliza();

	}

	public int getNroLicencia() {
		return nroLicencia;
	}

	public void setNroLicencia(int nroLicencia) {
		this.nroLicencia = nroLicencia;
	}
	
	
	
}
