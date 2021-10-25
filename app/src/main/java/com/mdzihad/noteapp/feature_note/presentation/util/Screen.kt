package com.mdzihad.noteapp.feature_note.presentation.util

sealed class Screen(
    val route:String
){
    object NoteScreen:Screen("notes_screen")
    object AddEditNoteScreen:Screen("add_edit_notes_screen")
    object SplashScreen:Screen("splash_screen")
}