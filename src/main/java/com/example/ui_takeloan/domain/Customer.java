package com.example.ui_takeloan.domain;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import java.time.LocalDate;

@Route
public class Customer extends VerticalLayout {

    private Long customerId;
    private String name;
    private String surname;
    private String phoneNumber;
    private String addressStreet;
    private String addressNumber;
    private String addressPostCode;
    private String addressCity;
    private String peselNumber;
    private String nipNumber;
    private IdType idType;
    private String idNumber;
    private String mailAddress;
    private boolean isCustomerActive;
    private LocalDate registrationDate;
    private LocalDate closedDate;

    public Customer(Long customerId, String name, String surname, String phoneNumber, String addressStreet, String addressNumber, String addressPostCode, String addressCity, String peselNumber, String nipNumber, IdType idType, String idNumber, String mailAddress, boolean isCustomerActive, LocalDate registrationDate, LocalDate closedDate) {
        this.customerId = customerId;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.addressStreet = addressStreet;
        this.addressNumber = addressNumber;
        this.addressPostCode = addressPostCode;
        this.addressCity = addressCity;
        this.peselNumber = peselNumber;
        this.nipNumber = nipNumber;
        this.idType = idType;
        this.idNumber = idNumber;
        this.mailAddress = mailAddress;
        this.isCustomerActive = isCustomerActive;
        this.registrationDate = registrationDate;
        this.closedDate = closedDate;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public String getAddressNumber() {
        return addressNumber;
    }

    public String getAddressPostCode() {
        return addressPostCode;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public String getPeselNumber() {
        return peselNumber;
    }

    public String getNipNumber() {
        return nipNumber;
    }

    public IdType getIdType() {
        return idType;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public boolean isCustomerActive() {
        return isCustomerActive;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public LocalDate getClosedDate() {
        return closedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;

        Customer that = (Customer) o;

        if (isCustomerActive != that.isCustomerActive) return false;
        if (customerId != null ? !customerId.equals(that.customerId) : that.customerId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (surname != null ? !surname.equals(that.surname) : that.surname != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(that.phoneNumber) : that.phoneNumber != null) return false;
        if (addressStreet != null ? !addressStreet.equals(that.addressStreet) : that.addressStreet != null)
            return false;
        if (addressNumber != null ? !addressNumber.equals(that.addressNumber) : that.addressNumber != null)
            return false;
        if (addressPostCode != null ? !addressPostCode.equals(that.addressPostCode) : that.addressPostCode != null)
            return false;
        if (addressCity != null ? !addressCity.equals(that.addressCity) : that.addressCity != null) return false;
        if (peselNumber != null ? !peselNumber.equals(that.peselNumber) : that.peselNumber != null) return false;
        if (nipNumber != null ? !nipNumber.equals(that.nipNumber) : that.nipNumber != null) return false;
        if (idType != null ? !idType.equals(that.idType) : that.idType != null) return false;
        if (idNumber != null ? !idNumber.equals(that.idNumber) : that.idNumber != null) return false;
        if (mailAddress != null ? !mailAddress.equals(that.mailAddress) : that.mailAddress != null) return false;
        if (registrationDate != null ? !registrationDate.equals(that.registrationDate) : that.registrationDate != null)
            return false;
        return closedDate != null ? closedDate.equals(that.closedDate) : that.closedDate == null;
    }

    @Override
    public int hashCode() {
        int result = customerId != null ? customerId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (addressStreet != null ? addressStreet.hashCode() : 0);
        result = 31 * result + (addressNumber != null ? addressNumber.hashCode() : 0);
        result = 31 * result + (addressPostCode != null ? addressPostCode.hashCode() : 0);
        result = 31 * result + (addressCity != null ? addressCity.hashCode() : 0);
        result = 31 * result + (peselNumber != null ? peselNumber.hashCode() : 0);
        result = 31 * result + (nipNumber != null ? nipNumber.hashCode() : 0);
        result = 31 * result + (idType != null ? idType.hashCode() : 0);
        result = 31 * result + (idNumber != null ? idNumber.hashCode() : 0);
        result = 31 * result + (mailAddress != null ? mailAddress.hashCode() : 0);
        result = 31 * result + (isCustomerActive ? 1 : 0);
        result = 31 * result + (registrationDate != null ? registrationDate.hashCode() : 0);
        result = 31 * result + (closedDate != null ? closedDate.hashCode() : 0);
        return result;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public void setAddressNumber(String addressNumber) {
        this.addressNumber = addressNumber;
    }

    public void setAddressPostCode(String addressPostCode) {
        this.addressPostCode = addressPostCode;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public void setPeselNumber(String peselNumber) {
        this.peselNumber = peselNumber;
    }

    public void setNipNumber(String nipNumber) {
        this.nipNumber = nipNumber;
    }

    public void setIdType(IdType idType) {
        this.idType = idType;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }


    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public void setCustomerActive(boolean customerActive) {
        isCustomerActive = customerActive;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public void setClosedDate(LocalDate closedDate) {
        this.closedDate = closedDate;
    }
}
