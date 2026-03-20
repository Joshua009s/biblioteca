/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;
import service.bibliotecaService;
import java.util.Scanner;
/**
 *
 * @author joshu
 */
public class menu {
  bibliotecaService servicio = new bibliotecaService();
  Scanner sc = new Scanner(System.in);
  
  public void iniciar(){
      int opcion;
      
      
      do {          
          System.out.println("1. agregar libros");
          System.out.println("2. Listar Libros");
          System.out.println("3. salir");
          
          opcion = sc.nextInt();
          sc.nextLine();
          
          switch(opcion){
              case 1:
              System.out.print("titulo: ");
              String titulo = sc.nextLine();
              
              System.out.println("Autor: ");
              String autor = sc.nextLine();
              servicio.agregarLibros(titulo, autor);
              System.out.println("\n");
              
              case 2:
              servicio.listarLibros();
              System.out.println("\n");
              break;
          }
      } while(opcion!=3);
  }
}
