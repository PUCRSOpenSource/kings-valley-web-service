
package kingsvalleyws_client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de preRegistro complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="preRegistro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="jogador1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="jogador2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "preRegistro", propOrder = {
    "jogador1",
    "id1",
    "jogador2",
    "id2"
})
public class PreRegistro {

    protected String jogador1;
    protected int id1;
    protected String jogador2;
    protected int id2;

    /**
     * Obtém o valor da propriedade jogador1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJogador1() {
        return jogador1;
    }

    /**
     * Define o valor da propriedade jogador1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJogador1(String value) {
        this.jogador1 = value;
    }

    /**
     * Obtém o valor da propriedade id1.
     * 
     */
    public int getId1() {
        return id1;
    }

    /**
     * Define o valor da propriedade id1.
     * 
     */
    public void setId1(int value) {
        this.id1 = value;
    }

    /**
     * Obtém o valor da propriedade jogador2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJogador2() {
        return jogador2;
    }

    /**
     * Define o valor da propriedade jogador2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJogador2(String value) {
        this.jogador2 = value;
    }

    /**
     * Obtém o valor da propriedade id2.
     * 
     */
    public int getId2() {
        return id2;
    }

    /**
     * Define o valor da propriedade id2.
     * 
     */
    public void setId2(int value) {
        this.id2 = value;
    }

}
