package com.mdzihad.noteapp.feature_note.domain.repository


import com.mdzihad.noteapp.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepository {

    fun getNotes(): Flow<List<Note>>

    suspend fun getNotesById(id:Int): Note?


    suspend fun addNotes(note: Note)


    suspend fun deleteNote(note: Note)


}