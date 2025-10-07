package marketsport;

import java.util.Scanner;

public class Inventario {

    public Inventario() {
    }

    public void vender(Persona p) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a MarketSport. ");
        System.out.println("elige el apartado del deporte deseado:");
        System.out.println("1.Basketball\n2.Futbol\n3.MMA\n4.Boxeo\n5.Voleybol");
        System.out.println("6.Rugby\n7.Tennis\n8.Beisbol\n9.Balon mano\n10.Karate");
        System.out.print("elige una opcion: ");
        int resp = sc.nextInt();
        while (true) {
            switch (resp) {
                case 1: // BASKETBALL
                    System.out.println("#############################################");
                    System.out.println("Ingresaste al apartado de Basketball ");
                    System.out.println("AH continuacion se mostraran los productos");
                    System.out.println("#############################################");
                    System.out.println("MENU \n1.Ropa \n2.Balones\nElige una opcion: ");
                    resp = sc.nextInt();

                    if (resp == 1) { // ROPA
                        System.out.println("ENTRASTE AL APARTADO DE ROPA");
                        System.out.println("MENU\n1.conjuntos\n2.Zapatillas\nElige una opcion.");
                        resp = sc.nextInt();

                        if (resp == 1) { // CONJUNTOS
                            String[] conjuntos = {
                                "negro y blanco Precio = 3500",
                                "morado y blanco Precio = 40000",
                                "narajado y negro Precio = 50000",
                                "amarillo y verde Precio = 60000",
                                "negro Precio = 25000"
                            };
                            System.out.println("#############################################");
                            System.out.println("a continuacion se mostraran los conjuntos disponibles");
                            System.out.println("#############################################");
                            for (int i = 0; i < conjuntos.length; i++) {
                                System.out.println((i + 1) + "." + conjuntos[i]);
                            }
                            System.out.println("Elige cual vas a llevas: ");
                            resp = sc.nextInt();
                            if(resp == 1 && p.saldo >= 35000){
                                System.out.println("has comprado  el conjunto "+conjuntos[0]);
                                p.saldo -=35000;
                                System.out.println("saldo actulizado: "+p.saldo);
                               
                            }else if(resp ==2 && p.saldo >= 40000){
                                System.out.println("has comprado el conjunto "+conjuntos[0]);
                                p.saldo -=40000;
                                System.out.println("saldo actualizado: "+p.saldo);
                            }else if(resp ==3 && p.saldo >=50000){
                                    System.out.println("has comprado el conjunto "+conjuntos[0]);
                                    p.saldo -=50000;
                                    System.out.println("Saldo actualizado: "+p.saldo);
                            }else if(resp ==4 && p.saldo >=60000){
                                System.out.println("has comprado el conjuento "+p.saldo );
                                p.saldo -=60000;
                                System.out.println("Saldo actualizado: "+p.saldo);
                            }else if(resp ==5 && p.saldo >=25000){
                                System.out.println("has comprado el conjunto "+conjuntos[0]);
                                p.saldo -=25000;
                                System.out.println("Saldo actializado: "+p.saldo);
                            }else{
                                
                                System.out.println("dinero insufinciete");
                                return;
                            }
                            
                            System.out.println("quieres comprar otra cosa?\n1.si\n2.no");
                            resp = sc.nextInt();
                            if(resp == 1){
                                continue;
                            }else{
                                return;
                            }
                            
                        }
                        
                    }else if(resp == 2){
                        
                    }
                    break;  // ← break DENTRO del case 1
                // resto de deportes
                case 2:
                    System.out.println("#############################################");
                    System.out.println("Ingresaste al apartado de Futbol");
                    System.out.println("AH continuacion se mostraran los productos");
                    System.out.println("#############################################");
                    System.out.println("MENU\n1.Ropa\n2.Zapatos\n3.Accesorios\nElige una opcion: ");
                    break;
                case 3:
                    System.out.println("#############################################");
                    System.out.println("Ingresaste al apartado de MMA");
                    System.out.println("AH continuacion se mostraran los productos");
                    System.out.println("#############################################");
                    System.out.println("MENU\n1.Ropa\n2.Accesorios\nElige una opcion");
                    break;
                case 4:
                    System.out.println("#############################################");
                    System.out.println("Ingresaste al apartado de Boxeo");
                    System.out.println("AH continuacion se mostraran los productos");
                    System.out.println("#############################################");
                    System.out.println("MENU\n1.Ropa\n2.Accesorios\nElige una opcion: ");
                    break;
                case 5:
                    System.out.println("#############################################");
                    System.out.println("Ingresaste al apartado de Voleybol ");
                    System.out.println("AH continuacion se mostraran los productos");
                    System.out.println("#############################################");
                    System.out.println("MENU\n1.Ropa\n2.Accesorios\nElige una opcion:");
                    break;
                case 6:
                    System.out.println("#############################################");
                    System.out.println("Ingresaste al apartado de Rugby");
                    System.out.println("AH continuacion se mostraran los productos");
                    System.out.println("#############################################");
                    System.out.println("MENU\n1.Ropa\n2.Accesorios\nElige una opcion:");
                    break;
                case 7:
                    System.out.println("#############################################");
                    System.out.println("Ingresaste al apartado de Tennis");
                    System.out.println("AH continuacion se mostraran los productos");
                    System.out.println("#############################################");
                    System.out.println("MENU\n1.Ropa\n2.Accesorios\nElige una opcion: ");
                    break;
                case 8:
                    System.out.println("#############################################");
                    System.out.println("Ingresaste al apartado de Beisbol");
                    System.out.println("Ah continuacion se mostraran los productos");
                    System.out.println("#############################################");
                    System.out.println("MENU\n1.Ropa\n2.Accesorios\nElige una opcion:");
                    break;
                case 9:
                    System.out.println("#############################################");
                    System.out.println("Ingresaste al apartdado de Balonmano");
                    System.out.println("AH continuacion se mostraran los productos");
                    System.out.println("#############################################");
                    System.out.println("MENU\n1.Ropa\n2.Accesorios\nElige una opcion:");
                    break;
                case 10:
                    System.out.println("#############################################");
                    System.out.println("Ingresaste al apartado de Karate");
                    System.out.println("AH continuacion se mostraran los productos");
                    System.out.println("#############################################");
                    System.out.println("MENU\n1.Ropa\n2.Accesorios\nElige una opcion: ");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}

