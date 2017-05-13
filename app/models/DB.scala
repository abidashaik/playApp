package models

import sorm._

/**
  * Created by kabeer on 11/05/17.
  */

object DB extends Instance(entities = Seq(Entity[Person]()), url = "jdbc:h2:mem:test")
