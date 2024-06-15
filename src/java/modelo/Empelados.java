/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "empelados")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empelados.findAll", query = "SELECT e FROM Empelados e")
    , @NamedQuery(name = "Empelados.findByIdEmpleados", query = "SELECT e FROM Empelados e WHERE e.idEmpleados = :idEmpleados")
    , @NamedQuery(name = "Empelados.findByNombre", query = "SELECT e FROM Empelados e WHERE e.nombre = :nombre")})
public class Empelados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_empleados")
    private Integer idEmpleados;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombre")
    private String nombre;
    @JoinColumn(name = "frk_departamentos", referencedColumnName = "id_departamento")
    @ManyToOne(optional = false)
    private Departamentos frkDepartamentos;

    public Empelados() {
    }

    public Empelados(Integer idEmpleados) {
        this.idEmpleados = idEmpleados;
    }

    public Empelados(Integer idEmpleados, String nombre) {
        this.idEmpleados = idEmpleados;
        this.nombre = nombre;
    }

    public Integer getIdEmpleados() {
        return idEmpleados;
    }

    public void setIdEmpleados(Integer idEmpleados) {
        this.idEmpleados = idEmpleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Departamentos getFrkDepartamentos() {
        return frkDepartamentos;
    }

    public void setFrkDepartamentos(Departamentos frkDepartamentos) {
        this.frkDepartamentos = frkDepartamentos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpleados != null ? idEmpleados.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empelados)) {
            return false;
        }
        Empelados other = (Empelados) object;
        if ((this.idEmpleados == null && other.idEmpleados != null) || (this.idEmpleados != null && !this.idEmpleados.equals(other.idEmpleados))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Empelados[ idEmpleados=" + idEmpleados + " ]";
    }
    
}
