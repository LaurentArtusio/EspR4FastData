/* Copyright (C) 2014 Orange	

This software is distributed under the terms and conditions of the 
'GNU GENERAL PUBLIC LICENSE Version 2' license which can be found 
in the file 'LICENSE.txt' in this package distribution or at 
'http://www.gnu.org/licenses/gpl-2.0-standalone.html'. 
*/


// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.6 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2013.01.04 � 05:59:51 PM CET 
//


package com.orange.espr4fastdata.oma.ngsidatastructures;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour QueryContextRequest complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="QueryContextRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entityIdList" type="{}EntityIdList"/>
 *         &lt;element name="attributeList" type="{}AttributeList" minOccurs="0"/>
 *         &lt;element name="restriction" type="{}Restriction" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryContextRequest", propOrder = {
    "entityIdList",
    "attributeList",
    "restriction"
})
public class QueryContextRequest {

    @XmlElement(required = true)
    protected EntityIdList entityIdList;
    protected AttributeList attributeList;
    protected Restriction restriction;

    /**
     * Obtient la valeur de la propri�t� entityIdList.
     * 
     * @return
     *     possible object is
     *     {@link EntityIdList }
     *     
     */
    public EntityIdList getEntityIdList() {
        return entityIdList;
    }

    /**
     * D�finit la valeur de la propri�t� entityIdList.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityIdList }
     *     
     */
    public void setEntityIdList(EntityIdList value) {
        this.entityIdList = value;
    }

    /**
     * Obtient la valeur de la propri�t� attributeList.
     * 
     * @return
     *     possible object is
     *     {@link AttributeList }
     *     
     */
    public AttributeList getAttributeList() {
        return attributeList;
    }

    /**
     * D�finit la valeur de la propri�t� attributeList.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeList }
     *     
     */
    public void setAttributeList(AttributeList value) {
        this.attributeList = value;
    }

    /**
     * Obtient la valeur de la propri�t� restriction.
     * 
     * @return
     *     possible object is
     *     {@link Restriction }
     *     
     */
    public Restriction getRestriction() {
        return restriction;
    }

    /**
     * D�finit la valeur de la propri�t� restriction.
     * 
     * @param value
     *     allowed object is
     *     {@link Restriction }
     *     
     */
    public void setRestriction(Restriction value) {
        this.restriction = value;
    }

}
