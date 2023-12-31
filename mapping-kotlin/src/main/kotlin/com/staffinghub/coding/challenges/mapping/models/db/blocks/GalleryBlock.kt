package com.staffinghub.coding.challenges.mapping.models.db.blocks

import com.staffinghub.coding.challenges.mapping.models.db.Image

class GalleryBlock(
    var images: List<Image?>,
    override val sortIndex: Int = 0,
) : ArticleBlock(sortIndex)
