package ecommerce_covid;

public class Mascara {

    private String tipoTecido;
    private boolean tamanhoAdulto;

    public String exibirInstrucoes(){
        if(tipoTecido.equals("algodão")){
            return "Pode usar por 2 horas e lavar. Seque bem!!";
        } else {
            return "Máscara deve ser descartada após o uso.";
        }
    }

    public String getTipoTecido() {
        return tipoTecido;
    }

    public void setTipoTecido(String tipoTecido) {
        this.tipoTecido = tipoTecido;
    }

    public boolean isTamanhoAdulto() {
        return tamanhoAdulto;
    }

    public void setTamanhoAdulto(boolean tamanhoAdulto) {
        this.tamanhoAdulto = tamanhoAdulto;
    }
}
