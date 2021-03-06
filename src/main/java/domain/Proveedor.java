package domain;

import java.util.Objects;
import java.util.regex.Pattern;

import exceptions.CuitIncorrectoExcepction;
import exceptions.DniIncorrectoException;

public class Proveedor {
	private String nombreORazonSocial;
	private int dni;
	private String cuil_cuit;
	private String direccionPostal;
	
	private String cuitValidoRegex = "\\d{2}-\\d{8}-\\d{1}";
	
	public Proveedor(String nombreORazonSocial, int dni, String direccionPostal) {
		this.nombreORazonSocial = nombreORazonSocial;
		this.validarDNI(dni);
		this.direccionPostal = direccionPostal;
	}
	
	public Proveedor(String nombreORazonSocial, String cuil_cuit, String direccionPostal) {
		this.nombreORazonSocial = nombreORazonSocial;
		this.validarCuit(cuil_cuit);
		this.direccionPostal = direccionPostal;
	}
	
	private void validarDNI(int dni) {
		if(dni <= 99999999 && dni > 0) {
			this.setDni(dni);
		}else {
			throw new DniIncorrectoException("Se ingres� un DNI negativo o de 9 cifras o mas");
		}
	}

	private void validarCuit(String cuit){
		if(Pattern.matches(cuitValidoRegex, cuit)) {
			this.setCuil_cuit(cuit);
		}else {
			throw new CuitIncorrectoExcepction("Se ingres� un numero de CUIT incorrecto");
		}
	}

	public String getCuil_cuit() {
		return cuil_cuit;
	}

	public void setCuil_cuit(String cuil_cuit) {
		this.cuil_cuit = cuil_cuit;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombreORazonSocial() {
		return nombreORazonSocial;
	}

	public void setNombreORazonSocial(String nombreORazonSocial) {
		this.nombreORazonSocial = nombreORazonSocial;
	}

	public String getDireccionPostal() {
		return direccionPostal;
	}

	public void setDireccionPostal(String direccionPostal) {
		this.direccionPostal = direccionPostal;
	}
	
	
}
