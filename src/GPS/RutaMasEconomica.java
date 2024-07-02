package GPS;

public class RutaMasEconomica implements RutaStrategy{
    @Override
    public String calcularRuta(String puntoA, String puntoB) {
        return "Ruta más economica entre " + puntoA + " y " + puntoB;
    }
}
