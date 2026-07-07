package com.cognizant;

public interface ExternalApi {

    String getData();

    String getDataById(int id);

    void login();

    void logout();

}