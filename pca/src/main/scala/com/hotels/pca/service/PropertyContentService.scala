package com.hotels.pca.service

import com.hotels.pca.domain.FullPropertyContent
import com.hotels.pca.domain.SummaryPropertyContent

trait PropertyContentService {
  def retrieveFullPropertyContent: Option[FullPropertyContent]
  def retrieveSummaryPropertyContent: Option[SummaryPropertyContent]
}
