package com.pavan.BackendHousie.Housie.Repository;

import com.pavan.BackendHousie.Housie.Entity.Player;
import com.pavan.BackendHousie.Housie.Entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Housie_Repo extends JpaRepository<Room,Integer> {
}


