/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chaodesempleo;

import Utilidades.*;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import static chaodesempleo.databaseManager.*;
/**
 *
 * @author Mariela
 */
public class FormularioAdmin extends javax.swing.JFrame {

    /**
     * Creates new form FormularioAdmin
     */
    Tabla t = new Tabla();
    databaseManager conectar;
    DefaultTableModel modelo = new DefaultTableModel();
    
    public FormularioAdmin() {
        initComponents();
        p11.setVisible(false);
        InvisiblesComp();
        
       
    }
     public void InvisiblesComp()
    {
        //LABELS
        userl.setVisible(false);
        nombrel.setVisible(false);
        namel.setVisible(false);
        fechainil.setVisible(false);
        fechafinl.setVisible(false);
        edadinil.setVisible(false);
        edadfinl.setVisible(false);
        idl.setVisible(false);
        lastnamel.setVisible(false);
        lastname2l.setVisible(false);
        gradol.setVisible(false);
        
        //BOTONES
        btnbuscarC1.setVisible(false);
        buscar2.setVisible(false);
        
        //PANELES Y COMBOBOX
        userf.setVisible(false);
        nombref.setVisible(false);
        namef.setVisible(false);
        fechainif.setVisible(false);
        fechafinf.setVisible(false);
        edadinif.setVisible(false);
        edadfinf.setVisible(false);
        idf.setVisible(false);
        lastnamef.setVisible(false);
        lastname2f.setVisible(false);
        gradof.setVisible(false);  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        p11 = new javax.swing.JPanel();
        nombrel = new javax.swing.JLabel();
        fechainif = new com.toedter.calendar.JDateChooser();
        fechafinf = new com.toedter.calendar.JDateChooser();
        fechainil = new javax.swing.JLabel();
        fechafinl = new javax.swing.JLabel();
        nombref = new javax.swing.JComboBox<>();
        edadfinf = new com.toedter.calendar.JDateChooser();
        edadinil = new javax.swing.JLabel();
        edadfinl = new javax.swing.JLabel();
        edadinif = new com.toedter.calendar.JDateChooser();
        gradol = new javax.swing.JLabel();
        gradof = new javax.swing.JComboBox<>();
        namel = new javax.swing.JLabel();
        namef = new javax.swing.JTextField();
        lastnamel = new javax.swing.JLabel();
        lastnamef = new javax.swing.JTextField();
        lastname2l = new javax.swing.JLabel();
        lastname2f = new javax.swing.JTextField();
        idl = new javax.swing.JLabel();
        idf = new javax.swing.JTextField();
        btnbuscarC1 = new javax.swing.JButton();
        userl = new javax.swing.JLabel();
        userf = new javax.swing.JTextField();
        buscar2 = new javax.swing.JButton();
        pTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(650, 600));

        p11.setBackground(new java.awt.Color(255, 255, 255));
        p11.setPreferredSize(new java.awt.Dimension(650, 70));

        nombrel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombrel.setForeground(new java.awt.Color(153, 153, 153));
        nombrel.setText("Nombre Empresa");

        fechainif.setDateFormatString("DD/MM/YYYY");
        fechainif.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        fechafinf.setDateFormatString("DD/MM/YYYY");
        fechafinf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        fechainil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fechainil.setForeground(new java.awt.Color(153, 153, 153));
        fechainil.setText("De: ");

        fechafinl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fechafinl.setForeground(new java.awt.Color(153, 153, 153));
        fechafinl.setText("hasta:");

        nombref.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        edadfinf.setDateFormatString("DD/MM/YYYY");
        edadfinf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        edadinil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edadinil.setForeground(new java.awt.Color(153, 153, 153));
        edadinil.setText("Edad de");

        edadfinl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edadfinl.setForeground(new java.awt.Color(153, 153, 153));
        edadfinl.setText("Hasta:");

