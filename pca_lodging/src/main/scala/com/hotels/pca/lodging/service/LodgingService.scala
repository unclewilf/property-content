package com.hotels.pca.lodging.service

import com.hotels.pca.lodging.domain.LodgingHotel

object LodgingService {

  lazy val hotels: Map[Long, LodgingHotel] =
    Map(
      (1, LodgingHotel(1)),
      (2, LodgingHotel(2)),
      (3, LodgingHotel(3))
    )

  def lookupHotel(id: Long) : Option[LodgingHotel] = {
    hotels.get(id)
  }
}
