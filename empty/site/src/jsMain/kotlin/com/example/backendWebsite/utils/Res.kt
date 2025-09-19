package com.example.backendWebsite.utils

import org.jetbrains.compose.web.css.CSSColorValue
import org.jetbrains.compose.web.css.rgb

object Res {

    enum class Theme(val color: CSSColorValue) {
        VANILLA(color = rgb(r = 248, g = 244, b = 238)),
        BASE_CARD(color = rgb(r = 228, g = 221, b = 204)),
        DARK_CARD(color = rgb(r = 197, g = 180, b = 157)),
        ACCENT(color = rgb(r = 68, g = 58, b = 53)),
        BLACK(color = rgb(r = 37, g = 37, b = 37)),
        SOCIAL_ICON_BACKGROUND_LIGHT(color = rgb(r = 23, g = 23, b = 230)),
        SOCIAL_ICON_BACKGROUND_DARK(color = rgb(r = 48, g = 82, b = 118)),
        GRADIENT_ONE_DARK(color = rgb(r = 19, g = 38, b = 58)),
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
    const val BORDER_RADIUS = 16
    const val MAX_INTRO_CARD_WIDTH = 1000
    const val MAX_INTRO_CARD_HEIGHT = 300
    const val MAX_MODULE_CARD_HEIGHT = 300
    const val MAX_MODULE_CARD_WIDTH = 500
    const val MAX_TECH_CARD_HEIGHT = 1500
    const val MAX_TECH_CARD_WIDTH = 600
    const val ICON_SIZE = 24
    const val ICON_SIZE_LG = 32
    }
}