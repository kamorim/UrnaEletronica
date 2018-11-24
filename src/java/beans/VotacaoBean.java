/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

@Named(value = "votacaoBean")
@ApplicationScoped
public class VotacaoBean implements Serializable {

    private String valorSelecionado;
    private Integer contAndreza = 0;
    private Integer contBruno = 0;
    private Integer contCarla = 0;
    private Integer contFernanda = 0;
    private Integer contJaime = 0;
    private String nomeVencedor = "";
    private int totalVotos = 0;

    private List<String> listaCandidatos = new ArrayList<String>();

    public VotacaoBean() {
        listaCandidatos.add("Andreza Lopes");
        listaCandidatos.add("Bruno Oliveira");
        listaCandidatos.add("Carla Zanatta");
        listaCandidatos.add("Fernanda Rocha");
        listaCandidatos.add("Jaime Miranda");
    }

    public String selecionar() {
        if (valorSelecionado != null && valorSelecionado.equalsIgnoreCase("Andreza Lopes")) {
            contAndreza++;
        } else if (valorSelecionado != null && valorSelecionado.equalsIgnoreCase("Bruno Oliveira")) {
            contBruno++;
        } else if (valorSelecionado != null && valorSelecionado.equalsIgnoreCase("Carla Zanatta")) {
            contCarla++;
        } else if (valorSelecionado != null && valorSelecionado.contains("Fernanda Rocha")) {
            contFernanda++;
        } else if (valorSelecionado != null && valorSelecionado.equalsIgnoreCase("Jaime Miranda")) {
            contJaime++;
        }

        if (contAndreza > contBruno && contAndreza > contCarla && contAndreza > contFernanda && contAndreza > contJaime) {
            nomeVencedor = "Andreza";
        } else if (contBruno > contAndreza && contBruno > contCarla && contBruno > contFernanda && contBruno > contJaime) {
            nomeVencedor = "Bruno";
        } else if (contCarla > contAndreza && contCarla > contBruno && contCarla > contFernanda && contCarla > contJaime) {
            nomeVencedor = "Carla";
        } else if (contFernanda > contAndreza && contFernanda > contBruno && contFernanda > contCarla && contFernanda > contJaime) {
            nomeVencedor = "Fernanda";
        } else if (contJaime > contAndreza && contJaime > contBruno && contJaime > contCarla && contJaime > contFernanda) {
            nomeVencedor = "Jaime";
        } else if (contAndreza == contBruno || contAndreza == contCarla || contAndreza == contFernanda || contAndreza == contJaime
                || contBruno == contAndreza || contBruno == contCarla || contBruno == contFernanda || contBruno == contJaime
                || contCarla == contAndreza || contCarla == contBruno || contCarla == contFernanda || contCarla > contJaime
                || contFernanda == contAndreza || contFernanda == contBruno || contFernanda == contCarla || contFernanda == contJaime
                || contJaime == contAndreza || contJaime == contBruno || contJaime == contCarla || contJaime == contFernanda) {
            nomeVencedor = "Empate";
        }
        
        totalVotos = contAndreza + contBruno + contCarla + contFernanda + contJaime;
        return "apuracaoResultados";
        
    }

    public List<String> getListaCandidatos() {
        return listaCandidatos;
    }

    public void setListaCandidatos(List<String> listaCandidatos) {
        this.listaCandidatos = listaCandidatos;
    }

    public String getNomeVencedor() {
        return nomeVencedor;
    }

    public void setNomeVencedor(String nomeVencedor) {
        this.nomeVencedor = nomeVencedor;
    }

    public int getTotalVotos() {
        return totalVotos;
    }

    public void setTotalVotos(int totalVotos) {
        this.totalVotos = totalVotos;
    }

    public String getValorSelecionado() {
        return valorSelecionado;
    }

    public void setValorSelecionado(String valorSelecionado) {
        this.valorSelecionado = valorSelecionado;
    }

    public Integer getContAndreza() {
        return contAndreza;
    }

    public void setContAndreza(Integer contAndreza) {
        this.contAndreza = contAndreza;
    }

    public Integer getContBruno() {
        return contBruno;
    }

    public void setContBruno(Integer contBruno) {
        this.contBruno = contBruno;
    }

    public Integer getContCarla() {
        return contCarla;
    }

    public void setContCarla(Integer contCarla) {
        this.contCarla = contCarla;
    }

    public Integer getContFernanda() {
        return contFernanda;
    }

    public void setContFernanda(Integer contFernanda) {
        this.contFernanda = contFernanda;
    }

    public Integer getContJaime() {
        return contJaime;
    }

    public void setContJaime(Integer contJaime) {
        this.contJaime = contJaime;
    }

}