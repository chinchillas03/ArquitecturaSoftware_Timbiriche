
import dominio.DimensionTablero;
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author waw
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<DimensionTablero> dimensiones = new ArrayList<>();
        dimensiones.add(DimensionTablero.DIEZxDIEZ);
        dimensiones.add(DimensionTablero.QUINCExQUINCE);
        dimensiones.add(DimensionTablero.VEINTExVEINTE);

        for (DimensionTablero dimension: dimensiones)
        {
            System.out.println(dimension);
        }
    }

}
