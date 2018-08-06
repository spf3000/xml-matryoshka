package example

import matryoshka._
import matryoshka.data._
import matryoshka.implicits._

import org.specs2.matcher.MatchResult
import org.specs2.mutable.Specification

import scalaz._
import Scalaz._
import X._
import spire.math.Natural
import spire.math.Natural._

class XSpec extends Specification {


  "X should do something" >> {

    Fix[X](El(
      "week", IList(
        Fix[X](El("day",
          IList(Fix[X](El("Mon", IList())))))))).cataM[State[Natural,?], IList[OTag]](stateAlg).run(Natural.zero) must beEqualTo ("hello")

  }

}
