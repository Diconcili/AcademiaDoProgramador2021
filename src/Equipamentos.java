public class Equipamentos {
    
    String nomeEquipamento;
    String preçoDeAquisição;
    String nomeFabricante;
    String númeroDeSérie;
    String dataFabricação;

    public Equipamentos(String nomeEquipamento, String preçoDeAquisição, String nomeFabricante, String númeroDeSérie, String dataFabricação) {
        this.nomeEquipamento = nomeEquipamento;
        this.preçoDeAquisição = preçoDeAquisição;
        this.nomeFabricante = nomeFabricante;
        this.númeroDeSérie = númeroDeSérie;
        this.dataFabricação = dataFabricação;
    }

    public String getNomeEquipamento() {
        return nomeEquipamento;
    }

    public void setNomeEquipamento(String nomeEquipamento) {        
                        
        this.nomeEquipamento = nomeEquipamento;
    }

    public String getPreçoDeAquisição() {
        return preçoDeAquisição;
    }

    public void setPreçoDeAquisição(String preçoDeAquisição) {
        this.preçoDeAquisição = preçoDeAquisição;
    }

    public String getNomeFabricante() {
        return nomeFabricante;
    }

    public void setNomeFabricante(String nomeFabricante) {
        this.nomeFabricante = nomeFabricante;
    }

    public String getNúmeroDeSérie() {
        return númeroDeSérie;
    }

    public void setNúmeroDeSérie(String númeroDeSérie) {
        this.númeroDeSérie = númeroDeSérie;
    }

    public String getDataFabricação() {
        return dataFabricação;
    }

    public void setDataFabricação(String dataFabricação) {
        this.dataFabricação = dataFabricação;
    }

    @Override
    public String toString() {
        return "Equipamentos{" + "nome do equipamento= " + nomeEquipamento + ", nome do fabricante= " + nomeFabricante + ", n\u00famero de s\u00e9rie= " + númeroDeSérie + '}';
    }

   
    
    
    
    
}
