/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.example.etl;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * An example entity bean which can be marshalled to/from XML
 * 
 * @version 
 */
@Entity(name = "customer")
@XmlRootElement(name = "customer")
@XmlAccessorType(XmlAccessType.FIELD)
@NamedQuery(name = "findCustomerByUsername", query = "SELECT c FROM customer c WHERE c.userName = :userName")
public class CustomerEntity {
    @XmlAttribute
    //Attribute fuer die Informationen des Customers
    // die id ist beim Customer das Attribut des root-Elements
    private Long id;
    private String userName;
    private String firstName;
    private String surname;
    private String street;
    private String city;
    private String zip;
    private String phone;

    /**
     * Getter-Methode fuer die Id des Customers
     * @return die Id des Customers
     */
    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }
    
    /**
     * Setter-Methode fuer die Id des Customers
     * @param die Id des Customers
     */
 
    public void setId(Long id) {
        this.id = id;
    }
    
    /**
     * Getter-Methode fuer die City des Customers
     * @return die City des Customers
     */
 
    public String getCity() {
        return city;
    }
    
    /**
     * Setter-Methode fuer die City des Customers
     * @param die City des Customers
     */
 
    public void setCity(String city) {
        this.city = city;
    }
    
    /**
     * Getter-Methode fuer den FirstName des Customers
     * @return den FirstName des Customers
     */
 
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * Setter-Methode fuer den FirstName des Customers
     * @return der FirstName des Customers
     */
 
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    /**
     * Getter-Methode fuer die phone des Customers
     * @return die phone des Customers
     */
 
    public String getPhone() {
        return phone;
    }
    
    /**
     * Setter-Methode fuer die phone des Customers
     * @param die phone des Customers
     */
 
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    /**
     * Getter-Methode fuer die Street des Customers
     * @return die Street des Customers
     */
 
    public String getStreet() {
        return street;
    }
   
    /**
     * Setter-Methode fuer die Street des Customers
     * @param die Street des Customers
     */
 
    public void setStreet(String street) {
        this.street = street;
    }
   
    /**
     * Getter-Methode fuer den Surname des Customers
     * @return der Surname des Customers
     */
 
    public String getSurname() {
        return surname;
    }
   
    /**
     * Setter-Methode fuer den Surname des Customers
     * @param der Surname des Customers
     */
 
    public void setSurname(String surname) {
        this.surname = surname;
    }
   
    /**
     * Getter-Methode fuer den Username des Customers
     * @return der Username des Customers
     */
 
    public String getUserName() {
        return userName;
    }
    
    /**
     * Setter-Methode fuer den Username des Customers
     * @param der Username des Customers
     */
 
    public void setUserName(String userName) {
        this.userName = userName;
    }
   
    /**
     * Getter-Methode fuer den Zip des Customers
     * @return der Zip des Customers
     */
 
    public String getZip() {
        return zip;
    }
    
    /**
     * Setter-Methode fuer den Zip des Customers
     * @param der Zip des Customers
     */
 
    public void setZip(String zip) {
        this.zip = zip;
    }
    
    /**
     * toString methode  des Customers
     * @return String-Repraesentation des Customers
     */
 
    public String toString() {
        return "Customer[userName: " + getUserName() + " firstName: " + getFirstName() + " surname: " + getSurname() + "]";
    }

}
