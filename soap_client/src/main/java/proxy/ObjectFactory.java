
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _GetAllProducts_QNAME = new QName("http://webservice.demo.example.com/", "getAllProducts");
    private static final QName _GetAllProductsResponse_QNAME = new QName("http://webservice.demo.example.com/", "getAllProductsResponse");
    private static final QName _GetProduct_QNAME = new QName("http://webservice.demo.example.com/", "getProduct");
    private static final QName _GetProductResponse_QNAME = new QName("http://webservice.demo.example.com/", "getProductResponse");
    private static final QName _Product_QNAME = new QName("http://webservice.demo.example.com/", "product");
    private static final QName _SellingPrice_QNAME = new QName("http://webservice.demo.example.com/", "sellingPrice");
    private static final QName _SellingPriceResponse_QNAME = new QName("http://webservice.demo.example.com/", "sellingPriceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllProducts }
     * 
     * @return
     *     the new instance of {@link GetAllProducts }
     */
    public GetAllProducts createGetAllProducts() {
        return new GetAllProducts();
    }

    /**
     * Create an instance of {@link GetAllProductsResponse }
     * 
     * @return
     *     the new instance of {@link GetAllProductsResponse }
     */
    public GetAllProductsResponse createGetAllProductsResponse() {
        return new GetAllProductsResponse();
    }

    /**
     * Create an instance of {@link GetProduct }
     * 
     * @return
     *     the new instance of {@link GetProduct }
     */
    public GetProduct createGetProduct() {
        return new GetProduct();
    }

    /**
     * Create an instance of {@link GetProductResponse }
     * 
     * @return
     *     the new instance of {@link GetProductResponse }
     */
    public GetProductResponse createGetProductResponse() {
        return new GetProductResponse();
    }

    /**
     * Create an instance of {@link Product }
     * 
     * @return
     *     the new instance of {@link Product }
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link SellingPrice }
     * 
     * @return
     *     the new instance of {@link SellingPrice }
     */
    public SellingPrice createSellingPrice() {
        return new SellingPrice();
    }

    /**
     * Create an instance of {@link SellingPriceResponse }
     * 
     * @return
     *     the new instance of {@link SellingPriceResponse }
     */
    public SellingPriceResponse createSellingPriceResponse() {
        return new SellingPriceResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllProducts }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllProducts }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.demo.example.com/", name = "getAllProducts")
    public JAXBElement<GetAllProducts> createGetAllProducts(GetAllProducts value) {
        return new JAXBElement<>(_GetAllProducts_QNAME, GetAllProducts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllProductsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllProductsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.demo.example.com/", name = "getAllProductsResponse")
    public JAXBElement<GetAllProductsResponse> createGetAllProductsResponse(GetAllProductsResponse value) {
        return new JAXBElement<>(_GetAllProductsResponse_QNAME, GetAllProductsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProduct }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetProduct }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.demo.example.com/", name = "getProduct")
    public JAXBElement<GetProduct> createGetProduct(GetProduct value) {
        return new JAXBElement<>(_GetProduct_QNAME, GetProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetProductResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.demo.example.com/", name = "getProductResponse")
    public JAXBElement<GetProductResponse> createGetProductResponse(GetProductResponse value) {
        return new JAXBElement<>(_GetProductResponse_QNAME, GetProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Product }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.demo.example.com/", name = "product")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<>(_Product_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SellingPrice }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SellingPrice }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.demo.example.com/", name = "sellingPrice")
    public JAXBElement<SellingPrice> createSellingPrice(SellingPrice value) {
        return new JAXBElement<>(_SellingPrice_QNAME, SellingPrice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SellingPriceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SellingPriceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.demo.example.com/", name = "sellingPriceResponse")
    public JAXBElement<SellingPriceResponse> createSellingPriceResponse(SellingPriceResponse value) {
        return new JAXBElement<>(_SellingPriceResponse_QNAME, SellingPriceResponse.class, null, value);
    }

}
