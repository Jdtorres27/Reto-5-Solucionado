
package com.mycompany.solucion_reto_5.controller;

//Modelos (acceso y objetos contenedores)
import com.mycompany.solucion_reto_5.model.dao.AsesorPorCiudadDao;
import com.mycompany.solucion_reto_5.model.dao.CompraPorProveedorDao;
import com.mycompany.solucion_reto_5.model.dao.ProyectosCasaCampestreDao;
import com.mycompany.solucion_reto_5.model.vo.AsesorPorCiudad;
import com.mycompany.solucion_reto_5.model.vo.CompraPorProveedor;
import com.mycompany.solucion_reto_5.model.vo.ProyectosCasaCampestre;

//Estructuras de datos (colecciones)
import java.util.ArrayList;

//Librerías para bases de datos
import java.sql.SQLException;

public class ControladorRequerimientosReto4 {
    private final CompraPorProveedorDao compraPorProveedorDao;
    private final ProyectosCasaCampestreDao proyectosCasaCampestreDao;
    private final AsesorPorCiudadDao asesorPorCiudadDao;
    
    public ControladorRequerimientosReto4(){
        this.compraPorProveedorDao = new CompraPorProveedorDao();
        this.asesorPorCiudadDao = new AsesorPorCiudadDao();
        this.proyectosCasaCampestreDao = new ProyectosCasaCampestreDao();

    }

    public ArrayList<AsesorPorCiudad> consultarAsesorPorCiudad() throws SQLException {
        return this.asesorPorCiudadDao.rankingAsesorPorCiudad();
    }
    
    public ArrayList<CompraPorProveedor> consultarCompraPorProveedor() throws SQLException {
        return this.compraPorProveedorDao.rankingCompraPorProveedor();
    }

    public ArrayList<ProyectosCasaCampestre> consultarProyectosCasaCampestre() throws SQLException {
        return this.proyectosCasaCampestreDao.rankingProyectosCasaCampestres();
    }

}

