/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea;

/**
 *
 * @author efrai
 */
public class Tarea {
private String descripcion;
private EstadoTarea estado;

public Tarea() {
this.estado = EstadoTarea.PENDIENTE;
    }
  
  

public Tarea(String descripcion, EstadoTarea estado) {
this.descripcion = descripcion;
this.estado = estado;
    }

public void setDescripcion(String descripcion) {
this.descripcion = descripcion;
}

public void setEstado(EstadoTarea estado) {
this.estado = estado;
 }

public String getDescripcion() {
return descripcion;
    }

public EstadoTarea getEstado() {
return estado;
}
  
public void completar(){
estado= EstadoTarea.COMPLETADO;
  }
  
public boolean estaPendiente(){
return estado == EstadoTarea.PENDIENTE;
  }
}
