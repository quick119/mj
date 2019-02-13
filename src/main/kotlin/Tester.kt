fun main() {
    val tiles = mutableListOf<Tile>(
        WindTile(Wind.EAST),
        WindTile(Wind.EAST),
        WindTile(Wind.NORTH),
        DotTile(6)
    )

    tiles.forEach {
        println(it.name())
    }
}