package com.mdzihad.noteapp.feature_note.data.data_source

import androidx.room.*
import com.mdzihad.noteapp.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow


@Dao
interface NoteDao {
    @Query("SELECT * FROM note")
    fun getNotes():Flow<List<Note>>


    @Query("SELECT * FROM note WHERE id=:id")
    suspend fun getNotesById(id:Int):Note?


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addNotes(note: Note)


    @Delete
    suspend fun deleteNote(note: Note)



}