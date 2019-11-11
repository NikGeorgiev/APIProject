package com.spartaglobal.JSONParser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spartaglobal.JSONParser.AlbumsDTO;
import java.io.IOException;

public class AlbumsDeserialiser {
    public AlbumsDTO[] AlbumsMapped;

    public AlbumsDeserialiser(String jsonString) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            AlbumsMapped = objectMapper.readValue(jsonString, AlbumsDTO[].class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
