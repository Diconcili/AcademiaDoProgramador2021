public class Chamados {
    
    String titulo;
    String descrição;
    String nomeEquipamento;
    String dataAbertura;  

    public Chamados(String titulo, String descrição, String nomeEquipamento, String dataAbertura) {
        this.titulo = titulo;
        this.descrição = descrição;
        this.nomeEquipamento = nomeEquipamento;        
        this.dataAbertura = dataAbertura;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public String getNomeEquipamento() {
        return nomeEquipamento;
    }

    public void setNomeEquipamento(String nomeEquipamento) {
        this.nomeEquipamento = nomeEquipamento;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
    
    @Override
    public String toString() {
        return "Chamados{" + "titulo= " + titulo + ", nome do equipamento = " + nomeEquipamento + ", data de abertura do chamado = " + dataAbertura + ", tempo de registro do chamado =" + '}';
    }

   
    
    
    
}
