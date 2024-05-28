package com.example.marsphotos.netWork

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@SerialName(value = "img_src")
val imgSrc: String = ""

data class MarsPhoto(
   val id: String,  val img_src: String
  )
