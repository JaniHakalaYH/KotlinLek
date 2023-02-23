package Rekursion

class Rekursion {

    fun getUnderlings(searchFor: String, map: Map<String, List<Tomte>>, newlist: MutableList<String>): List<String> {
        val list = map.getOrDefault(searchFor, listOf())
        if (list.isNotEmpty()) {
            for (x in list) {
                newlist.add(x.getTomteName())
                getUnderlings(x.getTomteName(), mapAvChefer(), newlist)
            }
        }
        return newlist
    }

    fun mapAvChefer() =
        mapOf(
            "Tomten" to listOf(Tomte("Glader"), Tomte("Butter")),
            "Glader" to listOf(Tomte("Tröger"), Tomte("Trötter"), Tomte("Blyger")),
            "Butter" to listOf(Tomte("Rådjuret"), Tomte("Nyckelpigan"), Tomte("Haren"), Tomte("Räven")),
            "Trötter" to listOf(Tomte("Skumtomten")),
            "Skumtomten" to listOf(Tomte("Dammråttan")),
            "Räven" to listOf(Tomte("Gråsuggan"), Tomte("Myran")),
            "Myran" to listOf(Tomte("Bladlusen"))
        )


}

fun main() {

    val logic = Rekursion()
    val list: MutableList<String> = mutableListOf()
    println(logic.getUnderlings("Räven",logic.mapAvChefer(), list))

}
