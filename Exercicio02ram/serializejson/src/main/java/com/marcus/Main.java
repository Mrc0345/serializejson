package com.marcus;
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        pessoa pessoa = new pessoa("Marcus Vinicius", 25);
        Gson gson = new Gson();
        
        // Serialização
        String json = gson.toJson(pessoa);
        
        System.out.println("JSON Gerado: " + json);
    }
}