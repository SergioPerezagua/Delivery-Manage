package persona;

public class Persona {
	
	private String dni;
	private String nombre;
	private String telefono;
	private String direccion;
	private String poblacion;
	
	public Persona(String dni, String nombre, String telefono, String direccion, String poblacion) {
		this.dni = dni;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.poblacion = poblacion;
	}

	public Persona(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.dni="";
		this.poblacion="";
		this.telefono="";
	}
	

	public Persona() {
		this.dni = "";
		this.nombre = "";
		this.telefono = "";
		this.direccion = "";
		this.poblacion = "";
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}
	
	
}
