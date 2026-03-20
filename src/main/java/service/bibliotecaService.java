/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.libro;
import java.util.ArrayList;

/**
 *
 * @author joshu
 */
public class bibliotecaService {
    private ArrayList<libro> libros= new ArrayList<>();
    
    public void agregarLibros(String titulo, String autor){
        libros.add(new libro(titulo, autor));
    }
    
    public void listarLibros(){
        for(libro l: libros){
           System.out.println(l.getTitulo()+" - " +l.getAutor()); 
        }
    }
}
