package com.example.webclient;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RickAndMortyApiServiceTest {
    @Test

    void getAllCharacters() {

        RickAndMortyApiService apiService = new RickAndMortyApiService();
        apiService.getAllCharacters();
    }

    @Test

    void getAllAliveCharacters() {

        RickAndMortyApiService apiService = new RickAndMortyApiService();
        apiService.getAllAliveCharacters();
    }

}