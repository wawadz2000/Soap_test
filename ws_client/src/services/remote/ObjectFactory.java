
package services.remote;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services.remote package. 
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

    private final static QName _Addition_QNAME = new QName("http://remote.services/", "addition");
    private final static QName _AdditionResponse_QNAME = new QName("http://remote.services/", "additionResponse");
    private final static QName _Distance_QNAME = new QName("http://remote.services/", "distance");
    private final static QName _DistanceResponse_QNAME = new QName("http://remote.services/", "distanceResponse");
    private final static QName _Division_QNAME = new QName("http://remote.services/", "division");
    private final static QName _DivisionResponse_QNAME = new QName("http://remote.services/", "divisionResponse");
    private final static QName _Multiplication_QNAME = new QName("http://remote.services/", "multiplication");
    private final static QName _MultiplicationResponse_QNAME = new QName("http://remote.services/", "multiplicationResponse");
    private final static QName _Soustraction_QNAME = new QName("http://remote.services/", "soustraction");
    private final static QName _SoustractionResponse_QNAME = new QName("http://remote.services/", "soustractionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services.remote
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Addition }
     * 
     * @return
     *     the new instance of {@link Addition }
     */
    public Addition createAddition() {
        return new Addition();
    }

    /**
     * Create an instance of {@link AdditionResponse }
     * 
     * @return
     *     the new instance of {@link AdditionResponse }
     */
    public AdditionResponse createAdditionResponse() {
        return new AdditionResponse();
    }

    /**
     * Create an instance of {@link Distance }
     * 
     * @return
     *     the new instance of {@link Distance }
     */
    public Distance createDistance() {
        return new Distance();
    }

    /**
     * Create an instance of {@link DistanceResponse }
     * 
     * @return
     *     the new instance of {@link DistanceResponse }
     */
    public DistanceResponse createDistanceResponse() {
        return new DistanceResponse();
    }

    /**
     * Create an instance of {@link Division }
     * 
     * @return
     *     the new instance of {@link Division }
     */
    public Division createDivision() {
        return new Division();
    }

    /**
     * Create an instance of {@link DivisionResponse }
     * 
     * @return
     *     the new instance of {@link DivisionResponse }
     */
    public DivisionResponse createDivisionResponse() {
        return new DivisionResponse();
    }

    /**
     * Create an instance of {@link Multiplication }
     * 
     * @return
     *     the new instance of {@link Multiplication }
     */
    public Multiplication createMultiplication() {
        return new Multiplication();
    }

    /**
     * Create an instance of {@link MultiplicationResponse }
     * 
     * @return
     *     the new instance of {@link MultiplicationResponse }
     */
    public MultiplicationResponse createMultiplicationResponse() {
        return new MultiplicationResponse();
    }

    /**
     * Create an instance of {@link Soustraction }
     * 
     * @return
     *     the new instance of {@link Soustraction }
     */
    public Soustraction createSoustraction() {
        return new Soustraction();
    }

    /**
     * Create an instance of {@link SoustractionResponse }
     * 
     * @return
     *     the new instance of {@link SoustractionResponse }
     */
    public SoustractionResponse createSoustractionResponse() {
        return new SoustractionResponse();
    }

    /**
     * Create an instance of {@link Point }
     * 
     * @return
     *     the new instance of {@link Point }
     */
    public Point createPoint() {
        return new Point();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Addition }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Addition }{@code >}
     */
    @XmlElementDecl(namespace = "http://remote.services/", name = "addition")
    public JAXBElement<Addition> createAddition(Addition value) {
        return new JAXBElement<>(_Addition_QNAME, Addition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdditionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://remote.services/", name = "additionResponse")
    public JAXBElement<AdditionResponse> createAdditionResponse(AdditionResponse value) {
        return new JAXBElement<>(_AdditionResponse_QNAME, AdditionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Distance }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Distance }{@code >}
     */
    @XmlElementDecl(namespace = "http://remote.services/", name = "distance")
    public JAXBElement<Distance> createDistance(Distance value) {
        return new JAXBElement<>(_Distance_QNAME, Distance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DistanceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DistanceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://remote.services/", name = "distanceResponse")
    public JAXBElement<DistanceResponse> createDistanceResponse(DistanceResponse value) {
        return new JAXBElement<>(_DistanceResponse_QNAME, DistanceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Division }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Division }{@code >}
     */
    @XmlElementDecl(namespace = "http://remote.services/", name = "division")
    public JAXBElement<Division> createDivision(Division value) {
        return new JAXBElement<>(_Division_QNAME, Division.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivisionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DivisionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://remote.services/", name = "divisionResponse")
    public JAXBElement<DivisionResponse> createDivisionResponse(DivisionResponse value) {
        return new JAXBElement<>(_DivisionResponse_QNAME, DivisionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiplication }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Multiplication }{@code >}
     */
    @XmlElementDecl(namespace = "http://remote.services/", name = "multiplication")
    public JAXBElement<Multiplication> createMultiplication(Multiplication value) {
        return new JAXBElement<>(_Multiplication_QNAME, Multiplication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplicationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MultiplicationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://remote.services/", name = "multiplicationResponse")
    public JAXBElement<MultiplicationResponse> createMultiplicationResponse(MultiplicationResponse value) {
        return new JAXBElement<>(_MultiplicationResponse_QNAME, MultiplicationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Soustraction }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Soustraction }{@code >}
     */
    @XmlElementDecl(namespace = "http://remote.services/", name = "soustraction")
    public JAXBElement<Soustraction> createSoustraction(Soustraction value) {
        return new JAXBElement<>(_Soustraction_QNAME, Soustraction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoustractionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoustractionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://remote.services/", name = "soustractionResponse")
    public JAXBElement<SoustractionResponse> createSoustractionResponse(SoustractionResponse value) {
        return new JAXBElement<>(_SoustractionResponse_QNAME, SoustractionResponse.class, null, value);
    }

}
