package com.pavan.BackendHousie.Housie.Controller;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.pavan.BackendHousie.Housie.Entity.Player;
import com.pavan.BackendHousie.Housie.Entity.Room;
import com.pavan.BackendHousie.Housie.Service.HousieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HousieController {

    @Autowired
    public HousieService housieService;

    @RequestMapping(method = RequestMethod.GET,value="/getroom/{roomid}")
    public Room getRoom(@PathVariable int roomid) throws Exception {

//        String json_samp = "{\"id\":\"560\",\"name\":\"pavan\"}";
//        JsonObject jsonObject = new JsonParser().parse(json_samp).getAsJsonObject();
//        System.out.println(jsonObject);

        Room r = housieService.getroom(roomid);
        System.out.println(" Room ID "+r.getRoom_id());
        return r;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(method = RequestMethod.POST,value="/joinroom/{roomid}/{pname}")
    public String joinRoom(@PathVariable int roomid,@PathVariable String pname){

        String status = housieService.joinroom(roomid,pname);
        status = (status.equals("joined_room"))?pname+" joined room":status;
        return status;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(method = RequestMethod.POST,value="/createRoom/{roomid}")
    public String createRoom(@PathVariable int roomid){

        System.out.println("in createRoom "+roomid);

        housieService.createRoom(roomid);
        return "Room Created";
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(method = RequestMethod.GET,value="getPlayersList/{roomid}")
    public List<Player> getPlayers(@PathVariable int roomid){
        List<Player> playerList = new ArrayList<Player>();

        playerList = housieService.getPlayers(roomid);
        return playerList;
    }
}
