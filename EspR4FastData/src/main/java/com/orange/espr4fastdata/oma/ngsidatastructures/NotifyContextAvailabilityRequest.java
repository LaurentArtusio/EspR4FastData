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
 * <p>Classe Java pour NotifyContextAvailabilityRequest complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="NotifyContextAvailabilityRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subscriptionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contextRegistrationResponseList" type="{}ContextRegistrationResponseList" minOccurs="0"/>
 *         &lt;element name="errorCode" type="{}StatusCode" minOccurs="0"/>
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
@XmlType(name = "NotifyContextAvailabilityRequest", propOrder = {
    "subscriptionId",
    "contextRegistrationResponseList",
    "errorCode"
})
public class NotifyContextAvailabilityRequest {

    @XmlElement(required = true)
    protected String subscriptionId;
    protected ContextRegistrationResponseList contextRegistrationResponseList;
    protected StatusCode errorCode;

    /**
     * Obtient la valeur de la propri�t� subscriptionId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * D�finit la valeur de la propri�t� subscriptionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionId(String value) {
        this.subscriptionId = value;
    }

    /**
     * Obtient la valeur de la propri�t� contextRegistrationResponseList.
     * 
     * @return
     *     possible object is
     *     {@link ContextRegistrationResponseList }
     *     
     */
    public ContextRegistrationResponseList getContextRegistrationResponseList() {
        return contextRegistrationResponseList;
    }

    /**
     * D�finit la valeur de la propri�t� contextRegistrationResponseList.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextRegistrationResponseList }
     *     
     */
    public void setContextRegistrationResponseList(ContextRegistrationResponseList value) {
        this.contextRegistrationResponseList = value;
    }

    /**
     * Obtient la valeur de la propri�t� errorCode.
     * 
     * @return
     *     possible object is
     *     {@link StatusCode }
     *     
     */
    public StatusCode getErrorCode() {
        return errorCode;
    }

    /**
     * D�finit la valeur de la propri�t� errorCode.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusCode }
     *     
     */
    public void setErrorCode(StatusCode value) {
        this.errorCode = value;
    }

}
