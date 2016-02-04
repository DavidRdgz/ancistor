package models

/**
  * Created by galois on 1/23/16.
  */


import sorm._

object DBmessage extends Instance(entities = Set(Entity[Message](), Entity[Hashtag]()), url = "jdbc:h2:mem:test")




