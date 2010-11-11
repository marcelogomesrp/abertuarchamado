/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.guaraba.aberturadechamado.facade;

import br.com.guaraba.aberturadechamado.modelo.Chamado;
import java.util.Date;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author marcelo
 */

@Stateless
public class ChamadoFacade extends AbstractFacade<Chamado>{

    @PersistenceContext(unitName = "AberturaDeChamadoPU")
    private EntityManager em;

    public EntityManager getEntityManager() {
        return em;
    }

    public ChamadoFacade() {
        super(Chamado.class);
    }

    @Override
    public void create(Chamado chamado) {
        chamado.setDataAbertura(new Date());
        super.create(chamado);
    }
}
