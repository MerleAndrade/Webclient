package com.example.webclient;

import org.springframework.web.reactive.function.client.WebClient;

public class RickAndMortyApiService {

   private WebClient webClient = WebClient.create("https://rickandmortyapi.com/api");


   public void getAllCharacters(){

       RickAndMortyCharacterListResponse response = webClient.get()
               .uri("/character")
               .retrieve()
               .toEntity(RickAndMortyCharacterListResponse.class)
               .block()
               .getBody();

       System.out.println(response);

   }

    public void getAllAliveCharacters(){

        RickAndMortyAliveCharacterListResponse response = webClient.get()
                .uri("/character?status=Alive")
                .retrieve()
                .toEntity(RickAndMortyAliveCharacterListResponse.class)
                .block()
                .getBody();

        System.out.println(response);

    }


}
