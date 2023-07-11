package Examen;

import java.util.Scanner;

public class Cuotas extends Poliza{
	private boolean pagado;
    Scanner sc= new Scanner(System.in);

	
    
	public Cuotas(int nroPoliza, String fechaInicio, String fechaFin, int nroCuotas, Pago formaPago, int montoTotal,
			boolean incluyeGranizo, int montoMaxGranizo, Cobertura cobertura, boolean pagado) {
		super(nroPoliza, fechaInicio, fechaFin, nroCuotas, formaPago, montoTotal, incluyeGranizo, montoMaxGranizo,
				cobertura);
		this.pagado = pagado;
	}




	public Cuotas() {
		
		
		System.out.println("Va a pagar ahora? 1- Si 2- NO" );
		int pag = sc.nextInt();
		switch(pag) {
		case 1: this.pagado = true;
		break;
		case 2: this.pagado = false;
		break;
		default: this.pagado = false;
		}
		

		
		
		
	}

	

	public boolean setPago() {
		return this.pagado = true;
	}
	public boolean Pagado(){
		return true;
	}
	
	public boolean isPagado() {
		return pagado;
	}

	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}


	
	
	

}
