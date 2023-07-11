package Examen;

public class Autobus extends Vehiculo{
	private int nroPlazas;

	public Autobus(String marca, String modelo, int anio, int nroMotor, String chasis, String potenciaCV,
			int matricula, int nroPlazas) {
		super(marca, modelo, anio, nroMotor, chasis, potenciaCV, matricula);
		this.nroPlazas = nroPlazas;
	}
	
	public Autobus() {
		super();
		System.out.println("ingrese el nro de plazas");
		this.nroPlazas = sc.nextInt();
		Poliza poliza = new Poliza();
	}

	public int getNroPlazas() {
		return nroPlazas;
	}

	public void setNroPlazas(int nroPlazas) {
		this.nroPlazas = nroPlazas;
	}
	
	
}
