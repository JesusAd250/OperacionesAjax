package ajax.ajax.Controllers;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperacionesController {

    @PostMapping("/calcular")
    public Map<String, Object> calcular(@RequestBody Map<String, String> datos) {
        double num1 = Double.parseDouble(datos.get("numero1"));
        double num2 = Double.parseDouble(datos.get("numero2"));
        String operacion = datos.get("operacion");
        double resultado = 0;

        switch (operacion) {
            case "+": resultado = num1 + num2; break;
            case "-": resultado = num1 - num2; break;
            case "*": resultado = num1 * num2; break;
            case "/": 
                if (num2 != 0) resultado = num1 / num2;
                else throw new ArithmeticException("División entre cero");
                break;
        }

        return Map.of("resultado", resultado);
    }
}