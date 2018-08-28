package example

import matryoshka._
import matryoshka.data._
import matryoshka.implicits._
import matryoshka.data._

import org.specs2.matcher.MatchResult
import org.specs2.mutable.Specification

import scalaz._
import Scalaz._
import X._
import spire.math.Natural
import spire.math.Natural._

class XSpec extends Specification {


  "X should do something" >> {

    Mu[X](El(
      "week", IList(
        Mu[X](El("day",
          IList(Mu[X](El("Mon", IList()))))))))
            .transCataM[State[Natural,?], OTag, IList](stateAlg).run(Natural.zero) must beEqualTo ("hello")

  }

}
