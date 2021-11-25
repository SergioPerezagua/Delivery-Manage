package persona;

public class Camionero extends Persona {
	
	private static final double SMI = 985.0;
	
	private double salario;
	
	public Camionero(){
		super();
		this.salario = SMI;
	}

	public Camionero(String dni, String nombre, String telefono, String direccion, String poblacion,double salario) {
		super(dni, nombre, telefono, direccion, poblacion);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	
}
