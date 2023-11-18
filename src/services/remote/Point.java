
package services.remote;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour point complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>{@code
 * <complexType name="point">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="x" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="y" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "point", propOrder = {
    "x",
    "y"
})
public class Point {

    protected float x;
    protected float y;

    /**
     * Obtient la valeur de la propriété x.
     * 
     */
    public float getX() {
        return x;
    }

    /**
     * Définit la valeur de la propriété x.
     * 
     */
    public void setX(float value) {
        this.x = value;
    }

    /**
     * Obtient la valeur de la propriété y.
     * 
     */
    public float getY() {
        return y;
    }

    /**
     * Définit la valeur de la propriété y.
     * 
     */
    public void setY(float value) {
        this.y = value;
    }

}
