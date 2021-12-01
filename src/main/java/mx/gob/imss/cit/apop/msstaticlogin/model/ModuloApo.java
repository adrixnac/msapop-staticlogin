package mx.gob.imss.cit.apop.msstaticlogin.model;

import lombok.Data;

@Data
public class ModuloApo {
    private Integer cveModuloApo;
    private String desModuloApo;
    
    public ModuloApo(Integer cveModuloApo, String desModuloApo) {
        this.cveModuloApo = cveModuloApo;
        this.desModuloApo = desModuloApo;
    }

    

}