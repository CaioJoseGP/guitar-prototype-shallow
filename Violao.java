public class Violao implements Cloneable {
    private String modelo;
    private String tipoCorda;
    private String corpo;
    private String timbre;

    public Violao(String modelo, String tipoCorda, String corpo, String timbre) {
        this.modelo = modelo;
        this.tipoCorda = tipoCorda;
        this.corpo = corpo;
        this.timbre = timbre;
    }

    public void exibirInfo() {
        System.out.println("Modelo: " + modelo + " | Cordas: " + tipoCorda + 
                           " | Corpo: " + corpo + " | Timbre: " + timbre);
    }

    @Override
    public Violao clone() {
        try {
            return (Violao) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Erro ao clonar o objeto", e);
        }
    }
}