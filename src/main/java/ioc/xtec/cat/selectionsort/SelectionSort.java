package ioc.xtec.cat.selectionsort;

/**
 * Aquesta classe implementa l'algoritme de selecció per ordenar un array d'enters.
 * També permet cercar un valor dins l'array.
 * 
 * @author Alex Redolad Casas
 * @version 1.0
 */
public class SelectionSort {

    /**
     * Ordena l'array utilitzant l'algoritme SelectionSort.
     * Aquest algoritme busca el valor més petit i el posa a la primera posició,
     * després cerca el següent més petit i el posa a la segona, etc.
     * 
     * @param arr L'array que es vol ordenar.
     */
   public void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    /**
     * Comprova si un valor es troba dins de l'array.
     * 
     * @param arr L'array en el qual es busca el valor.
     * @param value El valor que es vol buscar.
     * @return true si el valor existeix a l'array, false en cas contrari.
     * @throws IllegalArgumentException Si l'array és nul.
     */
    public boolean contains(int[] arr, int value) {
        if (arr == null) {
            throw new IllegalArgumentException("L'array no pot ser nul.");
        }

        for (int num : arr) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }
}
