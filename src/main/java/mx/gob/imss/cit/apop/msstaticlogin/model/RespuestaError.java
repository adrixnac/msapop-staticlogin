package mx.gob.imss.cit.apop.msstaticlogin.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import mx.gob.imss.cit.apop.msstaticlogin.integration.enums.EnumHttpStatus;

@Data
public class RespuestaError {


	@Schema(required = true, description = "Código de estatus HTTP")
	private String code;  //"HTTP Status code"
	@Schema(required = true, description = "Descripción de código de estatus HTTP")
	private String description;  // HTTP Status description
	@Schema(required = true, description = "Mensaje de error de negocio")
	private String businessMessage;  // Mensaje de negocio 
	@Schema(required = true, description = "Mensaje de la excepción real")
	private String reasonPhrase;  // Mensaje de la excepción real 
	@Schema(required = true, description = "Para uso futuro")
	private String uri;  // Para uso futuro
	@Schema(required = true, description = "Para uso futuro")
	private String contactEmail; // Para uso futuro	
	@Schema(required = true, description = "Fecha y hora en la que se genera la excepción")
	private String timeStamp;  // Fecha y hora de la excepcion
        
        

    public RespuestaError(EnumHttpStatus status, String businessMessage, String reasonPhrase) {
		this.code = status.getCode().toString();
		this.description = status.getDescription();
		this.businessMessage = businessMessage;
		this.reasonPhrase = reasonPhrase;
		this.uri = "http://infocovid.imss.gob.mx/help";

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");

		this.timeStamp = dateFormat.format(new Date());

    }
    
    
}
