
package com.mycompany.ajuste.salarios;

public class AjusteSalarios2 {
    public double salario, reajuste, salfinal;
    public double calc(){
        if (salario <= 280){
            reajuste = 0.2;
            salfinal = salario + (salario * reajuste);
            return salfinal;
        } else if (salario <= 700){
            reajuste = 0.15;
            salfinal = salario + (salario * reajuste);
            return salfinal;
        } else if (salario <= 1500){
            reajuste = 0.10;
            salfinal = salario + (salario * reajuste);
            return salfinal;
        } else {
            reajuste = 0.05;
            salfinal = salario + (salario * reajuste);
            return salfinal;
        }
    }
    public void saida(){
        calc();
        System.out.println("Salário antes do aumento: R$ "+ salario );
        System.out.println("Percentual de aumento: "+ (reajuste * 100) +("%"));
        System.out.println("O salário aumentou em: R$ " + (salario * reajuste));
        System.out.println("Salário após o aumento: R$ "+ (salfinal));
    }
}
