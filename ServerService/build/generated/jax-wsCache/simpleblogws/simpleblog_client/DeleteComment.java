
package simpleblog_client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteComment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteComment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_komen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id_post" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteComment", propOrder = {
    "idKomen",
    "idPost"
})
public class DeleteComment {

    @XmlElement(name = "id_komen")
    protected String idKomen;
    @XmlElement(name = "id_post")
    protected String idPost;

    /**
     * Gets the value of the idKomen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdKomen() {
        return idKomen;
    }

    /**
     * Sets the value of the idKomen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdKomen(String value) {
        this.idKomen = value;
    }

    /**
     * Gets the value of the idPost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPost() {
        return idPost;
    }

    /**
     * Sets the value of the idPost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPost(String value) {
        this.idPost = value;
    }

}
