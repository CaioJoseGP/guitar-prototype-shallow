import java.util.HashMap;
import java.util.Map;

public class ViolaoRegistry {
    private Map<String, Violao> prototipos = new HashMap<>();

    public ViolaoRegistry() {
        prototipos.put("Classico", new Violao("Clássico", "Nylon", "Acústico", "Suave"));
        prototipos.put("Folk", new Violao("Folk", "Aço", "Acinturado/Grande", "Encorpado"));
        prototipos.put("Flet", new Violao("Flet", "Nylon", "Fino/Elétrico", "Suave"));
        prototipos.put("Jumbo", new Violao("Jumbo", "Aço", "Largo/Arredondado", "Grave"));
        prototipos.put("7Cordas", new Violao("7 Cordas", "Nylon (7)", "Clássico", "Grave"));
        prototipos.put("12Cordas", new Violao("12 Cordas", "Aço (12)", "Clássico", "Ressonância Plena"));
        prototipos.put("Zero", new Violao("Zero", "Nylon/Aço", "Parlor (Pequeno)", "Confortável"));
        prototipos.put("DuploZero", new Violao("Duplo Zero", "Nylon/Aço", "Parlor (Médio)", "Fingerstyle"));
        prototipos.put("TriploZero", new Violao("Triplo Zero", "Nylon/Aço", "Parlor (Intermediário)", "Peculiar"));
    }

    public Violao getViolao(String chave) {
        Violao prototipo = prototipos.get(chave.trim());
        return (prototipo != null) ? prototipo.clone() : null;
    }
}