package ioc.xtec.cat.selectionsort;

/**
 * Aquesta classe valida que un array sigui correcte per ser processat.
 * Comprova que l'array no sigui nul ni buit.
 * 
 * @author El teu nom
 * @version 1.0
 */
public class ArrayValidator {

    /**
     * Valida que l'array no sigui nul ni buit.
     * Llança una excepció si l'array no és vàlid.
     * 
     * @param arr L'array que s'ha de validar.
     * @throws IllegalArgumentException Si l'array és nul o buit.
     */
    public void validateArray(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("L'array no pot ser nul.");
        }
        if (arr.length == 0) {
            throw new IllegalArgumentException("L'array no pot estar buit.");
        }
    }
}
