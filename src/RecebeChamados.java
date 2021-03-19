import java.util.ArrayList;

public class RecebeChamados {
    
    private ArrayList<Chamados> listaDeChamados;

    public ArrayList<Chamados> getListaDeChamados() {
        return listaDeChamados;
    }

    public void associaListaDeChamados(ArrayList<Chamados> listaDeChamados) {
        this.listaDeChamados = listaDeChamados;
    }

    @Override
    public String toString() {
        return "lista de chamados=" + listaDeChamados + '}';
    }
    
    
}
