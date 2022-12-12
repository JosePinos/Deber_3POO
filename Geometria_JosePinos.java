public class Geometria_JosePinos {

    //ATRIBUTOS
    private double area;
    private double perimetro;
    private double volumen;

    //CONSTRUCTOR
    public Geometria_JosePinos(){
        area = 0.0;
        perimetro = 0.0;
        volumen = 0.0;
    }


    //MÉTODOS


    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }


    //triangulo
    public void areaTriangulo(double base, double altura){
        if(base > 0.0 && altura > 0.0){
            area = base * altura / 2.0;
            //setArea(base * altura / 2.0);
        }else{
            area = 0;
        }

    }

    public void perimetroTriangulo(double l1, double l2, double l3){
        if(l1 > 0.0 && l2 > 0.0 && l3 > 0.0){
            perimetro = l1 + l2 + l3;
        }else{
            perimetro = 0;
        }

    }



    //circulo y esfera
    public void areaCirculo(double radio){
        if(radio > 0.0){
            area = Math.PI * radio * radio;
        }else{
            area = 0;
        }

    }

    public void perimetroCirculo(double radio){

        if(radio > 0.0){
            perimetro = 2.0 * Math.PI * radio;
        }else{
            perimetro = 0;
        }

    }

    public void areaEsfera(double radio){

        if(radio > 0.0){
            area = 4.0 * Math.PI * radio * radio;
        }else{
            area = 0;
        }
    }

    public void volumenEsfera(double radio){

        if(radio > 0.0){
            volumen =  4/3.0 * Math.PI * radio * radio * radio;
        }else{
            volumen = 0;
        }
    }



    //cuadrado y cubo
    public void areaCuadrado(double lado){

        area = lado > 0.0 ? lado * lado : 0.0;

    }

    public void perimetroCuadrado(double lado){
        //perimetro = 4.0 * lado;
        perimetro = lado > 0.0 ? 4.0 * lado : 0.0;
    }


    public void areaCubo(double lado){

        area = lado > 0.0 ? 6.0 * lado * lado : 0.0;
    }

    public void volumenCubo(double lado){
        volumen = lado > 0.0 ? lado * lado * lado : 0.0;
    }



    //RECTÁNGULO / PARALELEPÍPEDO / PARALELOGRAMO
    public void areaRectangulo(double base, double altura){

        if( base > 0.0 && altura > 0.0 ){
            area = base*altura;
        }else{
            area = 0.0;
        }
    }

    public void perimetroRectangulo(double base, double altura){

        if( base > 0.0 && altura > 0.0 ){
            perimetro = 2.0 * base  +  2.0 * altura;
        }else{
            perimetro = 0.0;
        }
    }

    public void superficieParalelepipedo(double largo, double ancho, double alto){

        if(largo > 0.0 && ancho > 0.0 && alto > 0.0){
            double sup_lateral = 2.0 * largo * alto  +  2.0 * ancho * alto;
            double sup_base = largo * ancho;
            area = sup_lateral + (2.0 * sup_base);
        }else{
            area = 0.0;
        }
    }

    public void volumenParalelepipedo(double largo, double ancho, double alto){

        if( largo > 0.0 && ancho > 0.0 && alto > 0.0 ){
            volumen = largo * ancho * alto;
        }else{
            volumen = 0.0;
        }
    }



    //TRAPECIO
    public void areaTrapecio(double baseMayor, double baseMenor, double altura){

        if( baseMayor > 0.0 && baseMenor > 0.0 && altura > 0.0){
            area = (baseMayor + baseMenor) * altura /2.0;
        }else{
            area = 0.0;
        }
    }



    //CILINDRO RECTO
    public void areaCilindro(double radio, double altura){

        if( radio > 0.0 && altura > 0.0 ){
            area = (2.0 * Math.PI * radio * altura) + (2.0 * Math.PI * radio* radio);
        }else{
            area = 0.0;
        }
    }

    public void volumenCilindro(double radio, double altura){

        if(radio > 0.0 && altura > 0.0){
            volumen = (Math.PI * Math.pow(radio,2)) * altura;
        }else{
            volumen = 0.0;
        }
    }

}///FIN DE LA CLASE GEOMETRIA_JOSEPINOS
