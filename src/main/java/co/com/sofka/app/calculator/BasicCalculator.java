package co.com.sofka.app.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {
    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }
    public Long sub(Long number1, Long number2) {
        logger.info( "Subtracting {} - {}", number1, number2 );
        return number1 - number2;
    }
    public Long multi(Long number1, Long number2) {
        logger.info( "Multiplying  {} * {}", number1, number2 );
        return number1 * number2;
    }
    public Long div(Long number1, Long number2) {
        if(number2 == 0) throw new RuntimeException("No se puede dividir por cero");
        logger.info( "Dividing {} / {}", number1, number2 );
        return number1 / number2;
    }
}

