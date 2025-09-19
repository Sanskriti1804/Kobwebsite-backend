package com.example.backendWebsite.pages

import androidx.compose.runtime.*
import com.example.backendWebsite.components.IntroCard
import com.example.backendWebsite.components.ProfileCard
import com.example.backendWebsite.utils.Res
import com.varabyte.kobweb.compose.css.TransitionTimingFunction
import com.varabyte.kobweb.compose.css.functions.LinearGradient
import com.varabyte.kobweb.compose.css.functions.linearGradient
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.backgroundImage
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.SilkStyleSheet
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.icons.fa.FaHeart
import com.varabyte.kobweb.silk.components.icons.fa.FaMoon
import com.varabyte.kobweb.silk.components.icons.fa.FaSun
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.icons.fa.IconStyle
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.base
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.selectors.focus
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobweb.silk.theme.colors.palette.SilkWidgetColorGroups
import com.varabyte.kobweb.silk.theme.colors.palette.link
import com.varabyte.kobweb.silk.theme.colors.palette.toPalette
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.attributes.InputType.Button
import org.jetbrains.compose.web.attributes.placeholder
import org.jetbrains.compose.web.css.CSSColorValue
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.Transitions
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.rgb
import org.jetbrains.compose.web.css.vh
import org.jetbrains.compose.web.dom.Input
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text




@Page
@Composable
fun HomePage() {
    val breakpoint = rememberBreakpoint()
    Box(
        modifier = Modifier
            .fillMaxSize()
            .backgroundColor(
                Res.Theme.VANILLA.color
            ),
        contentAlignment = Alignment.Center
    ){
        IntroCard(breakpoint = breakpoint)
    }
}

enum class Theme(val color : CSSColorValue ){
    Pink(color = rgb(r = 251, g = 116, b = 168)),
    LPink(color = rgb(r = 251, g = 198, b = 207))
}

val InputStyle = CssStyle {
    base {
        Modifier.border {
            width(2.px)
            style(LineStyle.Dashed)
            color(Theme.LPink.color)
        }
    }

    focus{
        Modifier.border {
            width(12.px)
            style(LineStyle.Solid)
            color(Theme.Pink.color)
        }
    }
}

@Composable
fun InputEmail(){
    Input(
        type = InputType.Text,
        attrs = Modifier
            .padding(15.px)
            .fontSize(20.px)
            .toAttrs{
                placeholder(value = "Enter your email")
                onInput {
//                    userName = it
                }

            }
    )
}




