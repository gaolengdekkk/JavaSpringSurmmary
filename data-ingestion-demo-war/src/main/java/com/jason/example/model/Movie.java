//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.03 at 03:41:20 PM CST 
//


package com.jason.example.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Movie complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Movie">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="object-Infos" type="{http://www.example.org/DemoSchema}ObjectInfos" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Movie", propOrder = {
    "objectInfos"
})
@XmlRootElement
public class Movie {

    @XmlElement(name = "object-Infos")
    protected ObjectInfos objectInfos;

    /**
     * Gets the value of the objectInfos property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectInfos }
     *     
     */
    public ObjectInfos getObjectInfos() {
        return objectInfos;
    }

    /**
     * Sets the value of the objectInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectInfos }
     *     
     */
    public void setObjectInfos(ObjectInfos value) {
        this.objectInfos = value;
    }

}
