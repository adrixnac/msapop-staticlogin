package mx.gob.imss.cit.apop.msstaticlogin.service.impl;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import mx.gob.imss.cit.apop.msstaticlogin.exceptions.BusinessException;
import mx.gob.imss.cit.apop.msstaticlogin.model.DatosLoginRequest;
import mx.gob.imss.cit.apop.msstaticlogin.model.ModuloApo;
import mx.gob.imss.cit.apop.msstaticlogin.service.StaticLoginService;


@Service("edoPacienteService")
public class StaticLoginServiceImpl implements StaticLoginService {

    private final static Logger logger = LoggerFactory.getLogger(StaticLoginServiceImpl.class);
    




    @Override
    public List<ModuloApo> validaCredenciales(DatosLoginRequest datos) throws BusinessException {


        List<ModuloApo> listaModulos = Arrays.asList(
            new ModuloApo(1, "Tratamiento"),
            new ModuloApo(2, "Cáncer de mama"),
            new ModuloApo(3, "Cáncer de próstata")
        );



        // TODO Auto-generated method stub
        return listaModulos;
    }
    
}