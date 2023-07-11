package Examen;

import java.util.*;

enum Cobertura{total,contraTerceros,Parcial}
enum Pago{Efectivo,transferencia,debitoAutomatico}

public class Poliza {
	private int nroPoliza;
	private int nro = 1000;
	private String fechaInicio;
	private String fechaFin;
	private int nroCuotas;
	private Pago formaPago;
	private int montoTotal;
	private boolean incluyeGranizo;
	private int montoMaxGranizo;
	private Cobertura cobertura;
    Scanner sc= new Scanner(System.in);
    


	public Poliza(int nroPoliza, String fechaInicio, String fechaFin, int nroCuotas, Pago formaPago, int montoTotal,
			boolean incluyeGranizo, int montoMaxGranizo, Cobertura cobertura) {
		super();
		this.nroPoliza = nroPoliza;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.nroCuotas = nroCuotas;
		this.formaPago = formaPago;
		this.montoTotal = montoTotal;
		this.incluyeGranizo = incluyeGranizo;
		this.montoMaxGranizo = montoMaxGranizo;
		this.cobertura = cobertura;

	}
	
	public Poliza() {
		nroPoliza = nro++;
		System.out.println("Ingresa la fecha de inicio");
		this.fechaInicio = sc.next();
		System.out.println("Ingresa la fecha de finalizacion");
		this.fechaFin = sc.next();
		System.out.println("Ingresa la cantidad de cuotas");
		this.nroCuotas = sc.nextInt();
		System.out.println("Ingresa la forma de pago 1 2 3");
		int pag = sc.nextInt();
		
		switch(pag) {
		case 1: this.formaPago = Pago.Efectivo;
		break;
		case 2: this.formaPago = Pago.transferencia;
		break;
		case 3: this.formaPago = Pago.debitoAutomatico;
		break;
		default: System.out.println("No ingreso numero correcto, default efectivo");
		this.formaPago = Pago.Efectivo;
		break;
		}
		System.out.println("Ingresa el monto total");
		this.montoTotal = sc.nextInt();
		System.out.println("Quieres incluir granizo? 1 2");
		pag = sc.nextInt();
		switch(pag) {
		case 1: this.incluyeGranizo = true;
		break;
		case 2: this.incluyeGranizo = false;
		break;
		default: System.out.println("numero incorrecto, default NO");
		this.incluyeGranizo = false;
		break;
		}
		if(this.incluyeGranizo) {
			System.out.println("Ingresa el monto total del granizo");
			this.montoMaxGranizo = sc.nextInt();
		}else {
			this.montoMaxGranizo = 0;
		}
		
		System.out.println("Ingrese el tipo de cobertura 1 2 3 ");
		pag = sc.nextInt();
		
		switch(pag) {
		case 1: this.cobertura = Cobertura.contraTerceros;
		break;
		case 2: this.cobertura = Cobertura.Parcial;
		break;
		case 3: this.cobertura = Cobertura.total;
		break;
		default: this.cobertura = Cobertura.contraTerceros;
		}
		Cuotas cuota = new Cuotas();
	}
	
	
	public void mostrarPoliza() {
		System.out.println("Numero Poliza"+this.nroPoliza+" fecha de inicio "+this.fechaInicio+" fecha fin "+this.fechaFin
				+ " Cantidad de cuotas "+this.nroCuotas+" forma de pago "+this.formaPago+ " monto total "+this.montoTotal+
				" incluye granizo? "+this.incluyeGranizo+ " Si incuye granizo, el monto total del mismo es de "+this.montoMaxGranizo
				+" la cobertura es "+this.cobertura
				);
	}

	
	public int getNroPoliza() {
		return nroPoliza;
	}

	public void setNroPoliza(int nroPoliza) {
		this.nroPoliza = nroPoliza;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public int getNroCuotas() {
		return nroCuotas;
	}

	public void setNroCuotas(int nroCuotas) {
		this.nroCuotas = nroCuotas;
	}

	public Pago getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(Pago formaPago) {
		this.formaPago = formaPago;
	}

	public int getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(int montoTotal) {
		this.montoTotal = montoTotal;
	}

	public boolean isIncluyeGranizo() {
		return incluyeGranizo;
	}

	public void setIncluyeGranizo(boolean incluyeGranizo) {
		this.incluyeGranizo = incluyeGranizo;
	}

	public int getMontoMaxGranizo() {
		return montoMaxGranizo;
	}

	public void setMontoMaxGranizo(int montoMaxGranizo) {
		this.montoMaxGranizo = montoMaxGranizo;
	}

	public Cobertura getCobertura() {
		return cobertura;
	}

	public void setCobertura(Cobertura cobertura) {
		this.cobertura = cobertura;
	}


	
	
	
}
