import java.util.*;

public class Main {

    // Cache para almacenar los números de Fibonacci ya calculados
    private static Map<Integer, Long> fibonacciCache = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reto 1: Fibonacci
        System.out.println("Reto 1: Fibonacci");
        System.out.println("Ingrese el valor de n para calcular el n-ésimo número de Fibonacci:");
        int n = sc.nextInt();
        long fibN = calcularFibonacci(n);
        System.out.println("F" + n + " = " + fibN);

        System.out.println("Ingrese un número entero para verificar si es un número de Fibonacci:");
        int numero2 = sc.nextInt();
        if (esNumeroFibonacci(numero2)){
            System.out.println(numero2 + " es un número de Fibonacci");
        } else {
            System.out.println(numero2 +" no es un número de Fibonacci");
        }

        System.out.println("Ingrese un número para mostrar los primeros números de Fibonacci:");
        int m = sc.nextInt();
        mostrarNumerosFibonacci(m);

        // Reto 2: Multiplicación Rusa
        System.out.println("Reto 2: Multiplicación Rusa");
        System.out.println("Ingrese el multiplicador:");
        int multiplicador = sc.nextInt();
        System.out.println("Ingrese el multiplicando:");
        int multiplicando = sc.nextInt();
        int producto = multiplicacionRusa(multiplicador, multiplicando);
        System.out.println("Resultado: " + producto);

        // Reto 3: Números amistosos
        System.out.println("Reto 3: Números amistosos");
        System.out.println("Encontrando pares de números amigables en el rango [1000, 1500]:");
        encontrarYMostrarNumerosAmigables(1000, 1500);

        // Reto 4: Votaciones de la CONFECH
        System.out.println("Reto 4: Votaciones de la CONFECH");
        int numUniversidades = solicitarNumeroUniversidades(sc);
        Map<String, Map<String, Integer>> votosPorUniversidad = procesarVotaciones(sc, numUniversidades);
        mostrarResultadosVotaciones(votosPorUniversidad);

        sc.close();
    }

    public static long calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            long fibo1 = 0;
            long fibo2 = 1;
            long fiboN = 0;
            for (int i = 2; i <= n; i++) {
                fiboN = fibo1 + fibo2;
                fibo1 = fibo2;
                fibo2 = fiboN;
            }
            return fiboN;
        }
    }

    public static boolean esNumeroFibonacci(int num) {
        return esCuadradoPerfecto(5 * num * num + 4) || esCuadradoPerfecto(5 * num * num - 4);
    }

    public static boolean esCuadradoPerfecto(int num){
        int raizCuadrada = (int)Math.sqrt(num);
        return raizCuadrada * raizCuadrada == num;
    }

    public static void mostrarNumerosFibonacci(int m) {
        long fibo1 = 0;
        long fibo2 = 1;
        System.out.println("Los " + m + " primeros números de Fibonacci son:");
        System.out.print(fibo1 + " " + fibo2 + " ");
        for (int i = 2; i < m; i++) {
            long fiboN = fibo1 + fibo2;
            System.out.print(fiboN + " ");
            fibo1 = fibo2;
            fibo2 = fiboN;
        }
        System.out.println();
    }

    public static int multiplicacionRusa(int multiplicador, int multiplicando) {
        int producto = 0;
        while (multiplicador > 0) {
            if (multiplicador % 2 != 0) {
                producto += multiplicando;
            }
            multiplicador /= 2;
            multiplicando *= 2;
        }
        return producto;
    }

    public static void encontrarYMostrarNumerosAmigables(int inicio, int fin) {
        for (int i = inicio; i <= fin; i++) {
            int sumaDivisoresI = sumaDivisores(i);
            if (sumaDivisoresI > i && sumaDivisoresI <= fin) {
                int sumaDivisoresJ = sumaDivisores(sumaDivisoresI);
                if (sumaDivisoresJ == i) {
                    System.out.println("Par amigable encontrado: (" + i + ", " + sumaDivisoresI + ")");
                }
            }
        }
    }

    public static int sumaDivisores(int num) {
        int suma = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                suma += i;
            }
        }
        return suma;
    }

    public static int solicitarNumeroUniversidades(Scanner sc) {
        System.out.println("   ---   Bienvenido a la interfaz de Universidades   ---   \n");
        System.out.println("Ingrese el número de universidades:");
        return sc.nextInt();
    }

    public static Map<String, Map<String, Integer>> procesarVotaciones(Scanner sc, int numUniversidades) {
        Map<String, Map<String, Integer>> votosPorUniversidad = new HashMap<>();
        sc.nextLine();
        for (int i = 0; i < numUniversidades; i++) {
            System.out.println("Universidad " + (i + 1) + ":");
            String nombreUniversidad = sc.nextLine();
            Map<String, Integer> votos = new HashMap<>();
            int aceptan = 0, rechazan = 0, blancos = 0, nulos = 0;
            System.out.println("Ingrese los votos (A para aceptar, R para rechazar, B para blanco, N para nulo, X para terminar):");
            String voto = sc.nextLine();
            while (!voto.equals("X")) {
                switch (voto) {
                    case "A":
                        aceptan++;
                        break;
                    case "R":
                        rechazan++;
                        break;
                    case "B":
                        blancos++;
                        break;
                    case "N":
                        nulos++;
                        break;
                    default:
                        System.out.println("Voto inválido.");
                        break;
                }
                voto = sc.nextLine();
            }
            votos.put("Aceptar", aceptan);
            votos.put("Rechazar", rechazan);
            votos.put("Blanco", blancos);
            votos.put("Nulo", nulos);
            votosPorUniversidad.put(nombreUniversidad, votos);
        }
        return votosPorUniversidad;
    }

    public static void mostrarResultadosVotaciones(Map<String, Map<String, Integer>> votosPorUniversidad) {
        int totalAceptan = 0, totalRechazan = 0, totalEmpate = 0;
        for (Map.Entry<String, Map<String, Integer>> entry : votosPorUniversidad.entrySet()) {
            String nombreUniversidad = entry.getKey();
            Map<String, Integer> votos = entry.getValue();
            int aceptan = votos.get("Aceptar");
            int rechazan = votos.get("Rechazar");
            totalAceptan += aceptan;
            totalRechazan += rechazan;
            System.out.println(nombreUniversidad + ": Aceptan = " + aceptan + ", Rechazan = " + rechazan);
            if (aceptan == rechazan) {
                totalEmpate++;
            }
        }
        System.out.println("Total: Aceptan = " + totalAceptan + ", Rechazan = " + totalRechazan + ", Empate = " + totalEmpate);
    }
}
