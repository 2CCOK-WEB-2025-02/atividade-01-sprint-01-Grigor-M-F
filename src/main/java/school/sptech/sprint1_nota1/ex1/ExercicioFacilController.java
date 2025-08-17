package school.sptech.sprint1_nota1.ex1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioFacilController {

    @GetMapping("/ex-01/{palavra}")
    public Boolean exercicioFacil(@PathVariable String palavra) {

        String textTratado = palavra.toLowerCase();
        int limiteMax = textTratado.length() -1;
        int limiteMin = 0;

        while(limiteMin < limiteMax){
            if(textTratado.charAt(limiteMin) != textTratado.charAt(limiteMax)){
                return false;
            }

            limiteMin++;
            limiteMax--;
        }


        return true;
    }
}
