package io.scalajs.npm.gzipuncompressedsize

import io.scalajs.nodejs.Error

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

/**
  * Gzip Uncompressed Size Test
  * @author lawrence.daniels@gmail.com
  */
@js.native
trait GzipUncompressedSize extends js.Object {

  def fromFile(path: String, callback: js.Function2[Error, Int, Any]): Unit = js.native

}

@js.native
@JSImport("gzip-uncompressed-size", JSImport.Default)
object GzipUncompressedSize extends GzipUncompressedSize
