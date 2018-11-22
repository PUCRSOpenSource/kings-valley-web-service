/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.marina.kingsvalley;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import codigo.*;
import java.util.*;
/**
 *
 * @author Marina
 */
@WebService(serviceName = "KingsValleyWS")
public class KingsValleyWS {
    
    private List<Partida> partidas;
    private List<Jogador> jogadores;
    private int contadorIds;
    
    private List<Partida> preRegistro;
    
    public KingsValleyWS(){
        jogadores = new LinkedList<>();
        partidas = new LinkedList<>();
        for (int i = 0; i < 500; i++) {
            partidas.add(new Partida());
        }
        contadorIds = 45;
        
        preRegistro = new LinkedList<>();
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "preRegistro")
    public synchronized int preRegistro(@WebParam(name = "jogador1") String jogador1, @WebParam(name = "id1") int id1, @WebParam(name = "jogador2") String jogador2, @WebParam(name = "id2") int id2) {
        Jogador j1 = new Jogador(id1, jogador1);
        Jogador j2 = new Jogador(id2, jogador2);
        Partida p = new Partida();
        p.setJ1(j1);
        p.setJ2(j2);
        preRegistro.add(p);
        return 0;
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "registraJogador")
    public synchronized int registraJogador(@WebParam(name = "nome") String nome) {
        for (Jogador j : jogadores) {
            if (j.getNome().equals(nome))
                return -1;
        }
        
        Partida par = estaNoPreRegistro(nome);
        if(par != null){
            Jogador oponente;
            Jogador eu;
            if(par.getJ1() != null && par.getJ1().getNome().equals(nome)){
               oponente = par.getJ2();
               eu = par.getJ1();
            }else{
               oponente = par.getJ1(); 
               eu = par.getJ2();
            }
            for (Partida p : partidas) {
               if ((p.getJ1() != null && p.getJ1().getNome().equals(oponente.getNome())) || (p.getJ2() != null && p.getJ2().getNome().equals(oponente.getNome()))) {
                   if (p.getJ1() == null) {
                       eu.setCor(Cor.CLARO);
                       p.setJ1(eu);
                   } else {
                       eu.setCor(Cor.ESCURO);
                        p.setJ2(eu);
                   }
                   p.setUltimaJogada(System.currentTimeMillis());
                   contadorIds++;
                   jogadores.add(eu);
                   return eu.getId();
               }
            }
            for (Partida p : partidas) {
               if (p.getJ1() == null) {
                   eu.setCor(Cor.CLARO);
                   p.setJ1(eu);
                   p.setUltimaJogada(System.currentTimeMillis());
                   contadorIds++;
                   jogadores.add(eu);
                   return eu.getId();
               }
           }
        }else{
           
           Jogador jogador = new Jogador(contadorIds, nome);

           for (Partida p : partidas) {
               if (p.getJ1() == null) {
                   jogador.setCor(Cor.CLARO);
                   p.setJ1(jogador);
                   p.setUltimaJogada(System.currentTimeMillis());
                   contadorIds++;
                   jogadores.add(jogador);
                   return jogador.getId();
               }
               if (p.getJ2() == null) {
                   jogador.setCor(Cor.ESCURO);
                   p.setJ2(jogador);
                   p.setUltimaJogada(System.currentTimeMillis());
                   contadorIds++;
                   jogadores.add(jogador);
                   return jogador.getId();
               }
           }
        }
        return -2;
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "encerraPartida")
    public synchronized int encerraPartida(@WebParam(name = "id") int id) {
        Iterator<Partida> partidaIterador = partidas.iterator();
        while (partidaIterador.hasNext()) {
            Partida p = partidaIterador.next();
            if (p.getJ1() != null && p.getJ1().getId() == id) {
                if (p.decrementaContagemRegressivaParaAcabarComAPartida() == 0) {
                    if (p.getJ2() != null)
                        removeJogador(p.getJ2().getId());
                    removeJogador(id);
                    partidaIterador.remove();
                    partidas.add(new Partida());
                }
                return 0;
            }
            if (p.getJ2() != null && p.getJ2().getId() == id) {
                if (p.decrementaContagemRegressivaParaAcabarComAPartida() == 0) {
                    if (p.getJ1() != null)
                        removeJogador(p.getJ1().getId());
                    removeJogador(id);
                    partidaIterador.remove();
                    partidas.add(new Partida());
                }
                return 0;
            }
        }
        return -1;
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "temPartida")
    public int temPartida(@WebParam(name = "id") int id) {
        for (Partida p : partidas) {
            if (p.getJ1() != null && p.getJ1().getId() == id) {
                if (p.getJ2() != null)
                    return 1;
                if (p.passouUmMinuto()) {
                    return -2;
                }
                return 0;
            }
            if (p.getJ2() != null && p.getJ2().getId() == id) {
                if (p.getJ1() != null)
                    return 2;
                if (p.passouUmMinuto()) {
                    return -2;
                }
                return 0;
            }
        }
        return -1;
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "obtemOponente")
    public String obtemOponente(@WebParam(name = "id") int id) {
        for (Partida p : partidas) {
            if (p.getJ1() != null && p.getJ1().getId() == id) {
                if (p.getJ2() != null) {
                    return p.getJ2().getNome();
                }
                return "";
            }
            if (p.getJ2() != null && p.getJ2().getId() == id) {
                if (p.getJ1() != null) {
                    return p.getJ1().getNome();
                }
                return "";
            }
        }

        return "";
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "ehMinhaVez")
    public synchronized int ehMinhaVez(@WebParam(name = "id") int id) {
        for (Partida p : partidas) {
            if ((p.getJ1() != null && p.getJ1().getId() == id) || (p.getJ2() != null && p.getJ2().getId() == id)) {
                return p.getStatus(id);
            }
        }
        return -1;
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "obtemTabuleiro")
    public String obtemTabuleiro(@WebParam(name = "id") int id) {
        for (Partida p : partidas) {
            if ((p.getJ1() != null && p.getJ1().getId() == id) || (p.getJ2() != null && p.getJ2().getId() == id)) {
                return p.obtemTabuleiro();
            }
        }
        return "";
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "movePeca")
    public synchronized int movePeca(@WebParam(name = "id") int id, @WebParam(name = "linha") int linha, @WebParam(name = "coluna") int coluna, @WebParam(name = "sentidoDeslocamento") int sentidoDeslocamento) {
        for (Partida p : partidas) {
            if ((p.getJ1() != null && p.getJ1().getId() == id) || (p.getJ2() != null && p.getJ2().getId() == id)) {
                return p.movePeca(id, linha, coluna, sentidoDeslocamento);
            }
        }
        return -1;
    }
    
    private void removeJogador(int idUsuario) {

        Iterator<Jogador> jogadorIterator = jogadores.iterator();
        while (jogadorIterator.hasNext()) {
            Jogador j = jogadorIterator.next();
            if (j.getId() == idUsuario) {
                jogadorIterator.remove();
                return;
            }
        }
    }
    
    private Partida estaNoPreRegistro(String nome){
        for (Partida partida : preRegistro) {
            if((partida.getJ1() != null && partida.getJ1().getNome().equals(nome)) || (partida.getJ2() != null && partida.getJ2().getNome().equals(nome))){ 
                return partida;
            }
        }
        return null;
    }
}
