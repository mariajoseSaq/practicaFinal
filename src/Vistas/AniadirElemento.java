/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controlador.Controlador;

/**
 *
 * @author Maria Jose
 */
public class AniadirElemento extends javax.swing.JPanel {

    Controlador c;

    /**
     * Creates new form AniadirElemento
     */
    public AniadirElemento(Controlador con) {
        this.c = con;
        initComponents();
        PanelEntrada.setVisible(false);
        PanelSalida.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboTr = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        denominacionTx = new javax.swing.JTextField();
        numFicherosT = new javax.swing.JTextField();
        numDatosT = new javax.swing.JTextField();
        guardarBoton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        PanelEntrada = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ficherosEntrada = new javax.swing.JTextField();
        datosEntrada = new javax.swing.JTextField();
        PanelSalida = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ficherosSalida = new javax.swing.JTextField();
        DatosSalida = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabel1.setText("Denominación: ");

        jLabel2.setText("Tipo de transacción: ");

        comboTr.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Entradas Externas", "Salidas Externas", "Grupos lógicos de datos internos", "Grupos lógicos de datos de interfaz", "Consultas externas" }));
        comboTr.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboTrItemStateChanged(evt);
            }
        });
        comboTr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTrActionPerformed(evt);
            }
        });

        jLabel3.setText("Nº de ficheros/tipos de registros: ");

        jLabel4.setText("Nº de datos elementales:");

        denominacionTx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                denominacionTxActionPerformed(evt);
            }
        });

        numFicherosT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numFicherosTActionPerformed(evt);
            }
        });

        numDatosT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numDatosTActionPerformed(evt);
            }
        });

        guardarBoton.setText("Guardar");
        guardarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBotonActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        PanelEntrada.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, java.awt.Color.gray));

        jLabel5.setText("Entrada");

        jLabel7.setText("Número de Ficheros");

        jLabel8.setText("Número de Datos");

        ficherosEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ficherosEntradaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelEntradaLayout = new javax.swing.GroupLayout(PanelEntrada);
        PanelEntrada.setLayout(PanelEntradaLayout);
        PanelEntradaLayout.setHorizontalGroup(
            PanelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEntradaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(PanelEntradaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(PanelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(35, 35, 35)
                        .addGroup(PanelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ficherosEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                            .addComponent(datosEntrada))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        PanelEntradaLayout.setVerticalGroup(
            PanelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEntradaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(ficherosEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(datosEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        PanelSalida.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, java.awt.Color.gray));

        jLabel6.setText("Salida");

        jLabel9.setText("Número de ficheros");

        jLabel10.setText("Número de Datos");

        javax.swing.GroupLayout PanelSalidaLayout = new javax.swing.GroupLayout(PanelSalida);
        PanelSalida.setLayout(PanelSalidaLayout);
        PanelSalidaLayout.setHorizontalGroup(
            PanelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSalidaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(PanelSalidaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(PanelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PanelSalidaLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(63, 63, 63)
                                .addComponent(DatosSalida))
                            .addGroup(PanelSalidaLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(50, 50, 50)
                                .addComponent(ficherosSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        PanelSalidaLayout.setVerticalGroup(
            PanelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSalidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(ficherosSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(DatosSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Nº de entradas externas", "0 x 3", "0 x 4", "0 x 6", "0"},
                {"Nº de salidas externas", "0 x 4", "0 x 5", "0 x 7", "0"},
                {"Nº de grupos lógicos de grupos de datos", "0 x 7", "0 x 10", "0 x 15", "0"},
                {"Nº de grupos lógicos de datos de interfaz", "0 x 5", "0 x 7", "0 x 10", "0"},
                {"Nº de consultas externas", "0 x 3", "0 x 4", "0 x 6", "0"},
                {"Total puntos función no ajustados", "", null, null, "0"}
            },
            new String [] {
                "Descripción", "Sencilla", "Media", "Compeleja", "Total PF"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(comboTr, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(denominacionTx)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(numDatosT, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(numFicherosT, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(guardarBoton)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PanelEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(PanelSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 23, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(denominacionTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(comboTr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(numFicherosT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(numDatosT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(guardarBoton))
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void numFicherosTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numFicherosTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numFicherosTActionPerformed

    private void guardarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBotonActionPerformed
        String denominacion = denominacionTx.getText();
        int tipo = comboTr.getSelectedIndex();
        int numFichEntrada = 0;
        int numDatEntrada = 0;
        int numFichSalida = 0;
        int numDatSalida = 0;
        int numFicheros = 0;
        int numDatos = 0;
        boolean insertado = false;
        boolean insertadoEntrada = false;
        boolean insertadoSalida = false;
        
        if (tipo == 4) {
            //consultas externas

            numFichEntrada = Integer.parseInt(ficherosEntrada.getText());
            numDatEntrada = Integer.parseInt(datosEntrada.getText());
            numFichSalida = Integer.parseInt(ficherosSalida.getText());
            numDatSalida = Integer.parseInt(DatosSalida.getText());
            insertadoEntrada = c.AddElto(denominacion + "CE_Entrada", tipo, numFichEntrada, numDatEntrada);
            insertadoSalida = c.AddElto(denominacion + "CE_Salida", tipo, numFichSalida, numDatSalida);

        } else {
            numFicheros = Integer.parseInt(numFicherosT.getText());
            numDatos = Integer.parseInt(numDatosT.getText());
            insertado = c.AddElto(denominacion, tipo, numFicheros, numDatos);
        }
        if ((insertadoEntrada && insertadoSalida) || insertado) {
            int filatabla = 0;
            int columnatabla = 0;
            String dificultad = "";

            filatabla = tipo;
            if (tipo == 0) {
                dificultad = c.dificultadEntradaExterna(numFicheros, numDatos);
                if ("Sencillo".equals(dificultad)) {
                    columnatabla = 1 + 0;
                } else if (dificultad.equals("Medio")) {
                    columnatabla = 1 + 1;
                } else {
                    columnatabla = 1 + 2;
                }

                dibujaTabla(filatabla, columnatabla);
            } else if (tipo == 1) {
                dificultad= c.dificultadSalidaExterna(numFicheros, numDatos);
                 if ("Sencillo".equals(dificultad)) {
                    columnatabla = 1 + 0;
                } else if (dificultad.equals("Medio")) {
                    columnatabla = 1 + 1;
                } else {
                    columnatabla = 1 + 2;
                }
                 dibujaTabla(filatabla, columnatabla);
            
            } else if (tipo == 2 || tipo == 3) {
                dificultad=c.dificultadGLDI(numFicheros, numDatos);
                 if ("Sencillo".equals(dificultad)) {
                    columnatabla = 1 + 0;
                } else if (dificultad.equals("Medio")) {
                    columnatabla = 1 + 1;
                } else {
                    columnatabla = 1 + 2;
                }
                 dibujaTabla(filatabla, columnatabla);

            } else {
                dificultad=c.dificultadConsultaExterna(numFichEntrada, numDatEntrada, numFichSalida, numDatSalida);
             
                if ("Medio".equals(dificultad)) {
                    columnatabla = 1 + 0;
                } else if (dificultad.equals("Medio")) {
                    columnatabla = 1 + 1;
                } else {
                    columnatabla = 1 + 2;
                }
                 dibujaTabla(filatabla, columnatabla);

            }

        }

    }//GEN-LAST:event_guardarBotonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void comboTrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTrActionPerformed

    private void comboTrItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboTrItemStateChanged

        String nombre = comboTr.getSelectedItem().toString();
        if (nombre.equals("Consultas externas")) {
            PanelEntrada.setVisible(true);
            PanelSalida.setVisible(true);
            numFicherosT.setEnabled(false);
            numDatosT.setEnabled(false);
        } else {
            PanelEntrada.setVisible(false);
            PanelSalida.setVisible(false);
            numFicherosT.setEnabled(true);
            numDatosT.setEnabled(true);
        }


    }//GEN-LAST:event_comboTrItemStateChanged

    private void denominacionTxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_denominacionTxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_denominacionTxActionPerformed

    private void numDatosTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numDatosTActionPerformed


    }//GEN-LAST:event_numDatosTActionPerformed

    private void ficherosEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ficherosEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ficherosEntradaActionPerformed

    public void dibujaTabla(int fila, int col) {
        String texto;

        int aux, auxTotal;
        String[] splitTexto;
        texto = jTable1.getValueAt(fila, col).toString();
        splitTexto = texto.split(" ");

        aux = Integer.parseInt(splitTexto[0]);

        aux++;
        splitTexto[0] = String.valueOf(aux);
        texto = splitTexto[0] + " " + splitTexto[1] + " " + splitTexto[2];
        jTable1.setValueAt(texto, fila, col);
        auxTotal = Integer.parseInt(jTable1.getValueAt(fila, 4).toString()) + Integer.parseInt(splitTexto[2]);
        jTable1.setValueAt(auxTotal, fila, 4);
        auxTotal = Integer.parseInt(jTable1.getValueAt(0, 4).toString()) + Integer.parseInt(jTable1.getValueAt(1, 4).toString())
                + Integer.parseInt(jTable1.getValueAt(2, 4).toString()) + Integer.parseInt(jTable1.getValueAt(3, 4).toString())
                + Integer.parseInt(jTable1.getValueAt(4, 4).toString());
        jTable1.setValueAt(auxTotal, 5, 4);
        c.actualizaPFNA(auxTotal);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DatosSalida;
    private javax.swing.JPanel PanelEntrada;
    private javax.swing.JPanel PanelSalida;
    private javax.swing.JComboBox comboTr;
    private javax.swing.JTextField datosEntrada;
    private javax.swing.JTextField denominacionTx;
    private javax.swing.JTextField ficherosEntrada;
    private javax.swing.JTextField ficherosSalida;
    private javax.swing.JButton guardarBoton;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField numDatosT;
    private javax.swing.JTextField numFicherosT;
    // End of variables declaration//GEN-END:variables
}
