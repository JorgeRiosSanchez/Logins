package com.politecnicomalaga.modelo;

public class Credencial {

    private int id;
    private String nombre;
    private Integer algoritmo;
    private String hash;
    private String salt;

    public Credencial (String nombre, Integer algoritmo, String hash, String salt){
        this.nombre=nombre;
        this.algoritmo=algoritmo;
        this.hash=hash;
        this.salt=salt;
    }

    public Credencial (int id, String nombre, Integer algoritmo, String hash, String salt){
        this.id=id;
        this.nombre=nombre;
        this.algoritmo=algoritmo;
        this.hash=hash;
        this.salt=salt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getAlgoritmo() {
        return algoritmo;
    }

    public void setAlgoritmo(Integer algoritmo) {
        this.algoritmo = algoritmo;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
}
