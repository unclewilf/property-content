package com.hotels.pca.service

import com.hotels.pca.domain.Flavour.{Flavour, Full, Summary}
import com.hotels.pca.domain._
import com.hotels.pca.lodging.service.LodgingService
import com.hotels.pca.lodging.transform.FullPropertyContentTransformer

object LodgingPropertyContentService extends PropertyContentService {

  override def retrievePropertyContent(flavour: Flavour, hcomId: HcomId): Option[PropertyContent] =
    flavour match {
      case Full => retrieveFullFlavour(hcomId)
      case Summary => retrieveSummaryFlavour(hcomId)
    }

  def retrieveFullFlavour(hcomId: HcomId): Option[PropertyContent] = {
    LodgingService.lookupHotel(hcomId.id) match {
      case Some(hotel) => Some(FullPropertyContentTransformer.transform(hotel))
      case None => None
    }
  }

  def retrieveSummaryFlavour(hcomId: HcomId): Option[PropertyContent] = {
    Option.empty
  }
}
