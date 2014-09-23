package com.hotels.pca.service

import com.hotels.pca.domain.Flavour.{Full, Flavour}
import com.hotels.pca.domain._

object LodgingPropertyContentService extends PropertyContentService {
  override def retrievePropertyContent(flavour: Flavour, id: HcomId): Option[PropertyContent] = flavour match {
    case Full =>
      retrieveFullFlavour(id)
  }

  def retrieveFullFlavour(id: HcomId): Option[PropertyContent] = {
    Option.empty
  }
}
