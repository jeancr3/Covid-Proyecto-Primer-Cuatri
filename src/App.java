

/*Haga un programa en Java que lea el nombre de un país, el número de casos activos de COVID-19 en ese país, y el porcentaje de ocupación de las UCI
 (unidades de cuidado intensivo) de ese país, e imprima la alerta declarada para ese país, el número estimado de hospitalizados en ese momento, 
 el número estimado de casos severos en ese momento (pacientes hospitalizados que necesiten de UCI), y el número estimado de fallecidos acumulados.

 El número estimado de casos hospitalizados, de casos severos y de casos acumulados de fallecidos por COVID-19 de cada país, se calculan mediante un porcentaje
 de los casos activos de cada país, que los investigadores han definido para ayudar a las autoridades de los diferentes países a prepararse y tomar decisiones.
    Los porcentajes que vamos a tener en cuenta para estos cálculos son los siguientes:

   Casos estimados de hospitalizados en este momento 1.4% de los casos activos en el país Número estimado de pacientes 
   hospitalizados por COVID-19 en este momento de acuerdo con los casos activos en el país 

  Casos estimados severos en este momento 0.8% de los casos activos en el país Número estimado de pacientes hospitalizados
   en UCI (unidad de cuidados intensivos) por COVID-19 en este momento de acuerdo con los casos
    activos en el país 

  Casos estimados de fallecidos acumulados 7% de los casos activos en el país Número estimado de casos fallecidos
     acumulados por COVID-19 en este momento de acuerdo con los casos activos en el país
     
     La alerta declarada en el país se calcula de acuerdo con el
      porcentaje de ocupación de las unidades de cuidados intensivos, de la siguiente manera:
      
      � Si es mayor a 1% y menor a 25%, no hay alerta declarada 
      � Si es mayor o igual a 25% y menor que 50%, se declara alerta amarilla 
      � si es mayor o igual a 50% y menor que 75%, se declara alerta naranja 
      � Si es mayor o igual a 75% y menor que 90%, se declara alerta roja 
      � Si es mayor o igual a 90% y menor o igual a 100%, se declara estado de calamidad 
      � En cualquier otro caso sería un error en la entrada de datos.

   Guatemala: 171.170
   Honduras:165.095
   Salvador: 58.546
   Nicaragua: 6.398
   Costa RIca:  201.678
   Panama: 336.521
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.regex.*; 

public class App {

    public static final String RESET = "\u001B[0m";
    public static final String ORANGE = "\u001b[38;5;172m";
    public static final String PINK = "\u001b[38;5;205m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String PURPLE = "\u001b[38;5;135m";
    public static final String CYAN = "\u001b[38;5;45m";

    public static final String FORMATO_PAIS = "^[a-zA-Z ]+$";
    public static final String FORMATO_NUMERO = "^[0-9]+$";

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        String pais;
        double casosActivos;
        double ocupacionDeLasUci;
        double numEstimaHospitali;
        double personasFallecidas;
 
        System.out.println("\n"+GREEN+"------------------------------------------------" +RESET);
        System.out.println(""+GREEN+"Bienvenido al sistema de Calculo del COV SARS 2" +RESET);
        System.out.println(""+GREEN+"------------------------------------------------" +RESET);


        System.out.println("\n"+RED+"Entradas\n" +RESET);


        System.out.print(""+YELLOW+"Nombre del pais: "+RESET);
        pais =  in.readLine().toLowerCase();

        if (!pais.matches(FORMATO_PAIS)) {
          System.out.println("El dato ingresado no es un nombre de pais.");
          return;
        }


        
        System.out.print("\n"+YELLOW+"Casos Activos: "+RESET);
        casosActivos = Double.parseDouble(in.readLine());


        numEstimaHospitali = (casosActivos*0.014);
        System.out.println("\n"+YELLOW+"Numero estimado de personas hospitalizadas es de: " +RESET +numEstimaHospitali );

        personasFallecidas =(casosActivos*0.07);
        System.out.println("\n"+YELLOW+"El estimado de personas fallecidas acumuladas es de:" +RESET +personasFallecidas);

        
        
        ocupacionDeLasUci = casosActivos*0.08/100;
        System.out.println("\n"+YELLOW+"El porcentaje de las UCI ocupadas es de: "+RESET +ocupacionDeLasUci);

        if(ocupacionDeLasUci > 0.001 && ocupacionDeLasUci < 0.25) {
           System.out.println("\n"+ORANGE+"No hay alerta declarada\n"+RESET);

                  
          }else if (ocupacionDeLasUci >= 0.25 && ocupacionDeLasUci < 0.50) {
           System.out.println("\n"+ORANGE+"se declara alerta amarilla\n"+RESET);
         
          }else if (ocupacionDeLasUci >= 0.50 && ocupacionDeLasUci < 0.75){
            System.out.println("\n"+ORANGE+"se declara alerta naranja\n"+RESET);   

          }else if (ocupacionDeLasUci >=0.75 && ocupacionDeLasUci < 0.90){
            System.out.println("\n"+ORANGE+"se declara alerta roja\n"+RESET);
        
          }else if (ocupacionDeLasUci >=0.90 && ocupacionDeLasUci <= 1.0){
            System.out.println("\n"+ORANGE+"se declara estado de calamidad\n"+RESET);  
         
          }else {
              System.out.println("\n"+RED+"Datos erroneos"+RESET);
          }
         
        
        System.out.println(""+GREEN+"-----------------------------------------------------------------------------------");
        System.out.println("Gracias por usar nuestro sistema");
        System.out.print("Recuerde no salir de casa,");
        System.out.println("Mantenga su burbuja, es por usted es por su familia.");
        System.out.println("-----------------------------------------------------------------------------------"+RESET);
       
        

        
        
        






   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    }
}
