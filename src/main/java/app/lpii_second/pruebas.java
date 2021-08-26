/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.lpii_second;

/**
 *
 * @author prantony
 */
public class pruebas {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        DataBeen prueba = new DataBeen();
        try{
            prueba.setTr1("12");
            prueba.setTr2("12");
            prueba.setTr3("12");
            prueba.setTr4("12");
            prueba.setTr5("12");
            
            prueba.setPrt1("15");
            prueba.setPrt2("15");
            prueba.setPrt3("15");
            prueba.setPrt4("15");
            prueba.setPrt5("15");
            
            prueba.setExm1("17");
            prueba.setExm2("17");
            prueba.setExm3("17");
            prueba.setExm4("17");
            prueba.setExm5("17");
            
            prueba.setInv1("19");
            prueba.setInv2("19");
            
            prueba.setEfnl("20");
            
            prueba.getExm_promedio();
            prueba.getInv_promedio();
            prueba.getPrt_promedio();
            prueba.getTr_promedio();
            prueba.getPromedio_final();
            
            System.out.println("Exito");
        }catch (Exception e){
            System.out.println(e);
        }
    }
    
}
