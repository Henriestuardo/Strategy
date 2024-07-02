package GPS;

public class RutaMasRapida implements RutaStrategy{

    @Override
    public String calcularRuta(String puntoA, String puntoB) {
        return "Ruta más rapida entre " + puntoA + " y " + puntoB;
    }
}
