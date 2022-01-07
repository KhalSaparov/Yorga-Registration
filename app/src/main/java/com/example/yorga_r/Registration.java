package com.example.yorga_r;

public class Registration {
    private String serial_nmb, passport_nmb, dateOfIssue, dateOfExpiry, name, surname,
            dateOfBirth, gender, materialStatus, durationOfTrip, nmb_of_entries, residencePermits,
            countryOfDestination, dateOfSubmission, dateOfTravel, placeOfWork, addressWork,
            previousTrips, invitation, phone, numberOfVoucher, visaApplication;

    public Registration() {
    }

    public Registration(String serial_nmb, String passport_nmb, String dateOfIssue, String dateOfExpiry, String name, String surname, String dateOfBirth, String gender, String materialStatus, String durationOfTrip, String nmb_of_entries, String residencePermits, String countryOfDestination, String dateOfSubmission, String dateOfTravel, String placeOfWork, String addressWork, String previousTrips, String invitation, String phone, String numberOfVoucher, String visaApplication) {
        this.serial_nmb = serial_nmb;
        this.passport_nmb = passport_nmb;
        this.dateOfIssue = dateOfIssue;
        this.dateOfExpiry = dateOfExpiry;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.materialStatus = materialStatus;
        this.durationOfTrip = durationOfTrip;
        this.nmb_of_entries = nmb_of_entries;
        this.residencePermits = residencePermits;
        this.countryOfDestination = countryOfDestination;
        this.dateOfSubmission = dateOfSubmission;
        this.dateOfTravel = dateOfTravel;
        this.placeOfWork = placeOfWork;
        this.addressWork = addressWork;
        this.previousTrips = previousTrips;
        this.invitation = invitation;
        this.phone = phone;
        this.numberOfVoucher = numberOfVoucher;
        this.visaApplication = visaApplication;
    }

    public String getSerial_nmb() {
        return serial_nmb;
    }

    public String getPassport_nmb() {
        return passport_nmb;
    }

    public String getDateOfIssue() {
        return dateOfIssue;
    }

    public String getDateOfExpiry() {
        return dateOfExpiry;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getMaterialStatus() {
        return materialStatus;
    }

    public String getDurationOfTrip() {
        return durationOfTrip;
    }

    public String getNmb_of_entries() {
        return nmb_of_entries;
    }

    public String getResidencePermits() {
        return residencePermits;
    }

    public String getCountryOfDestination() {
        return countryOfDestination;
    }

    public String getDateOfSubmission() {
        return dateOfSubmission;
    }

    public String getDateOfTravel() {
        return dateOfTravel;
    }

    public String getPlaceOfWork() {
        return placeOfWork;
    }

    public String getAddressWork() {
        return addressWork;
    }

    public String getPreviousTrips() {
        return previousTrips;
    }

    public String getInvitation() {
        return invitation;
    }

    public String getPhone() {
        return phone;
    }

    public String getNumberOfVoucher() {
        return numberOfVoucher;
    }

    public String getVisaApplication() {
        return visaApplication;
    }
}
