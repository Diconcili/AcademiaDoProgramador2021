import java.util.ArrayList;

public class RecebeEquipamento {
    
    private ArrayList<Equipamentos> listaDeEquipamentos;

    public ArrayList<Equipamentos> getListaDeEquipamentos() {
        return listaDeEquipamentos;
    }

    public void associaListaDeEquipamentos(ArrayList<Equipamentos> listaDeEquipamentos) {
        this.listaDeEquipamentos = listaDeEquipamentos;   }
         
    @Override
    public String toString() {
        return "lista de equipamentos=" + listaDeEquipamentos + '}';
    }
    
    
    
}
