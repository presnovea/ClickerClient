package com.emotionfactry.clickerclient.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Color

//ToDo("understand the approach to SnapshotMutationPolicy")

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

class AppColors(
    primary: Color,
    primaryVariant: Color,
    secondary: Color,
    secondaryVariant: Color,
    background: Color,
    surface: Color,
    error: Color,
    onPrimary: Color,
    onSecondary: Color,
    onBackground: Color,
    onSurface: Color,
    onError: Color
){
    var primary by mutableStateOf(primary, structuralEqualityPolicy())
        internal set
    var primaryVariant by mutableStateOf(primaryVariant, structuralEqualityPolicy())
        internal set
    var secondary by mutableStateOf(secondary, structuralEqualityPolicy())
        internal set
    var secondaryVariant by mutableStateOf(secondaryVariant, structuralEqualityPolicy())
        internal set
    var background by mutableStateOf(background, structuralEqualityPolicy())
        internal set
    var surface by mutableStateOf(surface, structuralEqualityPolicy())
        internal set
    var error by mutableStateOf(error, structuralEqualityPolicy())
        internal set
    var onPrimary by mutableStateOf(onPrimary, structuralEqualityPolicy())
        internal set
    var onSecondary by mutableStateOf(onSecondary, structuralEqualityPolicy())
        internal set
    var onBackground by mutableStateOf(onBackground, structuralEqualityPolicy())
        internal set
    var onSurface by mutableStateOf(onSurface, structuralEqualityPolicy())
        internal set
    var onError by mutableStateOf(onError, structuralEqualityPolicy())
        internal set

    /**
     * Creates copy of current colors
     */
    fun copy(
        primary: Color = this.primary,
        primaryVariant: Color = this.primaryVariant,
        secondary: Color = this.secondary,
        secondaryVariant: Color = this.secondaryVariant,
        background: Color = this.background,
        surface: Color = this.surface,
        error: Color = this.error,
        onPrimary: Color = this.onPrimary,
        onSecondary: Color = this.onSecondary,
        onBackground: Color = this.onBackground,
        onSurface: Color = this.onSurface,
        onError: Color = this.onError,
    ): AppColors = AppColors(
        primary,
        primaryVariant,
        secondary,
        secondaryVariant,
        background,
        surface,
        error,
        onPrimary,
        onSecondary,
        onBackground,
        onSurface,
        onError
    )



    //ToDo("realize method to create custom themes")
    fun updateColorsFrom(other: AppColors) {
        primary = other.primary
        primaryVariant = other.primaryVariant
        secondary = other.secondary
        secondaryVariant = other.secondaryVariant
        background = other.background
        surface = other.surface
        error = other.error
        onPrimary = other.onPrimary
        onSecondary = other.onSecondary
        onBackground = other.onBackground
        onSurface = other.onSurface
        onError = other.onError
    }

    //ToDo("realize method for upload to server")
    override fun toString(): String {return ""}
}



//ToDo("update the colors")
/**
 * Creates the light color scheme
 */
fun LightColorScheme(): AppColors =
    AppColors(
        primary = Color(0xFFCEF0F9),
        primaryVariant = Color(0xFFBBE8F2),
        secondary = Color(0xFF3D8B9D),
        secondaryVariant = Color(0xFF4DA3B7),
        background = Color(0xFFE7FCFF),
        surface = Color(0xFFD1F7FC),
        error = Color(202,70,70),
        onPrimary = Color(0,16,21),
        onSecondary = Color(0,16,21),
        onBackground = Color(0,16,21),
        onSurface = Color(0,16,21),
        onError = Color(82,19,19)
    )

//ToDo("update the colors")
/**
 * Creates the dark color scheme
 */
fun DarkColorScheme(): AppColors =
    AppColors(
        primary = Color(6,29,34),
        primaryVariant = Color(58,99,104),
        secondary = Color(0,67,79),
        secondaryVariant = Color(68,145,164),
        background = Color(0,16,21),
        surface = Color(3,27,33),
        error = Color(202,70,70),
        onPrimary = Color(244,244,244),
        onSecondary = Color(244,244,244),
        onBackground = Color(244,244,244),
        onSurface = Color(244,244,244),
        onError = Color(255,195,199)
    )


