import javax.swing.JOptionPane;

public class usoGeometria {

    public static void main(String[] args){

        Geometria_JosePinos Figura = new Geometria_JosePinos();
        int opcion = 1;

        while( opcion != 0){
            opcion = Menu();
            switch( opcion ) {

                case 1:{
                    Figura.areaTriangulo( Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del tríangulo")) ,
                         Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del tríangulo"))
                    );
                    JOptionPane.showMessageDialog(null, "El área del triángulo es: " + Figura.getArea());
                }
                break;

                case 2:{
                    Figura.perimetroTriangulo( Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado1 del tríangulo")) ,
                            Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado 2 del tríangulo")),
                            Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado 3 del tríangulo"))
                    );

                    JOptionPane.showMessageDialog(null, "El perímetro del triángulo es: " + Figura.getPerimetro());
                }
                break;

                case 3:{
                    Figura.areaCirculo(Double.parseDouble(JOptionPane.showInputDialog("Ingresa el radio del círculo")));
                    Figura.perimetroCirculo(Double.parseDouble(JOptionPane.showInputDialog("Ingresa el radio del círculo")));
                    JOptionPane.showMessageDialog(null, "El área del círculo es: " + Figura.getArea() +
                            "\n El perímetro del círculo es: " + Figura.getPerimetro());
                }
                break;

                case 4:{
                    Figura.areaEsfera(Double.parseDouble(JOptionPane.showInputDialog("Ingresa el radio de la esfera")));
                    Figura.volumenEsfera(Double.parseDouble(JOptionPane.showInputDialog("Ingresa el radio de la esfera")));
                    JOptionPane.showMessageDialog(null, "El área de la esfera es: " + Figura.getArea() +
                            "\n El volumen de la esfera es: " + Figura.getVolumen());
                }
                break;

                case 5:{
                    Figura.areaCuadrado(Double.parseDouble(JOptionPane.showInputDialog("Ingresa el lado del cuadrado")));
                    Figura.perimetroCuadrado(Double.parseDouble(JOptionPane.showInputDialog("Ingresa el lado del cuadrado")));
                    JOptionPane.showMessageDialog(null,"EL área del cuadrado es: " + Figura.getArea() +
                            "\nEl perímetro del cuadrado es: " + Figura.getPerimetro());
                }
                break;

                case 6:{
                    Figura.areaCubo(Double.parseDouble(JOptionPane.showInputDialog("Ingresa el lado del cuadrado")));
                    Figura.volumenCubo(Double.parseDouble(JOptionPane.showInputDialog("Ingresa el lado del cuadrado")));
                    JOptionPane.showMessageDialog(null, "El área del cubo es: " + Figura.getArea() +
                            "\nEl volumen del cubo es: " + Figura.getVolumen());
                }
                break;

                case 7:{
                    Figura.areaRectangulo(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del rectángulo")),
                            Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del rectángulo")) );

                    Figura.perimetroRectangulo(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del rectángulo")),
                            Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del rectángulo")) );

                    JOptionPane.showMessageDialog(null, "El área del rectángulo es: " + Figura.getArea() +
                            "\nEl perímetro del rectángulo es: " + Figura.getPerimetro());
                }
                break;

                case 8:{
                    Figura.superficieParalelepipedo( Double.parseDouble(JOptionPane.showInputDialog("Ingrese el largo del paralelepípedo")),
                            Double.parseDouble(JOptionPane.showInputDialog("Ingrese el ancho del paralelepípedo")),
                            Double.parseDouble(JOptionPane.showInputDialog("Ingrese el alto del paralelepípedo"))
                            );

                    Figura.volumenParalelepipedo( Double.parseDouble(JOptionPane.showInputDialog("Ingrese el largo del paralelepípedo")),
                            Double.parseDouble(JOptionPane.showInputDialog("Ingrese el ancho del paralelepípedo")),
                            Double.parseDouble(JOptionPane.showInputDialog("Ingrese el alto del paralelepípedo"))
                    );

                    JOptionPane.showMessageDialog(null, "El área del paralelepípedo es: " + Figura.getArea() +
                            "\nEl volumen del paralelepípedo es: " + Figura.getVolumen());
                }
                break;

                case 9:{
                    Figura.areaTrapecio( Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base mayor del trapecio")),
                            Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base menor del trapecio")),
                            Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del trapecio"))
                    );

                    JOptionPane.showMessageDialog(null, "El área del trapecio es: " + Figura.getArea());
                }
                break;

                case 10:{
                    Figura.areaCilindro(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del cilindro")),
                            Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del cilindro")) );

                    Figura.volumenCilindro(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del cilindro")),
                            Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del cilindro")) );


                    JOptionPane.showMessageDialog(null, "El área del cilindro es: " + Figura.getArea() +
                            "\nEl volumen del cilindro es: " + Figura.getVolumen());

                }
                break;

                case 0:{
                    JOptionPane.showMessageDialog(null, "Desarrollado por Super compumundo hipermega red");
                }
                break;

                default:{
                    JOptionPane.showMessageDialog(null, "Opción no válida");
                }
                break;


            }//fin del switch

        }//FIN DEL WHILE PRINCIPAL



    }//FIN DEL MÉTODO DE MAIN



    public static int Menu(){
        int opcion = 1;

        try{
            opcion = Integer.parseInt( JOptionPane.showInputDialog("\tCalculadora de figuras geométricas\n" +
                    "1) Área de un triángulo\n" +
                    "2) Perímetro de un triángulo\n" +
                    "3) Área y perímetro de un círculo\n" +
                    "4) Área y volumen de una esfera\n" +
                    "5) Área y perímetro de un cuadrado\n" +
                    "6) Área y volumen de un cubo\n" +
                    "7) Área y Perímetro de un rectángulo\n" +
                    "8) Área y volumen de un paralelepipedo\n" +
                    "9) Área de un trapecio\n" +
                    "10) Área y volumen de un cilindro\n" +
                    "0) SALIR" ) );

        }catch (NumberFormatException e){
            System.out.println("Solo puedes ingresar un número: "+ e);
        };


        return opcion;
    }//fin del método menu

}
