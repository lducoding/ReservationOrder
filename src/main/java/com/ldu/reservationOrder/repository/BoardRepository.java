package com.ldu.reservationOrder.repository;

import com.ldu.reservationOrder.dto.Restaurant;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardRepository {

    List<Restaurant> findAllRestaurant();
}
