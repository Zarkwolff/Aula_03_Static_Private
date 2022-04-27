/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diego
 */
public class Static {
    public static void main(String[] args) {
        SalaDeAula.professor = "Diego";
        SalaDeAula.ensinar();
        
        SalaDeAula a1 = new SalaDeAula();
        a1.aluno = "João";
        
        SalaDeAula a2 = new SalaDeAula();
        a2.aluno = "Isadora";
        
        System.out.println("Aluno(a): " + a1.aluno);
        System.out.println("Professor: " + a1.professor);
        System.out.println("");
        System.out.println("Aluno(a): " + a2.aluno);
        System.out.println("Professor: " + a2.professor);
    }
    
}
