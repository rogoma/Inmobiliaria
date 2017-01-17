/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entidades.Distritos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author rogoma
 */
@Stateless
public class DistritosFacade extends AbstractFacade<Distritos> {
    @PersistenceContext(unitName = "CgppPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DistritosFacade() {
        super(Distritos.class);
    }
    
}
