/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Tabla{
    private DefaultTableModel d;
    static int cont =0;
    
    
    public void puestoxEmpresa(JTable tabla){
        tabla.setDefaultRenderer(Object.class, new Render());
        
        d = new DefaultTableModel
        (
                new Object[][]{},
                new Object[]{"Empresa","Puestos Disponibles"}
        )
        {
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        tabla.setModel(d);
        
        tabla.setPreferredScrollableViewportSize(tabla.getPreferredSize());
 
    }
    
    //Puesto x Empresa
    public void solicitantes(JTable tabla){
        
        tabla.setDefaultRenderer(Object.class, new Render()); 
        d = new DefaultTableModel
        (
                new Object[][]{},
                new Object[]{"Nombre Empresa","Puesto"}
        )
        {
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        tabla.setModel(d);
        
        tabla.setPreferredScrollableViewportSize(tabla.getPreferredSize());
 
    }
    
        //Usuarios sin cambio
    public void usuariosSinCambio(JTable tabla){
        
        tabla.setDefaultRenderer(Object.class, new Render()); 
        d = new DefaultTableModel
        (
                new Object[][]{},
                new Object[]{"Usuaris"}
        )
        {
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        tabla.setModel(d);
        
        tabla.setPreferredScrollableViewportSize(tabla.getPreferredSize());
 
    }
    
    public void ingresar_actividad(String datos[]){
        Object[] row = { datos[1], datos[2], datos[3], datos[4],datos[5],datos[6],datos[7]};
        d.addRow(row);
        cont++;
        
        
    }
}
