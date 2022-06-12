import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    public void shouldBeAbleToSumTwoPositiveNumbers(){
        Calculadora calc = new Calculadora();
        int resultado = calc.somar(3, 10);

        Assertions.assertEquals(13,resultado);
    }
}
