/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Felipe Martinez
 */
public class Empresa {
    private String nombreEmpresa;
    private String nit;
    private String direcciones;
    private Clientes c;
    Empleado emp;

    public Empresa(String nombreEmpresa, String nit, String direcciones, Empleado emp) {
        this.nombreEmpresa = nombreEmpresa;
        this.nit = nit;
        this.direcciones = direcciones;
        this.emp = emp;
    }

   

    
    
    /**
     * @return the nombreEmpresa
     */
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    /**
     * @param nombreEmpresa the nombreEmpresa to set
     */
    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    /**
     * @return the nit
     */
    public String getNit() {
        return nit;
    }

    /**
     * @param nit the nit to set
     */
    public void setNit(String nit) {
        this.nit = nit;
    }

    /**
     * @return the direcciones
     */
    public String getDirecciones() {
        return direcciones;
    }

    /**
     * @param direcciones the direcciones to set
     */
    public void setDirecciones(String direcciones) {
        this.direcciones = direcciones;
    }

    /**
     * @return the c
     */
    public Clientes getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(Clientes c) {
        this.c = c;
    }
   
}
