package mx.com.axity.services.facade.impl;

import mx.com.axity.commons.to.UserTO;
import mx.com.axity.services.facade.ICatalogosFacade;
import mx.com.axity.services.service.ICatalogosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class CatalogosFacade implements ICatalogosFacade {

    @Autowired
    private ICatalogosService catalogosService;

    public List<UserTO> getAllUsers() {
        return this.catalogosService.getUsers();
    }
}
