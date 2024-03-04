package eu.kanade.tachiyomi.extension.es.leercapitulo

import eu.kanade.tachiyomi.source.model.Filter

class GenreFilter : UriPartFilter(
    "Género",
    arrayOf(
        Pair("<Seleccionar>", ""),
        Pair("Acción", "accion"),
        Pair("Animación", "animacion"),
        Pair("Apocalíptico", "apocaliptico"),
        Pair("Artes Marciales", "artes-marciales"),
        Pair("Aventura", "aventura"),
        Pair("Boys Love", "boys-love"),
        Pair("Ciberpunk", "ciberpunk"),
        Pair("Ciencia Ficción", "ciencia-ficcion"),
        Pair("Comedia", "comedia"),
        Pair("Crimen", "crimen"),
        Pair("Demonios", "demonios"),
        Pair("Deporte", "deporte"),
        Pair("Drama", "drama"),
        Pair("Ecchi", "ecchi"),
        Pair("Extranjero", "extranjero"),
        Pair("Familia", "familia"),
        Pair("Fantasia", "fantasia"),
        Pair("Género Bender", "genero-bender"),
        Pair("Girls Love", "girls-love"),
        Pair("Gore", "gore"),
        Pair("Guerra", "guerra"),
        Pair("Harem", "harem"),
        Pair("Historia", "historia"),
        Pair("Horror", "horror"),
        Pair("Magia", "magia"),
        Pair("Mecha", "mecha"),
        Pair("Militar", "militar"),
        Pair("Misterio", "misterio"),
        Pair("Musica", "musica"),
        Pair("Niños", "ninos"),
        Pair("Oeste", "oeste"),
        Pair("Parodia", "parodia"),
        Pair("Policiaco", "policiaco"),
        Pair("Psicológico", "psicologico"),
        Pair("Realidad", "realidad"),
        Pair("Realidad Virtual", "realidad-virtual"),
        Pair("Recuentos de la vida", "recuentos-de-la-vida"),
        Pair("Reencarnación", "reencarnacion"),
        Pair("Romance", "romance"),
        Pair("Samurái", "samurai"),
        Pair("Sobrenatural", "sobrenatural"),
        Pair("Superpoderes", "superpoderes"),
        Pair("Supervivencia", "supervivencia"),
        Pair("Telenovela", "telenovela"),
        Pair("Thriller", "thriller"),
        Pair("Tragedia", "tragedia"),
        Pair("Traps", "traps"),
        Pair("Vampiros", "vampiros"),
        Pair("Vida Escolar", "vida-escolar"),
    ),
)

class AlphabeticFilter : UriPartFilter(
    "Alfabético",
    arrayOf(
        Pair("<Seleccionar>", ""),
        Pair("0", "0"),
        Pair("1", "1"),
        Pair("2", "2"),
        Pair("3", "3"),
        Pair("4", "4"),
        Pair("5", "5"),
        Pair("6", "6"),
        Pair("7", "7"),
        Pair("8", "8"),
        Pair("9", "9"),
        Pair("A", "A"),
        Pair("B", "B"),
        Pair("C", "C"),
        Pair("D", "D"),
        Pair("E", "E"),
        Pair("F", "F"),
        Pair("G", "G"),
        Pair("H", "H"),
        Pair("I", "I"),
        Pair("J", "J"),
        Pair("K", "K"),
        Pair("L", "L"),
        Pair("M", "M"),
        Pair("N", "N"),
        Pair("O", "O"),
        Pair("P", "P"),
        Pair("Q", "Q"),
        Pair("R", "R"),
        Pair("S", "S"),
        Pair("T", "T"),
        Pair("U", "U"),
        Pair("V", "V"),
        Pair("W", "W"),
        Pair("X", "X"),
        Pair("Y", "Y"),
        Pair("Z", "Z"),
    ),
)

class StatusFilter : UriPartFilter(
    "Estado",
    arrayOf(
        Pair("<Seleccionar>", ""),
        Pair("Completed", "completed"),
        Pair("Ongoing", "ongoing"),
        Pair("Paused", "paused"),
        Pair("Cancelled", "cancelled"),
    ),
)

open class UriPartFilter(displayName: String, val vals: Array<Pair<String, String>>) :
    Filter.Select<String>(displayName, vals.map { it.first }.toTypedArray()) {
    fun toUriPart() = vals[state].second
}