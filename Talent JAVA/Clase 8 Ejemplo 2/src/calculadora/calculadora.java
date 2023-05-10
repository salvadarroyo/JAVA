package calculadora;

import org.springframework.stereotype.Component;

@Component
public class calculadora{
    public int sumar(int a, int b){
        return a + b;
    }
    public int restar(int a, int b){
        return a - b;
    }
    public int multiplicacion(int a, int b){
        return a * b;
    }
    public int division(int a, int b){
        if(b == 0){
            throw new IllegalArgumentException("No se puede dividir por 0");
        }
        else{
            return a / b;
        }
    }
}
