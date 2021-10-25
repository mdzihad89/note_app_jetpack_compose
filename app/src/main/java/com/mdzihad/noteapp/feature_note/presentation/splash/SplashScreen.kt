package com.mdzihad.noteapp.feature_note.presentation.splash

import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.mdzihad.noteapp.R
import com.mdzihad.noteapp.feature_note.presentation.util.Screen
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    navController: NavController
) {
    val scale = remember {

        androidx.compose.animation.core.Animatable(initialValue = 0f)
    }

    LaunchedEffect(key1 = true) {
        scale.animateTo(
            targetValue = 3f,
            animationSpec = tween(
                durationMillis = 500,
                easing = {
                    OvershootInterpolator(2f).getInterpolation(it)
                }
            )
        )
        delay(1500L)
        navController.navigate(route = Screen.NoteScreen.route) {
            popUpTo(route = Screen.SplashScreen.route) {
                inclusive = true
            }
        }
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_notes_logo),
            contentDescription = null,
            modifier = Modifier
                .size(50.dp)
                .scale(scale.value)
        )

        Spacer(modifier = Modifier.height(64.dp))
        
        Text(
            text = stringResource(id = R.string.tag_line),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFFF2746),
            textAlign = TextAlign.Center

        )
    }
}