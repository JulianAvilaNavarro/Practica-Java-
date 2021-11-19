package Punto17;

public class Lavadora extends Electrodomestico {
    static final int CargaDefault = 5;
    private int carga;

    public Lavadora()
    {
        super();
        this.carga = CargaDefault;
    }

    public Lavadora(double precioBase, int peso)
    {
        super(precioBase, peso);
        this.carga = CargaDefault;
    }

    public Lavadora(double precioBase, String color, char consumoEnergetico, int peso, int carga)
    {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga()
    {
        return carga;
    }

    @Override
    public double precioFinal() {
        if (getCarga() > 30)
        {
            return super.precioFinal() + 50;
        }
        return super.precioFinal();
    }
}