package com.pavan.BackendHousie.Housie.Repository;

import com.pavan.BackendHousie.Housie.Entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Player_Repo extends JpaRepository<Player,Integer> {

    @Query(value = "select p from Player p where p.room_id = ?1")
    List<Player> findByRoomId(int roomid);
}
