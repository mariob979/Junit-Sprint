/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera.Productos;

import Control.Verificaciones;
import Entidad.Producto;

/**
 *
 * @author 192545681742
 */
public class EditarProducto extends javax.swing.JPanel {

    /**
     * Creates new form EditarProducto
     */
    public EditarProducto() {
        initComponents();
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
        jLabel3 = new javax.swing.JLabel();
        idProductoEditado = new javax.swing.JTextField();
        nombreProductoEditado = new javax.swing.JTextField();
        precioProductoEditado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        editarProducto = new javax.swing.JButton();
        resultado = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setText("Identificación Producto");

        jLabel2.setText("Nombre Nuevo");

        jLabel3.setText("Precio Nuevo");

        jLabel4.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel4.setText("EDITAR PRODUCTO");

        editarProducto.setText("Guardar");
        editarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarProductoActionPerformed(evt);
            }
        });

        resultado.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(idProductoEditado)
                                    .addComponent(nombreProductoEditado)
                                    .addComponent(precioProductoEditado, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                                    .addComponent(editarProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idProductoEditado, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreProductoEditado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioProductoEditado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(editarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarProductoActionPerformed
        Verificaciones ver= new Verificaciones();
        String text= idProductoEditado.getText();
        String text2= precioProductoEditado.getText();
        String text3= nombreProductoEditado.getText();
        
        if(text.length()==0){
            resultado.setText("Es necesaria una ID válida para ésta operación");
        }else if(!ver.isNumeric(text)){
            resultado.setText("La ID debe ser un número");
        }else if(20<text.length()){
            resultado.setText("La ID no puede superar los 20 dígitos");
        }else if(!ver.VerificarExistenciaID(Integer.parseInt(text))){
            resultado.setText("No existe ningún producto registrado con ésta ID");
        }else{
            if(text2.length()==0 && text3.length()!=0){
                if(50<text3.length()){
                    resultado.setText("El nombre del producto no puede superar los 50 caracteres");
                }else{
                    Producto productoconlaID= new Producto();
                    productoconlaID.setId(Integer.parseInt(text));
                    Producto productoanterior = ver.pdao.leerID(productoconlaID);
                    ver.pdao.actualizarEDIT(productoanterior,text3,productoanterior.getValor());
                    resultado.setText("Producto actualizado");
                }
            }else if(text2.length()!=0 && text3.length()==0){
                if(!ver.isNumeric(text2)){
                    resultado.setText("Ingrese un número como precio");
                }else if(20<text2.length()){
                    resultado.setText("El número de dígitos no puede ser mayor que 20");
                }else if(Integer.parseInt(text2)<0){
                    resultado.setText("El precio no puede ser negativo");
                }else{
                    Producto productoconlaID= new Producto();
                    productoconlaID.setId(Integer.parseInt(text));
                    Producto productoanterior = ver.pdao.leerID(productoconlaID);
                    ver.pdao.actualizarEDIT(productoanterior,productoanterior.getNombre(),Integer.parseInt(text2));
                    resultado.setText("Producto actualizado");
                }
            }else if(text2.length()!=0 && text3.length()!=0){
                if(50<text3.length()){
                    resultado.setText("El nombre del producto no puede superar los 50 caracteres");
                }else if(!ver.isNumeric(text2)){
                    resultado.setText("Ingrese un número como precio");
                }else if(20<text2.length()){
                    resultado.setText("El número de dígitos no puede ser mayor que 20");
                }else if(Integer.parseInt(text2)<0){
                    resultado.setText("El precio no puede ser negativo");
                }else{
                    Producto productoconlaID= new Producto();
                    productoconlaID.setId(Integer.parseInt(text));
                    Producto productoanterior = ver.pdao.leerID(productoconlaID);
                    ver.pdao.actualizarEDIT(productoanterior,text3,Integer.parseInt(text2));
                    resultado.setText("Producto actualizado");
                }
            }else{
                resultado.setText("No se ha cambiado ningún elemento");
            }
        }                 
    }//GEN-LAST:event_editarProductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editarProducto;
    private javax.swing.JTextField idProductoEditado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nombreProductoEditado;
    private javax.swing.JTextField precioProductoEditado;
    private javax.swing.JLabel resultado;
    // End of variables declaration//GEN-END:variables
}
