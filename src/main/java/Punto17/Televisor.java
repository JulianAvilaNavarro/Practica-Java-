package Punto17;

public class Televisor extends Electrodomestico{
    static final int resolucionDefault=20;
    static final boolean sintonizadorTDTDefault=false;
    private int resPulgadas;
    private boolean sintonizadorTDT;

    public Televisor() {
        super();
        this.resPulgadas = resolucionDefault;
        this.sintonizadorTDT = sintonizadorTDTDefault;
    }

    public Televisor(double precioBase, int peso) {
        super(precioBase, peso);
        this.resPulgadas =resolucionDefault;
        this.sintonizadorTDT = sintonizadorTDTDefault;
    }
    // Heredar metodos y atrubitos clase electrodomestico

    public Televisor(double precioBase, String color, char consumoEnergetico, int peso, int resolucion, boolean sintonizadorTDT)
    {
        super(precioBase, color, consumoEnergetico, peso);
        this.resPulgadas = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucionEnPulgadas()
    {
        return resPulgadas;
    }

    public boolean isSintonizadorTDT()
    {
        return sintonizadorTDT;
    }

    @Override
    public double precioFinal()
    {
        double precioFinalAcumulado = super.precioFinal();
        if (getResolucionEnPulgadas() > 40)
        {
            precioFinalAcumulado += precioFinalAcumulado * 0.30;
        }
        if (isSintonizadorTDT())
        {
            precioFinalAcumulado += 250000;
        }
        return precioFinalAcumulado;
    }
}
