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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Diese Klasse speichert sich die Daten der Personen die im src/data/ definiert sind
 * @version 
 */
@XmlRootElement(name = "person")
@XmlAccessorType(XmlAccessType.FIELD)
public class PersonDocument {
    //speichert sich den Username der Person, es handelt sich um XMLAttribut des root(user)
    @XmlAttribute
    private String user;
    //steht innerhalb des root, es handelt sich um ein Element, welches sich den Vornamen speichert
    @XmlElement
    private String firstName;
    //steht innerhalb des root, es handelt sich um ein Element, welches sich den Nachnamen speichert
    @XmlElement
    private String lastName;
    //steht innerhalb des root, es handelt sich um ein Element, welches sich die City speichert
    @XmlElement
    private String city;

    /**
     * Die toString gibt aus um welchen User es sich handelt
     * @return gibt den User zurueck
     */
    @Override
    public String toString() {
        return "Person[user: " + user + "]";
    }

    /**
     * Diese Methode gibt aus von welcher City der User kommt
     * @return gibt die City zurueck
     */
    public String getCity() {
        return city;
    }

    /**
     * Diese Methode setzt die City des Users
     * @param city die neue City des Users
     */
    public void setCity(String city) {
        this.city = city;
    }
    
    /**
     * Diese Methode gibt aus wie der User mit Vornamen heisst
     * @return gibt den Vornamen zurueck
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Diese Methode setzt den Vornamen des Users
     * @param firstName der Vorname des Users
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Diese Methode gibt aus wie der User mit Nachnamen heisst
     * @return gibt den Nachnamen zurueck
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Diese Methode setzt den Nachnamen des Users
     * @param lastName der Nachname des Users
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    /**
     * Diese Methode gibt den User zurueck
     * @return gibt den User zurueck
     */
    public String getUser() {
        return user;
    }
    
    /**
     * Diese Methode setzt den User
     * @param user der User
     */
    public void setUser(String user) {
        this.user = user;
    }
}
