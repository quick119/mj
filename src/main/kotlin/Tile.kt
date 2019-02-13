abstract class Tile {
    abstract fun name() : String
}

abstract class RankTile : Tile() {
    open val rank: Int = -1
}

class DotTile(override val rank:Int) : RankTile() {
    val type = "餅"
    override fun name(): String {
        return rank.toString() + type
    }

}

class WindTile(val wind:Wind) : Tile() {

    override fun name(): String {
        return when(wind) {
            Wind.EAST -> "東"
            Wind.WEST -> "西"
            Wind.NORTH -> "北"
            Wind.SOUTH -> "南"
        }
    }
}

enum class Wind {
    EAST, WEST, NORTH, SOUTH
}