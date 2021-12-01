package mx.gob.imss.cit.apop.msstaticlogin.integration.enums;

import lombok.Getter;
import lombok.Setter;

public enum EnumBusinessError {
	
	SERVER_ERROR_INTERNAL (500, "Error interno."),
	SERVER_ERROR_UNIDADMEDICA (500, "Error en WS Contacto."),
	SERVER_ERROR_DELEGACION (500, "Error en WS Contacto."),
	SERVER_ERROR_VIGENCIA (500, "Error en vigencia.");	
	
	@Getter
	@Setter
	private Integer codigo;
	@Getter
	@Setter	
	private String descripcion;
	
	private EnumBusinessError(Integer codigo, String descripcion) {
		this.codigo = codigo;
		this.descripcion = descripcion;
	}
}
