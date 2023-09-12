package com.mycompany.ajuste.salarios;
import java.util.Scanner;

public class AjusteSalarios {

    public static void main(String[] args) {
        AjusteSalarios2 sal = new AjusteSalarios2(); 
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o seu salário: ");
        sal.salario = (ler.nextFloat());
        sal.saida();
        
    }
}
