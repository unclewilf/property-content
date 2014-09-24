package com.hotels.pca.lodging.transform

import com.hotels.pca.domain.FullPropertyContent
import com.hotels.pca.lodging.domain.LodgingHotel

object FullPropertyContentTransformer {

  def transform(lodgingHotel: LodgingHotel): FullPropertyContent = {
    FullPropertyContent(
      id = IdTransformer.transformId(lodgingHotel)
    )
  }
}
