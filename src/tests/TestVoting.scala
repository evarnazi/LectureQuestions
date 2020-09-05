package tests

import org.scalatest._
import execution.VoteCounter

class TestVoting extends FunSuite{
  test("Test") {
    val lis1: VoteCounter = new VoteCounter(List("hello", "maybe"))
    lis1.addVotes("hello", 100)
    lis1.addVotes("why", 20)
    assert(lis1.getVotes("hello") == 100)
    assert(lis1.getVotes("maybe") == 0)
    assert(lis1.getVotes("goodbye") == 0)

    val lis2: VoteCounter = new VoteCounter(List("no"))
    lis2.addVotes("no", 30)
    lis2.addVotes("yes", 20)
    assert(lis2.getVotes("no") == 30)
    assert(lis2.getVotes("yes") == 0)

    val lis3: VoteCounter = new VoteCounter(List("yes"))
    lis3.addVotes("yes", 30)
    lis3.addVotes("yes", 20)
    assert(lis3.getVotes("yes") == 50)
  }
}