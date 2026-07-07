package com.cognizant;

public class MyService {

    private ExternalApi api;

    public MyService(ExternalApi api) {

        this.api = api;

    }

    public String fetchData() {

        return api.getData();

    }

    public String fetchDataById(int id) {

        return api.getDataById(id);

    }

    public void processData() {

        api.login();

        api.getData();

        api.logout();

    }

}