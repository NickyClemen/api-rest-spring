package com.zirearl.shmuebles.models.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Entity
@Table(name="muebles")
public class Muebles implements Serializable {
    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mueble")
    private int idMueble;

    @NotEmpty
    private String nombre;

    @NotEmpty
    private String categoria;
    private String subcategoria;

    @NotEmpty
    private float precio;
    private float ancho;
    private float alto;
    private float profundo;

    @Column(name = "otras_medidas")
    private String otrasMedidas;
    private String material;
    private String colores;

    @Column(name = "color_adicional")
    private String colorAdicional;
    private String descripcion;

    @Column(name = "a_pedido")
    private String aPedido;

    public int getIdMueble() {
        return this.idMueble;
    }

    public void setIdMueble(int idMueble) {
        this.idMueble = idMueble;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSubcategoria() {
        return this.subcategoria;
    }

    public void setSubcategoria(String subcategoria) {
        this.subcategoria = subcategoria;
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getAncho() {
        return this.ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getAlto() {
        return this.alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public float getProfundo() {
        return this.profundo;
    }

    public void setProfundo(float profundo) {
        this.profundo = profundo;
    }

    public String getOtrasMedidas() {
        return this.otrasMedidas;
    }

    public void setOtrasMedidas(String otrasMedidas) {
        this.otrasMedidas = otrasMedidas;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColores() {
        return this.colores;
    }

    public void setColores(String colores) {
        this.colores = colores;
    }

    public String getColorAdicional() {
        return this.colorAdicional;
    }

    public void setColorAdicional(String colorAdicional) {
        this.colorAdicional = colorAdicional;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getaPedido() {
        return this.aPedido;
    }

    public void setaPedido(String aPedido) {
        this.aPedido = aPedido;
    }
}
