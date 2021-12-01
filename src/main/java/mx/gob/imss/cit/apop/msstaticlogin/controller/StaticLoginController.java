package mx.gob.imss.cit.apop.msstaticlogin.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.gob.imss.cit.apop.msstaticlogin.exceptions.BusinessException;
import mx.gob.imss.cit.apop.msstaticlogin.model.DatosLoginRequest;
import mx.gob.imss.cit.apop.msstaticlogin.model.ModuloApo;
import mx.gob.imss.cit.apop.msstaticlogin.model.RespuestaError;
import mx.gob.imss.cit.apop.msstaticlogin.service.StaticLoginService;

@RestController
@RequestMapping("/msapop-staticlogin/v1")
public class StaticLoginController {
    
    private static final Logger logger = LoggerFactory.getLogger(StaticLoginController.class);

	@Autowired
	private StaticLoginService staticLoginService;




    @RequestMapping(value = "/credenciales", produces = { "application/json" }, method = RequestMethod.POST)
	public ResponseEntity<?> validarCredenciales(@Valid @RequestBody DatosLoginRequest requestBody) throws Exception {

		ResponseEntity<?> responseEntity = null;
		
        List<ModuloApo> modulosApo = null;
		
		try {
			logger.debug("--> validarCredenciales {}", requestBody.toString());
            

			modulosApo = staticLoginService.validaCredenciales(requestBody);
			
			logger.debug("Regreso exitoso de validarCredenciales");
			
			responseEntity = new ResponseEntity<List<ModuloApo>>(modulosApo, HttpStatus.OK);
		}
		catch (BusinessException be) {
			int numberHTTPDesired = Integer.parseInt(be.getRespuestaError().getCode());
			RespuestaError respuestaError = be.getRespuestaError();
			responseEntity = new ResponseEntity<RespuestaError>(respuestaError, HttpStatus.valueOf(numberHTTPDesired));
		}

		return responseEntity;
		 	
	}

}