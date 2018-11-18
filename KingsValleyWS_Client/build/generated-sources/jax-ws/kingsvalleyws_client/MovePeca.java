
package kingsvalleyws_client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de movePeca complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="movePeca">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="linha" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="coluna" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sentidoDeslocamento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "movePeca", propOrder = {
    "id",
    "linha",
    "coluna",
    "sentidoDeslocamento"
})
public class MovePeca {

    protected int id;
    protected int linha;
    protected int coluna;
    protected int sentidoDeslocamento;

    /**
     * Obtém o valor da propriedade id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade linha.
     * 
     */
    public int getLinha() {
        return linha;
    }

    /**
     * Define o valor da propriedade linha.
     * 
     */
    public void setLinha(int value) {
        this.linha = value;
    }

    /**
     * Obtém o valor da propriedade coluna.
     * 
     */
    public int getColuna() {
        return coluna;
    }

    /**
     * Define o valor da propriedade coluna.
     * 
     */
    public void setColuna(int value) {
        this.coluna = value;
    }

    /**
     * Obtém o valor da propriedade sentidoDeslocamento.
     * 
     */
    public int getSentidoDeslocamento() {
        return sentidoDeslocamento;
    }

    /**
     * Define o valor da propriedade sentidoDeslocamento.
     * 
     */
    public void setSentidoDeslocamento(int value) {
        this.sentidoDeslocamento = value;
    }

}
