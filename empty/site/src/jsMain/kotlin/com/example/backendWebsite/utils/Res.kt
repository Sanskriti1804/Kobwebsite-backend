package com.example.backendWebsite.utils

import org.jetbrains.compose.web.css.CSSColorValue
import org.jetbrains.compose.web.css.rgb

object Res {

    enum class Theme(val color: CSSColorValue) {
        BLUE(color = rgb(r = 33, g = 150, b = 243)),
        LIGHT_BLUE(color = rgb(r = 168, g = 236, b = 255)),
        DARK_BLUE(color = rgb(r = 34, g = 63, b = 94)),
        SOCIAL_ICON_BACKGROUND_LIGHT(color = rgb(r = 23, g = 23, b = 230)),
        SOCIAL_ICON_BACKGROUND_DARK(color = rgb(r = 48, g = 82, b = 118)),
        GRADIENT_ONE(color = rgb(r = 161, g = 196, b = 253)),
        GRADIENT_ONE_DARK(color = rgb(r = 19, g = 38, b = 58)),
        GRADIENT_TWO(color = rgb(r = 194, g = 233, b = 251)),
        GRADIENT_TWO_DARK(color = rgb(r = 20, g = 46, b = 73))
    }

    object Icon {
        const val EMAIL_LIGHT = "mail.svg"
        const val EMAIL_DARK = "mail light.svg"
        const val GITHUB = "github.svg"
        const val GITHUB_LIGHT = "github Light.svg"
        const val INSTAGRAM = "instagram.svg"
        const val INSTAGRAM_LIGHT = "instagram_light.svg"
        const val GITLAB = "gitlab.svg"
        const val GITLAB_LIGHT = "gitlab_light.svg"
        const val SUN = "sun.svg"
        const val MOON = "moon.svg"
    }

    object Image {
        const val PHOTO = "photo.jpg"
    }

    object String {
        const val NAME = "Sanskriti"
        const val PROFESSION = "Kotlin Multiplaform Developer"
        const val ABOUT_ME =
            "Lorem ipsum dolor sit amet, nisl tempus lorem adipiscing elit. Donec sollicitudi"
        const val BUTTON_TEXT = "Get in touch"
        const val ROBOTO_CONDENSED = "Roboto CondensedBold"
        const val ROBOTO_REGULAR = "RobotoRegular"
        const val MY_EMAIL = "mailto:sanskritileet@gmail.com"
        const val SAVED_THEME = "theme"
    }

    object Dimens {
    const val BORDER_RADIUS = 8
    const val MAX_CARD_WIDTH = 1000
    const val MAX_CARD_HEIGHT = 608
    const val ICON_SIZE = 24
    const val ICON_SIZE_LG = 32
    }
}