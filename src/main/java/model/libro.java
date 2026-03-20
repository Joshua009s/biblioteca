/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author joshu
 */
public class libro {
    private String titulo;
    private String autor;
    private boolean prestado;
    
    public libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.prestado=false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
    
    public boolean isPrestado(){
        return prestado;
    }
    
    public void prestar(){
        prestado=true;
    }
    
    public void devolver(){
        prestado=false;
    }
    
}
