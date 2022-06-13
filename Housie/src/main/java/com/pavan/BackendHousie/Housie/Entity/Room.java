package com.pavan.BackendHousie.Housie.Entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
//import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Room {

    @Id
    int room_id;
//    List<Player> players;
}
