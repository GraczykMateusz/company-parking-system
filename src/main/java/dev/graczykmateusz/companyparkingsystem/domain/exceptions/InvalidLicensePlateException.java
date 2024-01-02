package dev.graczykmateusz.companyparkingsystem.domain.exceptions;

public class InvalidLicensePlateException extends RuntimeException {
    
    public InvalidLicensePlateException() {
        super("License plate is invalid!");
    }
}
