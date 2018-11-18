/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kingsvalleyws_client;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Marina
 */
public class KingsValleyWS_Client {
    
    static kingsvalleyws_client.KingsValleyWS port;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        kingsvalleyws_client.KingsValleyWS_Service service = new kingsvalleyws_client.KingsValleyWS_Service();
        port = service.getKingsValleyWSPort();

        executaTeste("KingsValley-0000",false);
        executaTeste("KingsValley-0001",false);

        
        String[] testePar1 = {"KingsValley-2000","KingsValley-2250","KingsValley-2500","KingsValley-2750"};
        executaTesteParalelo(testePar1);
        
    }
    
    private static void executaTesteParalelo(String[] rad) throws IOException {
        int numTestes = rad.length;
        Thread[] threads = new Thread[numTestes];
        for (int i=0;i<numTestes;++i) {
            String r = rad[i];
            threads[i] = new Thread() {
                @Override
                public void run() {
                    try {
                        executaTeste(r,false);
                    } catch (IOException e) {
                        e.printStackTrace(System.err);
                    }
                }
            };
        }
        for (int i=0;i<numTestes;++i)
            threads[i].start();
        for (int i=0;i<numTestes;++i) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                System.err.println("Falha ao esperar por teste ("+rad[i]+").");
                e.printStackTrace(System.err);
            }
        }
    }
    
    private static void executaTeste(final String rad,final boolean contagem) throws IOException {
        String inFile = rad+".in";
        String outFile = rad+".out";
        PrintWriter out = new PrintWriter(outFile);
        Scanner in = new Scanner(new File(inFile));
        int numOp = in.nextInt();
        for (int i=0;i<numOp;++i) {
            if (contagem)
               System.out.print("\r"+rad+": "+(i+1)+"/"+numOp);
            int op = in.nextInt();
            String parametros = in.next();
            String param[] = parametros.split(":",-1);
            switch(op) {
                case 0:
                    if (param.length!=4)
                        erro(inFile,i+1);
                    else
                        out.println(port.preRegistro(param[0],Integer.parseInt(param[1]),param[2],Integer.parseInt(param[3])));
                    break;
                case 1:
                        if (param.length!=1)
                            erro(inFile,i+1);
                        else
                            out.println(port.registraJogador(param[0]));
                        break;
                case 2:
                        if (param.length!=1)
                            erro(inFile,i+1);
                        else
                            out.println(port.encerraPartida(Integer.parseInt(param[0])));
                        break;
                case 3:
                        if (param.length!=1)
                            erro(inFile,i+1);
                        else
                            out.println(port.temPartida(Integer.parseInt(param[0])));
                        break;
                case 4:
                        if (param.length!=1)
                            erro(inFile,i+1);
                        else
                            out.println(port.obtemOponente(Integer.parseInt(param[0])));
                        break;
                case 5:
                        if (param.length!=1)
                            erro(inFile,i+1);
                        else
                            out.println(port.ehMinhaVez(Integer.parseInt(param[0])));
                        break;
                case 6:
                        if (param.length!=1)
                            erro(inFile,i+1);
                        else
                            out.println(port.obtemTabuleiro(Integer.parseInt(param[0])));
                        break;
                case 7:
                        if (param.length!=4)
                            erro(inFile,i+1);
                        else
                            out.println(port.movePeca(Integer.parseInt(param[0]),Integer.parseInt(param[1]),Integer.parseInt(param[2]),Integer.parseInt(param[3])));
                        break;
                default:
                    erro(inFile,i+1);
            }
        }
        if (contagem)
            System.out.println("... terminado!");
        else
            System.out.println(rad+": "+numOp+"/"+numOp+"... terminado!");
        out.close();
        in.close();
    }
    
    private static void erro(String arq,int operacao) {
        System.err.println("Entrada invalida: erro na operacao "+operacao+" do arquivo "+arq);
        System.exit(1);
    }
    
}
