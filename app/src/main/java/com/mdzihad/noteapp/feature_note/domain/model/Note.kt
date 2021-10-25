package com.mdzihad.noteapp.feature_note.domain.model


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.mdzihad.noteapp.ui.theme.*


@Entity
data class Note(
    val title: String,
    val content: String,
    val timesTamp:Long,
    val color :Int,
    @PrimaryKey val id: Int?=null
){
    companion object{
        val notesColors= listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message:String):Exception(message)
