package com.hotels.pca.lodging.transform

import com.hotels.pca.domain.HcomId
import com.hotels.pca.lodging.domain.LodgingHotel

object IdTransformer {
  def transformId(hotel: LodgingHotel): HcomId = {
    HcomId(hotel.lodgingId)
  }
}
