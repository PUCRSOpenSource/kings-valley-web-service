
package kingsvalleyws_client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the kingsvalleyws_client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PreRegistroResponse_QNAME = new QName("http://kingsvalley.marina.org/", "preRegistroResponse");
    private final static QName _TemPartidaResponse_QNAME = new QName("http://kingsvalley.marina.org/", "temPartidaResponse");
    private final static QName _EncerraPartida_QNAME = new QName("http://kingsvalley.marina.org/", "encerraPartida");
    private final static QName _ObtemOponenteResponse_QNAME = new QName("http://kingsvalley.marina.org/", "obtemOponenteResponse");
    private final static QName _ObtemOponente_QNAME = new QName("http://kingsvalley.marina.org/", "obtemOponente");
    private final static QName _PreRegistro_QNAME = new QName("http://kingsvalley.marina.org/", "preRegistro");
    private final static QName _RegistraJogadorResponse_QNAME = new QName("http://kingsvalley.marina.org/", "registraJogadorResponse");
    private final static QName _EhMinhaVez_QNAME = new QName("http://kingsvalley.marina.org/", "ehMinhaVez");
    private final static QName _MovePecaResponse_QNAME = new QName("http://kingsvalley.marina.org/", "movePecaResponse");
    private final static QName _RegistraJogador_QNAME = new QName("http://kingsvalley.marina.org/", "registraJogador");
    private final static QName _ObtemTabuleiroResponse_QNAME = new QName("http://kingsvalley.marina.org/", "obtemTabuleiroResponse");
    private final static QName _TemPartida_QNAME = new QName("http://kingsvalley.marina.org/", "temPartida");
    private final static QName _EncerraPartidaResponse_QNAME = new QName("http://kingsvalley.marina.org/", "encerraPartidaResponse");
    private final static QName _EhMinhaVezResponse_QNAME = new QName("http://kingsvalley.marina.org/", "ehMinhaVezResponse");
    private final static QName _ObtemTabuleiro_QNAME = new QName("http://kingsvalley.marina.org/", "obtemTabuleiro");
    private final static QName _MovePeca_QNAME = new QName("http://kingsvalley.marina.org/", "movePeca");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: kingsvalleyws_client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MovePeca }
     * 
     */
    public MovePeca createMovePeca() {
        return new MovePeca();
    }

    /**
     * Create an instance of {@link EncerraPartidaResponse }
     * 
     */
    public EncerraPartidaResponse createEncerraPartidaResponse() {
        return new EncerraPartidaResponse();
    }

    /**
     * Create an instance of {@link EhMinhaVezResponse }
     * 
     */
    public EhMinhaVezResponse createEhMinhaVezResponse() {
        return new EhMinhaVezResponse();
    }

    /**
     * Create an instance of {@link ObtemTabuleiro }
     * 
     */
    public ObtemTabuleiro createObtemTabuleiro() {
        return new ObtemTabuleiro();
    }

    /**
     * Create an instance of {@link EhMinhaVez }
     * 
     */
    public EhMinhaVez createEhMinhaVez() {
        return new EhMinhaVez();
    }

    /**
     * Create an instance of {@link MovePecaResponse }
     * 
     */
    public MovePecaResponse createMovePecaResponse() {
        return new MovePecaResponse();
    }

    /**
     * Create an instance of {@link RegistraJogador }
     * 
     */
    public RegistraJogador createRegistraJogador() {
        return new RegistraJogador();
    }

    /**
     * Create an instance of {@link ObtemTabuleiroResponse }
     * 
     */
    public ObtemTabuleiroResponse createObtemTabuleiroResponse() {
        return new ObtemTabuleiroResponse();
    }

    /**
     * Create an instance of {@link TemPartida }
     * 
     */
    public TemPartida createTemPartida() {
        return new TemPartida();
    }

    /**
     * Create an instance of {@link EncerraPartida }
     * 
     */
    public EncerraPartida createEncerraPartida() {
        return new EncerraPartida();
    }

    /**
     * Create an instance of {@link ObtemOponenteResponse }
     * 
     */
    public ObtemOponenteResponse createObtemOponenteResponse() {
        return new ObtemOponenteResponse();
    }

    /**
     * Create an instance of {@link ObtemOponente }
     * 
     */
    public ObtemOponente createObtemOponente() {
        return new ObtemOponente();
    }

    /**
     * Create an instance of {@link PreRegistro }
     * 
     */
    public PreRegistro createPreRegistro() {
        return new PreRegistro();
    }

    /**
     * Create an instance of {@link RegistraJogadorResponse }
     * 
     */
    public RegistraJogadorResponse createRegistraJogadorResponse() {
        return new RegistraJogadorResponse();
    }

    /**
     * Create an instance of {@link TemPartidaResponse }
     * 
     */
    public TemPartidaResponse createTemPartidaResponse() {
        return new TemPartidaResponse();
    }

    /**
     * Create an instance of {@link PreRegistroResponse }
     * 
     */
    public PreRegistroResponse createPreRegistroResponse() {
        return new PreRegistroResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreRegistroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kingsvalley.marina.org/", name = "preRegistroResponse")
    public JAXBElement<PreRegistroResponse> createPreRegistroResponse(PreRegistroResponse value) {
        return new JAXBElement<PreRegistroResponse>(_PreRegistroResponse_QNAME, PreRegistroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemPartidaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kingsvalley.marina.org/", name = "temPartidaResponse")
    public JAXBElement<TemPartidaResponse> createTemPartidaResponse(TemPartidaResponse value) {
        return new JAXBElement<TemPartidaResponse>(_TemPartidaResponse_QNAME, TemPartidaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncerraPartida }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kingsvalley.marina.org/", name = "encerraPartida")
    public JAXBElement<EncerraPartida> createEncerraPartida(EncerraPartida value) {
        return new JAXBElement<EncerraPartida>(_EncerraPartida_QNAME, EncerraPartida.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtemOponenteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kingsvalley.marina.org/", name = "obtemOponenteResponse")
    public JAXBElement<ObtemOponenteResponse> createObtemOponenteResponse(ObtemOponenteResponse value) {
        return new JAXBElement<ObtemOponenteResponse>(_ObtemOponenteResponse_QNAME, ObtemOponenteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtemOponente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kingsvalley.marina.org/", name = "obtemOponente")
    public JAXBElement<ObtemOponente> createObtemOponente(ObtemOponente value) {
        return new JAXBElement<ObtemOponente>(_ObtemOponente_QNAME, ObtemOponente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreRegistro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kingsvalley.marina.org/", name = "preRegistro")
    public JAXBElement<PreRegistro> createPreRegistro(PreRegistro value) {
        return new JAXBElement<PreRegistro>(_PreRegistro_QNAME, PreRegistro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistraJogadorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kingsvalley.marina.org/", name = "registraJogadorResponse")
    public JAXBElement<RegistraJogadorResponse> createRegistraJogadorResponse(RegistraJogadorResponse value) {
        return new JAXBElement<RegistraJogadorResponse>(_RegistraJogadorResponse_QNAME, RegistraJogadorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EhMinhaVez }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kingsvalley.marina.org/", name = "ehMinhaVez")
    public JAXBElement<EhMinhaVez> createEhMinhaVez(EhMinhaVez value) {
        return new JAXBElement<EhMinhaVez>(_EhMinhaVez_QNAME, EhMinhaVez.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MovePecaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kingsvalley.marina.org/", name = "movePecaResponse")
    public JAXBElement<MovePecaResponse> createMovePecaResponse(MovePecaResponse value) {
        return new JAXBElement<MovePecaResponse>(_MovePecaResponse_QNAME, MovePecaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistraJogador }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kingsvalley.marina.org/", name = "registraJogador")
    public JAXBElement<RegistraJogador> createRegistraJogador(RegistraJogador value) {
        return new JAXBElement<RegistraJogador>(_RegistraJogador_QNAME, RegistraJogador.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtemTabuleiroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kingsvalley.marina.org/", name = "obtemTabuleiroResponse")
    public JAXBElement<ObtemTabuleiroResponse> createObtemTabuleiroResponse(ObtemTabuleiroResponse value) {
        return new JAXBElement<ObtemTabuleiroResponse>(_ObtemTabuleiroResponse_QNAME, ObtemTabuleiroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemPartida }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kingsvalley.marina.org/", name = "temPartida")
    public JAXBElement<TemPartida> createTemPartida(TemPartida value) {
        return new JAXBElement<TemPartida>(_TemPartida_QNAME, TemPartida.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncerraPartidaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kingsvalley.marina.org/", name = "encerraPartidaResponse")
    public JAXBElement<EncerraPartidaResponse> createEncerraPartidaResponse(EncerraPartidaResponse value) {
        return new JAXBElement<EncerraPartidaResponse>(_EncerraPartidaResponse_QNAME, EncerraPartidaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EhMinhaVezResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kingsvalley.marina.org/", name = "ehMinhaVezResponse")
    public JAXBElement<EhMinhaVezResponse> createEhMinhaVezResponse(EhMinhaVezResponse value) {
        return new JAXBElement<EhMinhaVezResponse>(_EhMinhaVezResponse_QNAME, EhMinhaVezResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtemTabuleiro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kingsvalley.marina.org/", name = "obtemTabuleiro")
    public JAXBElement<ObtemTabuleiro> createObtemTabuleiro(ObtemTabuleiro value) {
        return new JAXBElement<ObtemTabuleiro>(_ObtemTabuleiro_QNAME, ObtemTabuleiro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MovePeca }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kingsvalley.marina.org/", name = "movePeca")
    public JAXBElement<MovePeca> createMovePeca(MovePeca value) {
        return new JAXBElement<MovePeca>(_MovePeca_QNAME, MovePeca.class, null, value);
    }

}
