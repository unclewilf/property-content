package com.hotels.pca.service

import com.hotels.pca.domain.Flavour.{Flavour, Full, Summary}
import com.hotels.pca.domain._
import com.hotels.pca.lodging.service.LodgingService
import com.hotels.pca.lodging.transform.FullPropertyContentTransformer

object LodgingPropertyContentService extends PropertyContentService {

  override def retrievePropertyContent(flavour: Flavour, id: HcomId): Option[PropertyContent] =
    flavour match {
      case Full => retrieveFullFlavour(id)
      case Summary => retrieveSummaryFlavour(id)
    }

  def retrieveFullFlavour(id: HcomId): Option[PropertyContent] = {
    LodgingService.lookupHotel(id.id) match {
      case Some(hotel) => Some(FullPropertyContentTransformer.transform(hotel))
      case None => None
    }
  }

  def retrieveSummaryFlavour(id: HcomId): Option[PropertyContent] = {
    Option.empty
  }
}
