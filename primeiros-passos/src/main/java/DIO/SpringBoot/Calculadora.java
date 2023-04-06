package DIO.SpringBoot;

import org.springframework.boot.SpringApplication;

public class Calculadora {
    public static void main(String[] args) {
        SpringApplication.run(PrimeirosPassosApplication.class, args);

        Calculadora calculadora = new Calculadora();
        System.out.println("O resultado é: " + calculadora.somar(2,7) + ".");
    }

    private Integer somar(int num1, int num2) {
        return num1+num2;
    }
}
