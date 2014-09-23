package com.hotels.pca.service

import com.hotels.pca.domain.Flavour.Flavour
import com.hotels.pca.domain.{HcomId, PropertyContent}

trait PropertyContentService {
  def retrievePropertyContent(flavour: Flavour, id: HcomId): Option[PropertyContent]
}
