/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIstas;

import java.beans.PropertyVetoException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import tp7.Alumno;
import tp7.Materia;

/**
 *
 * @author OzKuro
 */
public class FormularioInscripcion extends javax.swing.JInternalFrame {

    HashSet<Materia> materias = new HashSet<>();
    HashSet<Alumno> alumnos = new HashSet<>();
    DefaultComboBoxModel modelAlumnos = new DefaultComboBoxModel();
    DefaultComboBoxModel modelMaterias = new DefaultComboBoxModel();

    /**
     * Creates new form FormularioInscripcion
     *
     * @param alumnos
     * @param materias
     */
    public FormularioInscripcion(HashSet<Alumno> alumnos, HashSet<Materia> materias) {
        this.alumnos = alumnos;

        alumnos.forEach((a) -> {
            modelAlumnos.addElement(a);
        });

        this.materias = materias;

        materias.forEach((m) -> {
            modelMaterias.addElement(m);
        });

        initComponents();
        
        jLabelResultado.setVisible(false);
        
        if (jComboBoxAlumnos.getSelectedIndex() != -1){
            mostrarCantidadMaterias();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitle = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnInscribir = new javax.swing.JButton();
        jLabelMateria = new javax.swing.JLabel();
        jLabelAlumno = new javax.swing.JLabel();
        jComboBoxMaterias = new javax.swing.JComboBox<>();
        jComboBoxAlumnos = new javax.swing.JComboBox<>();
        jLabelResultado = new javax.swing.JLabel();

        setBackground(java.awt.Color.darkGray);

        jLabelTitle.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabelTitle.setForeground(java.awt.Color.black);
        jLabelTitle.setText("Formulario de Inscripcion");

        btnSalir.setBackground(java.awt.Color.gray);
        btnSalir.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnSalir.setForeground(java.awt.Color.black);
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnInscribir.setBackground(java.awt.Color.gray);
        btnInscribir.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnInscribir.setForeground(java.awt.Color.black);
        btnInscribir.setText("Inscribir");
        btnInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscribirActionPerformed(evt);
            }
        });

        jLabelMateria.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabelMateria.setForeground(java.awt.Color.black);
        jLabelMateria.setText("Elija una materia:");

        jLabelAlumno.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabelAlumno.setForeground(java.awt.Color.black);
        jLabelAlumno.setText("Elija un alumno:");

        jComboBoxMaterias.setBackground(java.awt.Color.gray);
        jComboBoxMaterias.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jComboBoxMaterias.setForeground(java.awt.Color.black);
        jComboBoxMaterias.setModel(modelMaterias);

        jComboBoxAlumnos.setBackground(java.awt.Color.gray);
        jComboBoxAlumnos.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jComboBoxAlumnos.setForeground(java.awt.Color.black);
        jComboBoxAlumnos.setModel(modelAlumnos);
        jComboBoxAlumnos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxAlumnosItemStateChanged(evt);
            }
        });

        jLabelResultado.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabelResultado.setForeground(java.awt.Color.black);
        jLabelResultado.setText("Alumno Inscripto!");
        jLabelResultado.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelMateria)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelAlumno)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnInscribir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabelTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabelResultado)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelTitle)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMateria)
                    .addComponent(jComboBoxMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAlumno)
                    .addComponent(jComboBoxAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jLabelResultado)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnInscribir))
                .addContainerGap())
        );

        setBounds(175, 175, 550, 450);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        try {
            this.setClosed(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(FormularioInscripcion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscribirActionPerformed
        if (jComboBoxAlumnos.getSelectedIndex() != -1 && jComboBoxMaterias.getSelectedIndex() != -1) {
            Alumno selectedAlumno = (Alumno) jComboBoxAlumnos.getSelectedItem();
            Materia selectedMateria = (Materia) jComboBoxMaterias.getSelectedItem();

            if (selectedAlumno.agregarMateria(selectedMateria)) {
                jLabelResultado.setText("Alumno inscripto!");
                jLabelResultado.setVisible(true);
            } else {
                jLabelResultado.setText("Alumno ya inscripto!");
                jLabelResultado.setVisible(true);
            }
        } else {
            jLabelResultado.setText("Seleccione Alumno y materia.");
        jLabelResultado.setVisible(true);
        }

    }//GEN-LAST:event_btnInscribirActionPerformed

    private void jComboBoxAlumnosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxAlumnosItemStateChanged
        mostrarCantidadMaterias();
    }//GEN-LAST:event_jComboBoxAlumnosItemStateChanged

    private void mostrarCantidadMaterias(){
        Alumno selectedAlumno = (Alumno) jComboBoxAlumnos.getSelectedItem();

        jLabelResultado.setText(selectedAlumno.getNombre() + " inscripto en " + selectedAlumno.cantidadMaterias() + " materias.");
        jLabelResultado.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInscribir;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> jComboBoxAlumnos;
    private javax.swing.JComboBox<String> jComboBoxMaterias;
    private javax.swing.JLabel jLabelAlumno;
    private javax.swing.JLabel jLabelMateria;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JLabel jLabelTitle;
    // End of variables declaration//GEN-END:variables
}
