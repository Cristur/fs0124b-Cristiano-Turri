package it.epicode.gestione_eventi.businesslayer.impl;

import it.epicode.gestione_eventi.businesslayer.RoleService;
import it.epicode.gestione_eventi.datalayer.entities.Role;
import it.epicode.gestione_eventi.datalayer.repositories.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RolesRepository roles;

    public Role save(String name){
        var r = new Role();
        r.setName(name);
        roles.save(r);
        return r;
    }
}
