package com.example.recycleview

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Resep(
    val imgresep: Int,
    val nameresep: String,
    val descresep: String

) : Parcelable
