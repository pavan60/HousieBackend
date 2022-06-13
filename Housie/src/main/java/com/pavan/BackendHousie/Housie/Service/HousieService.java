package com.pavan.BackendHousie.Housie.Service;

import com.pavan.BackendHousie.Housie.Entity.Player;
import com.pavan.BackendHousie.Housie.Entity.Room;
import com.pavan.BackendHousie.Housie.Repository.Housie_Repo;
import com.pavan.BackendHousie.Housie.Repository.Player_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HousieService {

    @Autowired
    public Housie_Repo housie_repo;

    @Autowired
    public Player_Repo player_repo;

     public Room getroom(int room_id) throws Exception{
         try {
             return housie_repo.findById(room_id).get();
         }catch(Exception e){
             System.out.println(" Exception caught "+e);
             Room r = new Room(-560);
             return r;
         }
     }

    public String joinroom(int roomid, String pname) {
         try{
             Room r = getroom(roomid);

             if(r.getRoom_id() != -560){

                 Player p = new Player();
                 p.setPlayer_name(pname);
                 p.setRoom_id(roomid);
                 player_repo.save(p);

                 return "joined_room";
             }else{
                 System.out.println(r.getRoom_id());
                 return "Room_doesnot_exist";
             }

         }
         catch (Exception e){
             System.out.println(" Exception caught "+e);
         }
         return "Room_doesnot_exist";
    }

    public void createRoom(int roomid) {
        Room r = new Room();
        r.setRoom_id(roomid);
        housie_repo.save(r);
    }


    public List<Player> getPlayers(int roomid) {
         List<Player> playerList = new ArrayList<>();

         playerList = player_repo.findByRoomId(roomid);

         return playerList;
    }
}
