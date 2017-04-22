package io.scalajs.npm.gzipuncompressedsize

import scalajs.concurrent.JSExecutionContext.Implicits.queue
import io.scalajs.nodejs.Assert
import org.scalatest.FunSpec

import scala.util.{Failure, Success}

/**
  * Gzip Uncompressed Size Test
  * @author lawrence.daniels@gmail.com
  */
class GzipUncompressedSizeTest extends FunSpec {

  describe("GzipUncompressedSize") {

    it("reports the uncompressed size of a gzip file via callback") {
      GzipUncompressedSize.fromFile("./README.md.gz", (error, uncompressedSize) => {
        Assert.equal(null, error)
        info(s"uncompressedSize = $uncompressedSize")
      })
    }

    it("reports the uncompressed size of a gzip file via a Scala Future") {
      GzipUncompressedSize.fromFileFuture("./README.md.gz") onComplete {
        case Success(uncompressedSize) =>
          info(s"uncompressedSize = $uncompressedSize")
        case Failure(e) =>
          alert(s"An error occurred: ${e.getMessage}")
      }
    }
  }

}
