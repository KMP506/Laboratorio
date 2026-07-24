package Controlador;

import tarea.EstadoTarea;
import tarea.Tarea;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;


public class ControladorTarea {
private DefaultTableModel modeloTabla;


public ControladorTarea(){
modeloTabla = new DefaultTableModel();
modeloTabla.addColumn("Descripción");
modeloTabla.addColumn("Estado");
}


public void agregarTarea(String descripcion){
Tarea tarea = new Tarea(descripcion, EstadoTarea.PENDIENTE);
modeloTabla.addRow(new Object[]{
tarea.getDescripcion(),
tarea.getEstado()
 });
    }


public void completarTarea(int fila){
if(fila >= 0){
modeloTabla.setValueAt(
EstadoTarea.COMPLETADO,
fila,
1
);
}
}


public void eliminarTarea(int fila){
if(fila >= 0){
String estado = modeloTabla.getValueAt(fila, 1).toString();
if(estado.equals("PENDIENTE")){
int opcion = JOptionPane.showConfirmDialog(null,"La tarea está pendiente, ¿desea eliminarla?","Confirmar eliminación",
JOptionPane.YES_NO_OPTION
);
if(opcion == JOptionPane.YES_OPTION){
modeloTabla.removeRow(fila);
}
}else{
modeloTabla.removeRow(fila);
}
}

}


public DefaultTableModel getModeloTabla(){
return modeloTabla;
}
}
