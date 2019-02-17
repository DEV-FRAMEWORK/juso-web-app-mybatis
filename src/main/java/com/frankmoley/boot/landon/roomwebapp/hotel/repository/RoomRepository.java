package com.frankmoley.boot.landon.roomwebapp.hotel.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.frankmoley.boot.landon.roomwebapp.hotel.entity.Room;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long>{
}
