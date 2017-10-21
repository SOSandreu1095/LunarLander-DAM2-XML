//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.10.19 a las 05:51:37 PM CEST 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="configuracion" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="dificultad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="modeloNave" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="modeloLuna" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "configuracion"
})
@XmlRootElement(name = "configuraciones")
public class Configuraciones {

    protected List<Configuraciones.Configuracion> configuracion;

    /**
     * Gets the value of the configuracion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the configuracion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfiguracion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Configuraciones.Configuracion }
     * 
     * 
     */
    public List<Configuraciones.Configuracion> getConfiguracion() {
        if (configuracion == null) {
            configuracion = new ArrayList<Configuraciones.Configuracion>();
        }
        return this.configuracion;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="dificultad" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="modeloNave" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="modeloLuna" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "nombre",
        "dificultad",
        "modeloNave",
        "modeloLuna"
    })
    public static class Configuracion {

        @XmlElement(required = true)
        protected String nombre;
        @XmlElement(required = true)
        protected String dificultad;
        @XmlElement(required = true)
        protected String modeloNave;
        @XmlElement(required = true)
        protected String modeloLuna;
        @XmlAttribute(name = "id")
        protected Byte id;

        /**
         * Obtiene el valor de la propiedad nombre.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombre() {
            return nombre;
        }

        /**
         * Define el valor de la propiedad nombre.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombre(String value) {
            this.nombre = value;
        }

        /**
         * Obtiene el valor de la propiedad dificultad.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDificultad() {
            return dificultad;
        }

        /**
         * Define el valor de la propiedad dificultad.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDificultad(String value) {
            this.dificultad = value;
        }

        /**
         * Obtiene el valor de la propiedad modeloNave.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModeloNave() {
            return modeloNave;
        }

        /**
         * Define el valor de la propiedad modeloNave.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModeloNave(String value) {
            this.modeloNave = value;
        }

        /**
         * Obtiene el valor de la propiedad modeloLuna.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModeloLuna() {
            return modeloLuna;
        }

        /**
         * Define el valor de la propiedad modeloLuna.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModeloLuna(String value) {
            this.modeloLuna = value;
        }

        /**
         * Obtiene el valor de la propiedad id.
         * 
         * @return
         *     possible object is
         *     {@link Byte }
         *     
         */
        public Byte getId() {
            return id;
        }

        /**
         * Define el valor de la propiedad id.
         * 
         * @param value
         *     allowed object is
         *     {@link Byte }
         *     
         */
        public void setId(Byte value) {
            this.id = value;
        }

    }

}
