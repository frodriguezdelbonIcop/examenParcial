package Examen;

import java.util.ArrayList;
import java.util.Scanner;

public class Seguros {
	private String nombre;
    Scanner sc= new Scanner(System.in);
    private ArrayList<Cliente> clientes;
    private ArrayList<Vehiculo> vehiculos;
    private ArrayList<Poliza> polizas;
	public Seguros(String nombre) {
		this.nombre = nombre;
		this.clientes = new ArrayList<>();
		this.vehiculos = new ArrayList<>();
		this.polizas = new ArrayList<>();
	}
	
	public Seguros() {
		System.out.println("Ingrese nombre del establecimiento");
		this.nombre = sc.next();
	}

	public void agregarPoliza() {
		System.out.println("Bienvenido a registrar una Poliza");
		System.out.println("Por favor, presione 1 para comenzar");
		int agre = sc.nextInt();
		
		switch(agre) {
		case 1: System.out.println("Ingrese el DNI de la persona");
		int dni = sc.nextInt();
		boolean registrado = buscarPersonaDni(dni);
				if(registrado) {
					System.out.println("La persona ya esta registrada");
					System.out.println("Ingrese el numero de matricula");
					int matr = sc.nextInt();
					registrado = buscarVehiculo(matr);
					if(registrado) {
						System.out.println("Su vehiculo ya esta registrado");
						System.out.println("Ingrese la Poliza correspondiente");
						Poliza poliza = new Poliza();
						polizas.add(poliza);

					}else {
						System.out.println("Su vehiculo no esta registrado, ingreselo por favor");
						System.out.println("Su vehiculo es un taxi o un Autobus?  1 2");
						int ve = sc.nextInt();
						switch(ve) {
						case 1: Taxi taxi = new Taxi();
						vehiculos.add(taxi);
						break;
						case 2: Autobus autobus = new Autobus();
						vehiculos.add(autobus);
						}
					}
				}else {
					System.out.println("Nuevo cliente, ingrese sus datos");
					Cliente cl = new Cliente();
					clientes.add(cl);
				}
		}
	}
	
	public void filtrarPolizas(Cobertura cobertura) {
		for (int i=0;i<polizas.size();i++) {
			if(polizas.get(i).getCobertura()==cobertura) {
				polizas.get(i).mostrarPoliza();
			}
		}
	}
	public void buscarPersona(int dni) {
		for (int i=0;i<clientes.size();i++) {
			if(clientes.get(i).getDNI()==dni) {
				clientes.get(i).Mostrar();
			}
		}
	}
	public void mostrarClientes() {
		for (int i=0;i<clientes.size();i++) {
			clientes.get(i).Mostrar();
		}
	}
	
	public void MostrarVehiculos() {
		for (int i=0;i<vehiculos.size();i++) {
			vehiculos.get(i).MostrarVehiculo();
		}
	}
	public void buscarPoliza(int nro) {
		for (int i=0;i<polizas.size();i++) {
			if(polizas.get(i).getNroPoliza()==nro) {
				polizas.get(i).mostrarPoliza();
			}
		}
	}
	
	public boolean buscarPersonaDni(int dni) {
		for (int i=0; i<clientes.size();i++) {
			if (clientes.get(i).getDNI()==dni) {
				return true;
			}
		}
		return false;
		}
	
	
	public boolean buscarVehiculo(int matricula) {
		for (int i=0; i<vehiculos.size();i++) {
			if (vehiculos.get(i).getMatricula()==matricula) {
				return true;
			}
		}
		return false;
		}
	
	public Vehiculo buscarMatricula(int matricula) {
		for (int i=0; i<vehiculos.size();i++) {
			if (vehiculos.get(i).getMatricula()==matricula) {
				return vehiculos.get(i);
			}
		}
		return null;
		}
		
	public void Pagar() {
		Cuotas cuota = new Cuotas();
		cuota.setPago();

	}
	//Getters y Setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	
	
}
