/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoDatos.AlumnosDatos;
import Entidades.Alumno;
import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lucia
 */
public class ActualizarAlumnos extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            if (columna != 0 && columna != 5) {
                return true;
            } else {
                return false;
            }
        }
    };

    public ActualizarAlumnos() {
        initComponents();
        armarCabezera();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAlumTabla = new javax.swing.JTable();
        jtfBuscador = new javax.swing.JTextField();
        jbActualizar = new javax.swing.JButton();
        jcbBuscarPor = new javax.swing.JComboBox<>();
        jButton = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Actualizar Alumnos");

        jtAlumTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtAlumTabla);

        jtfBuscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfBuscadorKeyTyped(evt);
            }
        });

        jbActualizar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/refresh.png"))); // NOI18N
        jbActualizar.setText("Actualizar Datos");
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        jcbBuscarPor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mostrar Todo", "Buscar Por ID", "Buscar Por DNI" }));
        jcbBuscarPor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbBuscarPorItemStateChanged(evt);
            }
        });

        jButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lupa.png"))); // NOI18N
        jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActionPerformed(evt);
            }
        });

        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cruz.png"))); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(243, 243, 243))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jcbBuscarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfBuscador, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton)
                        .addGap(181, 181, 181))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbActualizar)
                        .addGap(174, 174, 174)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcbBuscarPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbActualizar)
                        .addGap(27, 27, 27))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        actualizarAlumno();
    }//GEN-LAST:event_jbActualizarActionPerformed

    private void jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActionPerformed
        buscarPor();
    }//GEN-LAST:event_jButtonActionPerformed

    private void jcbBuscarPorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbBuscarPorItemStateChanged
        jtfBuscador.setText(null);
        habilitarCampo();
    }//GEN-LAST:event_jcbBuscarPorItemStateChanged

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jtfBuscadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfBuscadorKeyTyped
        // limita la cantidad de caracteres en el campo de text field
        if(jtfBuscador.getText().length()>=9){
            evt.consume();
        }
    }//GEN-LAST:event_jtfBuscadorKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jcbBuscarPor;
    private javax.swing.JTable jtAlumTabla;
    private javax.swing.JTextField jtfBuscador;
    // End of variables declaration//GEN-END:variables

    private void armarCabezera() {

        modelo.addColumn("IdAlumno");
        modelo.addColumn("DNI");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        modelo.addColumn("Fecha de Nacimiento");
        modelo.addColumn("Estado");
        this.jtAlumTabla.setModel(modelo);

    }

    private void actualizarAlumno() {
        //Metodo de Boton Actualizar

        int fila = this.jtAlumTabla.getSelectedRow();

        int idAlum = Integer.parseInt(modelo.getValueAt(fila, 0).toString());
        int dni = Integer.parseInt(modelo.getValueAt(fila, 1).toString());
        String ap = modelo.getValueAt(fila, 2).toString();
        String nom = modelo.getValueAt(fila, 3).toString();
        LocalDate fecha = LocalDate.parse(modelo.getValueAt(fila, 4).toString());
        boolean est = (boolean) modelo.getValueAt(fila, 5);

        AlumnosDatos.modicarAlumno(new Alumno(idAlum, dni, ap, nom, fecha, est));
    }

    private void buscarPor() {
        int op = jcbBuscarPor.getSelectedIndex();
        String campo = jtfBuscador.getText();

        // Limpiar la tabla antes de agregar nuevos datos
        modelo.setRowCount(0);

        switch (op) {
            case 0:
                for (Alumno alum : AlumnosDatos.listarAlumno()) {
                    modelo.addRow(new Object[]{alum.getIdAlumno(), alum.getDni(), alum.getApellido(), alum.getNombre(), alum.getFechaNacimiento(), alum.isEstado()});
                }
                jtfBuscador.setEnabled(false);
                break;
            case 1:
                try {
                    jtfBuscador.setEnabled(true);

                    if (!jtfBuscador.getText().isEmpty()) {
                        int id = Integer.parseInt(campo);
                        Alumno alum = AlumnosDatos.buscarAlumnosPorId(id);
                        modelo.addRow(new Object[]{alum.getIdAlumno(), alum.getDni(), alum.getApellido(), alum.getNombre(), alum.getFechaNacimiento(), alum.isEstado()});
                    }
                    jtfBuscador.setText(null);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Campo debe ser un número");
                } catch (NullPointerException e) {
                    JOptionPane.showMessageDialog(null, "No se encontraron datos");
                }
                break;

            case 2:
                try {
                    jtfBuscador.setEnabled(true);

                    if (!jtfBuscador.getText().isEmpty()) {
                        int dni = Integer.parseInt(campo);
                        Alumno alum = AlumnosDatos.buscarAlumnosPorDni(dni);
                        modelo.addRow(new Object[]{alum.getIdAlumno(), alum.getDni(), alum.getApellido(), alum.getNombre(), alum.getFechaNacimiento(), alum.isEstado()});
                    }
                    jtfBuscador.setText(null);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Campo debe ser un número");
                } catch (NullPointerException e) {
                    JOptionPane.showMessageDialog(null, "No se encontraron datos");
                }
                break;
        }

    }

    private void habilitarCampo() {
        int op = jcbBuscarPor.getSelectedIndex();

        switch (op) {
            case 0:
                jtfBuscador.setEnabled(false);
                break;
            case 1:
                jtfBuscador.setEnabled(true);
                break;
            case 2:
                jtfBuscador.setEnabled(true);
                break;
        }

    }

}//fin class