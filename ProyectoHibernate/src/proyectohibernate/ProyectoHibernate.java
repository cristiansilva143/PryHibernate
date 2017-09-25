/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectohibernate;

import com.mycompany.entidades.detalleUsuario;
import org.hibernate.Session;

/**
 *
 * @author admin
 */
public class ProyectoHibernate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        detalleUsuario usuario = new detalleUsuario();
        usuario.setNombre("Martin");
        usuario.setApellido("Muñoz");        
        Session session = hibernateUtil.getSessionfactry().getCurrentSession();
        
        session.beginTransaction();
        session.save(usuario);
        session.getTransaction().commit();        
        hibernateUtil.getSessionfactry().close();
    }
    
}
