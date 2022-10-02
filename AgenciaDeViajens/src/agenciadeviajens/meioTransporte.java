package agenciadeviajens;

public class meioTransporte {

    double rodoviario;
    double carroParticular;
    double aereo;
    double maritimo;

    /* Classes Construtoras */
    public meioTransporte() {
    }

    public meioTransporte(double rodoviario, double carroParticular, double aereo, double maritimo) {
        this.rodoviario = rodoviario;
        this.carroParticular = carroParticular;
        this.aereo = aereo;
        this.maritimo = maritimo;
    }

}
