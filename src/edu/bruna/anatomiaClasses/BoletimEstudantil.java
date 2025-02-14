// Aqui é quando movo meu arquivo java para outra pasta, package é uma forma de organização:
package edu.bruna.anatomiaClasses; 
                                  
public class BoletimEstudantil {
    
    public static void main(String[] args) {
        int mediaFinal = 6;
        if(mediaFinal < 6)
            System.out.println("REPROVADO");
        else if(mediaFinal == 6)
            System.out.println("PROVA MINERVA");
        else 
            System.out.println("APROVADO");
    }
}
