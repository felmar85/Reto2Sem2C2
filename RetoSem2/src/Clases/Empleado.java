/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Felipe Martinez
 */
public class Empleado extends Persona{
    private double salario;
    private Categorias cat;
    private Cargo carg;
    private List<Empleado> Subordinados;
    private Empleado dirigidoPor;

    public Empleado(double salario, Categorias cat, Cargo carg, String nombre, String apellidos, String identificacion, String correo) {
        super(nombre, apellidos, identificacion, correo);
        this.salario = salario;
        this.cat = cat;
        this.carg = carg;
        this.Subordinados = new ArrayList<Empleado>();
    }

    public void asignarSubordinado(Empleado emp){
      this.getSubordinados().add(emp);
      emp.setDirigidoPor(this);
    }
    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the cat
     */
    public Categorias getCat() {
        return cat;
    }

    /**
     * @param cat the cat to set
     */
    public void setCat(Categorias cat) {
        this.cat = cat;
    }

    /**
     * @return the carg
     */
    public Cargo getCarg() {
        return carg;
    }

    /**
     * @param carg the carg to set
     */
    public void setCarg(Cargo carg) {
        this.carg = carg;
    }

    /**
     * @return the dirigidoPor
     */
    public Empleado getDirigidoPor() {
        return dirigidoPor;
    }

    /**
     * @param dirigidoPor the dirigidoPor to set
     */
    public void setDirigidoPor(Empleado dirigidoPor) {
        this.dirigidoPor = dirigidoPor;
    }

    /**
     * @return the Subordinados
     */
    public List<Empleado> getSubordinados() {
        return Subordinados;
    }

    /**
     * @param Subordinados the Subordinados to set
     */
    public void setSubordinados(List<Empleado> Subordinados) {
        this.Subordinados = Subordinados;
    }
    
}
