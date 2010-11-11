/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.guaraba.aberturadechamado.facade;

import br.com.guaraba.aberturadechamado.modelo.Chamado;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author marcelo
 */

@ManagedBean(name="chamadoController")
@SessionScoped
public class ChamadoController implements Serializable {
    private Chamado chamado;
    @EJB
    private ChamadoController chamadoController;

    public ChamadoController() {
        this.chamado = new Chamado();
    }

    

}
