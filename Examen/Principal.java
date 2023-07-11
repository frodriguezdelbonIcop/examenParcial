package Examen;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Seguros seguro = new Seguros("La tercera seguros");
		
		seguro.agregarPoliza();
		seguro.buscarMatricula(124421);
		seguro.filtrarPolizas(Cobertura.total);
		seguro.mostrarClientes();
		seguro.MostrarVehiculos();
		seguro.buscarPersonaDni(1242141);
		seguro.buscarPoliza(1242);
		seguro.Pagar();
		seguro.buscarPersona(21421);
	}

}
