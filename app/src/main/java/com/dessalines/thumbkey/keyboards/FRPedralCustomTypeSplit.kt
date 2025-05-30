@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_FR_PEDRAL_TYPESPLIT_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("d", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("v"),
                    top = KeyC("w"),
                ),
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("g"),
                    bottom = KeyC("q"),
                ),
                EMOJI_KEY_ITEM_ALT,
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("œ", color = MUTED),
                    top = KeyC("ô", color = MUTED),
                    left = KeyC("ö", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("u", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("ù", color = MUTED),
                    left = KeyC("ü", color = MUTED),
                    bottom = KeyC("x"),
                    top = KeyC("û", color = MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    swipeType = EIGHT_WAY,
                    bottom = KeyC("y"),
                    bottomLeft = KeyC("æ", color = MUTED),
                    top = KeyC("â", color = MUTED),
                    topLeft = KeyC("á", color = MUTED),
                    right = KeyC("à", color = MUTED),
                    left = KeyC("ä", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("ï", color = MUTED),
                    bottom = KeyC("j"),
                    top = KeyC("î", color = MUTED),
                ),
                SPACEBAR_FRENCH_PEDRAL_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    swipeType = EIGHT_WAY,
                    right = KeyC("é", color = MUTED),
                    left = KeyC("è", color = MUTED),
                    bottom = KeyC("f"),
                    bottomLeft = KeyC("ë", color = MUTED),
                    top = KeyC("ê", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("z"),
                    left = KeyC("b"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("c", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("k"),
                    top = KeyC("ç", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    top = KeyC("p"),
                ),
                SPACEBAR_FRENCH_PEDRAL_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center = KeyC("l", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("m"),
                    left = KeyC("h"),
                ),
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    swipeType = EIGHT_WAY,
                    right = KeyC("?", color = MUTED),
                    left = KeyC("!", color = MUTED),
                    bottom = KeyC(":", color = MUTED),
                    bottomLeft = KeyC("ñ", color = MUTED),
                    top = KeyC(";", color = MUTED),
                ),
            ),
            listOf(
                NUMERIC_KEY_ITEM_ALT,
                BACKSPACE_TYPESPLIT_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_FR_PEDRAL_TYPESPLIT_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("D", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("V"),
                    top = KeyC("W"),
                ),
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("G"),
                    bottom = KeyC("Q"),
                ),
                EMOJI_KEY_ITEM_ALT,
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("Œ", color = MUTED),
                    top = KeyC("Ô", color = MUTED),
                    left = KeyC("Ö", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("U", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("Ù", color = MUTED),
                    left = KeyC("Ü", color = MUTED),
                    bottom = KeyC("X"),
                    top = KeyC("Û", color = MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    swipeType = EIGHT_WAY,
                    bottom = KeyC("Y"),
                    bottomLeft = KeyC("Æ", color = MUTED),
                    top = KeyC("Â", color = MUTED),
                    topLeft = KeyC("Á", color = MUTED),
                    right = KeyC(" À", color = MUTED),
                    left = KeyC("Ä", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("Ï", color = MUTED),
                    bottom = KeyC("J"),
                    top = KeyC("Î", color = MUTED),
                ),
                SPACEBAR_FRENCH_PEDRAL_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    swipeType = EIGHT_WAY,
                    right = KeyC("É", color = MUTED),
                    left = KeyC("È", color = MUTED),
                    bottom = KeyC("F"),
                    bottomLeft = KeyC("Ë", color = MUTED),
                    top = KeyC("Ê", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("Z"),
                    left = KeyC("B"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("C", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("K"),
                    top = KeyC("Ç", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    top = KeyC("P"),
                ),
                SPACEBAR_FRENCH_PEDRAL_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center = KeyC("L", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("M"),
                    left = KeyC("H"),
                ),
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    swipeType = EIGHT_WAY,
                    right = KeyC("?", color = MUTED),
                    left = KeyC("!", color = MUTED),
                    bottom = KeyC(":", color = MUTED),
                    bottomLeft = KeyC("Ñ", color = MUTED),
                    top = KeyC(";", color = MUTED),
                ),
            ),
            listOf(
                NUMERIC_KEY_ITEM_ALT,
                BACKSPACE_TYPESPLIT_SHIFTED_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_FR_PEDRAL_TYPESPLIT: KeyboardDefinition =
    KeyboardDefinition(
        title = "français pedral custom type-split",
        modes =
            KeyboardDefinitionModes(
                main = KB_FR_PEDRAL_TYPESPLIT_MAIN,
                shifted = KB_FR_PEDRAL_TYPESPLIT_SHIFTED,
                numeric = FRENCH_TYPESPLIT_NUMERIC_KEYBOARD,
            ),
    )
