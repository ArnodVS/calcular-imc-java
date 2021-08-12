package persona;
/*
 * @Author Arnold Valenzuela Sanchez
 *
 * La clase Persona contiene los atributos privados:
 * persona, edad, genero, peso y altura
 * con sus respectivos metodos handler "getter".
 *
 * Adicionalmente se tienen los metodos:
 *  - comprobarGenero()
 *  - calcularIMC()
 *  - esMayorDeEdad()
 *  - toString()
 *  - generaNSS()
 * */

public class Persona {

    // Atributos de la clase
    private String       nombre;
    private int          edad;
    private double       peso;
    private double       altura;
    private char         genero;
    private final String nSS;

    // Constructor con todos los atributos como parametros
    public Persona(String nombre, int edad, double peso, double altura, char genero, String nSS) {
        this.nombre = nombre;
        this.edad   = edad;
        this.peso   = peso;
        this.altura = altura;
        this.genero = genero;
        this.nSS    = generaNSS();
    }
    /*
    * El metodo comprobarGenero() retorna true si la persona
    * es Hombre y flase si es mujer. Adicionalmnete imprime
    * por pantalla el genero de la persona
    * */
    public boolean comprobarGenero(){
        if (genero == 'H'){
            System.out.println("La persona es Hombre");
            return true;
        }
        System.out.println("La persona es Mujer");
        return false;
    }
    /*
    * El metodo calcularIMC() calcula el IMC de una persona
    * dependiendo del genero proporcionado.
    * Imprime por pantalla el valor calculado resultadoIMC
    * y el rango IMC -1, 0 o 1.
    * */
    public void calcularIMC() {
        final int FALTA_DE_PESO = -1;
        final int PESO_IDEAL    = 0;
        final int SOBREPESO     = 1;
        double resultadoIMC;

        resultadoIMC = peso / (altura * altura);
        System.out.println("\nIMC: " + resultadoIMC);

        if (genero == 'H') {
            if (resultadoIMC < 20.0) {
                System.out.println("Rango IMC hombre: " + FALTA_DE_PESO);
            } else if (resultadoIMC >= 20.0 && resultadoIMC <= 25.0) {
                System.out.println("Rango IMC hombre: " + PESO_IDEAL);
            } else {
                System.out.println("Rango IMC hombre: " + SOBREPESO);
            }
        } else if (genero == 'M'){
            if (resultadoIMC < 19.0) {
                System.out.println("Rango IMC mujer: " + FALTA_DE_PESO);
            } else if (resultadoIMC >= 19.0 && resultadoIMC <= 24.0) {
                System.out.println("Rango IMC mujer: " + PESO_IDEAL);
            } else {
                System.out.println("Rango IMC mujer: " + SOBREPESO);
            }
        }
    }
    /*
    * El metodo esMayorDeEdad() retorna true si la persona
    * es mayor de edad y false si es menor. Adicionalmente
    * imprime por pantalla el mensaje si es mayor o menor
    * de edad
    * */
    public boolean esMayorDeEdad() {
        if (edad >= 18) {
            System.out.println("La persona es mayor de edad");
            return true;
        }
        System.out.println("La persona es menor de edad");
        return false;
    }
    /*
    * El metodo toString() returna infoPersona que imprime
    * por pantalla los datos escritos por el usuario
    * */
    public String toString() {
        String infoPersona = (
                "\nNombre: "    + nombre +
                "\nEdad: "      + edad +    " años"+
                "\nNumero SS: " + nSS +
                "\nGenero: "    + genero +
                "\nPeso: "      + peso +    " kg"+
                "\nAltura: "    + altura +  " m");
        return infoPersona;
    }
    /*
     * El metodo generaNSS() genera una expresión
     * de 8 caracteres (7 números y 1 letra) al azar.
     * */
    private String generaNSS() {
        double  numero;
        int     numeroRandom = 0;
        char    letraSelecionada;
        String  caractereAleatorio;
        String  numeroSSRandom;

        for (int i = 0; i < 7; i++) {
            numero = Math.floor(Math.random() * (0 - 9) + 9);
            numeroRandom = numeroRandom * 9 + (int) numero;
        }
        caractereAleatorio = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int modulo = numeroRandom % 23;
        letraSelecionada = caractereAleatorio.charAt(modulo);
        numeroSSRandom = ("" + numeroRandom + letraSelecionada + "");
        return numeroSSRandom;
    }
   /*
   * Metodos handler setter de cada atributo de la
   * clase nombre, edad, peso, altura, genero, NSS
   * */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
}