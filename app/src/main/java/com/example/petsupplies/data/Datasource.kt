package com.example.petsupplies.data

import com.example.petsupplies.R
import com.example.petsupplies.model.petsupplies

class Datasource {
    fun loadPetSupplies(): List<petsupplies> {
        return listOf<petsupplies>(
            petsupplies(R.string.fishsupplies11, R.drawable.pic1),
            petsupplies(R.string.fishsupplies12, R.drawable.pic2),
            petsupplies(R.string.fishsupplies13, R.drawable.pic3),
            petsupplies(R.string.fishsupplies14, R.drawable.pic4),
            petsupplies(R.string.fishsupplies15, R.drawable.pic5),
            petsupplies(R.string.fishsupplies16, R.drawable.pic6),
            petsupplies(R.string.fishsupplies17, R.drawable.pic7),
            petsupplies(R.string.fishsupplies18, R.drawable.pic8),
            petsupplies(R.string.fishsupplies19, R.drawable.pic9),
            petsupplies(R.string.fishsupplies20, R.drawable.pic10),
            petsupplies(R.string.fishsupplies21, R.drawable.pic11),
            petsupplies(R.string.fishsupplies22, R.drawable.pic12),
            petsupplies(R.string.fishsupplies23, R.drawable.pic13),
            petsupplies(R.string.fishsupplies24, R.drawable.pic14),
            petsupplies(R.string.fishsupplies25, R.drawable.pic15),
            petsupplies(R.string.fishsupplies1, R.drawable.pic21),
            petsupplies(R.string.fishsupplies2, R.drawable.pic22),
            petsupplies(R.string.fishsupplies3, R.drawable.pic23),
            petsupplies(R.string.fishsupplies4, R.drawable.pic24),
            petsupplies(R.string.fishsupplies5, R.drawable.pic25),
            petsupplies(R.string.fishsupplies6, R.drawable.pic26),
            petsupplies(R.string.fishsupplies7, R.drawable.pic27),
            petsupplies(R.string.fishsupplies8, R.drawable.pic28),
            petsupplies(R.string.fishsupplies9, R.drawable.pic29),
            petsupplies(R.string.fishsupplies10, R.drawable.pic30)

        )
    }

}