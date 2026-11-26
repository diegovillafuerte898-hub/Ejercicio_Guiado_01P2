void main() {
    Modulo[] modulos = new Modulo[5];
    modulos[0] = new Modulo("Autenticación", "Java", 100, true);
    modulos[1] = new Modulo("Inventario", "Java", 75, false);
    modulos[2] = new Modulo("Facturación", "Java", 100, true);
    modulos[3] = new Modulo("Reportes", "Python", 40, false);

    AnalizadorProyecto analizador = new AnalizadorProyecto(modulos);

    System.out.println("--- LISTADO DE MÓDULOS ---");
    System.out.println(analizador.listarModulos());
    System.out.println("Módulos terminados: " + analizador.contarTerminados());
    System.out.println("Progreso promedio: " + analizador.calcularProgresoPromedio() + "%");

    Modulo encontrado = analizador.buscarModulo("Inventario");
    if (encontrado != null) {
        System.out.println("Encontrado: " + encontrado.mostrarInformacion());
    }
}
