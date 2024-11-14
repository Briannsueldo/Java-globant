import java.util.Scanner;

import Model.Punto;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int option;

        do {
            System.out.println("""
                        Seleccione la accion
                        1 - Calcular la distancia al origen de un punto
                        2 - Calcular la distancia entre 2 puntos
                        3 - Calcular si tres puntos estan alineados
                    """);
            option = scan.nextInt();

            switch (option) {
                case 1 -> {
                    System.out.println("Ingrese la coordenada X:");
                    int x = scan.nextInt();
                    System.out.println("Ingrese la coordenada Y:");
                    int y = scan.nextInt();
                    Punto punto1 = new Punto(x,y);
                    System.out.println("La distancia al origen del punto es: " + punto1.distanciaAlOrigen(x, y));

                    break;
                }
                case 2 -> {
                    System.out.println("Ingrese la coordenada X del punto A:");
                    int xA = scan.nextInt();
                    System.out.println("Ingrese la coordenada Y del punto A:");
                    int yA = scan.nextInt();

                    Punto puntoA = new Punto(xA,yA);

                    System.out.println("Ingrese la coordenada X del punto B:");
                    int xB = scan.nextInt();
                    System.out.println("Ingrese la coordenada Y del punto B:");
                    int yB = scan.nextInt();

                    Punto puntoB = new Punto(xB, yB);

                    System.out.println("La distancia entre el punto A y el punto B es: " + Punto.distanciaEntrePuntos(puntoA, puntoB));
                    
                    break;
                }
                case 3 -> {
                    System.out.println("Ingrese la coordenada X del punto A:");
                    int xA = scan.nextInt();
                    System.out.println("Ingrese la coordenada Y del punto A:");
                    int yA = scan.nextInt();

                    Punto puntoA = new Punto(xA,yA);

                    System.out.println("Ingrese la coordenada X del punto B:");
                    int xB = scan.nextInt();
                    System.out.println("Ingrese la coordenada Y del punto B:");
                    int yB = scan.nextInt();

                    Punto puntoB = new Punto(xB, yB);

                    System.out.println("Ingrese la coordenada X del punto C:");
                    int xC = scan.nextInt();
                    System.out.println("Ingrese la coordenada Y del punto C:");
                    int yC = scan.nextInt();

                    Punto puntoC = new Punto(xC, yC);

                    if (Punto.estanAlineados(puntoA, puntoB, puntoC) == 0) {
                        System.out.println("Los puntos estan alineados");
                    } else {
                        System.out.println("Los puntos no estan alineados");
                    }

                    break;
                }
                default -> {
                    System.out.println("Valor invalido");
                }
            }
            
        } while (option != 4);

        scan.close();
    }
}
