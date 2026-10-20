public class Atributo {
        private int id;
        private String nombre;
        private String version;
        private boolean ejecutando;

        private static int totalAplicaciones = 0;

        public Atributo(String nombre, String version) {
            totalAplicaciones++;

            this.id = totalAplicaciones;
            this.nombre = nombre;
            this.version = version;
            this.ejecutando = false;
        }

    }