        edadinif.setDateFormatString("DD/MM/YYYY");
        edadinif.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        gradol.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gradol.setForeground(new java.awt.Color(153, 153, 153));
        gradol.setText("Grado Academico");

        gradof.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        namel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        namel.setForeground(new java.awt.Color(153, 153, 153));
        namel.setText("Nombre");

        namef.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lastnamel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lastnamel.setForeground(new java.awt.Color(153, 153, 153));
        lastnamel.setText("Apellido 1");

        lastnamef.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lastname2l.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lastname2l.setForeground(new java.awt.Color(153, 153, 153));
        lastname2l.setText("Apellido 2");

        lastname2f.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        idl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idl.setForeground(new java.awt.Color(153, 153, 153));
        idl.setText("Cedula");

        idf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnbuscarC1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnbuscarC1.setText("Buscar");
        btnbuscarC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarC1ActionPerformed(evt);
            }
        });

        userl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userl.setForeground(new java.awt.Color(153, 153, 153));
        userl.setText("Usuario");

        userf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userfActionPerformed(evt);
            }
        });

        buscar2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buscar2.setText("Buscar");

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("jLabel1");

        javax.swing.GroupLayout pTituloLayout = new javax.swing.GroupLayout(pTitulo);
        pTitulo.setLayout(pTituloLayout);
        pTituloLayout.setHorizontalGroup(
            pTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pTituloLayout.setVerticalGroup(
            pTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout p11Layout = new javax.swing.GroupLayout(p11);
        p11.setLayout(p11Layout);
        p11Layout.setHorizontalGroup(
            p11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p11Layout.createSequentialGroup()
                .addGroup(p11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p11Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(edadinil))
                    .addGroup(p11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fechainil, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(p11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(fechainif, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(fechafinf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(edadinif, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(p11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(p11Layout.createSequentialGroup()
                        .addGroup(p11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(p11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namef, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(p11Layout.createSequentialGroup()
                        .addComponent(lastnamel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lastnamef, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(nombrel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nombref, 0, 157, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(p11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(p11Layout.createSequentialGroup()
                        .addGroup(p11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p11Layout.createSequentialGroup()
                                .addComponent(edadfinl)
                                .addGap(31, 31, 31)
                                .addComponent(edadfinf, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(lastname2l))
                            .addComponent(userl, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(p11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lastname2f, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(userf))
                        .addGap(145, 145, 145))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p11Layout.createSequentialGroup()
                        .addComponent(fechafinl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(gradol)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(p11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gradof, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(p11Layout.createSequentialGroup()
                        .addGroup(p11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buscar2)
                            .addComponent(btnbuscarC1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
            .addComponent(pTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        p11Layout.setVerticalGroup(
            p11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p11Layout.createSequentialGroup()
                .addComponent(pTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namel)
                    .addGroup(p11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(namef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nombrel)
                        .addComponent(nombref, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p11Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(fechainil))
                    .addComponent(fechainif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(p11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p11Layout.createSequentialGroup()
                        .addGroup(p11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p11Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(p11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(p11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(idl)
                                        .addComponent(idf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(fechafinf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(p11Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(fechafinl)))
                        .addGroup(p11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p11Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(p11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lastnamef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lastnamel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(p11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lastname2f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lastname2l)))
                            .addGroup(p11Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(p11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(edadinil)
                                    .addComponent(edadinif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(p11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(edadfinf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edadfinl))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(p11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(p11Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(p11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gradof, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gradol))
                        .addGap(18, 18, 18)
                        .addComponent(btnbuscarC1)
                        .addGap(7, 7, 7)
                        .addComponent(buscar2)
                        .addGap(19, 19, 19))))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tabla);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("Consultas");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem2.setText("Empresas Asociadas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Puesto por empresa");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem1.setText("Usuarios sin modificar Clave");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Operaciones");

        jMenuItem4.setText("Agregar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Editar");
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Eliminar");
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Estadísticas");

        jMenuItem7.setText("Solicitantes por edad");
        jMenu3.add(jMenuItem7);

        jMenuItem9.setText("Solicitantes por Canton");
        jMenu3.add(jMenuItem9);

        jMenuItem8.setText("Solicitantes por distrito");
        jMenu3.add(jMenuItem8);

        jMenuItem10.setText("Solicitantes por provincia");
        jMenu3.add(jMenuItem10);

        jMenuItem11.setText("Top N de empresas con mayor solicitud");
        jMenu3.add(jMenuItem11);

        jMenuItem12.setText("Top N de puestos con mayor solicitud");
        jMenu3.add(jMenuItem12);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p11, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(p11, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        p11.setVisible(true);
        namel.setVisible(true);
        namef.setVisible(true);
        lastnamel.setVisible(true);
        lastname2l.setVisible(true);
        lastnamef.setVisible(true);
        lastname2f.setVisible(true);
        idl.setVisible(true);
        idf.setVisible(true);
        userl.setVisible(true);
        userf.setVisible(true);
        fechainil.setVisible(true);
        fechainif.setVisible(true);
        fechafinl.setVisible(true);
        fechafinf.setVisible(true);
        btnbuscarC1.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        lblTitulo.setText("EMPRESAS ASOCIADAS");
        //ChaoDesempleo.dbManager.empresa_QPuestos();
        MyConnection mc=null;
        CallableStatement cs;
        try {
            this.tabla.setModel(modelo);
            ResultSet r;
            r = ChaoDesempleo.dbManager.empresa_QPuestos();
            ResultSetMetaData rsMd = r.getMetaData();
            int cntddColumnas = rsMd.getColumnCount();
            
            for (int i=1; i<=cntddColumnas; i++){
                    modelo.addColumn(rsMd.getColumnLabel(i));
            }
            while (rs.next()){
                Object[] fila = new Object[cntddColumnas];
                for(int i=0; i<cntddColumnas; i++){
                    fila[i]=rs.getObject(i+1);
                }               
                modelo.addRow(fila);
            }        
        } catch (SQLException ex) {
            Logger.getLogger(FormularioAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        p11.setVisible(false);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void btnbuscarC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarC1ActionPerformed
        //USUARIOS SIN CAMBIAR CLAVE
        t.usuariosSinCambio(tabla);
        String nombre = nombref.getSelectedItem().toString();
        String edadde = edadfinf.getDate().toString();
        String edadhasta = edadinif.getDate().toString();
        String publide = fechainif.getDate().toString();
        String publihasta = fechafinf.getDate().toString();
        DefaultTableModel modelo = new DefaultTableModel();
        this.tabla.setModel(modelo);
        
    }//GEN-LAST:event_btnbuscarC1ActionPerformed

    private void userfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userfActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscarC1;
    private javax.swing.JButton buscar2;
    private com.toedter.calendar.JDateChooser edadfinf;
    private javax.swing.JLabel edadfinl;
    private com.toedter.calendar.JDateChooser edadinif;
    private javax.swing.JLabel edadinil;
    private com.toedter.calendar.JDateChooser fechafinf;
    private javax.swing.JLabel fechafinl;
    private com.toedter.calendar.JDateChooser fechainif;
    private javax.swing.JLabel fechainil;
    private javax.swing.JComboBox<String> gradof;
    private javax.swing.JLabel gradol;
    private javax.swing.JTextField idf;
    private javax.swing.JLabel idl;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lastname2f;
    private javax.swing.JLabel lastname2l;
    private javax.swing.JTextField lastnamef;
    private javax.swing.JLabel lastnamel;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField namef;
    private javax.swing.JLabel namel;
    private javax.swing.JComboBox<String> nombref;
    private javax.swing.JLabel nombrel;
    private javax.swing.JPanel p11;
    private javax.swing.JPanel pTitulo;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField userf;
    private javax.swing.JLabel userl;
    // End of variables declaration//GEN-END:variables
}
