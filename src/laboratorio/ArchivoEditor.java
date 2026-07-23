/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio;

/**
 *
 * @author kevin
 *////
public class ArchivoEditor {
  protected String nombre;
  protected String ruta;
  protected String contenido;

  public String getNombre(){
      return this.nombre;
  }
  
  public String getRuta(){
      return this.ruta;
  }
  
  public String getContenido(){
      return this.contenido;
  }
  
  public String setNombre(){
      return this.nombre=nombre;
  }
  
  public String setRuta(){
      return this.ruta=ruta;
  }
  
  public String setContenido(){
      return this.contenido=contenido;
  }
  
  
public ArchivoEditor(String nombre,String ruta,String contenido){
    this.nombre=nombre;
    this.ruta=ruta;
    this.contenido=contenido;
}
  
}
