public class AnalizadorProyecto {
    private Modulo[] modulos;

    public AnalizadorProyecto(Modulo[] modulos) {
        this.modulos = modulos;
    }

    public String listarModulos() {
        String resultado = "";
        for (int i = 0; i < modulos.length; i++) {
            if (modulos[i] != null) {
                resultado += modulos[i].mostrarInformacion() + "\n";
            }
        }
        return resultado;
    }

    public int contarTerminados() {
        int contador = 0;
        for (Modulo m : modulos) {
            if (m != null && m.isTerminado()) {
                contador++;
            }
        }
        return contador;
    }

    public double calcularProgresoPromedio() {
        double suma = 0;
        int count = 0;
        for (Modulo m : modulos) {
            if (m != null) {
                suma += m.getProgreso();
                count++;
            }
        }
        return count > 0 ? suma / count : 0.0;
    }

    public Modulo buscarModulo(String nombre) {
        for (Modulo m : modulos) {
            if (m != null && m.getNombre().equals(nombre)) {
                return m;
            }
        }
        return null;
    }
}
