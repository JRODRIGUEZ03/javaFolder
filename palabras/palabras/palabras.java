/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palabras;

/**
 *
 * @author JRIVERA
 */
public class Palabras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] pals = {"amigos", "hogar", "estudio", "desarrollo", "jugar", "celulñar", "perro", "carro"};

        System.out.println("Palabras con más de 4 letras:");

        for (String pal : pals) {
            if (pal.length() > 4) {
                System.out.println(pal);
            }
        }
    }
    
}
