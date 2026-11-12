public class SimuladorTemperatura {
    public static void main(String[] args) {
        // Lee la temperatura enviada desde el comando
        double t = Double.parseDouble(args[0]); 
        String[] opciones = {"BiblioTec", "PrestaLibros", "BiblioApp", "LectoGo", "NubeDeTinta"};
        double[] puntajes = {4.0, 2.5, 2.0, 1.0, 0.5};
        
        System.out.println("Temperatura: " + t);
        
        double[] probs = calcularProbabilidades(puntajes, t);
        
        for (int i = 0; i < opciones.length; i++) {
            int barras = (int) Math.round(probs[i] * 40);
            System.out.printf("%-12s [%-40s] %5.1f%%\n", opciones[i], "=".repeat(barras), probs[i] * 100);
        }
        
        System.out.println("Nombres elegidos (5 intentos):");
        for(int i=0; i<5; i++){
            System.out.print(elegir(opciones, probs) + (i < 4 ? ", " : "\n\n"));
        }
    }

    static double[] calcularProbabilidades(double[] puntajes, double t) {
        double[] prob = new double[puntajes.length];
        if (t <= 0) {
            prob[0] = 1.0;
            return prob;
        }
        double suma = 0;
        for (int i = 0; i < puntajes.length; i++) {
            prob[i] = Math.exp(puntajes[i] / t);
            suma += prob[i];
        }
        for (int i = 0; i < prob.length; i++) {
            prob[i] = prob[i] / suma;
        }
        return prob;
    }

    static String elegir(String[] opciones, double[] probs) {
        double r = Math.random();
        double acumulado = 0;
        for (int i = 0; i < probs.length; i++) {
            acumulado += probs[i];
            if (r < acumulado) {
                return opciones[i];
            }
        }
        return opciones[opciones.length - 1];
    }
}