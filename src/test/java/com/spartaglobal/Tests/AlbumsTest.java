package com.spartaglobal.Tests;

import com.spartaglobal.HTTPServices.FixerHTTPService;
import com.spartaglobal.JSONParser.AlbumsDTO;
import com.spartaglobal.JSONParser.AlbumsDeserialiser;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.text.SimpleDateFormat;

public class AlbumsTest {

    private static AlbumsDeserialiser Albums;
    static FixerHTTPService fixerHTTPService = new FixerHTTPService();

    @BeforeClass
    public static void setup() {
        fixerHTTPService.executeAlbumsGetRequest();
        Albums = new AlbumsDeserialiser(fixerHTTPService.getFixerAlbumsJSONString());
    }

    @Test
    public void Test1() {
        System.out.println(fixerHTTPService.getFixerAlbumsJSONString());
    }
    @Test
    public void  getTitle () {
        for (AlbumsDTO Album : Albums.AlbumsMapped){ //For each loop
            System.out.println(Album.getTitle());
        }
    }
    @Test
    public void getId(){
        for (AlbumsDTO Album : Albums.AlbumsMapped){
            System.out.println(Album.getId());
        }
    }
    @Test
    public void getUserId(){
        for (AlbumsDTO Album : Albums.AlbumsMapped){
            System.out.println(Album.getUserId());
        }
    }
    @Test
    public void getTitleName(){

    }
}
