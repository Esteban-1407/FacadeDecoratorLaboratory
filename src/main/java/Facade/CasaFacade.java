package Facade;

public class CasaFacade {
    private SistemaIluminacion iluminacion;
    private SistemaClimatizacion climatizacion;
    private SIstemaSeguridad seguridad;
    private SistemaEntretenimiento entretenimiento;

    public CasaFacade() {
        this.iluminacion = new SistemaIluminacion();
        this.climatizacion = new SistemaClimatizacion();
        this.seguridad = new SIstemaSeguridad();
        this.entretenimiento = new SistemaEntretenimiento();
    }

    public void modoNoche() {
        iluminacion.apagarLuces();
        climatizacion.encenderAireAcondicionado();
        seguridad.activarSistema();
        entretenimiento.apagarTelevisor();
        System.out.println("Modo noche activado.");
    }

    public void modoDia() {
        iluminacion.encenderLuces();
        climatizacion.apagarAireAcondicionado();
        seguridad.desactivarSistema();
        entretenimiento.encenderTelevisor();
        System.out.println("Modo día activado.");
    }

}
