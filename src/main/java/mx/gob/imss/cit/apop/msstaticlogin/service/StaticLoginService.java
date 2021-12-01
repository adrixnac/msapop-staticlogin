package mx.gob.imss.cit.apop.msstaticlogin.service;

import java.util.List;

import mx.gob.imss.cit.apop.msstaticlogin.exceptions.BusinessException;
import mx.gob.imss.cit.apop.msstaticlogin.model.DatosLoginRequest;
import mx.gob.imss.cit.apop.msstaticlogin.model.ModuloApo;

public interface StaticLoginService {
    
    List<ModuloApo> validaCredenciales(DatosLoginRequest datos ) throws BusinessException;
    
}