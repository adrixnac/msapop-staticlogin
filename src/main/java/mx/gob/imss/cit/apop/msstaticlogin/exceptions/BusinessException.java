package mx.gob.imss.cit.apop.msstaticlogin.exceptions;

import mx.gob.imss.cit.apop.msstaticlogin.integration.enums.EnumHttpStatus;
import mx.gob.imss.cit.apop.msstaticlogin.model.RespuestaError;

public class BusinessException extends Exception {


	
	private static final long serialVersionUID = 2044610281664856520L;
	private RespuestaError respuestaError;

	public BusinessException(EnumHttpStatus status,
			String businessMessage,
			String reasonPhrase) {

		super(reasonPhrase);

		String completeBusinessMessage = businessMessage ;

		respuestaError = new RespuestaError(status, completeBusinessMessage, reasonPhrase);

	}

	public BusinessException(RespuestaError respuestaError) {
		this.respuestaError = respuestaError;
	}

	public RespuestaError getRespuestaError() {
		return respuestaError;
	}

	public void setRespuestaError(RespuestaError respuestaError) {
		this.respuestaError = respuestaError;
	}

	

}
