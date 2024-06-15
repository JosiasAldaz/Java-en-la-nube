/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.Empelados;

/**
 *
 * @author LENOVO
 */
@Stateless
public class EmpeladosFacade extends AbstractFacade<Empelados> {

    @PersistenceContext(unitName = "Josias_fxPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EmpeladosFacade() {
        super(Empelados.class);
    }
    
}
