
/**
 *
 * @author angel
 */

public class ParesContador extends Thread {

    protected long inicio;
    protected long fin;
    protected double tiempoCalculo;

    @Override
    public void run() {
        try {
            this.inicio = System.nanoTime();
            for (byte conde = 2; conde <= 10; conde += 2) {
                System.out.println(conde + " ");
                sleep(500); // duerme 0.5 seg
            }
            this.fin = System.nanoTime();
            this.tiempoCalculo = ((double) (this.fin - this.inicio) / 1000000000);
            System.out.println("Tiempo con contador. "
                               + this.tiempoCalculo + " s.");
        } catch (InterruptedException e) {
            System.out.println(":( Hilo interrumpido.");
        }
    }
}
