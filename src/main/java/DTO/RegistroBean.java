package DTO;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import DAO.InventarioDAO;
import java.util.ArrayList;
@ManagedBean(name = "registroBean") 
public class RegistroBean implements Serializable {
    private int id;
    private String nombre;
    private String modelo;
    private List<InventarioDTO> registros;

    public RegistroBean() {
        registros = new ArrayList<>();
    }

    @PostConstruct
    public void init() {
        // Puedes inicializar algún dato aquí si es necesario
    }

    public void guardar() {
        //Registro nuevoRegistro = new Registro(id, nombre, modelo);
        //registros.add(nuevoRegistro);
        // Aquí puedes agregar la lógica para guardar en la base de datos si lo deseas
        id = 0; // Reiniciamos el id después de guardar
        nombre = ""; // Limpiamos los campos después de guardar
        modelo = "";
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public List<InventarioDTO> getRegistros() {
        return registros;
    }
    public void setLista(List<InventarioDTO> lista) {
        this.registros = lista;
    }
}
